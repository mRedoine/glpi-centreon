package com.softia.glpi.dto;

import java.time.LocalDateTime;


public class ComputerDto {
	public int id;
	public int entitiesId;
	public String name;
	public String serial;
	public String otherSerial;
	public String contact;
	public String contactNum;
	public int usersIdTech;
	public int groupsIdTech;
	public String comment;
	public LocalDateTime dateMod;
	public int autoupdatesystemsId;
	public int locationsId;
	public int domainsId;
	public int networksId;
	public int computermodelsId;
	public int computertypesId;
	public boolean isTemplate;
	public String templateName;
	public int manufacturersId;
	public boolean isDeleted;
	public boolean isDynamic;
	public int usersID;
	public int groupsId;
	public int statesId;
	public float ticketTco;
	public String computerUuid;
	public LocalDateTime dateCreation;
	public boolean isRecursive;
	
	@Override
	public String toString() {
		return "ComputerDto [id=" + id + ", name=" + name + ", serial=" + serial + "]";
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
