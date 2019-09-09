package com.softia.glpi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "glpi_domains")
public class Domains {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "entities_id")
	private GlpiEntities entities;
	@Column(name = "is_recursive", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isRecursive;

	
	
	public Domains() {
		super();
	}

	public Domains(int id, String name, GlpiEntities entities, boolean isRecursive) {
		super();
		this.id = id;
		this.name = name;
		this.entities = entities;
		this.isRecursive = isRecursive;
	}

	@Override
	public String toString() {
		return "Domains [id=" + id + ", name=" + name + ", entities=" + entities + ", isRecursive=" + isRecursive + "]";
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

	public GlpiEntities getEntities() {
		return entities;
	}

	public void setEntities(GlpiEntities entities) {
		this.entities = entities;
	}

	public boolean isRecursive() {
		return isRecursive;
	}

	public void setRecursive(boolean isRecursive) {
		this.isRecursive = isRecursive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Domains other = (Domains) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
