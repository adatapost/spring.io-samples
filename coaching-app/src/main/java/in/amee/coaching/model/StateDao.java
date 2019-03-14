package in.amee.coaching.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StateDao implements Dao<State> {
	private JdbcTemplate jdbc;

	public StateDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(State obj) {
		return jdbc.update("insert into state values(null,?,?)", obj.getStateName(), obj.getCountryId()) == 1;
	}

	@Override
	public boolean update(State obj) {
		return jdbc.update("update state set state_name=?,country_id=? where state_id=?", obj.getStateName(),
				obj.getCountryId(), obj.getStateId()) == 1;
	}

	@Override
	public boolean delete(State obj) {
		return jdbc.update("delete from state where state_id=?", obj.getStateId()) == 1;
	}

	@Override
	public State get(State obj) {
		List<State> list = jdbc.query("select * from stateview where state_id=?", rowMapper, obj.getStateId());
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@Override
	public List<State> gets() {
		return jdbc.query("select * from stateview", rowMapper);
	}

	@Override
	public List<State> gets(int id) {
		throw new RuntimeException("Not Implemented");
	}

	public List<State> gets(State obj) {
		try {
			return jdbc.query("select * from stateView where country_id=?", new Object[] { obj.getCountryId() },
					rowMapper);
		} catch (Exception e) {
			System.out.println("Error users-gets=>" + e);
		}
		return null;
	}

	RowMapper<State> rowMapper = new RowMapper<State>() {

		@Override
		public State mapRow(ResultSet rs, int rowNum) throws SQLException {
			State m = new State();
			m.setStateId(rs.getInt(1));
			m.setStateName(rs.getString(2));
			m.setCountryId(rs.getInt(3));
			m.setCountryName(rs.getString(4));
			return m;
		}
	};

}
