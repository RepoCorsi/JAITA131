package gestioneDelFlusso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GestioneDelFlusso {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
//		System.out.println("inserisci la tua eta");
//		int eta=s.nextInt();
//
//		//> < >= <= == != diverso
//		
//		//condizione da controllare booleana(true/false)
//		if (eta>=18) { //parte vera
//			//se è vero il controllo
//			System.out.println("sei maggiorenne puoi entrare");			
//		}else {//parte falsa
//			//entra qui solo se il controllo è falso 
//			System.out.println("non sei maggiorenne non puoi entrare");
//		}
		//---------------------------------------------------
		int num=2;
		//condizione
		if (num>5) {
			//se è vero che è >5
			System.out.println("il numero è maggiore di 5");
		}else if(num==5) {
			System.out.println("il numero è uguale a 5");
		}else {
			System.out.println("il numero è < di 5");
		}
		
		//------------------------------------------------------
//		System.out.println("inserisci la temperatura");
//		int temperatura=s.nextInt();
//		
//		if (temperatura>30) {
//			System.out.println("accendi condizionatore");
//		}else if(temperatura<17) {
//			System.out.println("accendi il riscaldamento");
//		}else { //l'ultima cosa che si mette
//			System.out.println("si sta bene");
//		}
		
		//----------------------------------------------
//		System.out.println("inserisci il primo numero");
//		int num1=s.nextInt();
//		System.out.println("inserisci il secondo numero");
//		int num2=s.nextInt();
//		
//		if (num2!=0) {
//			//faccio la divisione solo se il numero è != da 0
//			System.out.println("la divisione è "+(num1/num2));
//			System.out.println("il resto è "+(num1%num2)); //% operatore modulo
//		}else {
//			System.out.println("Errore: Non puoi dividere per zero");
//		}
//		
		int num3=10;
		if (num3%2==0) { //% ritorna il resto della divisione 
			System.out.println("il numero è pari");
		}else {
			System.out.println("il numero è dispari");
		}
		
		//------------------------------------------------------------
		int orario=LocalTime.now().getHour();//qui ricavo l'ora
		
		String saluto;
		
		//il primo ramo vero che trova esce
		if (orario<12) {
			saluto="Buon giorno";
		}else if(orario<18) {
			saluto="buon pomeriggio";
		}else if(orario<22) {
			saluto="Buona sera";
		}else {
			saluto="Buona notte";
		}
		System.out.println(saluto);
		//-----------------------------------------------------------------
		
//		System.out.println("Inserisci una parola");
//		String parola=s.nextLine();
//		
//		int lunghezza=parola.length();// quante lettere ha la parola
//		if ((lunghezza%2)==0) {
//			System.out.println("la parola ha un numero pari di lettere");
//		}else {
//			System.out.println("la parola ha un numero dispari di lettere");
//		}
		
		//Scanner x= new Scanner(System.in);
		boolean sole = false;
		int temperatura=25;
		//esco solo se c'è una temperatura >20 e c'è il sole
		//operatori logici && AND - || OR
		if (sole && temperatura>20) { //&& AND devono essere vere entrambe le condizioni
			System.out.println("esco");
		}else { //non esco
			System.out.println("Sto a casa");
		}

		//|| OR basta che ce ne sia solo 1 vera e tutto diventa vero
		if (sole || temperatura>20) {
			System.out.println("esco");
		}else {
			System.out.println("sto a casa");
		}
		//-----------------------------------------------------------------------
		int voto1=6;
		int voto2=5;
		int voto3=6;
		
		//la && AND ha la priorità sulla || OR
		//se voglio cambiare la priorità metto le parentesi ()
		
		if (voto1>=6 && (voto2>=6 || voto3>=6)) {
			System.out.println("promosso");
		}else {
			System.out.println("bocciato");
		}
		
		int voto4=8;
		if (voto4>=6) {
			System.out.println("promosso");
		}else {
			System.out.println("bocciato");
		}
		
		//operatore ternario
		//1° condizione
		//2° cosa fare se la condizione è vera
		//3° cosa fare per falso
						   //if(voto4>=6) {}     else
		System.out.println((voto4>=6)?"promosso":"bocciato");
	
		int altezza=120;
		String tipologia=(altezza>180)?"alto":"normale";
		System.out.println(tipologia);
		
		if (altezza>180) {
			System.out.println("alto");
		}else {
			System.out.println("normale");
		}

		//------------------------------------------------------
		
		int a=10;
		int b=10;
		
		int max=(a>b)?a:b;
		System.out.println("il maggiore è "+max);
		
		if (a>b) {
			max=a;
		}else {
			max=b;
		}
		
		System.out.println("il maggiore è "+max);
		
		String maxOuguale=(a>b)?"il più grande è "+a://ramo vero dell'if
						  (a==b)?"i numeri sono uguali"://else if
							  	 "il più grande è "+b;//else
		
		System.out.println(maxOuguale);
		
		if (a>b) {
			System.out.println("il più grande è "+a);
		}else if(a==b) {
			System.out.println("i numeri sono uguali");
		}else {
			System.out.println("il più grande è "+b);
		}
		
		//--------------------------------------------------------------------
		//si usa solo per i tipi di dato 
		//int long byte short char String.
		//NON SI USA PER BOOLEAN, DOUBLE, FLOAT
		double i=0;
		switch((int)i) {
			//if
			case 0: //cosa fare nel caso i vale 0
				System.out.println("i è uguale a 0");
				break;
			//else if	
			case 1: //cosa fare nel caso i vale 1
				System.out.println("i vale 1");
				break;
			//else if	
			case 2:
				System.out.println("i vale 2");
				break;
			//else	
			default: //in tutti gli altri casi
				System.out.println("i è diverso da 0,1,2");
				break;//non obbligatorio
		}
		
		if (i==0) {
			System.out.println("i è uguale a 0");
		}else if (i==1) {
			System.out.println("i è uguale a 1");
		}else if (i==2) {
			System.out.println("i è uguale a 2");
		}else {
			System.out.println("i è diverso da 0,1,2");
		}
		
		//il numero del giorno della settimana. parte da 1 che è lunedì
		int giorno=LocalDate.now().getDayOfWeek().getValue();//1//7
		System.out.println(giorno);
		
		switch(giorno) {
			case 1:
				System.out.println("oggi è lunedì");
				break;
			case 2:
				System.out.println("oggi è martedì");
				break;
			case 3:
				System.out.println("oggi è mercoledì");
				break;
			case 4:
				System.out.println("oggi è giovedì");
				break;
			case 5:
				System.out.println("oggi è venerdì");
				break;
			case 6:
				System.out.println("oggi è sabato");
				break;
			case 7:
				System.out.println("oggi è domanica");
				break;
			default:
				System.out.println("errore nella scelta del giorno");
		}
		//---------------------------------------------------
		//switch sequenziali
		String lettera ="x";
		switch(lettera) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println(lettera+" è una vocale");
				break;
			default:
				System.out.println(lettera+" è una consonante");				
		}
		
		//--------------------------------------------------
		// -> lambda expression
		switch(lettera) {
			case "a","e","i","o","u"->System.out.println(lettera+" è una vocale");
			default->System.out.println(lettera+" è una consonante");
		}

	//qui stiamo assegnando un valore alla variabile messaggio
	String messaggio=switch(lettera) {
							case "a","e","i","o","u"->lettera+" è una vocale";
							default->lettera+" è una consonante";//<--default obbligatorio
					  };// <-- il ; è obbligatorio
	
	System.out.println(messaggio);

	//---------------------------------------------------
	//chiedere all'utente 2 numeri a, b
	//stampare 1 se a è maggiore di b
	//stampare 2 se a è uguale a b
	//altrimenti stampare 3
	
	Scanner x= new Scanner(System.in);
	System.out.println("inserisci il primo numero");
	int a1=x.nextInt();
	System.out.println("inserisci il secondo numero");
	int b1=x.nextInt();
	
	int c;
	
	if (a1>b1) { 
		c=1;
	}else if(a1==b1) {
		c=2;
	}else {
		c=3;
	}
	
	System.out.println(c);
