package in.amee.coaching.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class InstituteDao implements Dao<Institute> {
	private JdbcTemplate jdbc;

	public InstituteDao(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public boolean add(Institute obj) {
		return jdbc.update(
				"insert into institute(inst_id,title,postal_code,address,created_by,city_id,domain_id,email,phone1,phone2,fax) values(null,?,?,?,?,?,?,?,?,?,?)",
				obj.getTitle(), obj.getPostalCode(), obj.getAddress(), obj.getCreatedBy(), obj.getCityId(),
				obj.getDomainId(), obj.getEmail(), obj.getPhone1(), obj.getPhone2(), obj.getFax()) == 1;
	}

	public boolean addImage(Institute obj) {
		return jdbc.update("update institute set logo=? where inst_id=?", obj.getLogo(), obj.getInstId()) == 1;
	}

	@Override
	public boolean update(Institute obj) {
		return jdbc.update(
				"update institute set title=?,postal_code=?,address=?,city_id=?,domain_id=?,email=?,phone1=?,phone2=?,fax=? where inst_id=?",
				obj.getTitle(), obj.getPostalCode(), obj.getAddress(), obj.getCityId(), obj.getDomainId(),
				obj.getEmail(), obj.getPhone1(), obj.getPhone2(), obj.getFax(), obj.getInstId()) == 1;
	}

	@Override
	public boolean delete(Institute obj) {
		return jdbc.update("delete from institute where inst_id=?", obj.getInstId()) == 1;
	}

	@Override
	public Institute get(Institute obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Institute> gets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Institute> gets(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
