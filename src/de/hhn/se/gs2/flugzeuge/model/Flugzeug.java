package de.hhn.se.gs2.flugzeuge.model;
/*
 * Birghisan Teodor-Octavian
 * 
 */

public class Flugzeug {

	private int serieNummer;
	private String modell;
	private double flugStunden;
	
	public Flugzeug(int serieNummer, String modell, double flugStunden) {
		super();
		this.serieNummer = serieNummer;
		this.modell = modell;
		this.flugStunden = flugStunden;
	}
	
	public String heizen() {
		return "Der Flugzeug mit dem Seriennummer "+ serieNummer + "wird geheizt";
	}
	
	public String einstellen() {
		return " ";
	}
	
	public String entlassen() {
		return " ";
	}
	
	public String auftanken() {
		return "Der Flugzeug mit dem Seriennummer "+ serieNummer + " wird aufgetankt";
	}
	
	public String enteisen() {
		return ""; 
	}
	
	public String landen() {
		return "Der Flugzeug mit dem Seriennummer "+ serieNummer + " wird landen";
	}
	
	public String reparieren() {
		return "Der Flugzeug mit dem Seriennummer "+ serieNummer + " wird repariert";
	}
	
	public int getSerieNummer() {
		return serieNummer;
	}

	public void setSerieNummer(int serieNummer) {
		this.serieNummer = serieNummer;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public double getFlugStunden() {
		return flugStunden;
	}

	public void setFlugStunden(double flugStunden) {
		this.flugStunden = flugStunden;
	}

	@Override
	public String toString() {
		return "Flugzeug [serieNummer=" + serieNummer + ", modell=" + modell + ", flugStunden=" + flugStunden + "]";
	}
}
