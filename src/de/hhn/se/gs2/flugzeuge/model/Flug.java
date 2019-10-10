package de.hhn.se.gs2.flugzeuge.model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * @author (cmocanu)Cezar-Cristian Mocanu
 * */

public class Flug {
 	
	private final String FLUG_NUMMER;
	private LocalDateTime date;
	private Fluglinie anbieter;
	private Flugzeug verkehrsmittel;
	
	private List<Flughafen> ziele;
	private List<Flughafen> herkunfte;
	private List<Passagier> flugReisender;
	
	//flight crew: key captain -Captain
	//flight crew: key fo -First Officer(Co-Pilot)
	//flight crew: key so -Second Officer
	private HashMap<String,Pilot> crew;

	//Konstructoren
	private Flug(String flugNummer,Flugzeug verkehrsmittel) throws Exception{
		this.verkehrsmittel = verkehrsmittel;
		
		FLUG_NUMMER = flugNummer;
		ziele = new ArrayList<>();
		herkunfte = new ArrayList<>();
		flugReisender = new ArrayList<>();
		crew = new HashMap<>();
		
		
	}

	public Flug(LocalDateTime date,String flugNummer,Flugzeug verkehrsmittel) throws Exception{
		this(flugNummer,verkehrsmittel);
		this.date = date;	
		System.out.println(this);
	}
	
	//add remove methode
	
	
	public void addZiel(Flughafen ziel) throws Exception{
		if(ziele.size() > 5)
			throw new Exception("Zu viele Ziele");
		ziele.add(ziel);
	}
	
	public void addHerkunft(Flughafen herkunft) throws Exception{
		if(herkunfte.size() > 5)
			throw new Exception("Zu viele Herkunfte");
		herkunfte.add(herkunft);
	}
	
	
	public void addPassagier(Passagier p) throws Exception{
		if(flugReisender.size() > 853)
			throw new Exception("Zu viele Passagiere");
		flugReisender.add(p);
	}
	
	//flight crew: key captain -Captain
	//flight crew: key fo -First Officer(Co-Pilot)
	//flight crew: key so -Second Officer
	public void addToCrew(String rank,Pilot p) throws Exception{
		
		if(!rank.equals("captain") && 
			!rank.equals("fo") &&
			!rank.equals("so"))
				throw new Exception("Rank does not exist");
		p.addFlug(this);
		crew.put(rank,p);
	}
	
	public Pilot removeFromCrew(String rank) throws Exception{
		if(!rank.contains(rank))
			throw new Exception("Rank does not exist");
		return crew.remove(rank);
	}
	
	
	//methoden
	
	public void show() {
		System.out.println("\nFlug " + this.getFLUG_NUMMER() + " am " + this.getDate());
		System.out.println("angeboten von " + anbieter.getName() + " (" + anbieter.getIataCode() + ")");
		System.out.println("geflogen von " + crew.get("captain").getNachname() + ", " + crew.get("captain").getVorname() + "[und " + crew.get("fo").getNachname() + "," + crew.get("so").getNachname()+"]");
		System.out.println("startet in " + herkunfte.get(0).getName() + "("+herkunfte.get(0).getIATA_CODE()+") bei " + herkunfte.get(0).getEinzugsgebiete().get(0).getName());
		System.out.println("landet in " + ziele.get(0).getName() + "("+ ziele.get(0).getIATA_CODE()+") bei " + ziele.get(0).getEinzugsgebiete().get(0).getName());
		System.out.println("wird durchgeführt mit " + verkehrsmittel.getTailNumber() + " (" + verkehrsmittel.getModell() + ")" );
		System.out.print("befördert Passagiere:");
		for(Passagier fR : flugReisender)
			System.out.print("  " + fR.getNachname() + "," + fR.getVorname() + " " + fR.getTitel() + " auf Platz " +  fR.getTickets().get(fR.getTickets().size()-1).getSitzplatz().getREIHE() +fR.getTickets().get(fR.getTickets().size()-1).getSitzplatz().getPLATZ());
		
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
	
	
	//get set
	public LocalDateTime getDate() {
		return date;
	}
	
	public Fluglinie getAnbieter() {
		return anbieter;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public void setDate(int dd,int mm,int yy,int hh,int min) {
		this.date = LocalDateTime.of(yy, mm, dd,hh,min);
	}

	public String getFLUG_NUMMER() {
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
		return "Flug [DATE=" + date + ", FLUG_NUMMER=" + FLUG_NUMMER + "] angelegt";
	}
	
	
	
}
