package de.hhn.se.gs2.flugzeuge.model;

public class Bordkarte {
	/**
	 * @author (gradu)Giulia Radu
	 * */
	private Sitzplatz sitzplatz;
	private Passagier passagier;
	
	public Bordkarte(Sitzplatz sitzplatz, Passagier passagier) {
		
		this.sitzplatz = sitzplatz;
		this.passagier = passagier;
		
		try {
			this.sitzplatz.addBordkarte(this);
			this.passagier.addBordkarte(this);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public Sitzplatz getSitzplatz() {
		return sitzplatz;
	}

	public void setSitzplatz(Sitzplatz sitzplatz) {
		this.sitzplatz = sitzplatz;
	}

	public Passagier getPassagier() {
		return passagier;
	}

	public void setPassagier(Passagier passagier) {
		this.passagier = passagier;
	}
	
	@Override
	public String toString() {
		return "Bordkarte [sitzplatz=" + sitzplatz + ", passagier=" + passagier+ "] angelegt";
	}
	
	
	
	
}
