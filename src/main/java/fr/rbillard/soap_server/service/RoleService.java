package fr.rbillard.soap_server.service;

import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;

public interface RoleService {

	Role create( Long actorId, Long movieId, String firstName, String lastName ) throws ActorNotFoundException, MovieNotFoundException;

	void delete( Long actorId, Long movieId ) throws ActorNotFoundException, MovieNotFoundException;

}
