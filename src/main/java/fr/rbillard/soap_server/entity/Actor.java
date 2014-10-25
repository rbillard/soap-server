package fr.rbillard.soap_server.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table
@XmlType(propOrder = {"id", "firstName", "lastName", "birthDate"})
public class Actor {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Date birthDate;
	
	@OneToMany(mappedBy = "id.actor")
	private List<Role> roles;

	
	public Long getId() {
		return id;
	}
	public void setId( Long id ) {
		this.id = id;
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
	
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate( Date birthDate ) {
		this.birthDate = birthDate;
	}
	
	
	@XmlTransient
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles( List<Role> roles ) {
		this.roles = roles;
	}
	
	
}
