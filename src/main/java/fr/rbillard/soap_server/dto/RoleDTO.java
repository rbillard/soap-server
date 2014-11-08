package fr.rbillard.soap_server.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"firstName", "lastName", "actor", "movie"})
public class RoleDTO {

	private String firstName;
	private String lastName;
	private ActorDTO actor;
	private MovieDTO movie;
	
	
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
	
	
	public ActorDTO getActor() {
		return actor;
	}
	public void setActor( ActorDTO actor ) {
		this.actor = actor;
	}
	
	
	public MovieDTO getMovie() {
		return movie;
	}
	public void setMovie( MovieDTO movie ) {
		this.movie = movie;
	}
	
}
