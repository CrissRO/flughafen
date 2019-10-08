package de.hhn.se.gs2.flugzeuge.model;

import java.util.HashMap;

public class Flughafen {

	private String name;
	private final String IATA_CODE_AREA;
	private HashMap<String,Stadt> stadteHashMap;  

	public Flughafen(String name, String IATA_CODE_AREA) {
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
	
	public Stadt getFlughafen(String key) throws Exception{
		if(stadteHashMap.containsKey(key))
			return stadteHashMap.get(key);
		throw new Exception("Kein Key gefunden");
	}

	public void addStadt(String key,Stadt stadt) throws Exception{
		if(stadteHashMap.size() > 3)
			throw new Exception("Zu viele Stadte!");
		stadteHashMap.put(key, stadt);
	}
	
	public Stadt removeStadt(String key) throws Exception{
		if(stadteHashMap.size() < 1)
			throw new Exception("Keinen Stadte sind nicht erlaubt!");
		return stadteHashMap.remove(key);
	}
	
	@Override
	public String toString() {
		return "Flughafen [name=" + name + ", IATA_CODE_AREA=" + IATA_CODE_AREA + "]";
	}

}
