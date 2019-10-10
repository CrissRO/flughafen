package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bogdan Andreias
 *
 */
public class Pilot {

	private String vorname;
	private String nachname;
	private Fluglinie arbeitgeber;
	private List<Flug> auftrage;

	public Pilot(String vorname,String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		auftrage=new ArrayList<Flug>();
		System.out.println(this);
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return vorname + nachname;
	}
	
	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
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

		System.out.println("Der Pilot mit der Name " + vorname + " " + nachname + " wird eingestellt");

	}

	@Override
	public String toString() {
		return "Pilot [vorname=" + vorname + ", nachname=" + nachname + "] angelegt";
	}

	

}
