package com.HIMSBackend.HIMSBackend.Controller;

import com.HIMSBackend.HIMSBackend.Model.State;
import com.HIMSBackend.HIMSBackend.Service.Interface.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StateController {


    @Autowired
    private StateService stateService;

    @PostMapping("/savestate")
    public State saveState(@RequestBody State state) {
        return stateService.saveState(state);
    }

    @GetMapping("/allstate")
    public List<State> getAllState() {
        return stateService.allState();
    }
}
