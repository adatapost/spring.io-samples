package com.adc.basic.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "dept")
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "deptId", cascade=CascadeType.ALL, fetch = FetchType.EAGER)    
	private Set<Emp> emps;
	
	public Set<Emp> getEmps() { return  emps; }
	 
	public Dept() {
	}
	public Dept(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Dept(String name) {
		this.name = name;
	}
	public Dept(Long id) {
		this.id = id;
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
	 
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
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
		Dept other = (Dept) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
