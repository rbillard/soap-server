package fr.rbillard.soap_server.exception;

public class RoleNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	private Long roleId;
	
	public RoleNotFoundException( Long roleId ) {
		this.roleId = roleId;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	
}
