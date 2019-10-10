package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author (gradu)Giulia Radu
 * */

public class Passagier {

	private String vorname;
	private String nachname;
	private String titel;
	private List<Bordkarte> tickets;
	private Flug buchung;
	
	//, Flug buchung in konstr
	public Passagier(String vorname,String nachname,String titel) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.titel = titel;
		
		this.tickets = new ArrayList<>();
		System.out.println(this);
		
	}

	public void addBordkarte(Bordkarte b) throws Exception {
		if(!tickets.contains(b))
			tickets.add(b);
		else
			throw new Exception("Die Bordkarte existiert bereits");
	}
	
	public void verspaeten() {
		System.out.println("Der Passagier hat verspaetet");
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public List<Bordkarte> getTickets() {
		return tickets;
	}

	public Flug getBuchung() {
		return buchung;
	}

	public void setBuchung(Flug buchung) {
		this.buchung = buchung;
	}
	
	public void setTickets(List<Bordkarte> tickets) {
		this.tickets = tickets;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	@Override
	public String toString() {
		return "Passagier [vorname=" + vorname + ", nachname=" + nachname + ", tickets=" + tickets + "] angelegt";
	}
	
	
	
	
	
}
