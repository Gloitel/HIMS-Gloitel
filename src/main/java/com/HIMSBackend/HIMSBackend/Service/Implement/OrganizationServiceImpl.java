package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Model.Organization;
import com.HIMSBackend.HIMSBackend.Repository.OrganizationRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {


    @Autowired
    private OrganizationRepository organizationRepository;


    @Override
    public Organization saveOrgnization(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public List<Organization> allOrganization() {
        return organizationRepository.findAll();
    }
}
