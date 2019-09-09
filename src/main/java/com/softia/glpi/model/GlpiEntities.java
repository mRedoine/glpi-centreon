package com.softia.glpi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glpi_entities")
public class GlpiEntities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String name;
	public int level;
	
	
	public GlpiEntities() {
		super();
	}


	public GlpiEntities(int id, String name, int level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
	}


	@Override
	public String toString() {
		return "Entities [id=" + id + ", name=" + name + ", level=" + level + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + level;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		GlpiEntities other = (GlpiEntities) obj;
		if (id != other.id)
			return false;
		if (level != other.level)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	

}
