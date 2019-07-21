package com.powsikan.moodle.course;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * CourseRepository
 */

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}