package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Dto.Request.AdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.AdminResponseDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SuperAdminService {
    SuperAdminResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto);

    List<Admin> getAllAdmins();

    AdminResponseDto addAdmin(AdminRequestDto adminRequestDto);
}
