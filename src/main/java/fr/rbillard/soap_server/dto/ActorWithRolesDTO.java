package fr.rbillard.soap_server.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import com.sun.xml.txw2.annotation.XmlElement;

public class ActorWithRolesDTO extends ActorDTO {

	private List<RoleMovieDTO> roles;
	
	
	@XmlElementWrapper( name = "roles " )
	@XmlElement( "role" )
	public List<RoleMovieDTO> getRoles() {
		return roles;
	}
	public void setRoles( List<RoleMovieDTO> roles ) {
		this.roles = roles;
	}
	
	
}
