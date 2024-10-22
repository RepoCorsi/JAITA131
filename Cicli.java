package cicli;

import java.util.Random;
import java.util.Scanner;

public class Cicli {

	public static void main(String[] args) {

	//inizializzazione; int i=0; la fa solo 1 volta
	//condizione BOOLEANA di permanenza nel ciclo i<10; fino a quando deve ciclare	
	//incremento i++;
//		for(int i=0;i<10;i++) {				
//			System.out.println(i+" ciao");
//		}		
//		//--------------------------------------
		//al contrario
//		for (int i = 10; i >0; i--) {
//			System.out.println(i+" ciao");
//		}
		//----------------------------------------------

		//0-->10 solo i pari		
//		for (int i = 0; i<=10; i+=2) {
//			System.out.println(i);
//		}
		//--------------------------------------------------
		//caratteri stampabili della tabella ascii
//		for (int i = 32; i<127; i++) {
//			System.out.println(i+": "+(char)i);
//		}
		
		//---------------------------------------------
		//for destrutturato
//		int contatore=0;//inizializzazione
//		
//		for(;contatore<10;) { //condizione
//			System.out.println(contatore);
//			
//			contatore++;//incremento
//		}
//		
		//------------------------------------------------------		
//		for(int i=0,j=10; i<10; i++,j--) {
//			System.out.println("i= "+i+" j= "+j);
//		}
//		//--------------------------------------------------
//	
//		String a="ciao a tutti";
//		for (int i = 0; i < a.length(); i++) {
//			System.out.println(a.charAt(i));
//		}
		//-----------------------------------
		
//		int numeroSpazi=0;
//		for (int i = 0; i <  a.length(); i++) {
//			if (a.charAt(i)==' ') {//charAt ritorna un carattere, NO Stringa
//				numeroSpazi++;
//			}
//		}
//		System.out.println("spazi= "+numeroSpazi);
				
		Random r= new Random();

		//boolean trovato=false;//stato iniziale
		
//		int casuale= r.nextInt(1,21);//1 a 20
//		System.out.println("il numero casuale è "+casuale);
//		
//		for (int i = 1; i <= 10 && trovato==false; i++) {
//			if (casuale==i) {
//				trovato=true;
//				System.out.println("l'ho trovato in posizione "+i);
//				//break;
//			}
//		}
//	
//		if (!trovato) {
//			System.out.println("non ho trovato il numero");
//		}
		
		//---------------------------------------------------------------------
		
//		for (int i = 1; i <= 10; i++) {//per ogni valore di i....
//			
//			for (int j = 1; j <= 10; j++) {//lo moltiplico per il valore di j
//				
//				System.out.print("\t"+i*j);
//			}
//			System.out.println("");
//		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("ciclo esterno");
			for (int j = 0; j < 3; j++) {
				System.out.println("\t ciclo interno");
			}
		}
		//--------------------------------------------------------------------
		
		//for destrutturato
//		int contatore=0;//inizializzazione
//		
//		for(;contatore<10;) { //condizione
//			System.out.println(contatore);
//			
//			contatore++;//incremento
//		}
		
//		int contatore=10;//inizializzazione
//		while(contatore<10) {//condizione
//			System.out.println(contatore);
//			contatore++;//incremento
//		}
//		
//		
//		do {
//			System.out.println(contatore);
//			contatore++;//incremento	
//		}while(contatore<10);
		
		Scanner s= new Scanner(System.in);
		
//		System.out.println("inserisci un valore metti 0 per uscire");
//		int valore= s.nextInt();
//		while(valore!=0) {
//			System.out.println("inserisci un valore metti 0 per uscire");
//			valore= s.nextInt();
//		}
//		
//		do {
//			System.out.println("inserisci un valore metti 0 per uscire");
//			valore= s.nextInt();
//		}while(valore!=0);
//		
//		
		//-------------------------------------------------
//		char lettera ='a';
//		while(lettera<='z') {
//			System.out.println(lettera);
//			lettera++;
//		}
		
		//---------------------------------------------------		
//		int vocali=0;
//		int consonanti=0;
//		
//		for (char lettera='a'; lettera<='z'; lettera++) {
//			
//			switch(lettera) {
//				case 'a','e','i','o','u':
//					System.out.println(lettera+ " è una vocale");
//					vocali++;
//					break;
//				default:
//					System.out.println(lettera+ " è una consonante");
//					consonanti++;
//					//break;				
//			}
//		}
//		
//		System.out.println("vocali "+vocali+ "consonanti "+consonanti);
		//-----------------------------------------------------------------
		
//		for (int i = 0; i < 10; i++) {
//			
//			if (i==5) {
//				continue;// salta un giro
//			}
//			
//			if (i==7) {
//				break;
//			}
//			
//			System.out.println(i);
//		}
//		
		//----------------------------------------
		//ciclo infinito col while
//		while(true) {
//			System.out.println("inserisci un numero, 7 per uscire");
//			int numero=s.nextInt();
//			System.out.println("hai inserito "+numero);
//			if (numero==7) {
//				System.out.println("ciao");
//				break;
//			}
//		}
//		
//		//ciclo infinito con il for
//		int val=0;
//		for(;;) {
//			System.out.println(val);
//			if (val==10) {
//				break;
//			}
//			val++;
//		}
				
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		int i=0;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//		}
//		int i=0;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i < 10);
		
		
		
	}
}
