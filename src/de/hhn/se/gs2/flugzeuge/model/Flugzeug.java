package de.hhn.se.gs2.flugzeuge.model;
import java.util.List;

/**
*
* @author Birghisan Teodor-Octavian
*
*/

public class Flugzeug {

	List<Flug> einsatz;
	Sitzplatz sitzGelegenheit;
	private String serienNummer; 
	private String modell;
	private String flugStunden;
	

	public String heizen() {
		// TODO - implement Flugzeug.heizen
		//throw new UnsupportedOperationException();
		return "Der Flugzeug mit dem Seriennummer "+ serienNummer + "wird geheizt";
	}

	public void einstellen() {
		// TODO - implement Flugzeug.einstellen
		throw new UnsupportedOperationException();
	}

	public String auftanken() {
		// TODO - implement Flugzeug.auftanken
		//throw new UnsupportedOperationException();
		return "Der Flugzeug mit dem Seriennummer "+ serienNummer + " wird aufgetankt";

	}

	public void reservieren() {
		// TODO - implement Flugzeug.reservieren
		throw new UnsupportedOperationException();
	}

	public String saeubern() {
		// TODO - implement Flugzeug.säubern
		//throw new UnsupportedOperationException();
		return "Der Flugzeug mit dem Seriennummer " + serienNummer + " wird gesaeubert";
	}

	public String enteisen() {
		// TODO - implement Flugzeug.enteisen
		//throw new UnsupportedOperationException();
		return "Der Flugzeug mit dem Seriennummer " + serienNummer + " wird enteist";
	}

	public void abheben() {
		// TODO - implement Flugzeug.abheben
		throw new UnsupportedOperationException();
	}

	public String landen() {
		// TODO - implement Flugzeug.landen
		//throw new UnsupportedOperationException();
		return "Der Flugzeug mit dem Seriennummer "+ serienNummer + " wird landen";
	}

	public String reparieren() {
		// TODO - implement Flugzeug.reparieren
		//throw new UnsupportedOperationException();
		return "Der Flugzeug mit dem Seriennummer "+ serienNummer + " wird repariert";

	}

	public void streichen() {
		// TODO - implement Flugzeug.streichen
		throw new UnsupportedOperationException();
	}
}
