package com.powsikan.moodle.student;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * StudentRepository
 */
@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

}