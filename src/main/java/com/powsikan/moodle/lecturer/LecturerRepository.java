package com.powsikan.moodle.lecturer;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * LecturerRepository
 */
@Repository
public interface LecturerRepository extends PagingAndSortingRepository<Lecturer, Long> {

}