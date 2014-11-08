package fr.rbillard.soap_server.ws.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.rbillard.soap_server.dto.ActorDTO;
import fr.rbillard.soap_server.dto.ActorWithRolesDTO;
import fr.rbillard.soap_server.dto.MovieDTO;
import fr.rbillard.soap_server.dto.MovieWithRolesDTO;
import fr.rbillard.soap_server.dto.RoleWithActorAndMovieDTO;
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
		return actorMapper.map( actor );
	}

	@Override
	public ActorDTO updateActor( Long id, String firstName, String lastName, Date birthDate ) throws ActorNotFoundException {
		Actor actor = actorService.update( id, firstName, lastName, birthDate );
		return actorMapper.map( actor );
	}

	@Override
	public ActorDTO findOneActor( Long id ) throws ActorNotFoundException {
		Actor actor = actorService.findOne( id );
		return actorMapper.map( actor );
	}
	
	@Override
	public ActorWithRolesDTO findOneActorWithRoles( Long id ) throws ActorNotFoundException {
		Actor actor = actorService.findOneWithRoles( id );
		return actorMapper.mapWithRoles( actor );
	}

	@Override
	public void deleteActor( Long id ) {
		actorService.delete( id );
	}

	@Override
	public List<ActorDTO> findActors( String firstName, String lastName ) {
		List<Actor> actors = actorService.find( firstName, lastName );
		return actorMapper.map( actors );
	}

	@Override
	public List<ActorDTO> findAllActors() {
		List<Actor> actors = actorService.findAll();
		return actorMapper.map( actors );
	}
	
	/** MOVIE */
	
	@Override
	public MovieDTO createMovie( String title ) {
		Movie movie = movieService.create( title );
		return movieMapper.map( movie );
	}

	@Override
	public MovieDTO updateMovie( Long id, String title ) throws MovieNotFoundException {
		Movie movie = movieService.update( id, title );
		return movieMapper.map( movie );
	}

	@Override
	public MovieDTO findOneMovie( Long id ) throws MovieNotFoundException {
		Movie movie = movieService.findOne( id );
		return movieMapper.map( movie );
	}
	
	@Override
	public MovieWithRolesDTO findOneMovieWithRoles( Long id ) throws MovieNotFoundException {
		Movie movie = movieService.findOneWithRoles( id );
		return movieMapper.mapWithRoles( movie );
	}

	@Override
	public void deleteMovie( Long id ) {
		movieService.delete( id );
	}

	@Override
	public List<MovieDTO> findMovies( String title ) {
		List<Movie> movies = movieService.find( title );
		return movieMapper.map( movies );
	}

	@Override
	public List<MovieDTO> findAllMovies() {
		List<Movie> movies = movieService.findAll();
		return movieMapper.map( movies );
	}
	
	/** ROLE */
	
	@Override
	public RoleWithActorAndMovieDTO createRole( Long actorId, Long movieId, String firstName, String lastName ) throws ActorNotFoundException, MovieNotFoundException {
		Role role = roleService.create( actorId, movieId, firstName, lastName );
		return roleMapper.map( role );
	}
	
	@Override
	public RoleWithActorAndMovieDTO updateRole( Long actorId, Long movieId, String firstName, String lastName ) throws RoleNotFoundException {
		Role role = roleService.update( actorId, movieId, firstName, lastName );
		return roleMapper.map( role );
	}

	@Override
	public void deleteRole( Long actorId, Long movieId ) throws RoleNotFoundException {
		roleService.delete( actorId, movieId );
	}

	@Override
	public List<RoleWithActorAndMovieDTO> findAllRoles() {
		List<Role> roles = roleService.findAll();
		return roleMapper.map( roles );
	}

	@Override
	public RoleWithActorAndMovieDTO findOneRole( Long actorId, Long movieId ) throws RoleNotFoundException {
		Role role = roleService.find( actorId, movieId );
		return roleMapper.map( role );
	}

}
