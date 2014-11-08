package fr.rbillard.soap_server.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"firstName", "lastName"})
public class RoleDTO {

	private String firstName;
	private String lastName;
	
	
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
