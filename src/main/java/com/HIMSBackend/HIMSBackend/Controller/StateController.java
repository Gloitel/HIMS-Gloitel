package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.State;
import com.HIMSBackend.HIMSBackend.Service.Interface.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {


    @Autowired
    private StateService stateService;

    @PostMapping("/save")
    public ResponseEntity<?> saveState(@RequestBody State state) {
        try {
            return new ResponseEntity(stateService.saveState(state), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity("Please fill correct  State Details", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllState() {
        try {
            List<State> states = stateService.allState();
            return new ResponseEntity("", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Some Un catch exception comes with Get All State", HttpStatus.BAD_REQUEST);

        }
    }
}
