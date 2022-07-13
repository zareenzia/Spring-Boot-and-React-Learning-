package com.zareen.springBootJDBC.demoJDBC;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import model.Course;
import repository.CourseRepositoryInterface;

@SpringBootApplication
@ComponentScan(value = {"repository"})
public class DemoJdbcApplication implements CommandLineRunner {
	
	 @Autowired
	    JdbcTemplate jdbcTemplate;
	 
	 @Autowired
	 @Qualifier("jdbcCourseRepository") 
	 private CourseRepositoryInterface courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		startCourseApp();
		
	}
	
	void startCourseApp() {
		 jdbcTemplate.execute("DROP TABLE IF EXISTS course");
		 jdbcTemplate.execute("CREATE TABLE course (\n"
		 		+ "  id INT NOT NULL AUTO_INCREMENT,\n"
		 		+ "  title VARCHAR(45) NULL,\n"
		 		+ "  description VARCHAR(45) NULL,\n"
		 		+ "  PRIMARY KEY (id));");
		 
		 
		 List<Course> courses = Arrays.asList(
	                new Course("Java", "Intro to Java"),
	                new Course("OOP", "Intro to oop"),
	                new Course("Math","Mathematics"),
	                new Course("English","Basic English")
	        );
		 
		 System.out.println("Saving all data to course table");
		 
		 courses.forEach(course -> {
			 System.out.println( "Saving "+course.getTitle());
	            courseRepository.save(course);
	        });
		 
		 courses = courseRepository.findAll();
		 System.out.println(courses);
		 
		 courses.get(2).setTitle("Physics");
		 courseRepository.update(courses.get(2));
		 
		 courses = courseRepository.findAll();
		 System.out.println(courses);	 
	}
}
