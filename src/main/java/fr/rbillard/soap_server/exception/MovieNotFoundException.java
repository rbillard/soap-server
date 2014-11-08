package fr.rbillard.soap_server.exception;

public class MovieNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private Long movieId;

	public MovieNotFoundException( Long movieId ) {
		this.movieId = movieId;
	}
	
	public Long getMovieId() {
		return movieId;
	}

}
