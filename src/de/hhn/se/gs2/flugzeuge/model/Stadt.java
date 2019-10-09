package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/* 
 * @author Bertea Fabian
 * */

public class Stadt {

	private String name;
	private final String IATA_CODE_METRO_AREA;
	
	private List<Flughafen> infrastruktur = new ArrayList<Flughafen>();

	//Konstructor der Klasse
	public Stadt(String name, String IATA_CODE_METRO_AREA) {
		this.name = name;
		this.IATA_CODE_METRO_AREA = IATA_CODE_METRO_AREA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIATA_CODE_METRO_AREA() {
		return IATA_CODE_METRO_AREA;
	}

	public Flughafen getFlughafen(int index) throws Exception {
		if (infrastruktur.size() < 0 || index < 0 || index > infrastruktur.size() - 1)
			throw new Exception("Es gibt nicht diesen index oder die Liste ist leer.");
		return infrastruktur.get(index);
	}

	public void addFlughafen(Flughafen flughafen) throws Exception {
		if (infrastruktur.size() > 6)
			throw new Exception("Zu viele Flughafen!");
		infrastruktur.add(flughafen);
	}

	public Flughafen removeFlughafen(int index) throws Exception {
		if (infrastruktur.size() < 0 || index < 0 || index > infrastruktur.size() - 1)
			throw new Exception("Es gibt nicht diesen index oder die Liste ist leer.");
		return infrastruktur.remove(index);
	}

	@Override
	public String toString() {
		return "Stadt [name=" + name + ", IATA_CODE_METRO_AREA=" + IATA_CODE_METRO_AREA + ", infrastruktur="
				+ infrastruktur + "]";
	}

}
