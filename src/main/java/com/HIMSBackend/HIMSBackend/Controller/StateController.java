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

    @PostMapping("/saveState")
    public ResponseEntity<?> saveState(@RequestBody State state) {
        return new ResponseEntity(stateService.saveState(state), HttpStatus.CREATED);
    }

    @GetMapping("/allState")
    public List<State> getAllState() {
        return stateService.allState();
    }
}
