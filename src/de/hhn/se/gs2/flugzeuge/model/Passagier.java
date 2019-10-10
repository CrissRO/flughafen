package de.hhn.se.gs2.flugzeuge.model;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Radu Giulia
 * */

public class Passagier {

	private String name;
	private List<Bordkarte> tickets;
	private Flug buchung;
	
	public Passagier(String name, Flug buchung) {
		this.name = name;
		this.buchung=buchung;
		this.tickets = new ArrayList<>();
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Passagier [name= " + name + "]";
	}
	
	
	
}
