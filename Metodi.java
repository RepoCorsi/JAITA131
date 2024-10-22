package metodi;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodi {

	static int x=0;//static mantiene il valore della variabile
	static String s="*";
	
	public static void main(String[] args) {
		
		//qui sto chiamando il metodo
		//quando chiamo il metodo vene eseguito quello che c'è nelle {}
		stampa();
		stampa();
								  //parametri attuali
		stampaConParametriIngresso("ciao","a tutti");
		stampaConParametriIngresso("xxx","yy");
		stampaConParametriIngresso("aa","bb");

		//il metodo mi restituisce una stringa che la metto dentro la var. uscitaMetodo
		String uscitaMetodo=stampaConParametriUscita("xx", "yy");
		System.out.println(uscitaMetodo);
	
		System.out.println(stampaConParametriUscita("xx", "yy"));
		
		int risultato=somma(2,2);
		System.out.println("il metodo mi ha restituito questo: "+risultato);
		
		risultato=somma(10,4);
		System.out.println("Adesso il metodo mi ha restituito questo: "+risultato);
		
		//passaggio di valori al metodo tramite scanner
		Scanner s= new Scanner(System.in);
//		System.out.println("inserisci il primo numero:");
//		int num1=s.nextInt();
//		System.out.println("inserisci il secondo numero:");
//		int num2=s.nextInt();
//		
//		risultato=somma(num1,num2);
//		System.out.println("hai passato al metodo "+num1+" e "+num2+
//						   " il metodo ha restituito "+risultato);	
		
		boolean divisibileOno=isDivisibile(10, 3);
		System.out.println("è divisibile? "+divisibileOno);
		
		//chiamo il metodo con l'operatore ternario
		System.out.println((isDivisibile(10, 2))?"si":"no");

		//chiamo il metodo che stampa l'array paperopoli
		String[] paperopoli= {"qui","quo","qua"};
		leggiArray(paperopoli);
		
		//chiamo il metodo craArray, passo 3 stringhe e ricevo in output un array
		String[] paperi=creaArray("paperino","gastone","nonna papera");
		
		//--leggiamo l'array che ci ha restituito il metodo creaArray
		leggiArray(paperi);//<-- lo leggiamo col metodo che ci siamo fatti noi
//		for (String p : paperi) {
//			System.out.println(p);
//		}
				
		int ris=somma(1,2,3);
		System.out.println("la versione con 3 parametri mi restituisce"+ris);

		ris=somma(1,2,3,4);
		System.out.println("la versione con 4 parametri mi restituisce"+ris);
		
		double risult=somma(2.5,3.4);
		System.out.println("la versione con 2 double mi restituisce "+risult);
		
		ris=somma("1","2");
		System.out.println("la versione con 2 stringh mi restituisce "+ris);
		
		String pap=somma("qui","quo","qua");
		System.out.println("i nipoti di paperino sono "+pap);
		
		ris=varArgs(1,2,3,4);
		System.out.println("la somma è "+ris);

		int ris2=varArgs(1,2);
		System.out.println("la somma è "+ris2);
		
		String unite=varArgs("ciao","a","tutti");
		System.out.println("la concatenazione mi produce "+unite);
		
		ArrayList elenco = new ArrayList<>();
		elenco.add("aaa");
		elenco.add(true);
		elenco.add(157);
		elenco.add(3.14);
		
		stampa(elenco);
		
		statico();//1
		statico();//2
		statico();//3
		
		aggiungiAsterischi();
		aggiungiAsterischi();
		aggiungiAsterischi();
		aggiungiAsterischi();
		
		//--chiamata del metodo ricorsivo
		eseguiTotVolte(5); 

		//chiamo il metodo fattoriale ricorsivo
        long risFatt=fattoriale(9);
        System.out.println(risFatt);
		
	}//fine main

	//------------- INIZIO METODI ----------------------------------
	//Cose obbligatorie:
	//il nome con le parentesi
	//il tipo di dato che il metodo deve ritornare. Se niente si mette void
	//static se il metodo viene chiamato da un altro metodo statico
	public static void stampa() {
		//corpo del metodo
		System.out.println("ciao");
	}
	
	//metodo con parametri di ingresso:
	//nome+i parametri di ingresso si chiama FIRMA DEL METODO
	//non ci possono essere 2 metodi con la stessa firma in una classe
												  //parametri formali
	public static void stampaConParametriIngresso(String par1, String par2) {
		
		System.out.println("ho ricevuto i seguenti parametri: "+par1+" e "+par2);
	}
	
	//------------------------- metodi con valore di ritorno -----------------------------
	
	public static String stampaConParametriUscita(String a, String b) {
		
		String frase="il metodo butta fuori questa stringa con:"+a+" e "+b;
		return frase; //<-- return fa ritornare un valore al metodo
	}
	
	
	//metodo che prende in input 2 numeri e restituisce true se il resto è 0, altrimenti false
	public static boolean isDivisibile(int num1, int num2) {
		return(num1%num2==0);
	}

	//metodo che prende in input un array e stampa i valori
	public static void leggiArray(String[] arr) {
		System.out.println("dentro il metodo stampo i valori dell'array:");
		for (String elemento : arr) {
			System.out.println(elemento);
		}
	}
	
//metodo che restituisce in output un array di Stringhe a partire da 3 stringhe in input:
	public static String[] creaArray(String uno,String due,String tre) {
		String[] arr= {uno,due,tre};
		return arr;
	}
	
	//----------------------OVERLOAD-------------------------------------------
	//metodi che hanno lo stesso nome ma parametri diversi
	

	public static int somma(int a, int b, int c) {
		System.out.println("overload metodo somma con 3 parametri");
		return a+b+c;
	}
	
	
	//metodo che prende in input 2 numeri interi e restituisce la somma
	  /* firma del metodo*/
	public static int somma(int a, int b) {	
		return a+b;
	}	
	
	
	public static int somma(int a, int b, int c,int d) {
		System.out.println("overload metodo somma con 4 parametri");
		return a+b+c+d;
	}
	
	public static double somma(double a, double b) {
		System.out.println("overload metodo somma con 2 double");
		return a+b;
	}
	
	public static int somma(String a, String b) {//"2"
		int num1=Integer.parseInt(a);
		int num2=Integer.parseInt(b);
		return num1+num2;
	}
	
	
	public static String somma(String a, String b,String c) {	
		System.out.println("overload che concatena 3 stringhe");
		return a+" "+b+" "+c;
	}	
	
	//---------------------------VARARGS--------------------------
	public static int varArgs(int...x) {// ... rappresentano qualunque quantità di argomenti
		
		int tot=0;
		//tratto la variabile di ingresso come se fosse un array
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(i);
//			tot+=x[i];
//		}
		for (int numero : x) {
			System.out.println(numero);
			tot+=numero;
		}
		return tot;
	}
	
	//---------------
	
	public static String varArgs(String...x) {// ... rappresentano qualunque quantità di argomenti
		
		String s="";
		for (String parola : x) {
			System.out.println(parola);
			s+=parola+" ";
		}
		return s;
	}	
	//---------------------
	
	public static void stampa(ArrayList parole) {
		
		for (Object elemento : parole) {
			System.out.println(elemento);
		}		
	}

	//-----------------------------------------------
	
	public static void statico() {
		//int x=0;
		System.out.println(++x);
	}
	
	public static void aggiungiAsterischi() {
		System.out.println(s);
		s+="*";//concateno gli asterischi
	}
	
	//-------------------------------------------------------
	//funzioni ricorsive--> direttamente o indirettamente chiama se stessa
//	public static void esegui() {
//		esegui();
//	}
	public static void eseguiTotVolte(int quanto) {
		if(quanto>0) {//caso di uscita
			System.out.println("sto chiamando me stesso "+quanto+" volte");
			quanto--;
			eseguiTotVolte(quanto);
		}
	}
	
	
	public static long fattoriale(long x) {
		if(x==0) {//il fattoriale di 0 è 1 quindi usciamo
			return 1; //caso di uscita
		}else {
			return x*fattoriale(x-1); //9*8*7*6*5*4*3*2*1
		}
	}
}//fine classe
