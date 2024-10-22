package array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array_list {

	public static void main(String[] args) {

		//Collection
		ArrayList lista=new ArrayList();
		//aggiungo elementi nell'ArryList
		lista.add(1);
		lista.add(2);
		lista.add(3);
		//int[] x= new int[3];
		
		//no length ma size()
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i)); //no [i] ma get(i)
		}
			
		lista.add(4);
		
		for (Object elemento : lista) {
			System.out.println(elemento);
		}
		
		lista.add("ciao");
		lista.add(true);
		
		for (Object elemento : lista) {
			System.out.println(elemento);
		}
		
		/////////////////////////////////////////////////////
		//wrapper Class
		//int Integer
		//char Character	
		//boolean Boolean
		//double Double
		
		//un Arraylist parametrizzato a Character
		ArrayList<Character> lettere= new ArrayList<>();
		lettere.add('a');
		lettere.add('b');
		lettere.add('c');
		lettere.add('d');
		
		for (int i = 0; i < lettere.size(); i++) {
			System.out.println(lettere.get(i));
		}
		
		lettere.add(0,'e');//specifico che l'elemento è va aggointo alla posizione 0
		
		//stampa direttamente l'ArrayList come se fosse Arrays.toString()
		System.out.println(lettere);
		
		for (Character lettera : lettere) {
			System.out.println(lettera);
		}
		
		//lambda expression
		lettere.forEach(lettera->System.out.println(lettera));
		
		//method reference
		lettere.forEach(System.out::println);// :: operatore di risoluzione dello scopo
		
		//----------------------------------------------------
		
		ArrayList<String> prodotti= new ArrayList<>();
		prodotti.add("scarpe");
		prodotti.add("maglie");
		prodotti.add("camicie");
		
		int lunghezza=prodotti.size();
		String elemento0= prodotti.get(0);
		
		prodotti.remove(0);
		//prodotti.remove("scarpe");
		prodotti.add(0,"giacca");
		
		prodotti.forEach(prodotto->System.out.println(prodotto));
		
		//------------------------------------------------------------------
		
		ArrayList<String> classe= new ArrayList<>();
		classe.add("mario");
		classe.add("luigi");
		classe.add("luca");

		ArrayList<Integer> voti= new ArrayList<>();
		voti.add(25);
		voti.add(30);
		voti.add(27);
		
		for (int i = 0; i < voti.size(); i++) {
			System.out.println("studente "+classe.get(i)+" voto: "+voti.get(i));
		}
		
		//-------------------------------------------------------------------------
		Character[] c= {'x','y','z'};
		
		//Arrays.asList(c) trasforma l'array normale in ArrayList
		ArrayList<Character> lettere2= new ArrayList<>(Arrays.asList(c));
		
		lettere2.add('w');
		lettere2.forEach(car->System.out.println(car));
		
		for (Character car : lettere2) {
			System.out.println(car);
		}
		
		//trasformo l'ArrayList in array normale
		//qui ho creato un array di dimensioni uguali a quelle dell'ArrayList
		Character[] x= new Character[lettere2.size()];
		lettere2.toArray(x);//converte l'ArrayList in array normale
		
		System.out.println(Arrays.toString(x));
		
		//--------------------------------------------------------------
		
		//ordina una collezione di dati
		Collections.sort(lettere2);
		
		//cerca un elemento
		//per poter utilizzare binarySearch l'arrayList deve essere ordinato
		System.out.println(Collections.binarySearch(lettere2, 'y'));

		//ArrayList al contrario
//mette i valori al contario e non restituisce nessuna informazione aggiuntiva da stampare 
		Collections.reverse(lettere2);
		System.out.println(lettere2);

		
		//copia di un ArrayList
		ArrayList copia=new ArrayList<>(lettere2);
		
		System.out.println(copia);
		
		
		System.out.println(lettere2.get(2));
		
	}

}
