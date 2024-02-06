package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Model.Gender;
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


    @PostMapping("/save")
    public ResponseEntity<?> saveCountry(@RequestBody Country country) {
        try {
            return new ResponseEntity(countryService.saveCountry(country), HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity("Please fill correct  Country Details", HttpStatus.BAD_REQUEST);
        }
    }




    @GetMapping("/getAll")
    public ResponseEntity getAllCountry() {
        try
        {
            List<Country> countries = countryService.allCountry();
            return new ResponseEntity(countries, HttpStatus.ACCEPTED);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity("Some Un catch exception comes with Get All Genders", HttpStatus.BAD_REQUEST);
        }

    }




}
