package fr.rbillard.soap_server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.rbillard.soap_server.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {

	List<Actor> findByFirstNameAndLastName( String firstName, String lastName );
	
}
