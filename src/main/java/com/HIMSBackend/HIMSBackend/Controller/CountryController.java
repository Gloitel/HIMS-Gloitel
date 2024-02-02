package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Model.Department;
import com.HIMSBackend.HIMSBackend.Service.Interface.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;


    @PostMapping("/saveCountry")
    public Country saveCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @GetMapping("/allCountry")
    public List<Country> getAllDepartments() {
        return countryService.allCountry();
    }





}
