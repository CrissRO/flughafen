package de.hhn.se.gs2.flugzeuge.model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * @author (cmocanu)Cezar-Cristian Mocanu
 * */

public class Flug {
 	
	private final int FLUG_NUMMER;
	private LocalDateTime date;
	private Fluglinie anbieter;
	private Flugzeug verkehrsmittel;
	
	public Fluglinie getAnbieter() {
		return anbieter;
	}

	
	private List<Flughafen> ziele;
	private List<Flughafen> herkunfte;
	private List<Passagier> flugReisender;
	
	//flight crew: key captain -Captain
	//flight crew: key fo -First Officer(Co-Pilot)
	//flight crew: key so -Second Officer
	private HashMap<String,Pilot> crew;

	//Konstructoren
	public Flug(int flugNummer) {
		FLUG_NUMMER = flugNummer;
		ziele = new ArrayList<>();
		herkunfte = new ArrayList<>();
		flugReisender = new ArrayList<>();
		crew = new HashMap<>();
		
	}

	public Flug(LocalDateTime date,int flugNummer) {
		this(flugNummer);
		this.date = date;	
	}
	
	public Flug(int dd,int mm,int yy,int hh,int min,int flugNummer) {
		this(flugNummer);
		date = LocalDateTime.of(yy,mm,dd,hh,min);
	}
	
	//add remove methode
	
	
	//flight crew: key captain -Captain
	//flight crew: key fo -First Officer(Co-Pilot)
	//flight crew: key so -Second Officer
	public void addToCrew(String rank,Pilot p) throws Exception{
		if(!rank.equals("captain") || 
			!rank.equals("fo") ||
			!rank.equals("so"))
				throw new Exception("Rank does not exist");
		crew.put(rank,p);
	}
	
	public Pilot removeFromCrew(String rank) throws Exception{
		if(!rank.contains(rank))
			throw new Exception("Rank does not exist");
		return crew.remove(rank);
	}
	
	
	//methoden
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
	
	
	//get set
	public LocalDateTime getDate() {
		return date;
	}
	
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public void setDate(int dd,int mm,int yy,int hh,int min) {
		this.date = LocalDateTime.of(yy, mm, dd,hh,min);
	}

	public int getFLUG_NUMMER() {
		return FLUG_NUMMER;
	}
	
	public void setAnbieter(Fluglinie anbieter) {
		this.anbieter = anbieter;
	}

	public Flugzeug getVerkehrsmittel() {
		return verkehrsmittel;
	}

	public void setVerkehrsmittel(Flugzeug verkehrsmittel) {
		this.verkehrsmittel = verkehrsmittel;
	}
	
	@Override
	public String toString() {
		return "Flug [DATE=" + date + ", FLUG_NUMMER=" + FLUG_NUMMER + "]";
	}
	
	
	
}
