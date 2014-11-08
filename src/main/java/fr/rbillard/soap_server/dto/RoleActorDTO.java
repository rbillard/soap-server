package fr.rbillard.soap_server.dto;


public class RoleActorDTO extends RoleDTO {

	private ActorDTO actor;
	
	public ActorDTO getActor() {
		return actor;
	}
	public void setActor( ActorDTO actor ) {
		this.actor = actor;
	}
	
}
