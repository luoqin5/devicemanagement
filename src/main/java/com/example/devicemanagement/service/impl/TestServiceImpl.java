package com.example.devicemanagement.service.impl;

import com.example.devicemanagement.dao.TestDAO;
import com.example.devicemanagement.domain.Test;
import com.example.devicemanagement.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDAO testDAO;

    @Override
    public String test(String str) {
        Test byName = testDAO.findByName(str);
        return byName.getName()+byName.getId();
    }
}
