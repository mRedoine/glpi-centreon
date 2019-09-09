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
@Table(name = "glpi_groups")
public class Groups {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "entities_id")
	private GlpiEntities entities;
	@Column(name = "is_recursive", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isRecursive;
	private int level;
	@Column(name = "is_requester", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isRequester;
	@Column(name = "is_assign", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isAssign;
	@Column(name = "is_task", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isTask;
	@Column(name = "is_notify", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isNotify;
	@Column(name = "is_itemgroup", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isItemGroup;
	@Column(name = "is_usergroup", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isUserGroup;
	@Column(name = "is_manager", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isManager;

	
	
	public Groups() {
		super();
	}

	public Groups(int id, GlpiEntities entities, boolean isRecursive, int level, boolean isRequester, boolean isAssign,
			boolean isTask, boolean isNotify, boolean isItemGroup, boolean isUserGroup, boolean isManager) {
		super();
		this.id = id;
		this.entities = entities;
		this.isRecursive = isRecursive;
		this.level = level;
		this.isRequester = isRequester;
		this.isAssign = isAssign;
		this.isTask = isTask;
		this.isNotify = isNotify;
		this.isItemGroup = isItemGroup;
		this.isUserGroup = isUserGroup;
		this.isManager = isManager;
	}

	@Override
	public String toString() {
		return "Groups [id=" + id + ", entities=" + entities + ", isRecursive=" + isRecursive + ", level=" + level
				+ ", isRequester=" + isRequester + ", isAssign=" + isAssign + ", isTask=" + isTask + ", isNotify="
				+ isNotify + ", isItemGroup=" + isItemGroup + ", isUserGroup=" + isUserGroup + ", isManager="
				+ isManager + "]";
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isRequester() {
		return isRequester;
	}

	public void setRequester(boolean isRequester) {
		this.isRequester = isRequester;
	}

	public boolean isAssign() {
		return isAssign;
	}

	public void setAssign(boolean isAssign) {
		this.isAssign = isAssign;
	}

	public boolean isTask() {
		return isTask;
	}

	public void setTask(boolean isTask) {
		this.isTask = isTask;
	}

	public boolean isNotify() {
		return isNotify;
	}

	public void setNotify(boolean isNotify) {
		this.isNotify = isNotify;
	}

	public boolean isItemGroup() {
		return isItemGroup;
	}

	public void setItemGroup(boolean isItemGroup) {
		this.isItemGroup = isItemGroup;
	}

	public boolean isUserGroup() {
		return isUserGroup;
	}

	public void setUserGroup(boolean isUserGroup) {
		this.isUserGroup = isUserGroup;
	}

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + level;
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
		Groups other = (Groups) obj;
		if (id != other.id)
			return false;
		if (level != other.level)
			return false;
		return true;
	}

}
