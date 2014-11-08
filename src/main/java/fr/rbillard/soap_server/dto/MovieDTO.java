package fr.rbillard.soap_server.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"id", "title"})
public class MovieDTO {

	private Long id;
	private String title;
	
	
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

	
}
