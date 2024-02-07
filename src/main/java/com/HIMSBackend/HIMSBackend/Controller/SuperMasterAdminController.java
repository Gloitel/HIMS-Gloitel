package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Service.Interface.SuperMasterAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("super-master-admin")
public class SuperMasterAdminController {

    @Autowired
    SuperMasterAdminService superMasterAdminService;

    @PostMapping("/create")
    public ResponseEntity createSuperMasterAdmin(@RequestBody SuperAdminRequestDto superMasterAdminRequestDto){
        try{
            SuperAdminResponseDto response = superMasterAdminService.createSuperMasterAdmin(superMasterAdminRequestDto);
            return new ResponseEntity(response, HttpStatus.CREATED);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity("Please fill all mendatory fields", HttpStatus.BAD_REQUEST);
        }
    }
}
