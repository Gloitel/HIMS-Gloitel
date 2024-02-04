package com.HIMSBackend.HIMSBackend.Controller;

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

    @PostMapping("/saveOrganization")
    public ResponseEntity<?> saveOrganization(@RequestBody Organization organization)
    {
        return new ResponseEntity(organizationService.saveOrgnization(organization), HttpStatus.CREATED);
    }


    @GetMapping("/getAllOrganization")
    public List<Organization> saveOrganization()
    {
        return organizationService.allOrganization();
    }

    // Add organization Api



}
