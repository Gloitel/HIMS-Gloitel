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

    @PostMapping("/saveRole")
    public ResponseEntity<?> saveRole(@RequestBody Role role) {
        return new ResponseEntity(roleService.saveRole(role), HttpStatus.CREATED);
    }

    @GetMapping("/allRole")
    public List<Role> getAllRole() {
        return roleService.allRole();
    }


}
