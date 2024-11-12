package testPredaPredatore;

public class TestPredaPredatore {

	public static void main(String[] args) {

		Preda[] prede= {new Coniglio(),new Pesce()};
		Predatore[] predatori= {new Avvoltoio(), new Pesce()};
		
		for (Predatore predatore : predatori) {
			predatore.caccia();
		}
		
		for (Preda preda : prede) {
			preda.scappa();
		}
		
		i[] tutto= {new Coniglio(),new Pesce(),new Avvoltoio()};
		
	
	}

}
