package fr.rbillard.soap_server.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table
@XmlType(propOrder = {"id", "title", "roles"})
public class Movie {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String title;
	
	@OneToMany(mappedBy = "id.movie", fetch = FetchType.EAGER)
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

	
	@XmlElementWrapper(name = "roles")
	@XmlElement(name = "role")
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles( List<Role> roles ) {
		this.roles = roles;
	}
	
	
}
