package fr.rbillard.soap_server.ws.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.rbillard.soap_server.entity.Actor;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.service.ActorService;
import fr.rbillard.soap_server.ws.ActorWebService;

public class ActorWebServiceImpl implements ActorWebService {

	@Autowired
	private ActorService actorService;
	
	@Override
	public Actor create( String firstName, String lastName, Date birthDate ) {
		return actorService.create( firstName, lastName, birthDate );
	}

	@Override
	public Actor update( Long id, String firstName, String lastName, Date birthDate ) throws ActorNotFoundException {
		return actorService.update( id, firstName, lastName, birthDate );
	}

	@Override
	public Actor findOne( Long id ) throws ActorNotFoundException {
		return actorService.findOne( id );
	}

	@Override
	public void delete( Long id ) {
		actorService.delete( id );
	}

	@Override
	public List<Actor> find( String firstName, String lastName ) {
		return actorService.find( firstName, lastName );
	}

}
