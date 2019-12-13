package com.powsikan.moodle.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * CourseRepository
 */

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}