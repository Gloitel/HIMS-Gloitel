package com.HIMSBackend.HIMSBackend.Controller;

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

        @PostMapping("saveHrDetails")
    public ResponseEntity<?> saveHrDetails(@RequestBody Hr_Details hr_details)
        {
            return new ResponseEntity(hrService.saveHrDetails(hr_details), HttpStatus.CREATED);
        }


        @GetMapping("getAllHrDetails")
        public List<Hr_Details>getAllHrDetails()
        {
            return hrService.getAllHrDetails();
        }
}



