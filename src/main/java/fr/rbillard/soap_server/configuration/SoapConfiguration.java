package fr.rbillard.soap_server.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import fr.rbillard.soap_server.ws.ActorWebService;
import fr.rbillard.soap_server.ws.MovieWebService;
import fr.rbillard.soap_server.ws.RoleWebService;
import fr.rbillard.soap_server.ws.impl.ActorWebServiceImpl;
import fr.rbillard.soap_server.ws.impl.MovieWebServiceImpl;
import fr.rbillard.soap_server.ws.impl.RoleWebServiceImpl;

@Configuration
@ImportResource("classpath:/spring-context.xml")
public class SoapConfiguration {
	
	@Bean(name = "movieWS")
	public MovieWebService movieWebService() {
		return new MovieWebServiceImpl();
	}
	
	@Bean(name = "actorWS")
	public ActorWebService actorWebService() {
		return new ActorWebServiceImpl();
	}
	
	@Bean(name = "roleWS")
	public RoleWebService roleWebService() {
		return new RoleWebServiceImpl();
	}
	
}