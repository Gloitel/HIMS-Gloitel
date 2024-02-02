package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Designation;
import com.HIMSBackend.HIMSBackend.Model.Role;

import java.util.List;

public interface DesignationService {

    Designation saveDegignation(Designation designation);

    List<Designation> allDegignation();
}
