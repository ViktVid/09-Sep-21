package pack09_09;

public class Arhitekta {
	
	private String naziv;
	private String brLicence;
	private boolean jeAktivan;
	
	public Arhitekta (String naziv, String brLicence) {
	this.naziv = naziv;
	this.brLicence = brLicence;
	this.jeAktivan = true;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getBrLicence() {
		return brLicence;
	}

	public boolean isJeAktivan() {
		return jeAktivan;
	}

	public void setJeAktivan(boolean jeAktivan) {
		this.jeAktivan = jeAktivan;
	}
	
//	public void stampanje () {
//	System.out.println("Arh - " + naziv + "BrLic: " + brLicence + " - Aktivan" + jeAktivan);
//  }
	@Override
	public String toString () {
		return "Arh - " + naziv + " BrLic: " + brLicence + " - Aktivan: " + jeAktivan;
		//Moze i na sl nacin: this.naziv ili getNaziv - 
	}
}
