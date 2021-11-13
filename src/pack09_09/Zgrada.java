package pack09_09;

public class Zgrada {

	private String naziv;
	private int godinaIzgradnje;
	private Arhitekta arh;
	private Izvodjac izv;
	
	public Zgrada (String naziv, int godinaIzgradnje, Arhitekta arh, Izvodjac izv) {
		this.naziv = naziv;
		this.godinaIzgradnje = godinaIzgradnje;
		this.arh = arh;
		this.izv = izv;
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getGodinaIzgradnje() {
		return godinaIzgradnje;
	}
		
	public Arhitekta getArh() {
		return arh;
	}

	@Override
	public String toString() {
		String ispis = "Zgrada - " + naziv + "Godina Izgradnje: " + godinaIzgradnje + 
		"\n" + arh + "\n" + izv;
		return ispis;
	
				
				
/*		ispis += "\n";
		ispis += arh "\n";
		ispis += izv"\n";
		return ispis; */
		
/*		StringBuillder sb = new StringBuilder ("Zgrada - ");
		sb.append(naziv)
		.append(" - ")
		.append(godinaIzgradnje)
		.append
		.append(izv)
		.append() */
		
	
	}

}
	
	
/* Zgrada - naziv - GodOsnivanja
 * Arhitekta
 * izvodjac	
 */

