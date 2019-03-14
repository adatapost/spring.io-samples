package in.amee.coaching.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class FeedbackDao implements Dao<Feedback> {

	private JdbcTemplate jdbc;

	public FeedbackDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(Feedback obj) {
		return jdbc.update("insert into feedback values(null,?,?,?,?)", 
				obj.getFeedDesc(), obj.getInstId(), U.now(),
				obj.getUserId()) == 1;
	}

	@Override
	public boolean update(Feedback obj) {
		return false;
	}

	@Override
	public boolean delete(Feedback obj) {
		return jdbc.update("delete from feedback where feed_id=?", obj.getFeedId()) == 1;
	}

	@Override
	public Feedback get(Feedback obj) {
		return null;
	}

	@Override
	public List<Feedback> gets() {
		return null;
	}

	@Override
	public List<Feedback> gets(int id) {

		return null;
	}
}
