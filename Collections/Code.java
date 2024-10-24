package code;

import java.util.ArrayDeque;

public class Code {

	public static void main(String[] args) {

		//il primo che entra è il primo che esce 
		//fifo -> first in  first out
		ArrayDeque<String> q= new ArrayDeque<>();
		q.add("cane");
		q.add("gatto");
		q.add("pesce");
		
		System.out.println(q.size());//dimensione
		System.out.println(q);//stampa la coda
		//peek restituisce il primo elemento della coda
		System.out.println("primo da servire= "+q.peek()); //il primo in coda
		
		for (String coda : q) {
			System.out.println(coda);
		}
		
		//per togliere un elemento dalla coda c'è poll
		q.poll();//elimina l'elemento in testa alla coda
		
		System.out.println(q);
		
		System.out.println("la coda è vuota? "+q.isEmpty());
		//getFirst getLast
		//removeFirst
		//removeLast
		
	}
}
