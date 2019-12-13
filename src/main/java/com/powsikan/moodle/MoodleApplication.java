package com.powsikan.moodle;

import com.powsikan.moodle.course.Course;
import com.powsikan.moodle.course.CourseRepository;
import com.powsikan.moodle.lecturer.Lecturer;
import com.powsikan.moodle.lecturer.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MoodleApplication implements CommandLineRunner {

	@Autowired
	LecturerRepository lecturerRepository;
	@Autowired
	CourseRepository courseRepository;
	public static void main(String[] args) {
		SpringApplication.run(MoodleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Lecturer lecturer=new Lecturer("lec");
//		Course course = new Course("Cou");
//
//		courseRepository.save(course);
//
//
//		Set<Course> courses = new HashSet<Course>();
//		courses.add(course);
//
//
//		lecturer.setCourses(courses);
//		lecturerRepository.save(lecturer);





	}
}
