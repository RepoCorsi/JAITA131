package testSupermercato;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cassa {

	//Attributi della classe Cassa
	private ArrayList<Prodotto> prodotti= new ArrayList<>();
	LocalDate data= LocalDate.now();
	
	//metodi classe cassa
	public void leggiProdotto(String codice, String desc, double Prezzo) {
		Prodotto p= new Prodotto(codice, desc, Prezzo);
		prodotti.add(p);
	}
	
	//overload
	public void leggiProdotto(Prodotto p) {
		prodotti.add(p);
	}
	
	public void stampaScontrino() {
		double somma=0;
		
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("'Scontrino del' dd/MM/yyyy");
		System.out.println(data.format(formato));//applico il formato alla data
		
		for (Prodotto p : prodotti) {
			System.out.println(p);//toString della classe prodotto
			somma+=p.getPrezzo();//sommo il prezzo di tutti i prodotti
		}
		
		DecimalFormat df= new DecimalFormat("0.00");//formato con 2 decimali
		
		System.out.println("il totale della spesa è: "+df.format(somma)+"€");	
		
	}
	
	
	public Prodotto piùCostoso() {//metodo che ritorna l'oggetto col prezzo più alto		
		double prezzoMax=0;
		Prodotto piuCostoso=null;
		
		for (Prodotto prodotto : prodotti) {
			if (prodotto.getPrezzo()>prezzoMax) {
				prezzoMax=prodotto.getPrezzo();
				piuCostoso=prodotto;
			}
		}
		return piuCostoso;//qui ritorno l'oggetto cha ha il prezzo più alto		
	}
	
	
}
