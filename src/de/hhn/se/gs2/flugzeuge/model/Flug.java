package de.hhn.se.gs2.flugzeuge.model;

import java.time.LocalDateTime;

/**
 * @author (cmocanu)Cezar-Cristian Mocanu
 * */

public class Flug {

	private final LocalDateTime DATE;
	private final int FLUG_NUMMER;
	
	public Flug(LocalDateTime date,int flugNummer) {
		this.DATE = date;
		this.FLUG_NUMMER = flugNummer;
	}

	public void einstellen() {}
	
	public void abheben() {}
	
	public void landen() {}
	
	public void streichen() {}
	
	public void verspatten() {}
	
	public LocalDateTime getDATE() {
		return DATE;
	}

	public int getFLUG_NUMMER() {
		return FLUG_NUMMER;
	}
	
	@Override
	public String toString() {
		return "Flug [DATE=" + DATE + ", FLUG_NUMMER=" + FLUG_NUMMER + "]";
	}
	
	
	
}
