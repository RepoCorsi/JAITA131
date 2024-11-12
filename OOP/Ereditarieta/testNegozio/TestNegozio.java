package testNegozio;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestNegozio {

/**
 * Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco, 
 * una descrizione del prodotto e il suo prezzo.
Realizzare una classe Prodotto con le opportune variabili d'istanza elencate precedentemente,
 e in più un attributo di tipo cliente(Riferimento alla classe cliente(Estensione di persona),
e dall'età (da persona), e dal numero tessera) e i vari metodi get, set e toString.

Aggiungere alla classe Prodotto un metodo applicaSconto che modifichi il prezzo del prodotto 
diminuendolo del 5% solo se il cliente ha più di 60 anni.

Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli 
Non Alimentari.
Ai prodotti alimentari viene infatti associata una data di scadenza, mentre a quelli 
non alimentari il materiale principale di cui sono fatti(carta, vetro, plastica..).

Realizzare le sottoclassi Alimentari e NonAlimentari estendendo opportunamente 
la classe Prodotto.

Modificare le due sottoclassi specializzando il metodo applicaSconto in modo che nel caso 
dei prodotti alimentari venga applicato uno sconto ulteriore del 20% se la data di scadenza 
è a meno di 10 giorni dalla data attuale, mentre nel caso dei prodotti nonAlimentari venga 
applicato uno sconto del 10%  se il prodotto è composto da materiale riciclabile.

Creare un elenco di prodotti Alimentari e non Alimentari, stamparne l'elenco visualizzando 
le informazioni dei clienti, e tutte le caratteristiche e il prezzo dei prodotti pagati 
dagli utenti.
 
 */
	
	public static void main(String[] args) {

		Cliente c= new Cliente("mario", "rossi", 65);
		ArrayList<Prodotto> p = new ArrayList<>();

		//aggiungiamo 2 prodotti non alimentari
		p.add(new ProdNonAlimentari("vetro", "Specchio", 10, c));
		p.add(new ProdNonAlimentari("plastica", "penna", 10, c));
		
		//aggiungiamo 2 prodotti Alimentari
		LocalDate dLatte= LocalDate.of(2024, 11,13);
		p.add(new ProdottiAlimentari(dLatte, "Latte", 10, c));
		
		LocalDate dCarne= LocalDate.of(2024, 11, 13);
		p.add(new ProdottiAlimentari(dCarne, "Manzo", 10, c));
		
		System.out.println(c);//--> Stampo il cliente
		
		for (Prodotto prodotti : p) {
			prodotti.applicaSconto();//-->polimorfismo
			System.out.println(prodotti);//Stampo le informaziomi di tutti i prodotti 
		}
		
		
		
		
		
	}

}
