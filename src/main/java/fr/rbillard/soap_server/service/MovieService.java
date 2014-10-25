package fr.rbillard.soap_server.service;

import java.util.List;

import fr.rbillard.soap_server.entity.Movie;
import fr.rbillard.soap_server.exception.MovieNotFoundException;

public interface MovieService {

	Movie create(String title);
	
	Movie update( Long id, String title ) throws MovieNotFoundException;
	
	Movie findOne( Long id ) throws MovieNotFoundException;
	
	void delete( Long id );
	
	List<Movie> find( String title );
	
}
