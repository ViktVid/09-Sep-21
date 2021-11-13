package Persone;

public class Roditelj extends Osoba {

	private int brojDece;
	
	public Roditelj(String naziv, String jmbg, int brojDece) {
		super(naziv, jmbg);
		this.brojDece = brojDece;
	}

	public int getBrojDece() {
		return brojDece;
	}

	public void uvecajBrojDece(int broj) {
		brojDece += broj;
		
	}
	
	public String toString() {
		return super.toString() + " - Broj Dece: " + brojDece;
	}
	
}
