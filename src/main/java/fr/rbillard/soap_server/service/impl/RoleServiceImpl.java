package fr.rbillard.soap_server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.entity.RoleId;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.repository.RoleRepository;
import fr.rbillard.soap_server.service.ActorService;
import fr.rbillard.soap_server.service.MovieService;
import fr.rbillard.soap_server.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository repository;
	
	@Autowired
	private ActorService actorService;
	
	@Autowired MovieService movieService;
	
	@Override
	public Role create( Long actorId, Long movieId, String firstName, String lastName ) throws ActorNotFoundException, MovieNotFoundException {
		
		RoleId id = new RoleId();
		id.setActor( actorService.findOne( actorId ) );
		id.setMovie( movieService.findOne( movieId ) );
		
		Role role = new Role();
		role.setId( id );
		role.setFirstName( firstName );
		role.setLastName( lastName );
		
		return repository.save( role );
		
	}

	@Override
	public void delete( Long actorId, Long movieId ) throws ActorNotFoundException, MovieNotFoundException {
		
		RoleId id = new RoleId();
		id.setActor( actorService.findOne( actorId ) );
		id.setMovie( movieService.findOne( movieId ) );
		
		repository.delete( id );
		
	}

}
