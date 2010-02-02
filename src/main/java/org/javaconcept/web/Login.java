package org.javaconcept.web;

public class Login extends ExampleSupport {

	
	@Override
	public String execute() throws Exception {
		if(isInvalid(username)) return INPUT;
		if(isInvalid(password)) return INPUT;		
		return SUCCESS;
	}
	
	private boolean isInvalid(String value){
		return (value==null || value.length()==0);
	}
	
	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
