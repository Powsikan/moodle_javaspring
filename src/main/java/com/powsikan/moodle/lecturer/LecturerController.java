package com.powsikan.moodle.lecturer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LecturerController
 */

@RestController
@RequestMapping("api/Department")
public class LecturerController {
    private LecturerRepository lecturerRepository;

    public LecturerController(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    @PostMapping
    public Lecturer create(@RequestBody Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

}