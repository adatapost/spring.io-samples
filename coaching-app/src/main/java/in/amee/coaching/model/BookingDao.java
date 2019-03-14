package in.amee.coaching.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookingDao implements Dao<Booking> {
	 private JdbcTemplate jdbc;	
	 public BookingDao(JdbcTemplate jdbc) { this.jdbc = jdbc; }
	@Override
	public boolean add(Booking obj) {
		try {
			return jdbc.update("insert into booking values (null,?,?,?,?)",obj.getCourseId(),obj.getCreated(),obj.getUserId(),obj.getPaymentMethod(),obj)==1;
		}catch(Exception e) {
			System.out.println("exception booking add:"+e);
		}
		return false;
	}

	@Override
	public boolean update(Booking obj) {
		try {
			return jdbc.update("update booking set course_id=?,created=?,user_id=?,payment_method=? where booking_id=?",obj.getCourseId(),obj.getCreated(),obj.getUserId(),obj.getPaymentMethod(),obj,obj.getPaymentMethod())==1;
		}catch(Exception e) {
			System.out.println("exception booking update:"+e);
		}
		return false;
	}

	@Override
	public boolean delete(Booking obj) {
		try {
			return jdbc.update("delete from booking where booking_id=?",obj.getBookId())==1;
		}catch(Exception e) {
			System.out.println("exception booking delete:"+e);
		}
		return false;
	}

	@Override
	public Booking get(Booking obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> gets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> gets(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
