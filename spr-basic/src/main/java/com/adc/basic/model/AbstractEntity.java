package com.adc.basic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	@Override public boolean equals(Object obj) {
		if(obj == null) return false;
		if (this == obj) return true;
			
		AbstractEntity other = (AbstractEntity) obj;
		return this.id.equals(other.getId());
	}

	@Override public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}
}