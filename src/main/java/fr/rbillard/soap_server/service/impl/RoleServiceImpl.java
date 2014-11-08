package fr.rbillard.soap_server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rbillard.soap_server.entity.Role;
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
		
		Role role = new Role();
		role.setActor( actorService.findOne( actorId ) );
		role.setMovie( movieService.findOne( movieId ) );
		role.setFirstName( firstName );
		role.setLastName( lastName );
		
		return repository.save( role );
		
	}
	
	@Override
	public Role update( Long roleId, Long actorId, Long movieId, String firstName, String lastName ) throws RoleNotFoundException, ActorNotFoundException, MovieNotFoundException  {
		
		Role role = find( roleId );
		
		role.setActor( actorService.findOne( actorId ) );
		role.setMovie( movieService.findOne( movieId ) );
		role.setFirstName( firstName );
		role.setLastName( lastName );
		
		return repository.save( role );
		
	}

	@Override
	public void delete( Long id ) throws RoleNotFoundException {
		repository.delete( id );
	}

	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public Role find( Long id ) throws RoleNotFoundException {
		
		Role role = repository.findOne( id );
		
		if ( role == null ) {
			throw new RoleNotFoundException( id );
		}
		
		return role;
		
	}
	
}
