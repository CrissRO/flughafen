package de.hhn.se.gs2.flugzeuge.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author (cmocanu)Cezar-Cristian Mocanu
 * */

public class Flug {

	//Die final Variablen sind mit grossen Buchstaben geschrieben 
	private final LocalDateTime DATE;
	private final int FLUG_NUMMER;
	private Fluglinie anbieter;
	private Flugzeug verkehrsMittel;
	
	private List<Flughafen> ziele;
	private List<Flughafen> herkunfte;
	private List<Pilot> flugzeugBesazung;//flight crew
	private List<Passagier> flugReisender;
	

	public Flug(LocalDateTime date,int flugNummer) {
		DATE = date;
		FLUG_NUMMER = flugNummer;
		ziele = new ArrayList<>();
		herkunfte = new ArrayList<>();
		flugzeugBesazung = new ArrayList<>();
		flugReisender = new ArrayList<>();
	}

	public void einstellen() {
		System.out.println("Der Flug #"+ FLUG_NUMMER+" ist eingestellt");
	}
	
	public void reservieren() {
		System.out.println("Sie haben der Flug #"+ FLUG_NUMMER+" reserviert");
	}
	
	public void abheben() {
		System.out.println("Der Flug #"+ FLUG_NUMMER+" hat abgehoben");
	}
	
	public void landen() {
		System.out.println("Der Flug #"+ FLUG_NUMMER+" ist gelandet");
	}
	
	public void streichen() {
		System.out.println("Der Flug #"+ FLUG_NUMMER+" ist gestrichen");
	}
	
	public void verspatten() {
		System.out.println("Flug #"+ FLUG_NUMMER+" verspaetet");
	}
	
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
