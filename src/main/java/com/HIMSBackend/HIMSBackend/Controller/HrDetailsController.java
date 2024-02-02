package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Hr_Details;
import com.HIMSBackend.HIMSBackend.Service.Interface.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hr")
public class HrDetailsController {


        @Autowired
        private HrService hrService;

        @PostMapping("saveHrDetails")
    public Hr_Details saveHrDetails(@RequestBody Hr_Details hr_details)
        {
            return hrService.saveHrDetails(hr_details);
        }


        @GetMapping("getAllHrDetails")
        public List<Hr_Details>getAllHrDetails()
        {
            return hrService.getAllHrDetails();
        }
}



