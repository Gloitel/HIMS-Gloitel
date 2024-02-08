package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.ResponseDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Service.Interface.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("super-master-admin")
public class SuperAdminController {

    @Autowired
    SuperAdminService superMasterAdminService;

    @PostMapping("/create")
    public ResponseEntity createSuperMasterAdmin(@RequestBody SuperAdminRequestDto superMasterAdminRequestDto){

        Map<String, Object> payload = new HashMap<>();
        try{
            SuperAdminResponseDto response = superMasterAdminService.createSuperMasterAdmin(superMasterAdminRequestDto);
            payload.put("payload",response);
            payload.put("message","SuccessFully Created SuperAdmin");
            payload.put("status code",201);
            payload.put("Success",true);

            return new ResponseEntity(payload, HttpStatus.CREATED);
        }
        catch(Exception e){
            e.printStackTrace();
            payload.put("payload","Null");
            payload.put("message","Not Created");
            payload.put("status code",HttpStatus.BAD_REQUEST);
            payload.put("Success",false);
            return new ResponseEntity("Please fill all mendatory fields", HttpStatus.BAD_REQUEST);
        }
    }
}
