package de.hhn.se.gs2.flugzeuge.model;

public class Pilot {

	private String name;
	private Fluglinie arbeitPlatz;

	public Pilot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fluglinie getArbeitPlatz() {
		return arbeitPlatz;
	}

	public void setArbeitPlatz(Fluglinie arbeitPlatz) {
		this.arbeitPlatz = arbeitPlatz;
	}

	@Override
	public String toString() {
		return "Pilot name: " + name;
	}

}
