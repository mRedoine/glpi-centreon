package com.softia.glpi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="glpi_users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String password;
	private String phone;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locations_id")
	private Location location;
	@Column(name = "use_mod")
	private int usemod;
	@Column(name = "is_active", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isActive;
	private int authsId;
	private int authtype;
	@Column(name = "is_deleted", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isDeleted;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entities_id")
	private GlpiEntities entities;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profiles_id")
	private Profiles profiles;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usertitles_id")
	private UserTitles userTitles;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usercategories_id")
	private UserCategories userCategories;
	@Column(name = "is_deleted_ldap", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isDeletedLdap;
	
	
	public Users(int id, String name, String password, String phone, Location location, int usemod, boolean isActive,
			int authsId, int authtype, boolean isDeleted, GlpiEntities entities, Profiles profiles,
			UserTitles userTitles, UserCategories userCategories, boolean isDeletedLdap) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.location = location;
		this.usemod = usemod;
		this.isActive = isActive;
		this.authsId = authsId;
		this.authtype = authtype;
		this.isDeleted = isDeleted;
		this.entities = entities;
		this.profiles = profiles;
		this.userTitles = userTitles;
		this.userCategories = userCategories;
		this.isDeletedLdap = isDeletedLdap;
	}
	
	
	public Users() {
		super();
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", location="
				+ location + ", usemod=" + usemod + ", isActive=" + isActive + ", authsId=" + authsId + ", authtype="
				+ authtype + ", isDeleted=" + isDeleted + ", entities=" + entities + ", profiles=" + profiles
				+ ", userTitles=" + userTitles + ", userCategories=" + userCategories + ", isDeletedLdap="
				+ isDeletedLdap + "]";
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
		Users other = (Users) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getUsemod() {
		return usemod;
	}
	public void setUsemod(int usemod) {
		this.usemod = usemod;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getAuthsId() {
		return authsId;
	}
	public void setAuthsId(int authsId) {
		this.authsId = authsId;
	}
	public int getAuthtype() {
		return authtype;
	}
	public void setAuthtype(int authtype) {
		this.authtype = authtype;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public GlpiEntities getEntities() {
		return entities;
	}
	public void setEntities(GlpiEntities entities) {
		this.entities = entities;
	}
	public Profiles getProfiles() {
		return profiles;
	}
	public void setProfiles(Profiles profiles) {
		this.profiles = profiles;
	}
	public UserTitles getUserTitles() {
		return userTitles;
	}
	public void setUserTitles(UserTitles userTitles) {
		this.userTitles = userTitles;
	}
	public UserCategories getUserCategories() {
		return userCategories;
	}
	public void setUserCategories(UserCategories userCategories) {
		this.userCategories = userCategories;
	}
	public boolean isDeletedLdap() {
		return isDeletedLdap;
	}
	public void setDeletedLdap(boolean isDeletedLdap) {
		this.isDeletedLdap = isDeletedLdap;
	}
	
	
	
	

}
