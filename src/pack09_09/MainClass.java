package pack09_09;

public class MainClass {

	public static void main(String[] args) {

//		Arhitekta a1 = new Arhitekta("Pera Peric", "012-abc-345");
//		System.out.println(a1);

		ArhitektonskiBiro biro = new ArhitektonskiBiro("Biro 1");
		Arhitekta arh1 = biro.registrujArhitektu("Pera Mitic", "123");
		System.out.println(arh1);
		
		Izvodjac i1 = new Izvodjac(2020, "100111959", "255-552-abc");
		System.out.println(i1);

//		Zgrada z1 = new Zgrada ("Zgrada Tehnickih Fakulteta", 1931, a1, i1);
//		Arhitekta arhZ1 = z1.getArh();
//		System.out.println(z1.getArh().getNaziv());
//		System.out.println(z1.getIzv());

		
	}
}
