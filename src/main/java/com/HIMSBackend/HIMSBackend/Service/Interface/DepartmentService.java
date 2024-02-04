package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Department;

import java.util.List;

public interface DepartmentService {


    List<Department> allDepartments();

    Department createDepartment(Department department);
    void deleteDepartment(Long id);
    Department getDepartmentById(Long id);

}
