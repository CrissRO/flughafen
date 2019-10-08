package de.hhn.se.gs2.flugzeuge.model;

import java.util.HashMap;

/**
 * 
 * @author Vulpe Sebastian-Gabriel
 *
 */

public class Fluglinie {
	

	private String name;
	private final String IATA_CODE;
	private HashMap<String,Pilot> angestellter;
	private HashMap<String,Flug> angebot;
	
	
	public Fluglinie(String name, String iataCode) {
		this.name=name;
		this.IATA_CODE=iataCode;
		angestellter = new HashMap<String,Pilot>();
		angebot = new HashMap<String,Flug>();
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
		if(angestellter.containsKey(key))
			return angestellter.get(key);
		throw new Exception("Kein Pilot gefunden für die gegebene Key");
	}

	public void addPilot(String key,Pilot pilot) throws Exception{
		angestellter.put(key, pilot);
	}
	
	public Pilot removePilot(String key) throws Exception{
		if(angestellter.size() < 1)
			throw new Exception("Keine Piloten ist nicht erlaubt!");
		return angestellter.remove(key);
	}
	
	public Flug getFlug(String key) throws Exception{
		if(angebot.containsKey(key))
			return angebot.get(key);
		throw new Exception("Kein Flug gefunden für die gegebene Key");
	}

	public void addFlug(String key,Flug flug) throws Exception{
		angebot.put(key, flug);
	}
	
	public Flug removeFlug(String key) throws Exception{
		if(angebot.size() < 1)
			throw new Exception("Keine Fluge sind nicht erlaubt!");
		return angebot.remove(key);
	}

	@Override
	public String toString() {
		return "Die Fluglinie mit der Name " + name + " hat der IATA-Code " + IATA_CODE;
	}
}
