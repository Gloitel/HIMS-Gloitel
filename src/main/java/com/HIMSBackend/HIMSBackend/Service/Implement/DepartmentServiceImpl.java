package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Model.Department;
import com.HIMSBackend.HIMSBackend.Repository.DepartmentRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> allDepartments() {
        return departmentRepository.findAll();
    }
}
