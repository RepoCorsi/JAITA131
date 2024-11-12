package testVeivolo;

public class TestVeivolo {

	public static void main(String[] args) {

		Aereo a= new Aereo("Boeing 747", 600);
		Elicottero e= new Elicottero("Apache", 500);
		Idrovolante i= new Idrovolante("idro", 300);
		
		Veivolo[] v= {a,e,i};
		
		for (Veivolo veivolo : v) {
			//polimorfismo
			System.out.println(veivolo);
			veivolo.decollo();
			veivolo.atterraggio();
		}
		
	}

}
