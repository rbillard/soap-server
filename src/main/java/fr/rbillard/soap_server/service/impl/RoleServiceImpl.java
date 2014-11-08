package fr.rbillard.soap_server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.entity.RoleId;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.exception.RoleNotFoundException;
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
		
		RoleId id = getRoleId( actorId, movieId );
		
		Role role = new Role();
		role.setId( id );
		role.setFirstName( firstName );
		role.setLastName( lastName );
		
		return repository.save( role );
		
	}
	
	@Override
	public Role update( Long actorId, Long movieId, String firstName, String lastName ) throws RoleNotFoundException  {
		
		Role role = find( actorId, movieId );
		
		role.setFirstName( firstName );
		role.setLastName( lastName );
		
		return repository.save( role );
		
	}

	@Override
	public void delete( Long actorId, Long movieId ) throws RoleNotFoundException {
		
		try {
			RoleId id = getRoleId( actorId, movieId );
			repository.delete( id );
		} catch ( ActorNotFoundException | MovieNotFoundException e ) {
			throw new RoleNotFoundException( actorId, movieId );
		}
		
	}

	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public Role find( Long actorId, Long movieId ) throws RoleNotFoundException {
		
		Role role;
		try {
			role = repository.findOne( getRoleId( actorId, movieId ) );
		} catch ( ActorNotFoundException | MovieNotFoundException e ) {
			throw new RoleNotFoundException( actorId, movieId );
		}
		
		if ( role == null ) {
			throw new RoleNotFoundException( actorId, movieId );
		}
		
		return role;
		
	}
	
	private RoleId getRoleId( Long actorId, Long movieId ) throws ActorNotFoundException, MovieNotFoundException {

		RoleId id = new RoleId();
		id.setActor( actorService.findOne( actorId ) );
		id.setMovie( movieService.findOne( movieId ) );
		
		return id;
		
	}

}
