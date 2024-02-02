package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Model.Role;
import com.HIMSBackend.HIMSBackend.Repository.RoleRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> allRole() {
        return roleRepository.findAll();
    }
}
