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
@Table(name = "glpi_locations")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "entities_id")
	private GlpiEntities entities;
	@Column(name = "is_recursive", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isRecursive;
	private String name;
	@Column(name = "location_id")
	private int locationsId;
	private int level;
	private String longitude;
	private String lattitude;
	
	
	public Location() {
		super();
	}
	public Location(int id, GlpiEntities entities, boolean isRecursive, String name, int locationsId, int level,
			String longitude, String lattitude) {
		super();
		this.id = id;
		this.entities = entities;
		this.isRecursive = isRecursive;
		this.name = name;
		this.locationsId = locationsId;
		this.level = level;
		this.longitude = longitude;
		this.lattitude = lattitude;
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", entities=" + entities + ", isRecursive=" + isRecursive + ", name=" + name
				+ ", locationsId=" + locationsId + ", level=" + level + ", longitude=" + longitude + ", lattitude="
				+ lattitude + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLocationsId() {
		return locationsId;
	}
	public void setLocationsId(int locationsId) {
		this.locationsId = locationsId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
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
		Location other = (Location) obj;
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
