package fr.rbillard.soap_server.service;

import java.util.List;

import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.exception.RoleNotFoundException;

public interface RoleService {

	Role create( Long actorId, Long movieId, String firstName, String lastName ) throws ActorNotFoundException, MovieNotFoundException;

	Role update( Long actorId, Long movieId, String firstName, String lastName ) throws RoleNotFoundException;

	void delete( Long actorId, Long movieId ) throws RoleNotFoundException;
	
	Role find( Long actorId, Long movieId ) throws RoleNotFoundException;
	
	List<Role> findAll();

}
