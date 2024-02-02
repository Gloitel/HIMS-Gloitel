package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Repository.CountryRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImp implements CountryService {


    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country saveCountry(Country country) {
        return  countryRepository.save(country);
    }

    @Override
    public List<Country> allCountry() {
        return countryRepository.findAll();
    }
}
