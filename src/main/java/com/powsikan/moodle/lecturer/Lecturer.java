package com.powsikan.moodle.lecturer;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import com.powsikan.moodle.course.Course;

import lombok.Data;

/**
 * Lecturer
 */
@Data
@Entity
public class Lecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany
    private Set<Course> courses;

}