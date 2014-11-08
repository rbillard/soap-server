package fr.rbillard.soap_server.mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.rbillard.soap_server.dto.ActorDTO;
import fr.rbillard.soap_server.entity.Actor;

@Component
public final class ActorMapper {
	
	@Autowired
	private Mapper mapper;
	
	private ActorMapper() {
		
	}

	public ActorDTO mapFull( Actor actor ) {
		return mapper.map( actor, ActorDTO.class, "actor" );
	}
	
	public ActorDTO mapLight( Actor actor ) {
		return mapper.map( actor, ActorDTO.class, "actorWithoutRoles" );
	}
	
	public List<ActorDTO> mapLight( List<Actor> actors ) {
		
		List<ActorDTO> dtos = new ArrayList<>( actors.size() );
		
		for ( Actor actor : actors ) {
			dtos.add( mapLight( actor ) );
		}
		
		return dtos;
		
	}
	
}
