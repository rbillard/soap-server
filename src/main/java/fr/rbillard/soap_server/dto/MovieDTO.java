package fr.rbillard.soap_server.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"id", "title", "roles"})
public class MovieDTO {

	private Long id;
	private String title;
	private List<RoleDTO> roles;
	
	
	public Long getId() {
		return id;
	}
	public void setId( Long id ) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle( String title ) {
		this.title = title;
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
