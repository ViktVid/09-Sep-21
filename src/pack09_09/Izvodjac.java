package pack09_09;

public class Izvodjac {

/* 
 Izvodjac ima naziv, godinu osnivanja, PIB i broj licence.
 Naziv se moze dohvatiti i postaviti, naziv se takodje postavlja prilikom kreiranja.
 Broj licence i PIB se moze samo dohvatiti a postavlja se prilikom kreiranja izvodjaca.
 Godina osnivanja se moze samo dohvatiti a postavlja se prilikom kreiranja izvodjaca.
 Izv - {Naziv} - BrLic: {BrojLicence} - PIB: {PIB} - Godina Osnivanja: {GodOsnivanja} */	
	
	private String naziv;
	private int godinaOsnivanja;
	private String pib;
	private String brLicence;
	
	public Izvodjac ( int godinaOsnivanja, String pib, String brLicence) {
		this.naziv = "Neki Naziv";
		this.godinaOsnivanja = godinaOsnivanja;
		this.pib = pib;
		this.brLicence = brLicence;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void setGodinaOsnivanja(int godinaOsnivanja) {
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public String getBrLicence() {
		return brLicence;
	}

	public void setBrLicence(String brLicence) {
		this.brLicence = brLicence;
	}

	public String toString () {
		return "Izv - " + naziv + " - BrLic: " + brLicence + " PIB: " + pib + " - Godina Osnivanja: " + godinaOsnivanja;
	}
// Izv - {Naziv} - BrLic: {BrojLicence} - PIB: {PIB} - Godina Osnivanja: {GodOsnivanja}	
}
