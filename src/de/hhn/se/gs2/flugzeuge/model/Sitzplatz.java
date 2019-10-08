package de.hhn.se.gs2.flugzeuge.model;
/*
 * @author Radu Giulia
 * */
public class Sitzplatz {
	
	private final String ORT;
	private final int  REIHE;
	private final char  PLATZ;

	
	public Sitzplatz(String ort, int reihe, char platz) {
		ORT = ort;
		REIHE = reihe;
		PLATZ = platz;
	}

	public void reservieren() {
		
	}

	@Override
	public String toString() {
		return "Sitzplatz [ort=" + ORT + ", reihe=" + REIHE + ", platz=" + PLATZ + "]";
	}
	
	
	
}
	