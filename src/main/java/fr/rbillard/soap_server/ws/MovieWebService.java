package fr.rbillard.soap_server.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import fr.rbillard.soap_server.entity.Movie;
import fr.rbillard.soap_server.exception.MovieNotFoundException;

@WebService(name = "MovieWebService", serviceName = "MovieWebService")
public interface MovieWebService {

	Movie create(@WebParam(name = "title") String title);
	
	Movie update(@WebParam(name = "id") Long id, @WebParam(name = "title") String title) throws MovieNotFoundException;
	
	Movie findOne(@WebParam(name = "id") Long id) throws MovieNotFoundException;
	
	void delete(@WebParam(name = "id") Long id);
	
	List<Movie> find(@WebParam(name = "title") String title);
	
	List<Movie> findAll();
	
}
