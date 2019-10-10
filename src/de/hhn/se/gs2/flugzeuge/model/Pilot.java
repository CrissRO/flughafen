package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bogdan Andreias
 *
 */
public class Pilot {

	private String name;
	private Fluglinie arbeitgeber;
	private List<Flug> auftrage;

	public Pilot(String name) {
		this.name = name;
		auftrage=new ArrayList<Flug>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fluglinie getarbeitgeber() {
		return arbeitgeber;
	}

	public void setarbeitgeber(Fluglinie arbeitgeber) {
		this.arbeitgeber = arbeitgeber;
	}
	
	public void addFlug(Flug flug) {
		if(!auftrage.contains(flug))
			auftrage.add(flug);
		else
			System.out.println("Der Flug ist shon auf de Liste");
	}

	public void einstellen() {

		System.out.println("Der Pilot mit der Name " + name + " wird eingestellt");

	}

	@Override
	public String toString() {
		return "Pilot name: " + name;
	}

}
