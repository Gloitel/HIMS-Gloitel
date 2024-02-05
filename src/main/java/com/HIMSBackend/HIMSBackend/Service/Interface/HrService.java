package com.HIMSBackend.HIMSBackend.Service.Interface;

import com.HIMSBackend.HIMSBackend.Model.Hr_Details;

import java.util.List;

public interface HrService {

    Hr_Details saveHrDetails(Hr_Details hr_details);

    List<Hr_Details>getAllHrDetails();

}
