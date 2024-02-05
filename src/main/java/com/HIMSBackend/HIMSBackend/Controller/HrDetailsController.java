package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Gender;
import com.HIMSBackend.HIMSBackend.Model.Hr_Details;
import com.HIMSBackend.HIMSBackend.Service.Interface.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hr")
public class HrDetailsController {


        @Autowired
        private HrService hrService;

        @PostMapping("/save")
    public ResponseEntity<?> saveHrDetails(@RequestBody Hr_Details hr_details) {
            try {
                System.out.println(hr_details.getBirthDate());
                System.out.println("=========================================================");


                return new ResponseEntity(hrService.saveHrDetails(hr_details), HttpStatus.CREATED);
            }
            catch (Exception e)
            {
                return new ResponseEntity("Please fill correct  Hr Details", HttpStatus.BAD_REQUEST);
            }
        }


        @GetMapping("/getAll")
        public ResponseEntity getAllHrDetails()
        {
            try
            {
                List<Hr_Details> hr_details =hrService.getAllHrDetails();
                return new ResponseEntity(hr_details, HttpStatus.ACCEPTED);
            }
            catch (Exception e)
            {
                e.printStackTrace();
                return new ResponseEntity("Some Un catch exception comes with Get All HrDetails", HttpStatus.BAD_REQUEST);
            }

        }


}



