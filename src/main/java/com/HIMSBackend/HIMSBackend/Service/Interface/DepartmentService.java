package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> allDepartments();

}
