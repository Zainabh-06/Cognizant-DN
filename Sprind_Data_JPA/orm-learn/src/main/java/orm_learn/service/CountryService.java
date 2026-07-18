package orm_learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import orm_learn.model.Country;
import orm_learn.repository.CountryRepository;
import orm_learn.exception.CountryNotFoundException;

@Service

public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

    Optional<Country> country = countryRepository.findById(countryCode);
    if (country.isPresent()) {
        return country.get();
       } else {
        throw new CountryNotFoundException("Country not found with code: " + countryCode);
      }
    }
    public void addCountry(Country country) {
        countryRepository.save(country);
    }
    
}