package com.powsikan.moodle.lecturer;

import com.powsikan.moodle.course.Course;
import com.powsikan.moodle.course.CourseRepository;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

/**
 * LecturerController
 */

@RestController
@RequestMapping("api/lecturer")
public class LecturerController {
    @Autowired
    private LecturerRepository lecturerRepository;
    @Autowired
    private CourseRepository courseRepository;


    @PostMapping
    public Lecturer create(@RequestBody Lecturer lecturer) {
        Lecturer lecturerD = lecturerRepository.getOne(lecturer.getId());

        Set<Course> courses = new HashSet<>();
        courses.addAll(lecturerD.getCourses());
        courses.addAll(lecturer.getCourses());
        lecturerD.setCourses(courses);

        courseRepository.saveAll(lecturer.getCourses());

        return lecturerRepository.save(lecturerD);
    }



}