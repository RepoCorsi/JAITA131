package soluzioniarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SoluzioniArray {

    public static void main(String[] args) {
       
      Scanner input=new Scanner(System.in);
      Random r =new Random();
      
      
       //********************* Es. 1 - SOMMA MEDIA*********************************
//Creare un array di 10 numeri da tastiera e calcolare la somma e la media dei suoi elementi.
       
       /*
        int[] mioArray=new int[10];
        int somma=0;
        System.out.println("inserisci 10 numeri:");
        for (int i = 0; i <10 ; i++) {
            mioArray[i]=input.nextInt();
        }

        for (int ris:mioArray) {
            System.out.println(ris);
            somma+=ris;
        }

        System.out.println("la somma è: "+somma+" la media è: "+(somma/10));
       */
      
       //********************** Es. 2 - SOMMA POSTO PARI-DISPARI***************************
//Creare un array di 10 numeri da tastiera.
//Dire se è maggiore la somma degli elementi di posto pari, oppure la somma degli elementi di posto dispari.
       
        /*int[] pariDispari=new int[10];
        int sommapari=0;
        int sommadispari=0;
        System.out.println("inserisci 10 numeri:");
        for (int i = 0; i <10 ; i++) {
            pariDispari[i]=input.nextInt();
        }

        for (int i = 0; i <10 ; i++) {
            if(i%2==0){
                sommapari+=pariDispari[i];
            }else{
                sommadispari+=pariDispari[i];
            }
        }

        if(sommapari>sommadispari){
            System.out.println("La somma delle posizioni pari è maggiore e vale "+sommapari);
        }
        else{
            System.out.println("La somma delle posizioni dispari è maggiore e vale "+sommadispari);
        }
        */      
      


        //************************ Es. 3 - CERCA ARRAY**********************************
//Dato un numero casuale in input da 1 a 20, verificare se questo numero è presente in un array di 10 numeri casuali da 1 a 10.
//Se è presente indicare la posizione, altrimenti dire che non fa parte dell'array.        
/*
       
        int n = r.nextInt(1,21);//numero casuale da 1 a 20
        System.out.println("numero casuale: "+n);
        int[] numeri = new int[10];
        int posizione = 0;
        boolean trovato = false;
        for (int i = 0; i < 10; i++){
            numeri[i] = r.nextInt(1,11);
        }

        for (int i = 0; i < 10; i++){
            System.out.print(numeri[i] + " ");
            if (n == numeri[i]){
                posizione = i;
                trovato = true;
            }
        }

        if (trovato){
            System.out.println("\nil numero " + n + " è stato trovato in posizione " + posizione);
        }else{
            System.out.println("\nil numero " + n + " NON è stato trovato");
        }
*/        
        

      //******************* Es. 4 - *ARRAY 6 NUMERI AL CONTRARIO* ***********************
    //Creare un array di 6 numeri da tastiera.
    //Creare poi un secondo array contenente i numeri al contrario.
    //Visualizzare tutti e 2 gli array.

      //******* Versione 1 *********************************************
   
//      int[] primoArray=new int[6];
//      int[] secondoArray=new int[6];
//      int x=0;
//
//        for (int i = 0; i <6 ; i++) {
//            System.out.println("inserisci il valore "+(i+1));
//            primoArray[i]=input.nextInt();
//        }
//
//        for (int i = 5; i >=0 ; i--) {
//            secondoArray[x]=primoArray[i];
//            x++;
//        }
//
//        for (int i = 0; i < 6; i++){
//          System.out.println(primoArray[i]+" "+secondoArray[i]);
//        }         
//        
      
        //********* Versione 2: CON 2 INDICI DEL FOR!! *******************************************
        /*
        int[] primoArray=new int[6];
        int[] secondoArray=new int[6];

        int i;
        int j;

        //NON SI POSSONO AVERE 2 CONDIZIONI NEL FOR!!! SOLO 1:  i<6 oppure j>=0
        for (i = 0,j=5; i<6 ; i++,j--) { 
           System.out.println("inserisci il valore "+(i+1));
           primoArray[i]=input.nextInt();
           secondoArray[j]=primoArray[i];
        }     

        for (int k = 0; k < 6; k++){
          System.out.println(primoArray[k]+" "+secondoArray[k]);
        }  
      */
    
       //********* Versione 3 *******************************************
       /*  
       int[] array4 = new int[6];
        int[] contrario = new int[array4.length];

        int inverso = array4.length - 1;
        for (int i = 0; i < array4.length; i++) {
          array4[i] = input.nextInt();
          contrario[inverso] = array4[i];
          inverso--;
        }

        System.out.println("Array: " + Arrays.toString(array4));
        System.out.println("Array al contrario: " + Arrays.toString(contrario));
      
      
      */
    
    /*************************** ES 5 Magg. Zero************************************/   
     
    //Riempire un array con 8 numeri inseriti dall’utente che siano maggiori di zero.
    //Se viene inserito un numero uguale o minore di zero, viene scartato, e chiesto di inserire di nuovo fino a quando rispetta la condizione. 
    //Visualizzare a schermo l’array inserito e quante volte l'utente ha sbagliato ad inserire i dati.
    /*
    int[] numeri= new int[8];
    int numErrori=0;
    System.out.println("inserisci 8 numeri maggiori di zero");
    int contatore=0;    
    while(true) {
      if (contatore==8){
        break;
      }
      int numUtente=input.nextInt();
      if (numUtente<=0){
        System.out.println("ti ho detto maggiore di zero");
        numErrori++;
      }else{
        numeri[contatore]=numUtente;
        contatore++;
      }
    }
    System.out.println(Arrays.toString(numeri)+" "+numErrori);
      */  


        //****************** Es. 6 - DUE LISTE************************
        /*
        int[] cinque=new int[5];
        int[] altriCinque=new int[5];
        int[] somma=new int[5];

        System.out.println("inserisci 5 numeri:");
        for (int i = 0; i <5 ; i++) {
            cinque[i]=input.nextInt();
        }
        System.out.println("inserisci altri 5 numeri");
        for (int i = 0; i <5 ; i++) {
            altriCinque[i]=input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            somma[i]=cinque[i]+altriCinque[i];
        }

        System.out.println("la somma dei numeri in posizioni corrispondenti sono:");
        for (int ris:somma) {
            System.out.println(ris);
        }
        */


        //*************** Es. 7 - DUE LISTE 2*********************
        
//        int[] cinque=new int[5];
//        int[] altriCinque=new int[5];
//        int somma=0;
//        int comune=0;
//        String elenco="";
//
//        System.out.println("inserisci 5 numeri:");
//        for (int i = 0; i <5 ; i++) {
//            cinque[i]=input.nextInt();
//        }
//        System.out.println("inserisci altri 5 numeri");
//        for (int i = 0; i <5 ; i++) {
//            altriCinque[i]=input.nextInt();
//        }
//
//        for (int i = 0; i < 5; i++) {//ciascun elemento della prima lista 
//            for (int j = 0; j < 5; j++) {//lo confronto con quelli dell'altra lista
//                if (cinque[i]==altriCinque[j]){
//                    comune++;
//                    elenco+=cinque[i]+" ";//Concatenazione di stringhe. elenco dei numeri in comune.
//                    somma+=cinque[i];
//                }
//            }
//        }
//
//        System.out.println("le 2 liste hanno "+comune+" numeri in comune: "+elenco);
//        System.out.println("la loro somma è "+somma);
        
 

        //******************** Es. 8 - MIN-MAX ******************************
        //Creare un array di 10 numeri in input.
        //Visualizzare il valore massimo e il minimo degli elementi dell'array, e dire in che posizione si trovano.
       
        /*
        int[] minMax=new int[10];
        System.out.println("inserisci 10 numeri positivi o negativi");
        for (int i = 0; i <10 ; i++) {
            minMax[i]=input.nextInt();
        }
        //scegliamo arbitrariamente dei valori iniziali di min e max
        int min=minMax[0];
        int max=minMax[0];
        int posMax=0;
        int posMin=0;
        for (int i = 0; i <10 ; i++) {
            //Se il numero che leggiamo dall'array è più piccolo del minimo
            if(minMax[i]<min){
                min=minMax[i];//allora il minimo è quello che leggiamo
                posMin=i;// e la posizione è questa che stiamo leggendo
            }else if(minMax[i]>max){
                max=minMax[i];
                posMax=i;
            }
        }

        System.out.println("Il valore max è "+max+" in posizione "+posMax);
        System.out.println("Il valore min è "+min+" in posizione "+posMin);
        */

        
        /********************* Es. 9 Uguali al precedente **********************************************************************/
        //Creare un array di 10 numeri da tastiera, e stampare solo i numeri che sono uguali al precedente.
        //Se non ci sono coppie di valori consecutivi uguali, il programma non stampa nulla.
        
//        int[] numeri = new int[10];
//
//        System.out.println("Inserisci 10 numeri:");
//        for (int i = 0; i < numeri.length; i++){
//            numeri[i] = input.nextInt();
//        }
//
//        System.out.println("Numeri uguali al precedente:");
//        for (int i = 1; i < numeri.length; i++){
//            if (numeri[i] == numeri[i - 1]){
//                System.out.println(numeri[i]);
//            }
//        }        
//        
        /**************** Es. 10 - Array no dup ***************************************************/
        //Creare un array di 10 numeri casuali da 1 a 10.
        //Visualizzare i valori degli array senza duplicati.        
        
//        int[] numeri = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//          numeri[i] = r.nextInt(1,11); //da 1 a 10
//          System.out.print(numeri[i]+" ");
//        }
//
//        System.out.print("\nArray senza duplicati: ");
//        for (int i = 0; i < 10; i++) {
//          boolean duplicato = false;
//          for (int j = 0; j < i; j++) {
//            if (numeri[i] == numeri[j]) {
//              duplicato = true;
//              break; //se lo trova esce dal ciclo impostando duplicato a true
//            }
//          }
//          if (!duplicato) {
//            System.out.print(numeri[i] + " ");
//          }
//        }
//        
        /***************** Es. 11 - SOLO i valori duplicati e dire QUANTE volte sono ripetuti******/
    //Creare un array di 10 numeri casuali da 1 a 10.
    //Visualizzare SOLO i valori duplicati e dire QUANTE volte sono ripetuti.
    //.............. Metodo che funziona qualsiasi siano i valori nell'array ......

    /*
         int[] numeri ={1, 2, 3, 4, 2, 7, 8, 8, 3, 2};

//        int[] numeri = new int[10];
//        // Generazione dei numeri casuali nell'array
//        for (int i = 0; i < numeri.length; i++) {
//            numeri[i] = r.nextInt(1,11);
//        }

        System.out.println(Arrays.toString(numeri));
        
        // Trova i valori ripetuti e il numero di volte in cui sono ripetuti
        boolean[] ripetuti = new boolean[numeri.length];
        for (int i = 0; i < numeri.length ; i++) {
            
            if (ripetuti[i]) {//se l'abbiamo già trovato lo saltiamo
                continue;
            }

            int conteggio = 1;//ce n'è sempre almeno 1 se non è duplicato
            
            for (int j = i + 1; j < numeri.length; j++) { //cerchiamo l'elemento all'interno di tutti gli altri.
                if (numeri[j] == numeri[i]) {//se lo troviamo
                    conteggio++;//incrementiamo conteggio
                    ripetuti[j] = true;//e salviamo true nell'array per dire che lo abbiamo trovato
                }
            }

            if (conteggio > 1) {//contiamo se per quell'elemento ne abbiamo più di 1
                System.out.println("Numero: " + numeri[i] + " - Ripetizioni: " + conteggio);
            }
        }

    */

    //Questo metodo funziona solo se i valori dell'array sono compresi tra 0 e array.length-1.
    //in questo caso da 0 a 9
    /*
    int[] numeri={8,5,8,9,8,3,1,8,3,5};
    int[] rip=new int[10];
    System.out.println("Array= "+Arrays.toString(numeri));

    for (int num : numeri){
         rip[num]++; //incremento di 1 l'array rip all'indice num.
    }
    System.out.println("Array= "+Arrays.toString(rip));
    for (int i = 0; i < rip.length; i++){
        if (rip[i]>1){
            System.out.println("il numero "+i+" è ripetuto: "+rip[i]+" volte");
        }
    } 
    */
     
    /************************* 12 Comincia Per************************/
//Scrivere un programma CominciaPer che chiede all’utente di inserire una sequenza di stringhe.
//Successivamente, chiede all’utente di inserire un carattere e stampa tutte le stringhe precedentemente inserite che iniziano con quel carattere.     
        // Input della sequenza di stringhe
//        System.out.println("Inserisci una sequenza di stringhe separate dalla virgola: ");
//        String sequenza = input.nextLine();
//        String[] stringhe = sequenza.split(",");
//
//        // Input del carattere
//        System.out.print("Inserisci un carattere: ");
//        char carattere = input.next().charAt(0);//non esiste nextChar()!!
//
//        // Stampa delle stringhe che iniziano con il carattere
//        System.out.println("Stringhe che iniziano con il carattere '" + carattere + "':");
//        for (String str : stringhe) {
//            if (str.charAt(0) == carattere) {
//                System.out.println(str);
//            }
//        }

    /******************* Es. 13 - palindromo.*********************************/
    
    //    System.out.println("inserisci una stringa: ");
    //    String parola= input.nextLine();
    //
    //    boolean palindromo=true;
    //    //togliamo gli spazi e trasformiamo la stringa in un array di caratteri
    //    char[] lettere = parola.replace(" ","").toCharArray();
    //
    //    for (int i = 0; i < lettere.length ; i++) { 
    //      //confrontiamo l'indice partendo dall'inizio con l'indice partendo dal fondo.
    //      if (lettere[i]!=(lettere[lettere.length-1-i])){
    //        palindromo=false;//Se sono diverse usciamo dal ciclo perchè la stringa non è palindroma
    //        break;
    //      }
    //    }
    //
    //    if (palindromo){
    //      System.out.println("la frase "+parola+" è palindroma");
    //    }else{
    //      System.out.println("la frase "+parola+" NON è palindroma");
    //    }
    //..............ALTRO METODO.........................................
    //   System.out.println("inserisci una stringa: ");
    //   String parolaIngresso= input.nextLine();
    //
    //   String parola=parolaIngresso.replace(" ","");//togliamo gli spazi
    //
    //   boolean palindroma=true;
    //
    //   int sx,dx;
    //   for(sx=0, dx = parola.length()-1; sx<dx; sx++,dx--){// con 2 indici che vanno in direzioni opposte
    //   
    //      if(parola.charAt(sx)!=parola.charAt(dx)){
    //          palindroma = false;
    //          break;
    //      }
    //   }
    //   System.out.println("Risultato : " + palindroma);
    
    
       /************************* 14 somma num. precedente e successivo ************************/
//Creare un array di 10 numeri da tastiera, e ritornare vero se un numero è uguale alla somma del numero precedente con il successivo, 
//e stampare i 3 numeri

//        int[] numeri = new int[10];
//
//        // Input dei numeri dall'utente
//        System.out.println("Inserisci 10 numeri:");
//        for (int i = 0; i < numeri.length; i++) {
//            numeri[i] = input.nextInt();
//        }
//
//        // Verifica se un numero è uguale alla somma del precedente e del successivo
//        boolean trovato = false;
//        //IMPORTANTE!! parte da 1 e finisce a numeri.length-1 altrimenti i conti dopo si sballano!
//        for (int i = 1; i < numeri.length-1; i++) {
//            if (numeri[i] == numeri[i - 1] + numeri[i + 1]) {
//                System.out.println("Trovato: " + numeri[i - 1] + " + " + numeri[i + 1] + " = " + numeri[i]);
//                trovato = true;
//            }
//        }
//
//        if (!trovato) {
//            System.out.println("Nessun numero corrisponde alla somma del precedente e del successivo.");
//        }

    
    
   }
}
