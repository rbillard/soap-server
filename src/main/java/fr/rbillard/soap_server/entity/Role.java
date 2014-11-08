package fr.rbillard.soap_server.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Role {
	
	@EmbeddedId
	private RoleId id;
	
	@Column( name = "ACTOR_ID", insertable = false, updatable = false )
	private Long actorId;
	
	@Column( name = "MOVIE_ID", insertable = false, updatable = false )
	private Long movieId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	
	public RoleId getId() {
		return id;
	}
	public void setId( RoleId id ) {
		this.id = id;
	}
	

	public Long getActorId() {
		return actorId;
	}
	public void setActorId( Long actorId ) {
		this.actorId = actorId;
	}
	
	
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId( Long movieId ) {
		this.movieId = movieId;
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}
	
	
}
