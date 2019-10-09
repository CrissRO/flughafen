package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Radu Giulia
 * */
public class Sitzplatz {
	
	private final String ORT;
	private final int  REIHE;
	private final char  PLATZ;
	private final Flugzeug FLUGZEUG ;
	private List<Bordkarte> tickets;

	
	public Sitzplatz(String ort, int reihe, char platz,Flugzeug flugzeug) {
		ORT = ort;
		REIHE = reihe;
		PLATZ = platz;
		FLUGZEUG = flugzeug;
		this.tickets = new ArrayList<Bordkarte>();
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

	@Override
	public String toString() {
		return "Sitzplatz [ort=" + ORT + ", reihe=" + REIHE + ", platz=" + PLATZ + "]";
	}
	
	
	
}
	