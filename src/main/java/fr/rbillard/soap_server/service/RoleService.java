package fr.rbillard.soap_server.service;

import java.util.List;

import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.exception.RoleNotFoundException;

public interface RoleService {

	Role create( Long actorId, Long movieId, String firstName, String lastName ) throws ActorNotFoundException, MovieNotFoundException;

	Role update( Long roleId, Long actorId, Long movieId, String firstName, String lastName ) throws RoleNotFoundException,  ActorNotFoundException, MovieNotFoundException;

	void delete( Long id ) throws RoleNotFoundException;
	
	Role find( Long id ) throws RoleNotFoundException;
	
	List<Role> findAll();

}
