package fr.rbillard.soap_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.rbillard.soap_server.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByTitle( String title );

}
