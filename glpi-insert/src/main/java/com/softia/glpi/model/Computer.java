package com.softia.glpi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "glpi_computers")
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Column(name = "entities_id")
	public int entitiesId;
	public String name;
	public String serial;
	@Column(name = "otherserial")
	public String otherSerial;
	public String contact;
	@Column(name = "contact_num")
	public String contactNum;
	@Column(name = "users_id_tech")
	public int usersIdTech;
	@Column(name = "users_id_tech")
	public int groupsIdTech;
	public String comment;
	@Column(name = "date_mod")
	public LocalDateTime dateMod;
	@Column(name = "autoupdatesystems_id")
	public int autoupdatesystemsId;
	@Column(name = "locations_id")
	public int locationsId;
	@Column(name = "domains_id")
	public int domainsId;
	@Column(name = "networks_id")
	public int networksId;
	@Column(name = "computermodels_id")
	public int computermodelsId;
	@Column(name = "computertypes_id")
	public int computertypesId;
	@Column(name = "is_template", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isTemplate;
	@Column(name = "template_name")
	public String templateName;
	@Column(name = "manufacturers_id")
	public int manufacturersId;
	@Column(name = "is_deleted", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isDeleted;
	@Column(name = "is_dynamic", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isDynamic;
	@Column(name = "users_id")
	public int usersID;
	@Column(name = "groups_id")
	public int groupsId;
	@Column(name = "states_id")
	public int statesId;
	@Column(name = "ticket_tco")
	public float ticketTco;
	@Column(name = "computer_uuid")
	public String computerUuid;
	@Column(name = "template_name")
	public LocalDateTime dateCreation;
	@Column(name = "is_recursive", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	public boolean isRecursive;

	@Override
	public String toString() {
		return "Computers [id=" + id + ", entitiesId=" + entitiesId + ", name=" + name + ", serial=" + serial
				+ ", otherSerial=" + otherSerial + ", contact=" + contact + ", contactNum=" + contactNum
				+ ", usersIdTech=" + usersIdTech + ", groupsIdTech=" + groupsIdTech + ", comment=" + comment
				+ ", dateMod=" + dateMod + ", autoupdatesystemsId=" + autoupdatesystemsId + ", locationsId="
				+ locationsId + ", domainsId=" + domainsId + ", networksId=" + networksId + ", computermodelsId="
				+ computermodelsId + ", computertypesId=" + computertypesId + ", isTemplate=" + isTemplate
				+ ", templateName=" + templateName + ", manufacturersId=" + manufacturersId + ", isDeleted=" + isDeleted
				+ ", isDynamic=" + isDynamic + ", usersID=" + usersID + ", groupsId=" + groupsId + ", statesId="
				+ statesId + ", ticketTco=" + ticketTco + ", computerUuid=" + computerUuid + ", dateCreation="
				+ dateCreation + ", isRecursive=" + isRecursive + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((serial == null) ? 0 : serial.hashCode());
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
		Computer other = (Computer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (serial == null) {
			if (other.serial != null)
				return false;
		} else if (!serial.equals(other.serial))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEntitiesId() {
		return entitiesId;
	}

	public void setEntitiesId(int entitiesId) {
		this.entitiesId = entitiesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getOtherSerial() {
		return otherSerial;
	}

	public void setOtherSerial(String otherSerial) {
		this.otherSerial = otherSerial;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public int getUsersIdTech() {
		return usersIdTech;
	}

	public void setUsersIdTech(int usersIdTech) {
		this.usersIdTech = usersIdTech;
	}

	public int getGroupsIdTech() {
		return groupsIdTech;
	}

	public void setGroupsIdTech(int groupsIdTech) {
		this.groupsIdTech = groupsIdTech;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getDateMod() {
		return dateMod;
	}

	public void setDateMod(LocalDateTime dateMod) {
		this.dateMod = dateMod;
	}

	public int getAutoupdatesystemsId() {
		return autoupdatesystemsId;
	}

	public void setAutoupdatesystemsId(int autoupdatesystemsId) {
		this.autoupdatesystemsId = autoupdatesystemsId;
	}

	public int getLocationsId() {
		return locationsId;
	}

	public void setLocationsId(int locationsId) {
		this.locationsId = locationsId;
	}

	public int getDomainsId() {
		return domainsId;
	}

	public void setDomainsId(int domainsId) {
		this.domainsId = domainsId;
	}

	public int getNetworksId() {
		return networksId;
	}

	public void setNetworksId(int networksId) {
		this.networksId = networksId;
	}

	public int getComputermodelsId() {
		return computermodelsId;
	}

	public void setComputermodelsId(int computermodelsId) {
		this.computermodelsId = computermodelsId;
	}

	public int getComputertypesId() {
		return computertypesId;
	}

	public void setComputertypesId(int computertypesId) {
		this.computertypesId = computertypesId;
	}

	public boolean isTemplate() {
		return isTemplate;
	}

	public void setTemplate(boolean isTemplate) {
		this.isTemplate = isTemplate;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public int getManufacturersId() {
		return manufacturersId;
	}

	public void setManufacturersId(int manufacturersId) {
		this.manufacturersId = manufacturersId;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isDynamic() {
		return isDynamic;
	}

	public void setDynamic(boolean isDynamic) {
		this.isDynamic = isDynamic;
	}

	public int getUsersID() {
		return usersID;
	}

	public void setUsersID(int usersID) {
		this.usersID = usersID;
	}

	public int getGroupsId() {
		return groupsId;
	}

	public void setGroupsId(int groupsId) {
		this.groupsId = groupsId;
	}

	public int getStatesId() {
		return statesId;
	}

	public void setStatesId(int statesId) {
		this.statesId = statesId;
	}

	public float getTicketTco() {
		return ticketTco;
	}

	public void setTicketTco(float ticketTco) {
		this.ticketTco = ticketTco;
	}

	public String getComputerUuid() {
		return computerUuid;
	}

	public void setComputerUuid(String computerUuid) {
		this.computerUuid = computerUuid;
	}

	public LocalDateTime getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isRecursive() {
		return isRecursive;
	}

	public void setRecursive(boolean isRecursive) {
		this.isRecursive = isRecursive;
	}

}
