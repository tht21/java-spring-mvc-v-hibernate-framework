package edu.pxu.demospringMVC.model;

public class User {
	private String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public User() {
	
	}

	public User(String fullName) {
		super();
		this.fullName = fullName;
	}
	
}

