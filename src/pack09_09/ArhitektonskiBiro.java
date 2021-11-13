package pack09_09;

import java.util.*;

public class ArhitektonskiBiro {

	private String naziv;
	private List<Arhitekta> arhitekte;
	
	public ArhitektonskiBiro(String naziv) {
		super();
		this.naziv = naziv;
		this.arhitekte = new ArrayList<Arhitekta>();
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Arhitekta registrujArhitektu(String naziv, String brLicence) {
		Arhitekta nekiArh = new Arhitekta(naziv, brLicence);
		arhitekte.add(nekiArh);
		return nekiArh;
	}
	
	
}
