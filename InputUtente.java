package inputUtente;

import java.util.Date;
import java.util.Scanner;

public class InputUtente {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci il nome");
		
		String nome=input.nextLine();
		
		System.out.println("hai scritto "+nome);
		
		System.out.println("quanti anni hai?");
		
		int eta=input.nextInt();// 49 invio
		input.nextLine();// raccogliere l'invio
		
		System.out.println("la tua età è "+eta);
		
		System.out.println("colore preferito");
		
		String colore=input.nextLine();
		
		System.out.println("il colore è "+colore);
		
		//---------------------------------------------

		
		
		
		
		
		
		
	}

}
