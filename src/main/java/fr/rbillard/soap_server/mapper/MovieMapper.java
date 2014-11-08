package fr.rbillard.soap_server.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.rbillard.soap_server.dto.MovieDTO;
import fr.rbillard.soap_server.dto.MovieWithRolesDTO;
import fr.rbillard.soap_server.entity.Movie;

@Component
public final class MovieMapper {

	@Autowired
	private Mapper mapper;
	
	private MovieMapper() {
		
	}

	public MovieDTO map( Movie movie ) {
		return mapper.map( movie, MovieDTO.class );
	}

	public MovieWithRolesDTO mapWithRoles( Movie movie ) {
		return mapper.map( movie, MovieWithRolesDTO.class );
	}

	public List<MovieDTO> map( List<Movie> movies ) {
		
		List<MovieDTO> dtos = new ArrayList<>( movies.size() );
		
		for ( Movie movie : movies ) {
			dtos.add( map( movie ) );
		}
		
		return dtos;
	}
	
}
