package fr.rbillard.soap_server.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;

@WebService(name = "RoleWebService", serviceName = "RoleWebService")
public interface RoleWebService {

	Role create(
			@WebParam(name = "actorId") Long actorId, 
			@WebParam(name = "movieId") Long movieId, 
			@WebParam(name = "firstName") String firstName, 
			@WebParam(name = "lastName") String lastName) 
			throws ActorNotFoundException, MovieNotFoundException;
	
	void delete(
			@WebParam(name = "actorId") Long actorId, 
			@WebParam(name = "movieId") Long movieId)
			throws ActorNotFoundException, MovieNotFoundException;
	
}
