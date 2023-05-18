package com.steve.generalTest.controller;

import com.steve.generalTest.entity.Student;
import com.steve.generalTest.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PutMapping
    public void add(@RequestBody Student studentToAdd){
        studentRepository.save(studentToAdd);
    }

    @GetMapping
    public Student get(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    @GetMapping("all")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
}
