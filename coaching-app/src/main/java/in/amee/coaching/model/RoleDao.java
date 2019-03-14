package in.amee.coaching.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class RoleDao implements Dao<Role> {
	private JdbcTemplate jdbc;

	public RoleDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(Role obj) {
		return jdbc.update("insert into role values (null,?)", obj.getRoleName()) == 1;
	}

	@Override
	public boolean update(Role obj) {
		return jdbc.update("update role set role_name=? where role_id=?", obj.getRoleName(), obj.getRoleId()) == 1;
	}

	@Override
	public boolean delete(Role obj) {
		return jdbc.update("delete from role where role_id=? or role_name=?", obj.getRoleId(), obj.getRoleName()) == 1;
	}

	@Override
	public Role get(Role obj) {
		List<Role> list = jdbc.query("selct * from role where role_id=? or role_name=?", rowMapper, obj.getRoleId(),
				obj.getRoleName());
		if (list.isEmpty())
			return null;
		return list.get(0);
	}

	@Override
	public List<Role> gets() {
		return jdbc.query("select * from role", rowMapper);
	}

	@Override
	public List<Role> gets(int id) {
		throw new RuntimeException("Not Implemented");
	}

	RowMapper<Role> rowMapper = new RowMapper<Role>() {

		@Override
		public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
			Role m = new Role();
			m.setRoleId(rs.getInt(1));
			m.setRoleName(rs.getString(2));
			return m;
		}

	};

}
