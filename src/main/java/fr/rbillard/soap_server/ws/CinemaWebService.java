package fr.rbillard.soap_server.ws;

import java.util.Date;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import fr.rbillard.soap_server.dto.ActorDTO;
import fr.rbillard.soap_server.dto.ActorWithRolesDTO;
import fr.rbillard.soap_server.dto.MovieDTO;
import fr.rbillard.soap_server.dto.MovieWithRolesDTO;
import fr.rbillard.soap_server.dto.RoleWithActorAndMovieDTO;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.exception.RoleNotFoundException;

@WebService(name = "CinemaWebService", serviceName = "CinemaWebService")
public interface CinemaWebService {

	ActorDTO createActor(
			@WebParam(name = "firstName") String firstName, 
			@WebParam(name = "lastName") String lastName,
			@WebParam(name = "birthDate") Date birthDate);
	
	ActorDTO updateActor(
			@WebParam(name = "id") Long id, 
			@WebParam(name = "firstName") String firstName, 
			@WebParam(name = "lastName") String lastName,
			@WebParam(name = "birthDate") Date birthDate)
			throws ActorNotFoundException;
	
	
	ActorDTO findOneActor(@WebParam(name = "id") Long id) throws ActorNotFoundException;

	ActorWithRolesDTO findOneActorWithRoles(@WebParam(name = "id") Long id) throws ActorNotFoundException;
	
	void deleteActor(@WebParam(name = "id") Long id);
	
	List<ActorDTO> findActors(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName);
	
	List<ActorDTO> findAllActors();
	
	MovieDTO createMovie(@WebParam(name = "title") String title);
	
	MovieDTO updateMovie(@WebParam(name = "id") Long id, @WebParam(name = "title") String title) throws MovieNotFoundException;
	
	MovieDTO findOneMovie(@WebParam(name = "id") Long id) throws MovieNotFoundException;

	MovieWithRolesDTO findOneMovieWithRoles(@WebParam(name = "id") Long id) throws MovieNotFoundException;
	
	void deleteMovie(@WebParam(name = "id") Long id);
	
	List<MovieDTO> findMovies(@WebParam(name = "title") String title);
	
	List<MovieDTO> findAllMovies();
	
	RoleWithActorAndMovieDTO createRole(
			@WebParam(name = "actorId") Long actorId, 
			@WebParam(name = "movieId") Long movieId, 
			@WebParam(name = "firstName") String firstName, 
			@WebParam(name = "lastName") String lastName) 
			throws ActorNotFoundException, MovieNotFoundException;
	
	RoleWithActorAndMovieDTO updateRole(
			@WebParam(name = "actorId") Long actorId, 
			@WebParam(name = "movieId") Long movieId, 
			@WebParam(name = "firstName") String firstName, 
			@WebParam(name = "lastName") String lastName) 
					throws RoleNotFoundException;
	
	RoleWithActorAndMovieDTO findOneRole(
			@WebParam(name = "actorId") Long actorId, 
			@WebParam(name = "movieId") Long movieId) throws RoleNotFoundException;
	
	void deleteRole(
			@WebParam(name = "actorId") Long actorId, 
			@WebParam(name = "movieId") Long movieId)
			throws RoleNotFoundException;
	
	List<RoleWithActorAndMovieDTO> findAllRoles();
	
}
