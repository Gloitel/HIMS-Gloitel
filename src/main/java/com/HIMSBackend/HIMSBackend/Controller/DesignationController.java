package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Designation;
import com.HIMSBackend.HIMSBackend.Model.State;
import com.HIMSBackend.HIMSBackend.Service.Interface.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    private DesignationService designationService;

    @PostMapping("/savedesignation")
    public Designation savedesignation(@RequestBody Designation designation) {
        return designationService.saveDegignation(designation);
    }

    @GetMapping("/alldesignation")
    public List<Designation> getAllState() {
        return designationService.allDegignation();
    }

}
