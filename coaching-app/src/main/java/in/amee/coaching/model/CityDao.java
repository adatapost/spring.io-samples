package in.amee.coaching.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CityDao implements Dao<City> {
	private JdbcTemplate jdbc;

	public CityDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(City obj) {
		try {
			return jdbc.update("insert into city values (null,?,?,?)", obj.getCityName(), obj.getStateId(),
					obj.getCountryId()) == 1;
		} catch (Exception e) {
			System.out.println("exception city add:" + e);
		}
		return false;
	}

	@Override
	public boolean update(City obj) {
		return jdbc.update("update city set city_name=?,state_id=?,country_id=? where city_id=?", obj.getCityName(),
				obj.getStateId(), obj.getCountryId(), obj.getCityId()) == 1;
	}

	@Override
	public boolean delete(City obj) {
		return jdbc.update("delete from city where city_id=?", obj.getCityId()) == 1;
	}

	@Override
	public City get(City obj) {
		List<City> list = jdbc.query("select * from cityview where city_id=?", rowMapper, obj.getCityId());
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@Override
	public List<City> gets() {
		return jdbc.query("select * from cityview", rowMapper);
	}

	public List<City> getFromState(City obj) {
		try {
			return jdbc.query("select * from cityview where state_id=? and country_id=?",
					new Object[] { obj.getStateId(), obj.getCountryId() }, rowMapper);
		} catch (Exception e) {
			System.out.println("Error users-gets=>" + e);
		}
		return null;
	}

	public List<City> getFState(City obj) {
		try {
			return jdbc.query("select * from cityview where state_id=?", new Object[] { obj.getStateId() }, rowMapper);
		} catch (Exception e) {
			System.out.println("Error users-gets=>" + e);
		}
		return null;
	}

	public List<City> getFromCountry(City obj) {
		try {
			return jdbc.query("select * from cityview where country_id=?", new Object[] { obj.getCountryId() },
					rowMapper);
		} catch (Exception e) {
			System.out.println("Error users-gets=>" + e);
		}
		return null;
	}

	@Override
	public List<City> gets(int id) {
		throw new RuntimeException("Not Implemented");
	}

	RowMapper<City> rowMapper = new RowMapper<City>() {

		@Override
		public City mapRow(ResultSet rs, int rowNum) throws SQLException {
			City m = new City();
			m.setCityId(rs.getInt(1));
			m.setCityName(rs.getString(2));
			m.setStateId(rs.getInt(3));
			m.setCountryId(rs.getInt(4));
			m.setStateName(rs.getString(5));
			m.setCountryName(rs.getString(6));
			return m;
		}
	};

}
