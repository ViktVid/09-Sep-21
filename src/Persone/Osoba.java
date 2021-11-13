package Persone;

public abstract class Osoba {
	
	private String naziv;
	private String jmbg;
	
	public Osoba (String naziv, String jmbg) {
		this.naziv = naziv;
		this.jmbg = jmbg;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getJMBG() {
		return jmbg;
	}
	
	public String toString() {
		return naziv + " - " + jmbg;
	}
	
}
