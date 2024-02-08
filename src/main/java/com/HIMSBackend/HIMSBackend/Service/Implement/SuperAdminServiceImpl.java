package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Enum.RoleType;
//import org.springframework.security.crypto.password.PasswordEncoder;
import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;

import com.HIMSBackend.HIMSBackend.Model.Admin;
import com.HIMSBackend.HIMSBackend.Model.Personal;
import com.HIMSBackend.HIMSBackend.Model.SuperAdmin;
import com.HIMSBackend.HIMSBackend.Repository.AdminRepository;
import com.HIMSBackend.HIMSBackend.Repository.SuperAdminRepository;
import com.HIMSBackend.HIMSBackend.Repository.SuperAdminRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.SuperAdminService;
import com.HIMSBackend.HIMSBackend.Service.Interface.SuperAdminService;
import com.HIMSBackend.HIMSBackend.Util.RandomPasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperAdminServiceImpl implements SuperAdminService {

    @Autowired
    SuperAdminRepository superAdminRepository;

    @Autowired
    AdminRepository adminRepository;
    //    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Autowired
    RandomPasswordGenerator passwordGenerator;

    @Override
    public SuperAdminResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto) {

        //Super master admin
        SuperAdmin sma = new SuperAdmin();

        sma.setName(superMasterAdminRequestDto.getName());
        sma.setEmail(superMasterAdminRequestDto.getEmail());
        sma.setEmailSet(true);
//        sma.setEmailVerified(true);
       // sma.setIssetIsEmailVerified(true);
        sma.setEmailVerified(true);
//        sma.setPhoneNumber(superMasterAdminRequestDto.getPhone_no());
        sma.setPersonal(new Personal(superMasterAdminRequestDto.getEmail(), superMasterAdminRequestDto.getPhone_no()));
        sma.setPhoneNumberSet(true);
        //sma.setPhoneNumberVerified(true);
        sma.setPhoneNumberVerified(true);
        sma.setRole(RoleType.valueOf("super_admin"));
        sma.setActivated(true);

//        String encPass = passwordEncoder.encode(superMasterAdminRequestDto.getPassword());
//        sma.setPassword(encPass);
        sma.setPassword(superMasterAdminRequestDto.getPassword());


        SuperAdmin savedSMA = superAdminRepository.save(sma);

     //   ResponseDto response = new ResponseDto();
        SuperAdminResponseDto res = new SuperAdminResponseDto();
//        String name;
        res.setName(savedSMA.getName());

//        String email;
        res.setEmail(savedSMA.getEmail());
//        String phone_number;
       // res.setPhone_number(savedSMAgetPhoneNumber());

        res.setPhone_number(savedSMA.getPersonal().getPersonalPhoneNumber());
//        boolean isActivated;
        res.setActivated(savedSMA.isActivated());
//        boolean isPasswordVerified;
       // res.setPasswordVerified(savedSMA.isEmailVerified());
        res.setPasswordVerified(savedSMA.isPasswordVerified());
//        boolean isPasswordSet;
        res.setPasswordSet(savedSMA.isPasswordSet());
//        boolean isPhoneNumberVerified;
        res.setPhoneNumberVerified(savedSMA.isPhoneNumberVerified());
//        boolean isPhoneNumberSet;
        res.setPhoneNumberSet(savedSMA.isPhoneNumberSet());
//        boolean isEmailVerified;
        res.setEmailVerified(savedSMA.isEmailVerified());
//        boolean isEmailSet;
        res.setEmailSet(savedSMA.isEmailSet());

//        response.setMessage("Congratulation "+savedSMA.getName()+" Your Id is "+savedSMA.getEmail()
//                +" and Role- "+savedSMA.getRole()+" has been successfully created");
//        response.setSuccess(true);

        return res;
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
}