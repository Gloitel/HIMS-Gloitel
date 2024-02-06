package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Hr_Details;
import com.HIMSBackend.HIMSBackend.Model.Organization;
import com.HIMSBackend.HIMSBackend.Service.Interface.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {


    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/save")
    public ResponseEntity<?> saveOrganization(@RequestBody Organization organization) {
        try {
            return new ResponseEntity(organizationService.saveOrgnization(organization), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity("Please fill correct  Organization Details", HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping("/getAll")
    public ResponseEntity saveOrganization(){
     try
    {
        List<Organization> organizations = organizationService.allOrganization();
        return new ResponseEntity(organizations, HttpStatus.ACCEPTED);
    }
     catch(Exception e)
    {
        e.printStackTrace();
        return new ResponseEntity("Some Un catch exception comes with Get All Organization", HttpStatus.BAD_REQUEST);
    }
}

}
