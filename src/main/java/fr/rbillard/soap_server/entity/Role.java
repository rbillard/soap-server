package fr.rbillard.soap_server.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table
@XmlType(propOrder = {"id", "firstName", "lastName"})
public class Role {
	
	@EmbeddedId
	private RoleId id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	
	public RoleId getId() {
		return id;
	}
	public void setId( RoleId id ) {
		this.id = id;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}
	
	
}
