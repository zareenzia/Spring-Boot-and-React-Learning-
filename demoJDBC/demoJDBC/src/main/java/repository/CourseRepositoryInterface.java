package repository;

import java.util.List;

import model.Course;

public interface CourseRepositoryInterface {
    int save(Course course);

    int update(Course course);

    List<Course> findAll();

}
