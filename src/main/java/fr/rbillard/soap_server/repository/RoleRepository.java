package fr.rbillard.soap_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.rbillard.soap_server.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
