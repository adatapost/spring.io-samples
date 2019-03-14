package in.amee.coaching.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class CourseDao implements Dao<Course> {

	private JdbcTemplate jdbc;

	public CourseDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(Course obj) {
		return jdbc.update("insert into course values(null,?,?,1,?,?,?,?)", obj.getCourseName(), obj.getInstId(),
				obj.getCourseDesc(), obj.getCourseFees(), U.now(), U.now()) == 1;
	}

	@Override
	public boolean update(Course obj) {
		return jdbc.update(
				"update course set course_name=?,inst_id=?,course_desc=?,course_fees=?,updated=? where course_id=?",
				obj.getCourseName(), obj.getInstId(), obj.getCourseDesc(), obj.getCourseFees(), U.now(),
				obj.getCourseId()) == 1;
	}

	@Override
	public boolean delete(Course obj) {
		return jdbc.update("delete from course where course_id=?", obj.getCourseId()) == 1;
	}

	@Override
	public Course get(Course obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> gets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> gets(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
