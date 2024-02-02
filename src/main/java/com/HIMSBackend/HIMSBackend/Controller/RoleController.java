package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Department;
import com.HIMSBackend.HIMSBackend.Model.Role;
import com.HIMSBackend.HIMSBackend.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/saverole")
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @GetMapping("/allrole")
    public List<Role> getAllRole() {
        return roleService.allRole();
    }


}
