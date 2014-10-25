package fr.rbillard.soap_server.ws.impl;

import org.springframework.beans.factory.annotation.Autowired;

import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.service.RoleService;
import fr.rbillard.soap_server.ws.RoleWebService;

public class RoleWebServiceImpl implements RoleWebService {

	@Autowired
	private RoleService roleService;
	
	@Override
	public Role create( Long actorId, Long movieId, String firstName, String lastName ) throws ActorNotFoundException,
			MovieNotFoundException {
		return roleService.create( actorId, movieId, firstName, lastName );
	}

	@Override
	public void delete( Long actorId, Long movieId ) throws ActorNotFoundException, MovieNotFoundException {
		roleService.delete( actorId, movieId );
	}

}
