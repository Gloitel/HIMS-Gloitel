package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Gender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenderService {
    Gender createGender(Gender gender);


    List<Gender> getAllGenders();
}
