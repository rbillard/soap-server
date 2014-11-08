package fr.rbillard.soap_server.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.sun.xml.txw2.annotation.XmlElement;

public class MovieWithRolesDTO extends MovieDTO {

	private List<RoleActorDTO> roles;
	
	
	@XmlElementWrapper( name = "roles " )
	@XmlElement( "role" )
	public List<RoleActorDTO> getRoles() {
		return roles;
	}
	public void setRoles( List<RoleActorDTO> roles ) {
		this.roles = roles;
	}
	
}
