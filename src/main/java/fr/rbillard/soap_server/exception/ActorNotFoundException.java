package fr.rbillard.soap_server.exception;

public class ActorNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private Long actorId;
	
	public ActorNotFoundException(Long actorId) {
		this.actorId = actorId;
	}

	public Long getActorId() {
		return actorId;
	}
	
}
