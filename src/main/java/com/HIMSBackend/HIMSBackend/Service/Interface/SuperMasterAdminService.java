package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface SuperMasterAdminService {
    ResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto);
}
