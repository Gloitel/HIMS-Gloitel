package com.HIMSBackend.HIMSBackend.Service.Interface;


import com.HIMSBackend.HIMSBackend.Model.Role;
import com.HIMSBackend.HIMSBackend.Model.State;

import java.util.List;

public interface StateService {


    State saveState(State state);

    List<State> allState();

}
