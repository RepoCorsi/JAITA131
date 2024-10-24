package es2ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Es2ArrayList {

	public static void main(String[] args) {
		
		//programma che chiede all'utente di inserire dei numeri e li mette in un ArrayList
		//fino a quando l'utente non mette -1
		//mostra tutti i valori e calcola la somma
		
		ArrayList<Integer> numeri= new ArrayList<>();
		Scanner s= new Scanner(System.in);
		int numero=0;
		int somma=0;
		
//		do {			
//			System.out.println("inserisci un numero, -1 per terminare");
//			numero=s.nextInt();//-1
//			if (numero!=-1) {// per non includere il -1 nell'arrayList
//				numeri.add(numero);	
//				somma+=numero;				
//			}							
//		}while(numero!=-1);
		
		while(true) {
			System.out.println("inserisci un numero, -1 per terminare");
			numero=s.nextInt();//-1
			if (numero==-1) {
				break;
			}else {
				numeri.add(numero);	
				somma+=numero;
			}
		}
		
				
		System.out.println(numeri);//stampa l'ArrayList numeri 
		System.out.println("la somma è "+somma);
		
		
		
		
		
	}

}
