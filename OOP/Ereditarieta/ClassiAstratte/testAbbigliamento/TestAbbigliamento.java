package testAbbigliamento;

public class TestAbbigliamento {

	public static void main(String[] args) {

		Maglia felpa= new Maglia("m", 20, "rosso", 20, "felpa");
		Maglia tshirt= new Maglia("l", 10, "bianca", 10, "tshirt");
		Pantaloni bermuda= new Pantaloni("Xl", 20, "blu", 20, "bermuda");
		Pantaloni jeans= new Pantaloni("s", 30, "nero", 20, "jeans");
		
		Abbigliamento[] a= {felpa, tshirt, bermuda,jeans};
		
		double totale=0;
		for (Abbigliamento abbigliamento : a) {
			System.out.println(abbigliamento);
			double prezzoScontato=abbigliamento.applicSconto();//polimorfismo
			totale=(abbigliamento.getQuantita()*prezzoScontato);
		}
		
		System.out.println("totale speso= "+totale);
	}

}
