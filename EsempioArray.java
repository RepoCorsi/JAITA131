package esempioArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EsempioArray {

	public static void main(String[] args) {

		int x=10;
		//[]indicano che è un array
		// i valori devono essere tutti dello stesso tipo
		//è obbligatorio specificare subito quanti elementi contiene
		//gli array sono fissi, non possono aumentare e non possono diminuire
 		int[] unArray=new int[10];
		
 		//primo elemento dell'array
 		unArray[0]=1;
 		//secondo elemento dell'array
 		unArray[1]=2;
 		//terzo elemento dell'array
 		unArray[2]=3;
 		
 		//se non specificato gli altri elementi numerici valgono 0
 		//per array booleani il valore predefinito è false
 		//per array di Stringhe il valore predefinito è ""
 		
 		System.out.println(unArray[8]);//0 perchè non valorizzato
 		System.out.println(unArray[1]);//2
 		
 		String[] noteMusicali=new String[7];
 		
 		noteMusicali[0]="do";
 		noteMusicali[1]="re";
 		noteMusicali[2]="mi";
 		noteMusicali[3]="fa";
 		noteMusicali[4]="sol";
 		noteMusicali[5]="la";
 		noteMusicali[6]="si";
 		
 		int lunghezza=noteMusicali.length;//proprietà dell'array. SENZA ()
 		System.out.println(lunghezza);
 		 		
 int parola= "ciao".length();//metodo delle stringhe da non confondere con length dell'array
 		
 		//--sintassi alternativa:
 						   //0       1       2       3
 		String[] colori= {"bianco","nero","giallo","blu"};
 		
 		System.out.println(colori[2]);//giallo
 		//come visualizzo il penultimo elemento?
 		
 		int lungh=colori.length;
 		
 		System.out.println(colori[lungh-2]);
 		
 		//-------------------------------------------------
 				
 		System.out.println(colori);
 		for (int i = 0; i<colori.length ; i++) {
			System.out.println(i+" "+colori[i]);
		}
 		
 		//sintassi alternativa dove non uso l'indice
 		//parti dall'array colori, e ogni valore lo metti nella var. temporanea colore
 		//fai così per tutti gli elementi
 		for(String elemento:colori) {
 			System.out.println(elemento);
 		}
 		
 		//creo un array e lo riempo con valori da 0 a 4
 		int[] arr= new int[5];
 		for (int i = 0; i <arr.length; i++) {
			arr[i]=i;//0--4
		}
 		
		//stampo con indice
 		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
 		
 		//stampo col for senza indice
 		//forEach
 		for (int i : arr) {
			System.out.println(i);
		}
 		
 		////////////////////////////////////////////////////////////
 	String[] giorni= {"lunedi","martedì","mercoledì","giovedì","venerdì","sabato","domenica"};
	
 	for (int i = 0; i < giorni.length; i++) {
		if (giorni[i].equals("venerdì") || giorni[i].equals("sabato") ) {
			System.out.println(giorni[i]+" weekend");
		}else if(giorni[i].equals("domenica")) {
			System.out.println(giorni[i]+" relax");
		}else {
			System.out.println(giorni[i]+" lavoro");
		}
	}
 	
 	for (String nomeGiorno : giorni) {
		if (nomeGiorno.equals("venerdì") || nomeGiorno.equals("sabato") ) {
			System.out.println(nomeGiorno+" weekend");
		}else if(nomeGiorno.equals("domenica")) {
			System.out.println(nomeGiorno+" relax");
		}else {
			System.out.println(nomeGiorno+" lavoro");
		}		
	}
 	
 	//---------------------------------------------
 	String[] animali= {"cane","gatto","topo","criceto","pesce","tricheco"};
 	String piuLunga=animali[0];//lo decido io inizialmente, per avere un punto di partenza
 	
 	for (String animale : animali) {
		if (animale.length()>piuLunga.length()) {
			piuLunga=animale;
		}
	}
 	System.out.println("la più lunga è "+piuLunga);
 	
 	//-----------------------------------------------------------------
 	//le stringhe non sono array 
 	String parola2="ciao";
 	//char[] arrayCaratteri= {'c','i','a','o'};
 char[] arrayCaratteri=parola2.toCharArray();//trasforma la stringa in un array di caratteri
 	
 for (char lettera : arrayCaratteri) {
	System.out.println(lettera);
 }	
 
//	System.out.println(parola2[0]); --no

 	//ho creato un array a pertire da una stringa
 	String str="ciao a tutti";
 	String[] arrDiStringhe=str.split(" ");//array di 3 elementi: 1)ciao 2)a 3)tutti
 	for (String pezzi : arrDiStringhe) {
		System.out.println(pezzi);
	}
 	
 	//---------------------------------------------------------
 	int[] numeri= {4,2,1,3};
 	//la classe Arrays mi permette di visualizzare il contenuto dell'array
 	System.out.println(Arrays.toString(numeri));
 	
 	//----------------------------------------------------------
 	//array di numeri casuali
 	int[] arrCasuali=new int[10];
 	Random r= new Random();
 	
 	for (int i = 0; i < arrCasuali.length; i++) {
		arrCasuali[i]=r.nextInt(101);//popolo l'array con valori casuali da 0 a 100
	}
 	
 	for (int valore : arrCasuali) {
		System.out.println(valore);
	}
 	
	System.out.println(Arrays.toString(arrCasuali));
//--------------------------------------------------------
 	//
	Scanner s= new Scanner(System.in);
//	System.out.println("quanti numeri vuoi avere?");
//	int quanti=s.nextInt();//numero di elementi nell'array
//	
//	int[] valori=new int[quanti];//creo l'array di dimensione scelta dall'utente
//	for (int i = 0; i < valori.length; i++) {
//		System.out.println("inserisci l'elemento alla posizione "+i);
//		valori[i]=s.nextInt();//l'utente inserisce i valori nell'array in base all'indice		
//	}
//	//-----------------------------------------------------------
//	//qui abbiamo l'array con i gli elementi
//	
//	System.out.println("gli elementi dell'array sono:");
//	for (int elemento : valori) {
//		System.out.println(elemento);
//	}
//	//----------------------------------------------------------
//	//selection sort
//	//confrontare ogni valore col succesivo. se è più piccolo lo sposta, lo mette prima
//	
//	for (int i = 0; i < valori.length; i++) {//ogni valore
//		for (int j = 0; j < valori.length; j++) {//lo confronto con tutti gli altri
//			if (valori[i]<valori[j]) {//se è più piccolo
//				int temp=valori[i]; //li inverto
//				valori[i]=valori[j];
//				valori[j]=temp;
//			}
//		}
//	}
//	System.out.println("array ordinato");
//	//array ordinato
//	System.out.println(Arrays.toString(valori));
	
	//--------------------------------------------------------
	//Array multiDimenensionali
	int[][] arrMulti= {			
			{1,2,3}, //posizione 0
			{4,5,6}	 //posizione 1
	};
	
	System.out.println(arrMulti[0][1]);//stampa 2
	System.out.println(arrMulti[1][2]);//stampa 6
	
	//stesso esempio con altra sintassi
	int[][] multiplo=new int[2][3];
	multiplo[0][0]=1;
	multiplo[0][1]=2;
	multiplo[0][2]=3;
	multiplo[1][0]=4;
	multiplo[1][1]=5;
	multiplo[1][2]=6;
	
	//stampo l'array multiplo
	for(int[] righe :multiplo) {
		for(int valore:righe) {
			System.out.print(valore);
		}
		System.out.println("");//vado a capo dopo ogni riga
	}
	
	//Stampo con la classe Arrays
	System.out.println(Arrays.deepToString(arrMulti));
	//----------------------------------------------------
	
	int[] xy=new int[3];
	xy[0]=99;
	xy[1]=55;
	xy[2]=33;
	
	for (int i = 0; i < xy.length; i++) {
		System.out.println(xy[i]);
	}
	
	for (int valore : xy) {
		System.out.println(valore);
	}
	
	String[] frutti= {"banane","arance","limoni","lamponi"};
	String[] verdure= {"carote","piselli","pomodori","insalata"};
	
						   //0    //1
	String[][] vegetali= {frutti,verdure};//array di 2X4
	
	for (String[] riga : vegetali) {		
		for (String elemento : riga) {			
			System.out.println(elemento);
		}		
	}
	
	//--------------------------------------------------------------
	
	int[] numerix= new int[8];
	System.out.println("inserisci 8 numeri >0");
	int numUtente=0;
	int numErrori=0;
	
	int contatore=0;
	while(true) {
		if(contatore==8) {
			break;
		}
		numUtente=s.nextInt();
		if (numUtente<=0) {
			System.out.println("ti ho detto >0");
			numErrori++;
		}else {
			numerix[contatore]=numUtente;
			contatore++;
		}		
	}	
	System.out.println(Arrays.toString(numerix)+" Errori: "+numErrori);
	
 		
	}
}
