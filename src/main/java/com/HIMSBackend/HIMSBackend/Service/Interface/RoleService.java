package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Department;
import com.HIMSBackend.HIMSBackend.Model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

    Role saveRole(Role role);

    List<Role> allRole();

}
