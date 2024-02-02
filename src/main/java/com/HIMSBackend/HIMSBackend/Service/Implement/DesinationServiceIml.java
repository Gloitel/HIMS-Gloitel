package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Model.Designation;
import com.HIMSBackend.HIMSBackend.Repository.DesignationRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesinationServiceIml implements DesignationService {

    @Autowired
    private DesignationRepository designationRepository;

    @Override
    public Designation saveDegignation(Designation designation) {
        return designationRepository.save(designation);
    }

    @Override
    public List<Designation> allDegignation() {
        return designationRepository.findAll();
    }
}
