package spring_learn.service;

import java.util.List;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import spring_learn.Country;

@Service
public class CountryService {

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountries() {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries =
                (List<Country>) context.getBean("countryList");

        context.close();

        return countries;
    }

    public Country getCountry(String code) {

        List<Country> countries = getAllCountries();

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}