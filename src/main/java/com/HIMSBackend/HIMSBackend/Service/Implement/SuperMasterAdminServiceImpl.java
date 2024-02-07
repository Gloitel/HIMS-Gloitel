package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Enum.RoleType;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.ResponseDto;
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
    public ResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto) {

        //Super master admin
        SuperAdmin sma = new SuperAdmin();

        sma.setName(superMasterAdminRequestDto.getName());
        sma.setEmail(superMasterAdminRequestDto.getEmail());
        sma.setEmailSet(true);
        sma.setEmailVerified(true);
        sma.setPhoneNumber(superMasterAdminRequestDto.getPhone_no());
        sma.setPhoneNumberSet(true);
        sma.setPhoneNumberVerified(true);
        sma.setRole(RoleType.valueOf("super_admin"));
        sma.setActivated(true);

        String encPass = passwordEncoder.encode(superMasterAdminRequestDto.getPassword());
        sma.setPassword(encPass);

        SuperAdmin savedSMA = superMasterAdminRepository.save(sma);

        ResponseDto response = new ResponseDto();


        response.setMessage("Congratulation "+savedSMA.getName()+" Your Id is "+savedSMA.getEmail()
                +" and Role- "+savedSMA.getRole()+" has been successfully created");
        response.setSuccess(true);

        return response;
    }
}
