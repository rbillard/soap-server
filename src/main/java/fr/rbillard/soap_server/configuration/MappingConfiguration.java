package fr.rbillard.soap_server.configuration;

import static org.dozer.loader.api.FieldsMappingOptions.useMapId;
import static org.dozer.loader.api.TypeMappingOptions.mapId;
import static org.dozer.loader.api.TypeMappingOptions.oneWay;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.rbillard.soap_server.dto.ActorDTO;
import fr.rbillard.soap_server.dto.MovieDTO;
import fr.rbillard.soap_server.dto.RoleDTO;
import fr.rbillard.soap_server.entity.Actor;
import fr.rbillard.soap_server.entity.Movie;
import fr.rbillard.soap_server.entity.Role;

@Configuration
public class MappingConfiguration {

	@Bean
	public Mapper mapper() {
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.addMapping( beanMappingBuilder() );
		return mapper;
		
	}
	
	private BeanMappingBuilder beanMappingBuilder() {
		
		return new BeanMappingBuilder() {
			
			@Override
			protected void configure() {

				// Actor
				mapping( Actor.class, ActorDTO.class, oneWay(), mapId( "actor" ) )
					.fields( "roles", "roles", useMapId( "roleWithoutActor" ) );

				mapping( Actor.class, ActorDTO.class, oneWay(), mapId( "actorWithoutRoles" ) )
					.exclude( "roles" );

				// Movie
				mapping( Movie.class, MovieDTO.class, oneWay(), mapId( "movie" ) )
					.fields( "roles", "roles",useMapId( "roleWithoutMovie" ) );

				mapping( Movie.class, MovieDTO.class, oneWay(), mapId( "movieWithoutRoles" ) )
					.exclude( "roles" );

				// Role
				mapping( Role.class, RoleDTO.class, oneWay(), mapId( "role" ) )
					.fields( "id.actor", "actor", useMapId( "actorWithoutRoles" ) )
					.fields( "id.movie", "movie", useMapId( "movieWithoutRoles" ) );

				mapping( Role.class, RoleDTO.class, oneWay(), mapId( "roleWithoutActor" ) )
					.exclude( "actor" )
					.fields( "id.movie", "movie", useMapId( "movieWithoutRoles" ) );

				mapping( Role.class, RoleDTO.class, oneWay(), mapId( "roleWithoutMovie" ) )
					.exclude( "movie" )
					.fields( "id.actor", "actor", useMapId( "actorWithoutRoles" ) );

			}
			
		};
		
	}
	
}
