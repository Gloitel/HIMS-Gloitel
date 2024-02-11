package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Dto.Request.AdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.AdminResponseDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Model.Admin;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public interface SuperAdminService {
    SuperAdminResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto);

    Page<Admin> getAllAdmins(Pageable pageable);

    AdminResponseDto addAdmin(AdminRequestDto adminRequestDto);
}
