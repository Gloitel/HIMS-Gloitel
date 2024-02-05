package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Exception.Gender.GenderCreationException;
import com.HIMSBackend.HIMSBackend.Exception.Gender.GenderNotFoundException;
import com.HIMSBackend.HIMSBackend.Model.Gender;
import com.HIMSBackend.HIMSBackend.Repository.GenderRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {

    @Autowired
    GenderRepository genderRepository;


    // Create Gender with Check exception
    @Override
    public Gender createGender(Gender gender) throws GenderCreationException {
        if (gender.getGender() == null) {
            throw new GenderCreationException("Gender name is required.");
        }
        try {
            return genderRepository.save(gender);
        }catch (GenderCreationException g){
            throw new GenderCreationException("Please fill correct gender");
        }
    }


    @Override
    public List<Gender> getAllGenders() {
        List<Gender> genders = genderRepository.findAll();

        // Validation (optional):
        if (genders.isEmpty()) {
            throw new GenderNotFoundException("No genders found.");
        }

        return genders;
    }
}
