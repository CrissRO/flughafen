package de.hhn.se.gs2.flugzeuge.model;

import java.util.HashMap;

/* 
 * @author Bertea Fabian
 * */

public class Stadt {

	private String name;
	private final String IATA_CODE_AREA;
	private HashMap<String,Flughafen> flughafenHashMap;  
	
	public Stadt(String name, String IATA_CODE_AREA) {
		this.name = name;
		this.IATA_CODE_AREA = IATA_CODE_AREA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIATA_CODE_AREA() {
		return IATA_CODE_AREA;
	}
	
	public Flughafen getFlughafen(String key) throws Exception{
		if(flughafenHashMap.containsKey(key))
			return flughafenHashMap.get(key);
		throw new Exception("Kein Key gefunden");
	}

	public void addFlughafen(String key,Flughafen fH) throws Exception{
		if(flughafenHashMap.size() > 6)
			throw new Exception("Zu viele Flughafen!");
		flughafenHashMap.put(key, fH);
	}
	
	public Flughafen removeFlughafen(String key) throws Exception{
		if(flughafenHashMap.size() < 1)
			throw new Exception("Keinen Flughafen sind nicht erlaubt!");
		return flughafenHashMap.remove(key);
	}

	@Override
	public String toString() {
		return "Stadt [name=" + name + ", IATA_CODE_AREA=" + IATA_CODE_AREA + "]";
	}

}
