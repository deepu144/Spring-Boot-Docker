package com.deepu.demospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/save")
    public void save(@RequestBody List<Student> li){
        studentRepository.saveAll(li);
    }
    @GetMapping("")
    public List<Student> get(){
        return studentRepository.findAll();
    }
}
