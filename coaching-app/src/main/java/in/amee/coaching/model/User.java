package in.amee.coaching.model;

import java.sql.Blob;
import java.util.Date;

public class User {
	private int userId;
	private String email;
	private String password;
	private int roleId;
	private Date created;
	private boolean isActive;
	private String firstName;
	private String lastName;
	private String gender;
	private String contact;
	private String postalCode;
	private String address;
	private int cityId;
	private Blob photo;
	private City city;

	public User() {
		this.postalCode = "";
		this.address = "";
	}

	public User(int userId, String email, String password, int roleId, Date created, boolean isActive, String firstName,
			String lastName, String gender, String contact, String postalCode, String address, int cityId, Blob photo,
			City city) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.roleId = roleId;
		this.created = created;
		this.isActive = isActive;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.contact = contact;
		this.postalCode = postalCode;
		this.address = address;
		this.cityId = cityId;
		this.photo = photo;
		this.city = city;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
