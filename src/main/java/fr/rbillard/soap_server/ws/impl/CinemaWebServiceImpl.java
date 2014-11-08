package fr.rbillard.soap_server.ws.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.rbillard.soap_server.dto.ActorDTO;
import fr.rbillard.soap_server.dto.MovieDTO;
import fr.rbillard.soap_server.dto.RoleDTO;
import fr.rbillard.soap_server.entity.Actor;
import fr.rbillard.soap_server.entity.Movie;
import fr.rbillard.soap_server.entity.Role;
import fr.rbillard.soap_server.exception.ActorNotFoundException;
import fr.rbillard.soap_server.exception.MovieNotFoundException;
import fr.rbillard.soap_server.exception.RoleNotFoundException;
import fr.rbillard.soap_server.mapper.ActorMapper;
import fr.rbillard.soap_server.mapper.MovieMapper;
import fr.rbillard.soap_server.mapper.RoleMapper;
import fr.rbillard.soap_server.service.ActorService;
import fr.rbillard.soap_server.service.MovieService;
import fr.rbillard.soap_server.service.RoleService;
import fr.rbillard.soap_server.ws.CinemaWebService;

public class CinemaWebServiceImpl implements CinemaWebService {

	@Autowired
	private ActorService actorService;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private ActorMapper actorMapper;
	
	@Autowired
	private MovieMapper movieMapper;
	
	@Autowired
	private RoleMapper roleMapper;
	
	/** ACTOR */
	
	@Override
	public ActorDTO createActor( String firstName, String lastName, Date birthDate ) {
		Actor actor = actorService.create( firstName, lastName, birthDate );
		return actorMapper.mapLight( actor );
	}

	@Override
	public ActorDTO updateActor( Long id, String firstName, String lastName, Date birthDate ) throws ActorNotFoundException {
		Actor actor = actorService.update( id, firstName, lastName, birthDate );
		return actorMapper.mapLight( actor );
	}

	@Override
	public ActorDTO findOneActor( Long id ) throws ActorNotFoundException {
		Actor actor = actorService.findOneWithRoles( id );
		return actorMapper.mapFull( actor );
	}
	
	@Override
	public void deleteActor( Long id ) {
		actorService.delete( id );
	}

	@Override
	public List<ActorDTO> findActors( String firstName, String lastName ) {
		List<Actor> actors = actorService.find( firstName, lastName );
		return actorMapper.mapLight( actors );
	}

	@Override
	public List<ActorDTO> findAllActors() {
		List<Actor> actors = actorService.findAll();
		return actorMapper.mapLight( actors );
	}
	
	/** MOVIE */
	
	@Override
	public MovieDTO createMovie( String title ) {
		Movie movie = movieService.create( title );
		return movieMapper.mapLight( movie );
	}

	@Override
	public MovieDTO updateMovie( Long id, String title ) throws MovieNotFoundException {
		Movie movie = movieService.update( id, title );
		return movieMapper.mapLight( movie );
	}

	@Override
	public MovieDTO findOneMovie( Long id ) throws MovieNotFoundException {
		Movie movie = movieService.findOneWithRoles( id );
		return movieMapper.mapFull( movie );
	}
	
	@Override
	public void deleteMovie( Long id ) {
		movieService.delete( id );
	}

	@Override
	public List<MovieDTO> findMovies( String title ) {
		List<Movie> movies = movieService.find( title );
		return movieMapper.mapLight( movies );
	}

	@Override
	public List<MovieDTO> findAllMovies() {
		List<Movie> movies = movieService.findAll();
		return movieMapper.mapLight( movies );
	}
	
	/** ROLE */
	
	@Override
	public RoleDTO createRole( Long actorId, Long movieId, String firstName, String lastName ) throws ActorNotFoundException, MovieNotFoundException {
		Role role = roleService.create( actorId, movieId, firstName, lastName );
		return roleMapper.map( role );
	}
	
	@Override
	public RoleDTO updateRole( Long roleId, Long actorId, Long movieId, String firstName, String lastName ) throws RoleNotFoundException, ActorNotFoundException, MovieNotFoundException {
		Role role = roleService.update( roleId, actorId, movieId, firstName, lastName );
		return roleMapper.map( role );
	}

	@Override
	public void deleteRole( Long id ) throws RoleNotFoundException {
		roleService.delete( id );
	}

	@Override
	public List<RoleDTO> findAllRoles() {
		List<Role> roles = roleService.findAll();
		return roleMapper.map( roles );
	}

	@Override
	public RoleDTO findOneRole( Long id ) throws RoleNotFoundException {
		Role role = roleService.find( id );
		return roleMapper.map( role );
	}

}
