package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Service.Interface.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;


    @PostMapping("/saveCountry")
    public ResponseEntity<?> saveCountry(@RequestBody Country country) {
        return new ResponseEntity(countryService.saveCountry(country), HttpStatus.CREATED);
    }

    @GetMapping("/allCountry")
    public List<Country> getAllDepartments() {

        return countryService.allCountry();
    }

}
