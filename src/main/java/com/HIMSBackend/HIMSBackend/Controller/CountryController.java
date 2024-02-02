package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Model.Department;
import com.HIMSBackend.HIMSBackend.Service.Interface.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;



    @PostMapping("/savecountry")
    public Country saveCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @GetMapping("/allcountry")
    public List<Country> getAllDepartments() {
        return countryService.allCountry();
    }





}
