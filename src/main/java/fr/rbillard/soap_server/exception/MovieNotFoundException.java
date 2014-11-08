package fr.rbillard.soap_server.exception;

public class MovieNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private long movieId;

	public MovieNotFoundException( long movieId ) {
		this.movieId = movieId;
	}
	
	public long getMovieId() {
		return movieId;
	}

}
