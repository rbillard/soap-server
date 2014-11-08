package fr.rbillard.soap_server.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Movie {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String title;
	
	@OneToMany( mappedBy = "id.movie", cascade = CascadeType.ALL )
	private List<Role> roles;
	
	
	public Long getId() {
		return id;
	}
	public void setId( Long id ) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle( String title ) {
		this.title = title;
	}


	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles( List<Role> roles ) {
		this.roles = roles;
	}
	
	
}
