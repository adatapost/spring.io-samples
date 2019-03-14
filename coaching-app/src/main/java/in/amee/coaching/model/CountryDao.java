package in.amee.coaching.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CountryDao implements Dao<Country> {
	private JdbcTemplate jdbc;

	public CountryDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(Country obj) {
		return jdbc.update("insert into country values (null,?)", obj.getCountryName()) == 1;
	}

	@Override
	public boolean update(Country obj) {
		return jdbc.update("update country set country_name=? where country_id=?", obj.getCountryName(),
				obj.getCountryId()) == 1;
	}

	@Override
	public boolean delete(Country obj) {
		return jdbc.update("delete from country where country_id=? or country_name=?", obj.getCountryId(),
				obj.getCountryName()) == 1;
	}

	@Override
	public Country get(Country obj) {
		List<Country> list = jdbc.query("select * from country where country_id=? or country_name=?", rowMapper,
				obj.getCountryId(), obj.getCountryName());
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@Override
	public List<Country> gets() {
		return jdbc.query("select * from country", rowMapper);
	}

	@Override
	public List<Country> gets(int id) {
		throw new RuntimeException("Not Implemented");
	}

	RowMapper<Country> rowMapper = new RowMapper<Country>() {

		@Override
		public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
			Country m = new Country();
			m.setCountryId(rs.getInt(1));
			m.setCountryName(rs.getString(2));
			return m;
		}
	};

}
