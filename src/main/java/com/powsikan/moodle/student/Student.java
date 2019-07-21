package com.powsikan.moodle.student;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.powsikan.moodle.department.Department;

import lombok.Data;

/**
 * Student
 */

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Integer year;

    @ManyToMany
    private Set<Department> departments;

}