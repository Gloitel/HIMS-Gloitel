package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Organization;
import com.HIMSBackend.HIMSBackend.Service.Interface.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {



    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/saveOrganization")
    public Organization saveOrganization(@RequestBody Organization organization)
    {
        return organizationService.saveOrgnization(organization);
    }


    @GetMapping("/getAllOrganization")
    public List<Organization> saveOrganization()
    {
        return organizationService.allOrganization();
    }

    // Add organization Api



}
