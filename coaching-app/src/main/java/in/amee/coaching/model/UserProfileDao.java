package in.amee.coaching.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserProfileDao implements Dao<UserProfile> {
	private JdbcTemplate jdbc;

	public UserProfileDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(UserProfile obj) {
		return jdbc.update(
				"insert into user_profile(user_id,first_name,last_name,gender,conatct,address,city_id) values(?,?,?,?,?,?,?)",
				obj.getUserId(), obj.getFirstName(), obj.getLastName(), obj.getGender(), obj.getContact(),
				obj.getAddress(), obj.getCityId()) == 1;
	}

	public boolean addImage(UserProfile obj) {
		return jdbc.update("update user_profile set photo=? where user_id=?", obj.getPhoto(), obj.getUserId()) == 1;
	}

	@Override
	public boolean update(UserProfile obj) {
		return jdbc.update(
				"update user_profile set first_name=?,last_name=?,gender=?,contact=?,address=?,city_id=? where user_id=?",
				obj.getFirstName(), obj.getLastName(), obj.getGender(), obj.getContact(), obj.getAddress(),
				obj.getCityId(), obj.getUserId()) == 1;
	}

	@Override
	public boolean delete(UserProfile obj) {
		return jdbc.update("delete from user_profile where user_id=?", obj.hashCode()) == 1;
	}

	@Override
	public UserProfile get(UserProfile obj) {
		return null;
	}

	@Override
	public List<UserProfile> gets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserProfile> gets(int id) {
		throw new RuntimeException("not implemented");
	}

}
