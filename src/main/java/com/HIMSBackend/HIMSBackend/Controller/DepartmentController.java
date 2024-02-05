package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Department;
import com.HIMSBackend.HIMSBackend.Service.Interface.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

//    @PostMapping("/saveDepartment")
//    public ResponseEntity<?> saveDepartment(@RequestBody Department department) {
//        return new ResponseEntity(departmentService.saveDepartment(department), HttpStatus.CREATED);
//    }

    @GetMapping("/getAll")
    public ResponseEntity getAllDepartments() {
        try
        {
            List<Department> departments = departmentService.allDepartments();
            return new ResponseEntity(departments, HttpStatus.ACCEPTED);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new ResponseEntity("Some Un catch exception comes with Get All Department", HttpStatus.BAD_REQUEST);
        }
    }



    @PostMapping("/save")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        try {
            Department savedDepartment = departmentService.createDepartment(department);
            return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity("Please fill correct  Department Details", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        Department department = departmentService.getDepartmentById(id);
        return ResponseEntity.ok(department);
    }






}
