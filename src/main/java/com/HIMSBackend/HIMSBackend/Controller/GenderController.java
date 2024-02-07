package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Gender;
import com.HIMSBackend.HIMSBackend.Service.Interface.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gender")
public class GenderController {

    @Autowired
    GenderService genderService;

    // Add Gender
    @PostMapping("/add")
    public ResponseEntity<?> addGender(@RequestBody Gender gender) {
        try {
            return new ResponseEntity(genderService.createGender(gender),HttpStatus.CREATED);
        }
        catch (Exception e) {
            // Handle other exceptions with different responses
            e.printStackTrace();
            return new ResponseEntity("Please fill correct gander with capital case", HttpStatus.BAD_REQUEST);
        }
    }

    //Get All Genders
    @GetMapping("/getAll")
    public ResponseEntity getAllGenders(){
        try {
            List<Gender> genders = genderService.getAllGenders();
            return new ResponseEntity(genders,HttpStatus.ACCEPTED);
        } catch (Exception e) {
            // Handle exceptions and return appropriate responses
            e.printStackTrace();
            return new ResponseEntity("Please Add Gender First", HttpStatus.BAD_REQUEST);
        }
    }
}
