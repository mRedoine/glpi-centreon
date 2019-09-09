package com.softia.glpi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glpi_computermodels")
public class ComputerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int weight;
	@Column(name = "required_units")
	private int requiredUnits;
	private float depth;
	@Column(name = "power_consumption" )
	private int powerConsumption;
	@Column(name = "power_connections")
	private int powerConnections;
	@Column(name = "is_half_rack")
	private boolean isHalfRack;
	@Override
	public String toString() {
		return "ComputerModel [id=" + id + ", name=" + name + ", weight=" + weight + ", requiredUnits=" + requiredUnits
				+ ", depth=" + depth + ", powerConsumption=" + powerConsumption + ", powerConnections="
				+ powerConnections + ", isHalfRack=" + isHalfRack + "]";
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getRequiredUnits() {
		return requiredUnits;
	}
	public void setRequiredUnits(int requiredUnits) {
		this.requiredUnits = requiredUnits;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public int getPowerConnections() {
		return powerConnections;
	}
	public void setPowerConnections(int powerConnections) {
		this.powerConnections = powerConnections;
	}
	public boolean isHalfRack() {
		return isHalfRack;
	}
	public void setHalfRack(boolean isHalfRack) {
		this.isHalfRack = isHalfRack;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
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
		ComputerModel other = (ComputerModel) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	public ComputerModel(int id, String name, int weight, int requiredUnits, float depth, int powerConsumption,
			int powerConnections, boolean isHalfRack) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.requiredUnits = requiredUnits;
		this.depth = depth;
		this.powerConsumption = powerConsumption;
		this.powerConnections = powerConnections;
		this.isHalfRack = isHalfRack;
	}
	public ComputerModel() {
		super();
	}
	
	
	
	

}
