package de.hhn.se.gs2.flugzeuge.model;

public class Passagier {

	private String name;

	public Passagier(String name) {
		name = name;
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
