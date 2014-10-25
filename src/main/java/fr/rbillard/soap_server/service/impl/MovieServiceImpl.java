package fr.rbillard.soap_server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rbillard.soap_server.entity.Movie;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.repository.MovieRepository;
import fr.rbillard.soap_server.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository repository;

	@Override
	public Movie create( String title ) {

		Movie movie = new Movie();
		movie.setTitle( title );
		return repository.save( movie );
		
	}

	@Override
	public Movie update( Long id, String title ) throws MovieNotFoundException {
		
		Movie movie = findOne( id );
		movie.setTitle( title );
		return repository.save( movie );
		
	}

	@Override
	public Movie findOne( Long id ) throws MovieNotFoundException {
		
		Movie movie = repository.findOne( id );
		if ( movie == null ) {
			throw new MovieNotFoundException();
		}
		return movie;
		
	}

	@Override
	public void delete( Long id ) {
		repository.delete( id );
	}

	@Override
	public List<Movie> find( String title ) {
		return repository.findByTitle( title );
	}

}
