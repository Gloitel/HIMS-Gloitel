package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.ResponseDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface SuperMasterAdminService {
    SuperAdminResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto);
}
