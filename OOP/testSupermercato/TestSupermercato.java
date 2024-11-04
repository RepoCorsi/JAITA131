package testSupermercato;

import java.util.Scanner;

public class TestSupermercato {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("quanti prodotti hai acquistato?");
		
		int nProdotti=s.nextInt();
		s.nextLine();
		
		Cassa cassa1= new Cassa();
		
		System.out.println("passa i prodotti sul lettore");
		
		for (int i = 0; i < nProdotti; i++) {
			System.out.println("codice:");
			String codice=s.nextLine();
			System.out.println("Descrizione:");
			String Descrizione=s.nextLine();
			System.out.println("Prezzo:");
			double Prezzo=s.nextDouble();
			s.nextLine();
			
			Prodotto p= new Prodotto(codice, Descrizione, Prezzo);
			cassa1.leggiProdotto(p);
			
			//cassa1.leggiProdotto(codice, Descrizione, Prezzo);			
		}
		
		cassa1.stampaScontrino();
		Prodotto piùCostoso=cassa1.piùCostoso();
		System.out.println("il prodotto più costoso è "+piùCostoso);
		

	}

}
