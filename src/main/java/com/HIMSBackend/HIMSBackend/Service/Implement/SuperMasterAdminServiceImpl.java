package com.HIMSBackend.HIMSBackend.Service.Implement;

import org.springframework.security.crypto.password.PasswordEncoder;
import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Model.SuperAdmin;
import com.HIMSBackend.HIMSBackend.Repository.SuperMasterAdminRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.SuperMasterAdminService;
import com.HIMSBackend.HIMSBackend.Util.RandomPasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperMasterAdminServiceImpl implements SuperMasterAdminService {

    @Autowired
    SuperMasterAdminRepository superMasterAdminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    RandomPasswordGenerator passwordGenerator;

    @Override
    public SuperAdminResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto) {
        SuperAdminResponseDto response = new SuperAdminResponseDto();

        //Super master admin
        SuperAdmin sma = new SuperAdmin();
        sma.setCompany_name(superMasterAdminRequestDto.getCompany_name());
        sma.setComapny_type(superMasterAdminRequestDto.getComapny_type());
        sma.setCeo_name(superMasterAdminRequestDto.getCeo_name());
        sma.setMobile_no(superMasterAdminRequestDto.getMobile_no());
        sma.setEmail(superMasterAdminRequestDto.getEmail());
        sma.setAddress(superMasterAdminRequestDto.getAddress());
        sma.setPan_no(superMasterAdminRequestDto.getPan_no());
        sma.setAadhar_no(superMasterAdminRequestDto.getAadhar_no());
        sma.setGst_no(superMasterAdminRequestDto.getGst_no());
        sma.setCountry(superMasterAdminRequestDto.getCountry());

        String raw = passwordGenerator.generateRandomString(6);
        String encPass = passwordEncoder.encode(raw);
        sma.setPassword(encPass);
//        sma.setRole();

        SuperAdmin savedSMA = superMasterAdminRepository.save(sma);




        return response;
    }
}
