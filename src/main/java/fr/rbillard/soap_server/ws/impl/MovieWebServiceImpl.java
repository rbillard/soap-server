package fr.rbillard.soap_server.ws.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.rbillard.soap_server.entity.Movie;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.service.MovieService;
import fr.rbillard.soap_server.ws.MovieWebService;

public class MovieWebServiceImpl implements MovieWebService {

	@Autowired
	private MovieService movieService;
	
	@Override
	public Movie create( String title ) {
		return movieService.create( title );
	}

	@Override
	public Movie update( Long id, String title ) throws MovieNotFoundException {
		return movieService.update( id, title );
	}

	@Override
	public Movie findOne( Long id ) throws MovieNotFoundException {
		return movieService.findOne( id );
	}

	@Override
	public void delete( Long id ) {
		movieService.delete( id );
	}

	@Override
	public List<Movie> find( String title ) {
		return movieService.find( title );
	}

}
