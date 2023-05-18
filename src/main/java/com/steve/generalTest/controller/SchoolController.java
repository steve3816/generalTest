package com.steve.generalTest.controller;

import com.steve.generalTest.entity.School;
import com.steve.generalTest.entity.Student;
import com.steve.generalTest.repository.SchoolRepository;
import com.steve.generalTest.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("school")
public class SchoolController {

    @Autowired
    SchoolRepository schoolRepository;

    @PutMapping
    public void add(@RequestBody School schoolToAdd){
        schoolRepository.save(schoolToAdd);
    }

    @GetMapping
    public School get(Long id){
        return schoolRepository.findById(id).orElse(null);
    }

    @GetMapping("all")
    public List<School> getAll(){
        return schoolRepository.findAll();
    }
}
