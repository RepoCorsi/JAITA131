package testStrumenti;

public class TestStrumenti {

	public static void main(String[] args) {

		Strumento s= new Strumento("generico");
		
		Chitarra c= new Chitarra("Fender", 6);
		Pianoforte p= new Pianoforte("coda", "Yamaha");
		Tromba t= new Tromba("t1", 3);
		
//		s.suona();
//		c.suona();
//		p.suona();
//		t.suona();
		
		suonaMain(p);		
		
		Strumento[] arrS= {s,c,p,t};
		
		//polimorfismo
		for (Strumento strumento : arrS) {
			strumento.suona();
		}
		
		
	}//Fine main
	
	//metodo che accetta in input istanze del tipo Strumento
	static void suonaMain(Strumento strumento) {
		
		strumento.suona();		
	}

}
