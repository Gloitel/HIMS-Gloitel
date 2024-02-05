package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Model.State;
import com.HIMSBackend.HIMSBackend.Repository.StateRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

   @Autowired
   private StateRepository stateRepository;

    @Override
    public State saveState(State state) {
        return  stateRepository.save(state);
    }

    @Override
    public List<State> allState() {
        return stateRepository.findAll();
    }
}
