package orm_learn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import orm_learn.model.Country;
import orm_learn.service.CountryService;
import orm_learn.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside main");

        testGetAllCountries();
        try {
            testFindCountryByCode();
        } catch (CountryNotFoundException e) {
            LOGGER.error(e.getMessage());
        }
        testAddCountry();
    }

    private static void testGetAllCountries() {

        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();

        LOGGER.info("countries={}", countries);

        LOGGER.info("End");
    }
    private static void testFindCountryByCode() throws CountryNotFoundException {

    LOGGER.info("Start");

    Country country = countryService.findCountryByCode("IN");

    LOGGER.info("Country={}", country);

    LOGGER.info("End");
    }
     private static void testAddCountry() {

    LOGGER.info("Start");

    Country country = new Country();
    country.setCode("XX");
    country.setName("Test Country");

    countryService.addCountry(country);

    LOGGER.info("Country Added Successfully");

    LOGGER.info("End");
  }
}