package com.softia.glpi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "glpi_profiles")
public class Profiles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name = "is_default", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isDefault;
	@Column(name = "helpdesk_hardware")
	private int helpDeskHardware;
	@Column(name = "create_ticket_on_login", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean createTicketOnLogin;
	private int ticketTemplatesId;
	
	
	
	public Profiles() {
		super();
	}
	public Profiles(int id, String name, boolean isDefault, int helpDeskHardware, boolean createTicketOnLogin,
			int ticketTemplatesId) {
		super();
		this.id = id;
		this.name = name;
		this.isDefault = isDefault;
		this.helpDeskHardware = helpDeskHardware;
		this.createTicketOnLogin = createTicketOnLogin;
		this.ticketTemplatesId = ticketTemplatesId;
	}
	@Override
	public String toString() {
		return "Profiles [id=" + id + ", name=" + name + ", isDefault=" + isDefault + ", helpDeskHardware="
				+ helpDeskHardware + ", createTicketOnLogin=" + createTicketOnLogin + ", ticketTemplatesId="
				+ ticketTemplatesId + "]";
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
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public int getHelpDeskHardware() {
		return helpDeskHardware;
	}
	public void setHelpDeskHardware(int helpDeskHardware) {
		this.helpDeskHardware = helpDeskHardware;
	}
	public boolean isCreateTicketOnLogin() {
		return createTicketOnLogin;
	}
	public void setCreateTicketOnLogin(boolean createTicketOnLogin) {
		this.createTicketOnLogin = createTicketOnLogin;
	}
	public int getTicketTemplatesId() {
		return ticketTemplatesId;
	}
	public void setTicketTemplatesId(int ticketTemplatesId) {
		this.ticketTemplatesId = ticketTemplatesId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (createTicketOnLogin ? 1231 : 1237);
		result = prime * result + helpDeskHardware;
		result = prime * result + id;
		result = prime * result + (isDefault ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ticketTemplatesId;
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
		Profiles other = (Profiles) obj;
		if (createTicketOnLogin != other.createTicketOnLogin)
			return false;
		if (helpDeskHardware != other.helpDeskHardware)
			return false;
		if (id != other.id)
			return false;
		if (isDefault != other.isDefault)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ticketTemplatesId != other.ticketTemplatesId)
			return false;
		return true;
	}
	
	
	
	

}
