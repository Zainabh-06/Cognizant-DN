package com.cognizant.authentication_service.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import java.security.Key;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;


@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("START authenticate()");
        LOGGER.debug("Authorization Header : {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("END authenticate()");

        return map;
    }

    private String getUser(String authHeader) {

        LOGGER.debug("START getUser()");

        String encodedCredentials = authHeader.substring("Basic ".length());

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        LOGGER.debug("Decoded Credentials : {}", credentials);

        String user = credentials.split(":")[0];

        LOGGER.debug("User : {}", user);

        return user;
    }

    private String generateJwt(String user) {

    LOGGER.debug("Generating JWT for {}", user);

    Key key = Keys.hmacShaKeyFor(
            "secretkeysecretkeysecretkey12345".getBytes(StandardCharsets.UTF_8));

    return Jwts.builder()
            .setSubject(user)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 1200000))
            .signWith(key)
            .compact();
}
}