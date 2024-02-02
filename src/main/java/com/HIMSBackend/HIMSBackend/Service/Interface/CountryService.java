package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Model.Department;

import java.util.List;

public interface CountryService {

    Country saveCountry(Country country);

    List<Country> allCountry();
}
