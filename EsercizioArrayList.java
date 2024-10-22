package esercizioArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioArrayList {

	public static void main(String[] args) {

		/**
Presentare all'utente un menù di 5 voci con cui l'utente possa fare le seguenti operazioni:

Inserire un nome dentro l'ArrayList
Cancellare un nome dall'ArrayList
Cercare un nome dentro l'ArrayList(dire se c'è oppure no)
Visualizzare l'elenco di tutti i nomi all'interno dell'ArrayList
Uscire dal programma.

Il programma deve presentare il menù finché l'utente non sceglie di uscire.

*/	
		ArrayList<String> nomi= new ArrayList<>();
		Scanner s= new Scanner(System.in);
		while(true) {
			
			System.out.println("Selezona una opzione:");
			System.out.println("1 per inserire un nome");
			System.out.println("2 per cancellare un nome");
			System.out.println("3 per cercare un nome e sapere se esiste nell'elenco");
			System.out.println("4 per visualizzare tutti i nomi");
			System.out.println("5 per uscire");
			
			int scelta=s.nextInt();
			s.nextLine();//per l'invio
			String nome="";
			
			switch(scelta) {
				case 1:
					//inserisci il nome
					System.out.println("inserisci un nome");
					nome=s.nextLine().toUpperCase();
					nomi.add(nome);
					System.out.println("nome inserito");
					break;
				case 2:
					//cancella il nome
					System.out.println("che nome vuoi cancellare?");
					nome= s.nextLine().toUpperCase();
					if(nomi.contains(nome)) {//ritorna true se il valore è contenuto nell'AL
						nomi.remove(nome);
						System.out.println("nome eliminato");
					}else {
						System.out.println("il nome che vuoi cancellare non è nell'elenco");
					}					
					break;
				case 3:
					//cerca il nome
					System.out.println("che nome vuoi cercare?");
					nome= s.nextLine().toUpperCase();
					if (nomi.contains(nome)) {
						System.out.println("il nome è presente nell'elenco");
					}else {
						System.out.println("il nome non è presente nell'elenco");
					}
					break;
				case 4:
					//visualizza tutti i nomi
					if (nomi.isEmpty()) {
						System.out.println("la lista è vuota");
					}else {
						System.out.println("ecco tutti i nomi dell'elenco:");
						for (String persona : nomi) {
							System.out.println(persona);
						}
					}
					break;
				case 5:
					//esci
					System.out.println("grazie per aver usato il nostro programma");
					return; //esce da tutto
				default:
					//Scelta non valida
					System.out.println("Scelta non valida, Riprova");
					
			}//Fine switch			
		}//fine while
		
		
		
		
		
		
		
		
	}

}
