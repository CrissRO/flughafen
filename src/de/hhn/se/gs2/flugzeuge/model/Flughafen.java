package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bertea Fabian
 */

public class Flughafen {

	private String name;
	private final String IATA_CODE;
	
	private List<Stadt> einzugsgebiete = new ArrayList<Stadt>();
	private List<Flug> abfluge = new ArrayList<Flug>();
	private List<Flug> ankufte = new ArrayList<Flug>();

	//Konstructor der Klasse
	public Flughafen(String name, String IATA_CODE) {
		System.out.println(this);
		this.name = name;
		this.IATA_CODE = IATA_CODE;
	}

	public void heizen() {
		System.out.println("Flugzeug " + name + "mit IATA_CODE: " + IATA_CODE + " wird nun geheizt.");
	}

	public void saubern() {
		System.out.println("Flugzeug " + name + "mit IATA_CODE: " + IATA_CODE + " wird nun gesaubert.");
	}

	public void enteisen() {
		System.out.println("Flugzeug " + name + "mit IATA_CODE: " + IATA_CODE + " wird nun enteist.");
	}

	public void streichen() {
		System.out.println("Flugzeug " + name + "mit IATA_CODE: " + IATA_CODE + " wird nun gestreicht.");
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
		if (!abfluge.contains(flug)) {
			flug.addHerkunft(this);
			abfluge.add(flug);
		}
		else
			throw new Exception("Abflug schon existiert");
	}

	public void addAnkuft(Flug flug) throws Exception {
		if (!ankufte.contains(flug)) {
			flug.addZiel(this);
			ankufte.add(flug);
		}
		else
			throw new Exception("Ankuft schon existiert");
	}

	public Stadt getFlughafen(int index) throws Exception {
		if (einzugsgebiete.size() < 0 || index < 0 || index > einzugsgebiete.size() - 1)
			throw new Exception("Es gibt nicht diesen index oder die Liste ist leer.");
		return einzugsgebiete.get(index);
	}

	public void addStadt(Stadt stadt) throws Exception {
		if (einzugsgebiete.size() > 3)
			throw new Exception("Zu viele Stadte!");
		einzugsgebiete.add(stadt);
	}

	public Stadt removeStadt(int index) throws Exception {
		if (einzugsgebiete.size() < 0 || index < 0 || index > einzugsgebiete.size() - 1)
			throw new Exception("Es gibt nicht diesen index oder die Liste ist leer.");
		return einzugsgebiete.remove(index);
	}

	
	public List<Stadt> getEinzugsgebiete() {
		return einzugsgebiete;
	}

	public void setEinzugsgebiete(List<Stadt> einzugsgebiete) {
		this.einzugsgebiete = einzugsgebiete;
	}

	public List<Flug> getAbfluge() {
		return abfluge;
	}

	public void setAbfluge(List<Flug> abfluge) {
		this.abfluge = abfluge;
	}

	public List<Flug> getAnkufte() {
		return ankufte;
	}

	public void setAnkufte(List<Flug> ankufte) {
		this.ankufte = ankufte;
	}

	@Override
	public String toString() {
		return "Flughafen [name=" + name + ", IATA_CODE=" + IATA_CODE + ", einzugsgebiete=" + einzugsgebiete
				+ ", abfluge=" + abfluge + ", ankufte=" + ankufte + "] angelegt";
	}

}
