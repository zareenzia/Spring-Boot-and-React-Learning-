package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Course;

@Repository
@Qualifier("jdbcCourseRepository")
public class JDBCCourseRepository implements CourseRepositoryInterface{
	
    @Autowired
    private JdbcTemplate jdbcTemplate;


	@Override
	public int save(Course course) {
		return jdbcTemplate.update("insert into course (title, description) values(?,?)",
				course.getTitle(),course.getDescription()
				);
	}

	@Override
	public int update(Course course) {
	
		return jdbcTemplate.update(
                "update course set title = ? where id = ?",
                course.getTitle(), course.getId());
	}

	@Override
	public List<Course> findAll() {
	     return jdbcTemplate.query(
	                "select * from course",
	                (rs, rowNum) ->
	                        new Course(
	                                rs.getInt("id"),
	                                rs.getString("title"),
	                                rs.getString("description")
	                        )
	        );
	}
}
