package array;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MioArray {

    public static void main(String[] args) {

        int[] unArray;//dichiaro un array di interi.
        //Gli array hanno dimensione fissa!!! e devo specificare la dimensione.
        //Elementi tutti dello stesso tipo.
        unArray=new int[10];//Gli dico che l'array ha 10 elementi, ma non gli do ancora il valore.

        //oppure tutto in una riga:
        int[] unAltroArray=new int[10];

        //gli do num valori
        unArray[0]=1;//gli array partono da zero
        unArray[1]=2;
        unArray[2]=3;
        //se non specificato gli atri elementi valgono zero
        //false per boolean, "" per stringa

        System.out.println(unArray[8]);

        //Altro esempio col tipo stringa: definisco un array di note musicali.

        String[] noteMusicali = new String[7];

        noteMusicali[0] = "Do";
        noteMusicali[1] = "Re";
        noteMusicali[2] = "Mi";
        noteMusicali[3] = "Fa";
        noteMusicali[4] = "Sol";
        noteMusicali[5] = "La";
        noteMusicali[6] = "Si";

        int lunghezzaArr = noteMusicali.length;

        System.out.println("L'array contiente " + lunghezzaArr + " elementi");
        System.out.println(noteMusicali); //stampa il puntatore


        //Altra sintassi, se conosco già num valori da mettere nell'array
        //Array Letterale:
        String[] colori={"bianco","nero","giallo","blu"};
        System.out.println(colori[3]);

        //Lunghezza array
        int lunghezza=colori.length;
        System.out.println(lunghezza);

        //come visualizzo il penultimo elemento?
        System.out.println(colori[lunghezza-2]);

        /****************** Stampare con un loop ***********************************/

        //Metodo Classico
        for (int i = 0; i < colori.length; i++){
            String colore = colori[i];

            System.out.println(colore);
        }

        //col loop migliorato:
 		//sintassi alternativa dove non uso l'indice
 		//parti dall'array colori, e ogni valore lo metti nella var. temporanea colore
 		//fai così per tutti gli elementi

        for (String colore : colori){
            System.out.println(colore);
        }

        //valorizzare un array col loop
 		//creo un array vuoto e lo riempo con valori da 0 a 4

        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i]=i; //0--4
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

        //Altro esempio:
        //dichiaro un altro array e lo leggo con un for
        String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};

        for(int i = 0; i < giorni.length; i++) {

                if(giorni[i].equals("Venerdì") || giorni[i].equals("Sabato")) {
                        System.out.println(giorni[i] + " Festa");
                }else if( giorni[i].equals("Domenica")){
                        System.out.println(giorni[i] + " Relax");
                }else {
                        System.out.println(giorni[i] + " Lavoro / Studio");
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

        //.................................. ESEMPIO ........................................
        //Stampare la stringa più lunga nell'array:
        String[] animali={"cane","gatto","topo","criceto","pesce","tricheco"};
        String piuLunga=animali[0]; //variabile da testare per la lunghezza. testo a partire dalla prima
        for (String s : animali){
               if (s.length()>piuLunga.length()){
                   piuLunga=s;
            }
        }
        System.out.println("La più lunga è "+piuLunga);

        //.................... Le stringhe non sono array di caratteri ma classi ...................
        String stringa="ciao";	
//char[] arrayCaratteri= {'c','i','a','o'};	//Questo è un array di caratteri
        char[] arrayCaratteri = stringa.toCharArray();//trasforma la stringa in un array di caratteri

        for (char lettera : arrayCaratteri){
            System.out.println(lettera);
        }

        ////SPLIT - Creare un array da elementi di una Stringa
//	System.out.println(parola2[0]); --no   le stringhe non sono array
        String str = "ciao a tutti";
//creo un array a pertire da una stringa
        String[] arrDiStringhe = str.split(" "); //array di 3 elementi: 1)ciao 2)a 3)tutti

        for (String pezzi : arrDiStringhe){
            System.out.println(pezzi);
        }

        //Attenzione ai caratteri riservati, come il punto . + \ *
        String str2 = "ciao*come*stai";
        //si usa L'ESCAPE
        String[] arrOfStr2 = str2.split("\\*"); // str.split("."); will give no output...

        for (String a : arrOfStr2){
            System.out.println(a);
        }

        //Esempio con espressioni regolari
        String str3 = "parola1,parola2 parola3@parola4?parola5.parola6";
        String[] arrOfStr3 = str3.split("[, ?.@]");//quello che voglio includere lo metto tra quadre

        for (String a : arrOfStr3){
            System.out.println(a);
        }


        //.......................
        int[] numeri={4,2,1,3};

        //Per stampare un array non si fa print, perchè è un oggetto, e quindi
        //ritorna la posizione in memoria e non il contenuto dell'array
        System.out.println(numeri);

        //Visto che gli array sono immutabili,
       //per lavorarci si usa la classe Arrays del package java.util che va importata

        ////la classe Arrays mi permette di visualizzare il contenuto dell'array con un semplice print
        System.out.println(Arrays.toString(numeri));
        //Stampare un array multidimensionale
        //System.out.println(Arrays.deepToString(arrayMultiDimesionale));


        //Array con numeri casuali
        int[] arrCasuali=new int [10];//dichiaro l'array di 10 num. interi

        Random r=new Random(); //creo l'oggetto random. Va importato con java.util.Random

        for (int i = 0; i < 10; i++){
            arrCasuali[i]=r.nextInt(0,101);//lo popolo con valori casuali da 0 a 100.
        }

        for (int valori : arrCasuali){
            System.out.println(valori);//lo stampo
        }
        //System.out.println("Con toString: "+Arrays.toString(arrCasuali));


        //.................................. ORDINARE UN ARRAY .................................
        //Selection sort:
        System.out.println("Quanti numeri vuoi?");
        Scanner input=new Scanner(System.in);
        int quanti=input.nextInt();

        int[] valori = new int[quanti];	//creo l'array di dimensione scelta dall'utente

        for (int i = 0; i < valori.length; i++) {// inizializzazione da parte dell ’utente
            System.out.println("inserisci il numero "+i);
            valori[i] = input.nextInt();  //l'utente inserisce i valori nell'array in base all'indice
        }

        //Selection sort
        for (int i = 0; i < valori.length; i++) {//Ogni valore
            for (int j = 0; j < valori.length; j++) {//lo confronto con gli altri
                if (valori[i] < valori[j]) {//Se è più piccolo..
                    int tmp = valori[i];//li inverto.
                    valori[i] = valori[j];
                    valori[j] = tmp;
                }
            }
        }

        System.out.println("Array ordinato: "+Arrays.toString(valori));


        //**************************
         //Gli array sono tutti dello stesso tipo,
        //in java tutto è un oggetto, quindi
        //posso usare OBJECT per creare array di tipi diversi.
        Object[] misto = new Object[4];
        misto[0] = true;
        misto[1] = "Fragola";
        misto[2] = 123;
        misto[3] = Calendar.getInstance().getTime();

        System.out.println(Arrays.toString(misto));


        /*********************** Array multidimensionali ************************************/
        int[][] arrMulti={
            {1,2,3}, //posizione 0
            {4,5,6}	 //posizione 1
        };

        System.out.println(arrMulti[0][1]);//prima riga, secondo elemento, quindi valore 2


        //stesso esempio ma con l'altra sintassi
        int [][] multiplo=new int[2][3];//E' un array composto da 2 array,  ciascuno di 3 elementi.
        multiplo[0][0]=1;
        multiplo[0][1]=2;
        multiplo[0][2]=3;
        multiplo[1][0]=4;
        multiplo[1][1]=5;
        multiplo[1][2]=6;

        for (int[] arr2 : multiplo){
            for (int num : arr2){
                System.out.println(num);
            }
        }

        //Stampa con l'indice
        for (int i = 0; i < multiplo.length; i++){
            for (int j = 0; j < multiplo[i].length; j++){
                System.out.print(multiplo[i][j]);
            }
            System.out.println("");	//vado a capo dopo ogni riga
        }
							   
	//Stampo con la classe Arrays
	System.out.println(Arrays.deepToString(arrMulti));
	//----------------------------------------------------
        System.out.println(""); //Per lasciare una riga vuota

        String[][] arrMulti2={
            //nome    cognome
            {"mario","rossi"}, //0
            {"giuseppe","verdi"},//1
            {"ugo","bianchi"}//2

        };
        for (String[] persone : arrMulti2){
            for (String nomiEcognomi : persone){
                System.out.print(nomiEcognomi+" ");
            }
            System.out.println("");//per andare a capo dopo ogni persona
        }

//        }


        //.......................Array multiplo da array esistente.....................................

        String[] frutti={"banane","arance","limoni","lamponi"};
        String[] verdure={"carote","piselli","pomodori","insalata"};
        String[][] vegetali={frutti,verdure}; //Crea un array multiplo da 2 array. Il primo elemento è frutti, il secondo è verdure
                                              //Importante le doppie parentesi dopo String!!


        for (String[] arr3 : vegetali){
            for (String veg : arr3){
                System.out.println(veg);
            }
        }

        //stampa usando il metodo Arrays.deepToString
        String veg = Arrays.deepToString(vegetali);
        System.out.println(veg);


        //************************* FAR FARE ESERCIZI ***********************************************************************/

        /***********Da fare dopo che hanno fatto gli esercizi sugli array****************/
        System.out.println("**********Dopo Esercizi*******");

        int[] arrDisordinato={5,9,0,2,7,1};

        //ordina un array. Cambia proprio l'array, non solo visualizzazione
        Arrays.sort(arrDisordinato);

        System.out.println("Array ordinato: "+ Arrays.toString(arrDisordinato));

        //copyOf copia l'array per il numero di caratteri indicato:
        int[] ordinato = Arrays.copyOf(arrDisordinato, arrDisordinato.length);
        System.out.println("Array ordinato: "+ Arrays.toString(ordinato));

        //cerca un elemento nell'array e ritorna la sua posizione
        int posizione=Arrays.binarySearch(arrDisordinato, 5);//deve essere ordinato con Arrays.sort
        System.out.println("il 5 è in posizione "+posizione);

        //confronta 2 array di tipo Integer e ritorna false perchè NON sono uguali

        int[] arrX={99,-1,43,555,888,2};

        System.out.println(Arrays.equals(arrX, arrDisordinato));

        //riempe tutto l'array con il valore 5. Il valore deve rispettare il tipo, e non essere un array
        Arrays.fill(arrX, 5);
        //riempe con 10 partendo dalla pos 3 fino alla 5
        Arrays.fill(arrX, 2,6,10);

        //Stampa un array come stringa
        System.out.println(Arrays.toString(arrX));

        int[] altriNumeri = {3, 6, 9, 12, -1, -4, -9, 12, 21,-7};

        //copia di una parte dell'array.
        //dal terzo elemento al sesto(estremo sup escluso) 12, -1, -4, -9
        int[] parteDeiNumeri = Arrays.copyOfRange(altriNumeri, 3, 7);
        System.out.println("parteDeiNumeri:"+Arrays.toString(parteDeiNumeri));

    }//Fine main
} //Fine Classe