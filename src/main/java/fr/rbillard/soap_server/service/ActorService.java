package fr.rbillard.soap_server.service;

import java.util.Date;
import java.util.List;

import fr.rbillard.soap_server.entity.Actor;
import fr.rbillard.soap_server.exception.ActorNotFoundException;

public interface ActorService {

	Actor create( String firstName, String lastName, Date birthDate );

	Actor update( Long id, String firstName, String lastName, Date birthDate ) throws ActorNotFoundException;

	Actor findOne( Long id ) throws ActorNotFoundException;

	Actor findOneWithRoles( Long id ) throws ActorNotFoundException;

	void delete( Long id );

	List<Actor> find( String firstName, String lastName );
	
	List<Actor> findAll();

}
