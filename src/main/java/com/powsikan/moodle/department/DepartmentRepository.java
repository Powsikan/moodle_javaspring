package com.powsikan.moodle.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * DepartmentRepository
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}