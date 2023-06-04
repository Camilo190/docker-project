package com.camilo.myspringproject.service.interfaces;

import com.camilo.myspringproject.model.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITestService {
    public List<Test> getAll();
}
