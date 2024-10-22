package provaSet;

import java.util.HashSet;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {

		//SET 
		//è una lista di valori che NON ammette duplicati
		//non è ordinata-> non segue NECESSARIAMENTE l'ordine in cui ho messo i valori
		//l'ordine all'interno della lista dipende da una funzione di HASH
		//Non esiste il metodo get per trovare la posizione di un elemento
		//HashSet -> non segue l'ordine di inserimento
		//TreeSet -> ordina a prescindere dall'ordine in cui io inserisco i valori
		
		HashSet<String> hash = new HashSet<>();
		hash.add("c");
		hash.add("a");
		hash.add("b");
		hash.add("b");
		hash.add("a");
		
		System.out.println(hash);
		System.out.println(hash.add("d"));//true se non c'è ancora l'elemento
		System.out.println(hash.add("d"));//false se c'è già l'elemento
		
		for (String valore : hash) {
			System.out.println(valore);
		}
		//---------------------------------------------------------
		//di default è ordinato
		//esclude i duplicati
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(2);
		ts.add(9);
		ts.add(5);
		
		System.out.println(ts);
		
		
	}
}
