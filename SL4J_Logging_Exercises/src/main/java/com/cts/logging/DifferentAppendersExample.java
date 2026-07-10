package com.cts.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DifferentAppendersExample {

    private static final Logger logger =
            LoggerFactory.getLogger(DifferentAppendersExample.class);

    public static void main(String[] args) {

        System.out.println("Application Started");

        logger.info("User logged in successfully.");
        logger.warn("Password will expire in 5 days.");
        logger.error("Unable to connect to the database.");

        System.out.println("Application Finished");
    }
}