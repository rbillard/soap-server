package fr.rbillard.soap_server.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.rbillard.soap_server.dto.RoleWithActorAndMovieDTO;
import fr.rbillard.soap_server.entity.Role;

@Component
public final class RoleMapper {

	@Autowired
	private Mapper mapper;
	
	private RoleMapper() {
		
	}

	public RoleWithActorAndMovieDTO map( Role role ) {
		return mapper.map( role, RoleWithActorAndMovieDTO.class );
	}

	public List<RoleWithActorAndMovieDTO> map( List<Role> roles ) {
		
		List<RoleWithActorAndMovieDTO> dtos = new ArrayList<>( roles.size() );
		
		for ( Role role : roles ) {
			dtos.add( map( role ) );
		}

		return dtos;
		
	}
	
}
