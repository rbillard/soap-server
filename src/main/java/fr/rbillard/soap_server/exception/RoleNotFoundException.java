package fr.rbillard.soap_server.exception;

public class RoleNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public Long actorId;
	public Long movieId;
	
	public RoleNotFoundException( Long actorId, Long movieId ) {
		this.actorId = actorId;
		this.movieId = movieId;
	}
	
	public Long getActorId() {
		return actorId;
	}
	
	public Long getMovieId() {
		return movieId;
	}
	
}
