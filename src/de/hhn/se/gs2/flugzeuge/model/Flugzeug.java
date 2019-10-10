package de.hhn.se.gs2.flugzeuge.model;
import java.util.ArrayList;
import java.util.List;

/**
*
* @author Birghisan Teodor-Octavian
*
*/

public class Flugzeug {

	List<Flug> einsatz; //Assignement
	List<Sitzplatz> sitzGelegenheit;
	private String serienNummer; 
	private String modell;
	private double flugStunden;
	private String tailNumber;
	
	public Flugzeug(String serienNummer, String modell, double flugStunden, String tailNumber) {
		this.serienNummer = serienNummer;
		this.modell = modell;
		this.flugStunden = flugStunden;
		this.tailNumber = tailNumber;
		sitzGelegenheit = new ArrayList<>();
		einsatz = new ArrayList<>();
		System.out.println(this);
	}
	
	public String getSerienNummer() {
		return serienNummer;
	}

	public void setSerienNummer(String serienNummer) {
		this.serienNummer = serienNummer;
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

	public void setFlugStunden(int flugStunden) {
		this.flugStunden = flugStunden;
	}

	public String getTailNumber() {
		return tailNumber;
	}

	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}

	public List<Flug> getEinsatz() {
		return einsatz;
	}

	public List<Sitzplatz> getSitzGelegenheit() {
		return sitzGelegenheit;
	}

	public void addSitzGelegenheit(Sitzplatz s){
		if(sitzGelegenheit.size()>854) {
			System.out.println("Der Flugzeug kann keine Sitzplaetze mehr haben! ");
		}else {
			sitzGelegenheit.add(s);
		}
	}
	
	public void addEinsatz(Flug f) {
		einsatz.add(f);
	}

	public void heizen() {
		System.out.println("Der Flugzeug mit dem Seriennummer "+ serienNummer +", modell "+ modell +" mit dem Tailnumber "+tailNumber + "wird geheizt");
	}

	public void einstellen() {
		System.out.println("Der Flugzeug mit dem Seriennummer "+ serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird repariert");
	}

	public void auftanken() {
		System.out.println("Der Flugzeug mit dem Seriennummer "+ serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird aufgetankt");
	}

	public void reservieren() {
	 System.out.println("Der Flugzeug mit dem Seriennummer "+ serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird reserviert");
	}

	public void saeubern() {
		System.out.println("Der Flugzeug mit dem Seriennummer " + serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird gesaeubert");
	}

	public void enteisen() {
		System.out.println("Der Flugzeug mit dem Seriennummer " + serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird enteist");
	}

	public void abheben() {
		System.out.println("Der Flugzeug mit dem Seriennummer " + serienNummer +", modell "+ modell +" mit dem Tailnumber "+tailNumber + "hebt ab");
	}

	public void landen() {
		System.out.println("Der Flugzeug mit dem Seriennummer "+ serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird landen");
	}

	public void reparieren() {
		System.out.println("Der Flugzeug mit dem Seriennummer "+ serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird repariert");
	}

	public void streichen() {
		System.out.println("Der Flugzeug mit dem Seriennummer "+ serienNummer + ", modell "+ modell +" mit dem Tailnumber "+tailNumber + " wird gestriechen");
	}

	@Override
	public String toString() {
		return "Flugzeug [einsatz=" + einsatz + ", sitzGelegenheit=" + sitzGelegenheit + ", serienNummer="
				+ serienNummer + ", modell=" + modell + ", flugStunden=" + flugStunden + ", tailNumber=" + tailNumber
				+ "] angelegt";
	}
	
}