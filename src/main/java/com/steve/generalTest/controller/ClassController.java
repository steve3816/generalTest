package com.steve.generalTest.controller;

import com.steve.generalTest.entity.Class;
import com.steve.generalTest.repository.ClassRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("class")
public class ClassController {

    @Autowired
    ClassRepository ClassRepository;

    @PutMapping
    public void add(@RequestBody Class classToAdd){
        ClassRepository.save(classToAdd);
    }
    
    @GetMapping
    public Class get(Long id){
        return ClassRepository.findById(id).orElse(null);
    }
    
    @GetMapping("all")
    public List<Class> getAll(){
        return ClassRepository.findAll();
    }
}
