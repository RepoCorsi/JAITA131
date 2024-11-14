package metodiDefault;

public class TestDefault {

	public static void main(String[] args) {

		A a= new A();
		a.ciao();//--> deriva dal metodo astratto della interfaccia
		a.stampa(); //--> default contiene il corpo del metodo
		a.stampa2();//--> default contiene il corpo del metodo
		System.out.println(a.x);
		System.out.println(a.y);
		
		System.out.println(a instanceof Int1);
	}

}
