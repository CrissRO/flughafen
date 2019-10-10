package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author (gradu)Giulia Radu
 * */
public class Sitzplatz {
	
	private final String ORT;
	private final int  REIHE;
	private final char  PLATZ;
	private final Flugzeug FLUGZEUG ;
	private List<Bordkarte> tickets;

	
	public Sitzplatz(String ort, char platz, int reihe, Flugzeug flugzeug) {
		ORT = ort;
		REIHE = reihe;
		PLATZ = platz;
		FLUGZEUG = flugzeug;
		this.tickets = new ArrayList<Bordkarte>();
		System.out.println(this);
	}
	
	public void addBordkarte(Bordkarte b) throws Exception {
		if(!tickets.contains(b))
			tickets.add(b);
		else
			throw new Exception("Die Bordkarte existiert bereits");
	}

	public List<Bordkarte> getTickets() {
		return tickets;
	}

	public void setTickets(List<Bordkarte> tickets) {
		this.tickets = tickets;
	}

	public void reservieren() {
		System.out.println("Der Sitzplatz ist gebucht");
	}
	
	public void reparieren() {
		System.out.println("Der Sitzplatz wird repariert");
	}

	public int getREIHE() {
		return REIHE;
	}

	public char getPLATZ() {
		return PLATZ;
	}

	@Override
	public String toString() {
		return "Sitzplatz [ort=" + ORT + ", reihe=" + REIHE + ", platz=" + PLATZ + "] angelegt";
	}
	
	
	
}
	