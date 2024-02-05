package com.HIMSBackend.HIMSBackend.Controller;


import com.HIMSBackend.HIMSBackend.Model.Role;
import com.HIMSBackend.HIMSBackend.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/save")
    public ResponseEntity<?> saveRole(@RequestBody Role role) {
        try {
            return new ResponseEntity(roleService.saveRole(role), HttpStatus.CREATED);
        }catch (Exception e)
        {
            return new ResponseEntity("Please fill correct  Role Details", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/all")
    public ResponseEntity getAllRole() {
        try {
            List<Role> roles = roleService.allRole();
            return new ResponseEntity(roles, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Some Un catch exception comes with Get All Role", HttpStatus.BAD_REQUEST);
        }


    }

}