//------------------------------------
	
 /***************************** ESERCIZI:*****************************/
    
	/* ********************* 1) BMI (BODY MASS INDEX)************************************
    * Si scriva un programma che chiede all'utente peso e altezza e calcola il BMI 
    * e indichi se la persona è nella norma, sovrappeso o sottopeso.
    * BMI = peso / (Altezza * Altezza) (altezza in metri)
    * Un BMI da 20 a 25 è considerato “nella norma”.
    */
	
	//-------------------------------------------------------------------------
	//********************* 2) Morra cinese (Carta forbice sasso)***************
	/*
	 * Realizzare un programma che permetta di giocare alla morra cinese contro il computer
	 * 
	 */
		
	 Random r= new Random();
	 int numeroPc=r.nextInt(0,3); //da 0 a 2  
	 String computer;
	 
	 if (numeroPc==0) {
		computer="f";
	}else if (numeroPc==1) {
		computer="s";
	}else {
		computer="c";
	}

	 System.out.println("inserisci f,s,c");
	 
	 String giocatore=s.nextLine().toLowerCase();
	 
	 System.out.println("tu: "+giocatore+" pc: "+computer);
	
	 boolean vittoria=giocatore.equals("s")&& computer.equals("f")
			 		||giocatore.equals("f")&& computer.equals("c")
			 		||giocatore.equals("c")&& computer.equals("s");
	 
	 if (computer.equals(giocatore)) {
		System.out.println("parità");
	}else if(vittoria) {
		System.out.println("hai vinto");
	}else {
		System.out.println("hai perso");
	}
	
	//-----------------------------------------------------------------------------
	
	//********************* 3) Calcolatrice ***************************
	/* 
	 * Realizzare con lo SWITCH un programma che 
	 * chiede all'utente 2 numeri e l'operazione da eseguire sui 2 numeri(+ - * /)
	 * Gestire nel caso della divisione che il divisore sia DIVERSO da 0
	 * Esempio: inserisci il primo numero: 3
	 * 			inserisci il secondo numero: 4
	 * 			inserisci l'operazione: +
	 * output programma: 3 + 4 = 7 
	 * 
	 */
	System.out.println("primo numero");
	int primo=s.nextInt();
	System.out.println("secondo numero");
	int secondo=s.nextInt();
	
	s.nextLine();//per prendere l'invio
	
	System.out.println("che operazione vuoi fare?");
	String operazione=s.nextLine().toLowerCase();
	
	switch(operazione) {		
		case "+": //if
			System.out.println(primo+" + "+secondo+" = "+(primo+secondo));
			break;
		case "-": //else if
			System.out.println(primo+" - "+secondo+" = "+(primo-secondo));
			break;
		case "*"://else if
			System.out.println(primo+" * "+secondo+" = "+(primo*secondo));
			break;
		case "/"://else if
			if (secondo==0) {
				System.out.println("non puoi dividere per 0");
			}else {
				System.out.println(primo+" / "+secondo+" = "+(primo/secondo));
			}	
			break;
		default://else
			System.out.println("operazione non valida");
	}
	
	
	
	
	
		/*int xy=10;
		if (xy<10) { //1
			System.out.println("minore di 10");
		}else if(xy==10) {//2
			System.out.println("uguale a 10");
		}else if(xy>10) {//3
			System.out.println("maggiore di 10");
		}else {//4
			System.out.println("negli altri casi");
		}
	//---------------------------------------------------
		switch(xy) {
			case <10: //1 if
				System.out.println("minore di 10");
				break;
			case ==10://2 else if
				System.out.println("uguale a 10");
				break;
			case >10://3 else if
				System.out.println("maggiore di 10");
				break;
			default: //else
				System.out.println("negli altri casi");
			}			
		}
		*/
	
	
	
	//-----------------------------------------------------------------------
	
	//********************* 4) Giorni mese ***************************
	/*Realizzare con lo SWITCH un programma che chiede il nome del mese 
	 * e restituisce il numero dei giorni.
     *       Esempio: inserisci il mese: Marzo
     *       output:  Marzo ha 31 giorni.
     *   	 non considerare gli anni bisestili
	 */
		
		
		
		
		
		
		
		
	}
}
