package com.softia.glpi.model;

import java.time.LocalDateTime;

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


public class Computer2 {
	/*
	 public static class Builder {
		 @Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int id;
			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "entities_id")
			private GlpiEntities entities;

			private String name;
			private String serial;

			@Column(name = "otherserial")
			private String otherSerial;

			private String contact;

			@Column(name = "contact_num")
			private String contactNum;

			@Column(name = "users_id_tech")
			private int userIdTech;

			@Column(name = "groups_id_tech")
			private int groupIdTech;

			private String comment;

			@Column(name = "date_mod")
			private LocalDateTime dateMod;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "autoupdatesystems_id")
			private AutoUpdateSystems autoupdatesystem;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "locations_id")
			private Location location;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "domains_id")
			private Domains domain;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "networks_id")
			private Networks net;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "computermodels_id")
			private ComputerModel compModel;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "computertypes_id")
			private ComputerTypes compTypes;

			@Column(name = "is_template", nullable = false)
			@Type(type = "org.hibernate.type.NumericBooleanType")
			private boolean isTemplate;

			@Column(name = "template_name")
			private String templateName;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "manufacturers_id")
			private Manufacturers manufacturer;

			@Column(name = "is_deleted", nullable = false)
			@Type(type = "org.hibernate.type.NumericBooleanType")
			private boolean isDeleted;

			@Column(name = "is_dynamic", nullable = false)
			@Type(type = "org.hibernate.type.NumericBooleanType")
			private boolean isDynamic;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "users_id")
			private Users user;

			@ManyToOne(fetch = FetchType.LAZY)
			@JoinColumn(name = "groups_id")
			private Groups group;

			@Column(name = "states_id")
			private int statesId;

			@Column(name = "ticket_tco")
			private float ticketTco;

			@Column(name = "uuid")
			private String computerUuid;

			@Column(name = "date_creation")
			private LocalDateTime dateCreation;

			@Column(name = "is_recursive", nullable = false)
			@Type(type = "org.hibernate.type.NumericBooleanType")
			private boolean isRecursive;
			
			
			public Builder withEntities(GlpiEntities entities) {
				this.entities = entities;
				return this;
			}
			public Builder withAutoUpdate(AutoUpdateSystems autoUpdate) {
				autoupdatesystem = autoUpdate;
				return this;
			}
			
			public Builder withLocations(Location location) {
				this.location = location;
				return this;
			}
			
			public Builder withDomains(Domains domain) {
				this.domain = domain;
				return this;
			}
			
			public Builder withNetworks(Networks network) {
				this.net = network;
				return this;
			}
			
			public Builder withComputerModels(ComputerModel compModel) {
				this.compModel = compModel;
				return this;
			}
			
			public Builder withComputerTypes(ComputerTypes compTypes) {
				this.compTypes = compTypes;
				return this;
			}
			
			public Builder withManufacturers(Manufacturers manufacturer) {
				this.manufacturer = manufacturer;
				return this;
			} 
			
			public Builder isTemplate(boolean isTemplate) {
				this.isTemplate = isTemplate;
				return this;
			} 
			
			public Builder isDeleted(boolean isDeleted) {
				this.isDeleted = isDeleted;
				return this;
			} 
			
			public Builder isDynamic(boolean isDynamic) {
				this.isDynamic = isDynamic;
				return this;
			} 
			
			public Builder withUsers(Users user) {
				this.user = user;
				return this;
			} 
			
			public Builder withGroups(Groups group) {
				this.group = group;
				return this;
			} 


			public Computer2 build() {
				Computer2 computer = new Computer2();
			//	computer.groups = this.group;
				return null;
				
			}
			
			
			
				@Override
				public String toString() {
					return "Computer [id=" + id + ", entities=" + entities + ", name=" + name + ", serial=" + serial
							+ ", otherSerial=" + otherSerial + ", contact=" + contact + ", contactNum=" + contactNum
							+ ", userIdTech=" + userIdTech + ", groupIdTech=" + groupIdTech + ", comment=" + comment + ", dateMod="
							+ dateMod + ", autoupdatesystemsId=" + autoupdatesystem + ", location=" + location + ", domain="
							+ domain + ", net=" + net + ", compModel=" + compModel + ", compTypes=" + compTypes + ", isTemplate="
							+ isTemplate + ", templateName=" + templateName + ", manufacturersId=" + manufacturer
							+ ", isDeleted=" + isDeleted + ", isDynamic=" + isDynamic + ", user=" + user + ", group=" + group
							+ ", statesId=" + statesId + ", ticketTco=" + ticketTco + ", computerUuid=" + computerUuid
							+ ", dateCreation=" + dateCreation + ", isRecursive=" + isRecursive + ", getClass()=" + getClass()
							+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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

				public int getUserIdTech() {
					return userIdTech;
				}

				public void setUserIdTech(int userIdTech) {
					this.userIdTech = userIdTech;
				}

				public int getGroupIdTech() {
					return groupIdTech;
				}

				public void setGroupIdTech(int groupIdTech) {
					this.groupIdTech = groupIdTech;
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

				

				public AutoUpdateSystems getAutoupdatesystem() {
					return autoupdatesystem;
				}

				public void setAutoupdatesystem(AutoUpdateSystems autoupdatesystem) {
					this.autoupdatesystem = autoupdatesystem;
				}

				public Location getLocation() {
					return location;
				}

				public void setLocation(Location location) {
					this.location = location;
				}

				public Domains getDomain() {
					return domain;
				}

				public void setDomain(Domains domain) {
					this.domain = domain;
				}

				public Networks getNet() {
					return net;
				}

				public void setNet(Networks net) {
					this.net = net;
				}

				public ComputerModel getCompModel() {
					return compModel;
				}

				public void setCompModel(ComputerModel compModel) {
					this.compModel = compModel;
				}

				public ComputerTypes getCompTypes() {
					return compTypes;
				}

				public void setCompTypes(ComputerTypes compTypes) {
					this.compTypes = compTypes;
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

				public Manufacturers getManufacturer() {
					return manufacturer;
				}

				public void setManufacturersId(Manufacturers manufacturer) {
					this.manufacturer = manufacturer;
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

				public Users getUser() {
					return user;
				}

				public void setUser(Users user) {
					this.user = user;
				}

				public Groups getGroup() {
					return group;
				}

				public void setGroup(Groups group) {
					this.group = group;
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
					Builder other = (Builder) obj;
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
		}

	 
	 private Computer2() {
		 
	 }
	

*/
}
