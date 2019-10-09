package de.hhn.se.gs2.flugzeuge.model;

import java.time.LocalDateTime;

public class Main {

	public static void main(String args[]) {
		Flugzeug avion=new Flugzeug();
		Flug flug1=new Flug(LocalDateTime.now(), 1234);
		//Flug flug2=new Flug(LocalDateTime.of(2019,9,13,18,30), 1235);
		Passagier giulia=new Passagier("Giulia",flug1);
		Sitzplatz loculMeu= new Sitzplatz("II Klasse",27,'E',avion);
		
		Bordkarte karte1=new Bordkarte(loculMeu, giulia);
		Bordkarte karte2=new Bordkarte(loculMeu, giulia);
		
		
		//for(Bordkarte b:giulia.getTickets())
		//	System.out.println(b);
		for(Bordkarte b:loculMeu.getTickets())
			System.out.println(b.getPassagier().getName() + " " + b.getPassagier().getBuchung());
		
			
			
		
	}
	
}
