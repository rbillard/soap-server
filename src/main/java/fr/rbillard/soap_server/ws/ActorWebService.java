package fr.rbillard.soap_server.ws;

import java.util.Date;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import fr.rbillard.soap_server.entity.Actor;
import fr.rbillard.soap_server.exception.ActorNotFoundException;

@WebService(name = "ActorWebService", serviceName = "ActorWebService")
public interface ActorWebService {

	Actor create(
			@WebParam(name = "firstName") String firstName, 
			@WebParam(name = "lastName") String lastName,
			@WebParam(name = "birthDate") Date birthDate);
	
	Actor update(
			@WebParam(name = "id") Long id, 
			@WebParam(name = "firstName") String firstName, 
			@WebParam(name = "lastName") String lastName,
			@WebParam(name = "birthDate") Date birthDate)
			throws ActorNotFoundException;
	
	
	Actor findOne(@WebParam(name = "id") Long id) throws ActorNotFoundException;
	
	void delete(@WebParam(name = "id") Long id);
	
	List<Actor> find(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName);
	
}
