package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Dto.Request.SuperMasterAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperMasterAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Model.Country;
import com.HIMSBackend.HIMSBackend.Model.SuperMasterAdmin;
import com.HIMSBackend.HIMSBackend.Repository.SuperMasterAdminRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.SuperMasterAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperMasterAdminServiceImpl implements SuperMasterAdminService {

    @Autowired
    SuperMasterAdminRepository superMasterAdminRepository;

    @Override
    public SuperMasterAdminResponseDto createSuperMasterAdmin(SuperMasterAdminRequestDto superMasterAdminRequestDto) {
        SuperMasterAdminResponseDto response = new SuperMasterAdminResponseDto();

        //Super master admin
        SuperMasterAdmin sma = new SuperMasterAdmin();
        sma.setCompany_name(superMasterAdminRequestDto.getCompany_name());
        sma.setComapny_type(superMasterAdminRequestDto.getComapny_type());
        sma.setCeo_name(superMasterAdminRequestDto.getCeo_name());
        sma.setMobile_no(superMasterAdminRequestDto.getMobile_no());
        sma.setEmail(superMasterAdminRequestDto.getEmail());
        sma.setAddress(superMasterAdminRequestDto.getAddress());
        sma.setPan_no(superMasterAdminRequestDto.getPan_no());
        sma.setAadhar_no(superMasterAdminRequestDto.getAadhar_no());
        sma.setGst_no(superMasterAdminRequestDto.getGst_no());
        sma.setPassword(superMasterAdminRequestDto.getPassword());
        sma.setCountry(superMasterAdminRequestDto.getCountry());

        SuperMasterAdmin savedSMA = superMasterAdminRepository.save(sma);



        return response;
    }
}
