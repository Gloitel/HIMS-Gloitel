package com.HIMSBackend.HIMSBackend.Service.Implement;

import com.HIMSBackend.HIMSBackend.Model.Hr_Details;
import com.HIMSBackend.HIMSBackend.Repository.HrRepository;
import com.HIMSBackend.HIMSBackend.Service.Interface.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrServiceImpl implements HrService {

    @Autowired
    private HrRepository hrRepository;

    @Override
    public Hr_Details saveHrDetails(Hr_Details hr_details) {
        return hrRepository.save(hr_details);
    }

    @Override
    public List<Hr_Details> getAllHrDetails() {
        return hrRepository.findAll();
    }
}
