package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Dto.Request.SuperMasterAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperMasterAdminResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface SuperMasterAdminService {
    SuperMasterAdminResponseDto createSuperMasterAdmin(SuperMasterAdminRequestDto superMasterAdminRequestDto);
}
