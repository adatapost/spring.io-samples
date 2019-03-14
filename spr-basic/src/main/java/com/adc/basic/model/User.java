package com.adc.basic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity

public class User {
	@Id
	private int userId;
	@Column(unique =  true)
	private String email, password;
	private int roleId;
	
	@Column(name = "careted")
	private Date created;
	
	@Column(name = "is_active")
	private boolean active;
	
 

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String email, String password, int roleId, Date created, boolean active) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.roleId = roleId;
		this.created = created;
		this.active = active;
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
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", roleId=" + roleId
				+ ", created=" + created + ", active=" + active + "]";
	}

	
}
