package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Department;
import com.HIMSBackend.HIMSBackend.Model.Role;
import com.HIMSBackend.HIMSBackend.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/saveRole")
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @GetMapping("/allRole")
    public List<Role> getAllRole() {
        return roleService.allRole();
    }


}
