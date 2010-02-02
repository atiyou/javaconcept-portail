package org.javaconcept.web;

public class HelloWorld extends ExampleSupport {

	
	@Override
	public String execute() throws Exception {	
		setMessage(getText(message));
		return SUCCESS;
	}
	
	public static final String MESSAGE = "HelloWorld.message";
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
