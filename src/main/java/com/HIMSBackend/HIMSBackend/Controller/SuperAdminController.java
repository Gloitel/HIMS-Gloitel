package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Dto.Request.AdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Request.SuperAdminRequestDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.AdminResponseDto;
import com.HIMSBackend.HIMSBackend.Dto.Response.SuperAdminResponseDto;
import com.HIMSBackend.HIMSBackend.Model.Admin;
import com.HIMSBackend.HIMSBackend.Service.Interface.SuperAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("super-admin")
public class SuperAdminController {

    @Autowired
    SuperAdminService superAdminService;

    @PostMapping("/create")
    public ResponseEntity createSuperMasterAdmin(@RequestBody SuperAdminRequestDto superMasterAdminRequestDto){

        Map<String, Object> payload = new HashMap<>();
        try{
            SuperAdminResponseDto response = superAdminService.createSuperMasterAdmin(superMasterAdminRequestDto);
            payload.put("payload",response);
            payload.put("message","SuccessFully Created SuperAdmin");
            payload.put("status code",HttpStatus.CREATED.value());
            payload.put("Success",true);

            return new ResponseEntity(payload, HttpStatus.CREATED);
        }
        catch(Exception e){
            e.printStackTrace();
            payload.put("payload","Null");
            payload.put("message","Not Created");
            payload.put("status code",HttpStatus.BAD_REQUEST.value());
            payload.put("Success",false);
            return new ResponseEntity("Please fill all mendatory fields", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get-all-admins")
    public ResponseEntity getAllAdmins(){
        Map<String, Object> payload = new HashMap<>();

        List<Admin> admins = superAdminService.getAllAdmins();

        payload.put("List of all admin",admins);
        payload.put("message","SuccessFully Created SuperAdmin");
        payload.put("status code",HttpStatus.ACCEPTED.value());
        payload.put("Success",true);
        return new ResponseEntity(payload, HttpStatus.ACCEPTED);
    }

    //crate admin api
    @PutMapping("/add-admin")
    public ResponseEntity addAdmin(@RequestBody AdminRequestDto adminRequestDto){

        Map<String, Object> payload = new HashMap<>();
        try{
            AdminResponseDto response = superAdminService.addAdmin(adminRequestDto);
            payload.put("payload",response);
            payload.put("message","SuccessFully Created SuperAdmin");
            payload.put("status code",HttpStatus.CREATED.value());
            payload.put("Success",true);

            return new ResponseEntity(payload, HttpStatus.CREATED);
        }
        catch(Exception e){
            e.printStackTrace();
            payload.put("payload","Null");
            payload.put("message","Not Created");
            payload.put("status code",HttpStatus.BAD_REQUEST.value());
            payload.put("Success",false);
            return new ResponseEntity("Please fill all mendatory fields", HttpStatus.BAD_REQUEST);
        }
    }

}
