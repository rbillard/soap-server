package fr.rbillard.soap_server.dto;

public class RoleWithActorAndMovieDTO extends RoleDTO {

	private ActorDTO actor;
	private MovieDTO movie;

	
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
