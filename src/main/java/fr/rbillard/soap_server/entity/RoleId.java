package fr.rbillard.soap_server.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

@Embeddable
public class RoleId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "ACTOR_ID")
	private Actor actor;

	@ManyToOne
	@JoinColumn(name = "MOVIE_ID")
	private Movie movie;


	public Actor getActor() {
		return actor;
	}
	public void setActor( Actor actor ) {
		this.actor = actor;
	}

	
	@XmlTransient
	public Movie getMovie() {
		return movie;
	}
	public void setMovie( Movie movie ) {
		this.movie = movie;
	}
	
	
}