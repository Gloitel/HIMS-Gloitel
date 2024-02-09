package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Dto.Request.AdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.AdminResponseDto;
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
    public SuperAdminResponseDto createSuperMasterAdmin(SuperAdminRequestDto superAdminRequestDto) {

        //Super master admin
        SuperAdmin sma = new SuperAdmin();

        sma.setName(superAdminRequestDto.getName());
        sma.setEmail(superAdminRequestDto.getEmail());
        sma.setEmailSet(true);
        sma.setEmailVerified(true);
        sma.setPersonal(new Personal(superAdminRequestDto.getEmail(), superAdminRequestDto.getPhone_no()));
        sma.setPhoneNumberSet(true);
        sma.setPhoneNumberVerified(true);
        sma.setRole(RoleType.valueOf("super_admin"));
        sma.setActivated(true);

        sma.setPassword(superAdminRequestDto.getPassword());


        SuperAdmin savedSMA = superAdminRepository.save(sma);

        SuperAdminResponseDto res = new SuperAdminResponseDto();
        res.setName(savedSMA.getName());
        res.setEmail(savedSMA.getEmail());
        res.setPhone_number(savedSMA.getPersonal().getPersonalPhoneNumber());
        res.setActivated(savedSMA.isActivated());
        res.setPasswordVerified(savedSMA.isPasswordVerified());
        res.setPasswordSet(savedSMA.isPasswordSet());
        res.setPhoneNumberVerified(savedSMA.isPhoneNumberVerified());
        res.setPhoneNumberSet(savedSMA.isPhoneNumberSet());
        res.setEmailVerified(savedSMA.isEmailVerified());
        res.setEmailSet(savedSMA.isEmailSet());

        return res;
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public AdminResponseDto addAdmin(AdminRequestDto adminRequestDto) {

        //Fill admin detail with admindto
        Admin ad = new Admin();
        ad.setName(adminRequestDto.getName());
        ad.setEmail(adminRequestDto.getEmail());
        ad.setEmailSet(true);
        ad.setEmailVerified(true);
        ad.setPersonal(new Personal(adminRequestDto.getEmail(), adminRequestDto.getPhone_no()));
        ad.setPhoneNumberSet(true);
        ad.setPhoneNumberVerified(true);
        ad.setRole(RoleType.valueOf("admin"));
        ad.setActivated(true);

        // random password generator
        String pass = RandomPasswordGenerator.generateRandomString(6);
        ad.setPassword(pass);

        Admin savedAdmin = adminRepository.save(ad);

        //Add response for admin
        AdminResponseDto res = new AdminResponseDto();

        res.setName(savedAdmin.getName());
        res.setEmail(savedAdmin.getEmail());
        res.setPhone_number(savedAdmin.getPersonal().getPersonalPhoneNumber());
        res.setActivated(savedAdmin.isActivated());
        res.setPasswordVerified(savedAdmin.isPasswordVerified());
        res.setPasswordSet(savedAdmin.isPasswordSet());
        res.setPhoneNumberVerified(savedAdmin.isPhoneNumberVerified());
        res.setPhoneNumberSet(savedAdmin.isPhoneNumberSet());
        res.setEmailVerified(savedAdmin.isEmailVerified());
        res.setEmailSet(savedAdmin.isEmailSet());

        SuperAdmin superAdmin = superAdminRepository.findById(1L).get();
        List<Admin> adminList = superAdmin.getAdminList();
        adminList.add(ad);

        superAdmin.setAdminList(adminList);
        superAdminRepository.save(superAdmin);

        return res;
    }
}