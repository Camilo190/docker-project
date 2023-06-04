package com.camilo.myspringproject.service.impl;

import com.camilo.myspringproject.model.Test;
import com.camilo.myspringproject.service.interfaces.ITestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements ITestService {

    @Override
    public List<Test> getAll() {
        List<Test> testList = new ArrayList<>();
        Test test = new Test();
        test.setId(1L);
        test.setData("Hello World!");
        testList.add(test);
        return testList;
    }
}
