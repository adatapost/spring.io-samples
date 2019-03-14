package in.amee.coaching.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BusinessDomainDao implements Dao<BusinessDomain> {
	private JdbcTemplate jdbc;

	public BusinessDomainDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(BusinessDomain obj) {
		return jdbc.update("insert into business_domain values (null,?)", obj.getName()) == 1;
	}

	@Override
	public boolean update(BusinessDomain obj) {
		return jdbc.update("update business_domain set name=? where domain_id=?", obj.getName(),
				obj.getDomainId()) == 1;
	}

	@Override
	public boolean delete(BusinessDomain obj) {
		return jdbc.update("delete from business_domain where domain_id=? or name=?", obj.getDomainId(),
				obj.getName()) == 1;
	}

	@Override
	public BusinessDomain get(BusinessDomain obj) {
		List<BusinessDomain> list = jdbc.query("select * from business_domain where domain_id=? or name=?", rowMapper,
				obj.getDomainId(), obj.getName());
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@Override
	public List<BusinessDomain> gets() {
		return jdbc.query("select * from business_damain", rowMapper);
	}

	@Override
	public List<BusinessDomain> gets(int id) {
		throw new RuntimeException("Not Implemented");
	}

	RowMapper<BusinessDomain> rowMapper = new RowMapper<BusinessDomain>() {

		@Override
		public BusinessDomain mapRow(ResultSet rs, int rowNum) throws SQLException {
			BusinessDomain m = new BusinessDomain();
			m.setDomainId(rs.getInt(1));
			m.setName(rs.getString(2));
			return m;
		}

	};

}
