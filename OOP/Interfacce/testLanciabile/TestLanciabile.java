package testLanciabile;

public class TestLanciabile {

	public static void main(String[] args) {

		Lanciabile[] l={new Dado(),new Dado(),new Moneta(),new Moneta()};
		
		int testa=0;
		int sei=0;
		
		for (Lanciabile lanciabile : l) {
			String ris=lanciabile.lancia();// testa o croce oppure da 1 a 6
			System.out.println(ris);
			
			if (ris.equals("testa")) {
				testa++;// se esce testa incrementiamo il contatore
			}else if(ris.equals("6")) {
				sei++;// se esce 6 incrementiamo il contatore
			}
		}
		
		if (testa==2||sei==2) {
			System.out.println("Hai vinto");
		}			
	}
}
