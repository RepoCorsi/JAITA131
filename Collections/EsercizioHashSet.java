package esercizioHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EsercizioHashSet {

	public static void main(String[] args) {
/*Gestione di un elenco di partecipanti a un evento.

Creare un programma che consenta di aggiungere, rimuovere, visualizzare e 
verificare se un determinato partecipante è presente in un elenco utilizzando un HashSet. 

    Implementa il seguente menu:
        Opzione 1: Aggiungi partecipante
            Richiedi all'utente di inserire il nome del partecipante da aggiungere all'evento.
       Opzione 2: Rimuovi partecipante
            Richiedi all'utente di inserire il nome del partecipante da rimuovere dall'evento.
       Opzione 3: Visualizza partecipanti
            Stampa tutti i nomi dei partecipanti presenti nell'HashSet.
        Opzione 4: Verifica partecipante
            Richiedi all'utente di inserire il nome del partecipante da verificare se è presente nell'Hashset
        Opzione 5: Esci
            Termina il programma.

  Implementa un ciclo che richieda all'utente di selezionare un'opzione dal menu finché non sceglie Esci.

 */
	HashSet<String> partecipanti= new HashSet<>();
	Scanner s= new Scanner(System.in);
	
	int scelta;
	
	while(true) {
		System.out.println("Seleziona una opzione:\n1 aggungi\n2 rimuovi\n3visualizza\n4verifica\n5esci");	
		scelta=s.nextInt();
		s.nextLine();//pulire l'invio
		String nome="";
		switch(scelta) {
			case 1:
				//aggiungi
				System.out.println("inserisci un partecipante");
				nome=s.nextLine().toUpperCase();
				if (partecipanti.add(nome)) {
					System.out.println("Aggiunto con successo");
				}else {
					System.out.println("La persona che vuoi inserire esiste già");
				}				
				break;
			case 2:
				System.out.println("inserisci il partecipante da rimuovere");
				nome=s.nextLine().toUpperCase();
				if (partecipanti.remove(nome)) {
					System.out.println("persona rimossa con successo");
				}else {
					System.out.println("la persona che vuoi rimuovere non è presente nell'elenco");
				}
				//rimuovi
				break;
			case 3:
				//visualizza
				if (partecipanti.isEmpty()) {
					System.out.println("non c'è nessun partecipante all'evento");
				}else {
					System.out.println("elenco partecipanti");
					for (String persona : partecipanti) {
						System.out.println(persona+" ");
					}
				}
				break;
			case 4:
				//verifica
				System.out.println("inserisci il nome da verificare se esiste");
				nome=s.nextLine().toUpperCase();
				if (partecipanti.contains(nome)) {
					System.out.println("la persona è presente nell'elenco");
				}else {
					System.out.println("non è presente");
				}
				break;
			case 5:
				//esci
				System.out.println("ciao e grazie");
				return;				
		}
		
		
		
		
		
		
		
	}
	
		
	}

}
