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
	private HashMap<String,Pilot> pilotenHashMap;
	private HashMap<String,Flug> flugeHashMap;
	
	
	public Fluglinie(String name, String iataCode) {
		this.name=name;
		this.IATA_CODE=iataCode;
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
		if(pilotenHashMap.containsKey(key))
			return pilotenHashMap.get(key);
		throw new Exception("Kein Key gefunden");
	}

	public void addPilot(String key,Pilot pilot) throws Exception{
		pilotenHashMap.put(key, pilot);
	}
	
	public Pilot removePilot(String key) throws Exception{
		if(pilotenHashMap.size() < 1)
			throw new Exception("Keinen Piloten sind nicht erlaubt!");
		return pilotenHashMap.remove(key);
	}
	
	public Flug getFlug(String key) throws Exception{
		if(flugeHashMap.containsKey(key))
			return flugeHashMap.get(key);
		throw new Exception("Kein Key gefunden");
	}

	public void addFlug(String key,Flug flug) throws Exception{
		flugeHashMap.put(key, flug);
	}
	
	public Flug removeFlug(String key) throws Exception{
		if(flugeHashMap.size() < 1)
			throw new Exception("Keinen Fluge sind nicht erlaubt!");
		return flugeHashMap.remove(key);
	}

	@Override
	public String toString() {
		return "Fluglinie [name=" + name + ", IataCode=" + IATA_CODE + "]";
	}
}
