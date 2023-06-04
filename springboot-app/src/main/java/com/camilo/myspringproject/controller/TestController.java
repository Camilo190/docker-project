package com.camilo.myspringproject.controller;

import com.camilo.myspringproject.dto.TestDTO;
import com.camilo.myspringproject.mappers.TestMapper;
import com.camilo.myspringproject.service.interfaces.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
@CrossOrigin(maxAge = 3600)
public class TestController {
    private ITestService testService;
    @GetMapping("/all")
    public ResponseEntity<List<TestDTO>> getAll(){
        return new ResponseEntity<>(this.testService.getAll().stream().
                map(TestMapper.INSTANCE::toTestDTO).collect(Collectors.toList()),
                HttpStatus.OK);
    }

    @Autowired
    public void setTestService(ITestService testService) {
        this.testService = testService;
    }
}
