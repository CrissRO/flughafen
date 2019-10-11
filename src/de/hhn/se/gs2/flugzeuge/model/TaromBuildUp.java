package de.hhn.se.gs2.flugzeuge.model;

import java.time.LocalDateTime;

public class TaromBuildUp {
	
	private static Stadt theOriginCity;
	private static Stadt theDestinationCity;
	private static Flughafen theOriginAirport;
	private static Flughafen theDestinationAirport;
	private static Flugzeug theAirplane;
	private static Flugzeug theAirplaneBack;
	private static Flug outFlight;
	private static Flug returnFlight;
	private static Fluglinie theAirLine;
	private static Pilot captain;
	private static Pilot firstOfficer;
	private static Pilot secondOfficer;
	private static Sitzplatz firstSeatOut;
	private static Sitzplatz firstSeatReturn;
	private static Sitzplatz secondSeatOut;
	private static Passagier theFirstPassenger;
	private static Passagier theSecondPassenger;
	private static Bordkarte outTicketPassengerOne;
	private static Bordkarte returnTicketPassengerOne;
	private static Bordkarte outTicketPassengerTwo;//nu se mai intoarce, ramane in NY
	
	private static void buildAirport() {
		
		theOriginAirport = new Flughafen("Los Angeles International Airport ","LAX"); 
		theDestinationAirport = new Flughafen("John F. Kennedy International Airport","JFK"); 
	}
	
	private static void buildCity() {
		
		theOriginCity = new Stadt("Los Angeles","LA");
		theDestinationCity = new Stadt("New York","NYC");
		try {
			theOriginCity.addFlughafen(theOriginAirport);
			theOriginAirport.addStadt(theOriginCity);
			theDestinationCity.addFlughafen(theDestinationAirport);
			theDestinationAirport.addStadt(theDestinationCity);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	private static void  buildAirplane() {
		theAirplane = new Flugzeug("A321","Airbus A321",576,"N101NN");
		theAirplaneBack = new Flugzeug("A321","Airbus A321",576,"N101NN");
	}
	
	private static void buildPassengers() {
		theFirstPassenger = new Passagier("Anna","Smith","Ms.");
		theSecondPassenger = new Passagier("Jane","Williams","Ms.");
	}
	
	private static void buildFlights() {
		try {
			outFlight = new Flug(LocalDateTime.of(2019, 10, 10, 13, 30),"RO705",theAirplane);
			
			outFlight.addPassagier(theFirstPassenger);
			outFlight.addPassagier(theSecondPassenger);
			
			returnFlight = new Flug(LocalDateTime.of(2019, 10, 10, 16, 50),"RO643",theAirplane);   
			
			returnFlight.addPassagier(theFirstPassenger);
			
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		theAirplane.addEinsatz(outFlight);
		theAirplane.addEinsatz(returnFlight);
		try {
			theOriginAirport.addAbflug(outFlight);
			theDestinationAirport.addAnkuft(outFlight); 

			theDestinationAirport.addAbflug(returnFlight); 
			theOriginAirport.addAnkuft(returnFlight);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void buildSeats() {
		firstSeatOut = new Sitzplatz("Business", 'A', 5, theAirplane);
		secondSeatOut = new Sitzplatz("Business", 'B', 5, theAirplane);
		firstSeatReturn = new Sitzplatz("Business", 'A', 6, theAirplane);
		theAirplane.addSitzGelegenheit(firstSeatOut);
		theAirplane.addSitzGelegenheit(secondSeatOut);
		theAirplane.addSitzGelegenheit(firstSeatReturn);

	}
	
	
	private static void buildBoardingTicket() {
		outTicketPassengerOne = new Bordkarte(firstSeatOut,theFirstPassenger);
		returnTicketPassengerOne = new Bordkarte(firstSeatReturn,theFirstPassenger);
		outTicketPassengerTwo = new Bordkarte(secondSeatOut,theSecondPassenger);
	}
	

	
	private static void buildPilots(){
		captain = new Pilot("John","Whitaker");
		firstOfficer = new Pilot("Kevin","Miller");
		secondOfficer = new Pilot("Robert","Shepherd");
		try {
			outFlight.addToCrew("captain", captain);
			outFlight.addToCrew("fo", firstOfficer);
			outFlight.addToCrew("so", secondOfficer);
			returnFlight.addToCrew("captain", captain);
			returnFlight.addToCrew("fo", firstOfficer);	
			returnFlight.addToCrew("so", secondOfficer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void buildAirline() {
		theAirLine = new Fluglinie("TAROM","RO");
		try {
			theAirLine.addPilot(captain.getName(), captain);
			theAirLine.addPilot(firstOfficer.getName(), firstOfficer);
			theAirLine.addPilot(secondOfficer.getName(), secondOfficer);
			theAirLine.addFlug(outFlight);
			theAirLine.addFlug(returnFlight);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		buildAirport();
		buildCity();
		buildAirplane();
		buildPassengers();
		buildSeats();
		buildBoardingTicket();
		buildFlights();
		buildPilots();
		buildAirline();
				
		outFlight.show();
		
		System.out.println();
		
		returnFlight.show();
	}
	
}
