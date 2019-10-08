package de.hhn.se.gs2.flugzeuge.model;
/*
 * @author Radu Giulia
 * */
public class Passagier {

	private String name;

	public Passagier(String name) {
		this.name = name;
	}
	
	public void verspaeten() {
		System.out.println("Der Passagier hat verspaetet");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Passagier [name=" + name + "]";
	}
	
	
}
