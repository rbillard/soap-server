package fr.rbillard.soap_server.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.rbillard.soap_server.entity.Actor;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.repository.ActorRepository;
import fr.rbillard.soap_server.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository repository;
	
	@Override
	public Actor create( String firstName, String lastName, Date birthDate ) {
		
		Actor actor = new Actor();
		actor.setFirstName( firstName );
		actor.setLastName( lastName );
		actor.setBirthDate( birthDate );

		return repository.save( actor );
		
	}

	@Override
	public Actor update( Long id, String firstName, String lastName, Date birthDate ) throws ActorNotFoundException {
		
		Actor actor = findOne( id );
		
		actor.setFirstName( firstName );
		actor.setLastName( lastName );
		actor.setBirthDate( birthDate );

		return repository.save( actor );

	}

	@Override
	public Actor findOne( Long id ) throws ActorNotFoundException {
		
		Actor actor = repository.findOne( id );
		if ( actor == null ) {
			throw new ActorNotFoundException();
		}
		return actor;
		
	}

	@Override
	public void delete( Long id ) {
		repository.delete( id );
	}

	@Override
	public List<Actor> find( String firstName, String lastName ) {
		return repository.findByFirstNameAndLastName( firstName, lastName );
	}

	@Override
	public List<Actor> findAll() {
		return repository.findAll();
	}

}
