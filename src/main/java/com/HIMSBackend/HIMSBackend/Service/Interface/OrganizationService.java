package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Organization;
import com.HIMSBackend.HIMSBackend.Model.Role;
import com.HIMSBackend.HIMSBackend.Repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganizationService {
    Organization saveOrgnization(Organization organization);

    List<Organization> allOrganization();


}
