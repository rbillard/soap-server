package fr.rbillard.soap_server.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import fr.rbillard.soap_server.ws.CinemaWebService;
import fr.rbillard.soap_server.ws.impl.CinemaWebServiceImpl;

@Configuration
@ImportResource("classpath:/spring-context.xml")
public class SoapConfiguration {
	
	@Bean(name = "cinemaWS")
	public CinemaWebService actorWebService() {
		return new CinemaWebServiceImpl();
	}
	
}