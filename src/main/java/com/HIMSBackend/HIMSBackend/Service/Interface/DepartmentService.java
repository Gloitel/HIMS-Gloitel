package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Department;

import java.util.List;

public interface DepartmentService {


    List<Department> allDepartments();

    Department createDepartment(Department department);
    void deleteDepartment(Long id);
    Department getDepartmentById(Long id);

//    @Service
//    class SuperMasterAdminServiceImpl implements SuperAdminService {
//
//        @Autowired
//        SuperAdminRepository superAdminRepository;
//
//    //    @Autowired
//    //    private PasswordEncoder passwordEncoder;
//        @Autowired
//    RandomPasswordGenerator passwordGenerator;
//
//        @Override
//        public SuperAdminResponseDto createSuperMasterAdmin(SuperAdminRequestDto superMasterAdminRequestDto) {
//
//            //Super master admin
//            SuperAdmin sma = new SuperAdmin();
//
//            sma.setName(superMasterAdminRequestDto.getName());
//            sma.setEmail(superMasterAdminRequestDto.getEmail());
//            sma.setEmailSet(true);
//            sma.setEmailVerified(true);
//            sma.setPhoneNumber(superMasterAdminRequestDto.getPhone_no());
//            sma.setPhoneNumberSet(true);
//            sma.setPhoneNumberVerified(true);
//            sma.setRole(RoleType.valueOf("super_admin"));
//            sma.setActivated(true);
//
//    //        String encPass = passwordEncoder.encode(superMasterAdminRequestDto.getPassword());
//    //        sma.setPassword(encPass);
//            sma.setPassword(superMasterAdminRequestDto.getPassword());
//
//
//            SuperAdmin savedSMA = superAdminRepository.save(sma);
//
//            ResponseDto response = new ResponseDto();
//            SuperAdminResponseDto res = new SuperAdminResponseDto();
//    //        String name;
//            res.setName(savedSMA.getName());
//    //        String email;
//            res.setEmail(savedSMA.getEmail());
//    //        String phone_number;
//            res.setPhone_number(savedSMA.getPhoneNumber());
//    //        boolean isActivated;
//            res.setActivated(savedSMA.isActivated());
//    //        boolean isPasswordVerified;
//            res.setPasswordVerified(savedSMA.isEmailVerified());
//    //        boolean isPasswordSet;
//            res.setPasswordSet(savedSMA.isPasswordSet());
//    //        boolean isPhoneNumberVerified;
//            res.setPhoneNumberVerified(savedSMA.isPhoneNumberVerified());
//    //        boolean isPhoneNumberSet;
//            res.setPhoneNumberSet(savedSMA.isPhoneNumberSet());
//    //        boolean isEmailVerified;
//            res.setEmailVerified(savedSMA.isEmailVerified());
//    //        boolean isEmailSet;
//            res.setEmailSet(savedSMA.isEmailSet());
//
//    //        response.setMessage("Congratulation "+savedSMA.getName()+" Your Id is "+savedSMA.getEmail()
//    //                +" and Role- "+savedSMA.getRole()+" has been successfully created");
//    //        response.setSuccess(true);
//
//            return res;
//        }
//    }
}
