package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.Designation;
import com.HIMSBackend.HIMSBackend.Service.Interface.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    private DesignationService designationService;


    @GetMapping("/all")
    public List<Designation> getAllState() {
        return designationService.allDegignation();
    }



    @PostMapping("/save")
    public ResponseEntity<Designation> createDesignation(@RequestBody Designation designation) {
        Designation savedDesignation = designationService.createDesignation(designation);
        return new ResponseEntity<>(savedDesignation, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDesignation(@PathVariable Long id) {
        designationService.deleteDesignation(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Designation> getDesignationById(@PathVariable Long id) {
        Designation designation = designationService.getDesignationById(id);
        return ResponseEntity.ok(designation);
    }

}
