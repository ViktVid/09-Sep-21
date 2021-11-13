package Persone;

public class Radnik extends Osoba {

	private int godinaZaposlenja;
	
	public Radnik(String naziv, String jmbg, int godinaZaposlenja) {
		super(naziv, jmbg);
		this.godinaZaposlenja = godinaZaposlenja;
			
	}

	public int getGodinaZaposlenja() {
		return godinaZaposlenja;
	}
	
	public String toString () {
		return super.toString() + " Godina zaposlenja: " + godinaZaposlenja;
	}

}
