package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Vulpe Sebastian-Gabriel
 *
 */

public class Fluglinie { 
	

	private String name;
	private final String IATA_CODE;
	private HashMap<String,Pilot> angestellte;
	private ArrayList<Flug> angebote;
	
	
	public Fluglinie(String name, String iataCode) {
		this.name=name;
		this.IATA_CODE=iataCode;
		angestellte = new HashMap<String,Pilot>();
		angebote = new ArrayList<Flug>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIataCode() {
		return IATA_CODE;
	}
	
	public Pilot getPilot(String key) throws Exception{
		if(angestellte.containsKey(key))
			return angestellte.get(key);
		throw new Exception("Kein Pilot gefunden für die gegebene Key");
	}

	public void addPilot(String key,Pilot pilot) throws Exception{
		angestellte.put(key, pilot);
	}
	
	public Pilot removePilot(String key) throws Exception{
		if(angestellte.size() < 1)
			throw new Exception("Keine Piloten ist nicht erlaubt!");
		return angestellte.remove(key);
	}
	
	public Flug getFlug(int index) throws Exception{
		if(angebote.get(index) != null)
			return angebote.get(index);
		throw new Exception("Kein Flug gefunden fuer die gegebene Key");
	}

	public void addFlug(Flug flug) throws Exception{
		angebote.add(flug);
	}
	
	public Flug removeFlug(int index) throws Exception{
		if(angebote.get(index) == null)
			throw new Exception("Dieses Flug gibt nicht!");
		return angebote.remove(index);
	}

	@Override
	public String toString() {
		return "Die Fluglinie mit der Name " + name + " hat der IATA-Code " + IATA_CODE;
	}
}
