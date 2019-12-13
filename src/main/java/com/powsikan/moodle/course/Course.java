package com.powsikan.moodle.course;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import com.powsikan.moodle.lecturer.Lecturer;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Course
 */
@Data
@Entity
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    public Course(String name) {
        this.name = name;
    }
}