package com.adc.basic.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "emp")
	private Long id;
	private String name;
	private Long salary;
	private Long deptId;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private Dept dept = new Dept();
	public Dept getDept() { return dept; }
	 
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Long id, String name, Long salary, Long deptId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	 
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
