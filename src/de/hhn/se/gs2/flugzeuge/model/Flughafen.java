package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Bertea Fabian
 */

public class Flughafen {

	private String name;
	private final String IATA_CODE;
	private HashMap<String, Stadt> einzugsgebiet;
	private List<Flug> abflug;
	private List<Flug> ankuft;

	public Flughafen(String name, String IATA_CODE) {
		this.name = name;
		this.IATA_CODE = IATA_CODE;
		einzugsgebiet = new HashMap<String, Stadt>();
		abflug = new ArrayList<Flug>();
		ankuft = new ArrayList<Flug>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIATA_CODE() {
		return IATA_CODE;
	}

	public void addAbflug(Flug flug) throws Exception {
		if (abflug.size() > 5)
			throw new Exception("Uber 5 Fluge");
		else if (!abflug.contains(flug))
			abflug.add(flug);
		else
			throw new Exception("Abflug schon existiert");
	}

	public void addAnkuft(Flug flug) throws Exception {
		if (ankuft.size() > 5)
			throw new Exception("Uber 5 Fluge");
		else if (!ankuft.contains(flug))
			ankuft.add(flug);
		else
			throw new Exception("Ankuft schon existiert");
	}

	public Stadt getFlughafen(String key) throws Exception {
		if (einzugsgebiet.containsKey(key))
			return einzugsgebiet.get(key);
		throw new Exception("Kein Key gefunden");
	}

	public void addStadt(String key, Stadt stadt) throws Exception {
		if (einzugsgebiet.size() > 3)
			throw new Exception("Zu viele Stadte!");
		einzugsgebiet.put(key, stadt);
	}

	public Stadt removeStadt(String key) throws Exception {
		if (einzugsgebiet.size() < 1)
			throw new Exception("Keinen Stadte sind nicht erlaubt!");
		return einzugsgebiet.remove(key);
	}

	@Override
	public String toString() {
		return "Flughafen [name=" + name + ", IATA_CODE=" + IATA_CODE + "]";
	}

}
