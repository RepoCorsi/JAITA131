package esercizioEccezioni;

import java.util.Scanner;

public class TestEsercizio {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Inserisci la lunghezza dell'array");
		int lunghezza=s.nextInt();
		s.nextLine();
		
		int[] array=new int[lunghezza];
		int indice=0;//indice dell'array
		
		//System.out.println("inserisci i valori dell'array. Scrivi fine per uscire");
		
		while(true) {
			System.out.println("inserisci un valore o fine");
			String input=s.nextLine();//per i numeri e per fine
			
			if (input.equalsIgnoreCase("fine")) {
				break;//esco dal ciclo se l'utente scrive fine
			}
			
			try {
				int valore=Integer.parseInt(input);// "6"->6
				array[indice]=valore;//assegnamo il valore passato dall'utente all'array
				indice++;//incrementiamo l'indice
			} catch (IndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("Hai inserito più valori di quelli consentiti");
				array=new int[lunghezza]; //resettiamo l'array
				indice=0;//resettiamo l'indice
				System.out.println("Array resettato, inserisci di nuovo i valori");
			}			
		}//fine while
		
		System.out.println("I valori finali dell'array sono:");
		for (int i = 0; i < indice; i++) {
			System.out.println(array[i]);
		}
		
	}

}
