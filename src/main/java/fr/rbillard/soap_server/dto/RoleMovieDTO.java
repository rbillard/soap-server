package fr.rbillard.soap_server.dto;


public class RoleMovieDTO extends RoleDTO {

	private MovieDTO movie;
	
	public MovieDTO getMovie() {
		return movie;
	}
	public void setMovie( MovieDTO movie ) {
		this.movie = movie;
	}
	
}
