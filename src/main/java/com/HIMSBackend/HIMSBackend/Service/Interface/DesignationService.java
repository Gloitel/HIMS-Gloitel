package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Designation;


import java.util.List;

public interface DesignationService {

     List<Designation> allDegignation();

    Designation createDesignation(Designation designation);
    void deleteDesignation(Long id);
    Designation getDesignationById(Long id);
}
