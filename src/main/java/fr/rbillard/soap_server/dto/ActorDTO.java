package fr.rbillard.soap_server.dto;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = {"id", "firstName", "lastName", "birthDate", "roles"})
public class ActorDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private List<RoleDTO> roles;
	
	
	public Long getId() {
		return id;
	}
	public void setId( Long id ) {
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
	
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate( Date birthDate ) {
		this.birthDate = birthDate;
	}
	
	
	@XmlElementWrapper( name = "roles" )
	@XmlElement( name = "role" )
	public List<RoleDTO> getRoles() {
		return roles;
	}
	public void setRoles( List<RoleDTO> roles ) {
		this.roles = roles;
	}
	
	
}
