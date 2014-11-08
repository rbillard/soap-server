package fr.rbillard.soap_server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Role {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "ACTOR_ID")
	private Actor actor;

	@ManyToOne
	@JoinColumn(name = "MOVIE_ID")
	private Movie movie;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	
	public Long getId() {
		return id;
	}
	public void setId( Long id ) {
		this.id = id;
	}
	
	
	public Actor getActor() {
		return actor;
	}
	public void setActor( Actor actor ) {
		this.actor = actor;
	}

	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie( Movie movie ) {
		this.movie = movie;
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
