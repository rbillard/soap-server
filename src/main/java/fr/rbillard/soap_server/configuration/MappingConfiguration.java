package fr.rbillard.soap_server.configuration;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.rbillard.soap_server.dto.RoleActorDTO;
import fr.rbillard.soap_server.dto.RoleMovieDTO;
import fr.rbillard.soap_server.dto.RoleWithActorAndMovieDTO;
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
				mapping( RoleActorDTO.class, Role.class ).fields( "actor", "id.actor" );
				mapping( RoleMovieDTO.class, Role.class ).fields( "movie", "id.movie" );
				mapping( RoleWithActorAndMovieDTO.class, Role.class )
					.fields( "actor", "id.actor" )
					.fields( "movie", "id.movie" );
			}
			
		};
		
	}
	
}
