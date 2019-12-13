package com.powsikan.moodle.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentController
 */
@RestController
@RequestMapping("api/student")

public class StudentController {
    @Autowired
    private StudentRepository studentRepository;


    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}