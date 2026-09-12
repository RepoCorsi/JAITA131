package soluzionimetodi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SoluzioniMetodi {

    private static double cambio;    
    
    public static void main(String[] args){

        //isDivisibile
        boolean divisibile=isDivisible(10,2);
        System.out.println("è divisibile? "+divisibile);
        
        //1 pari o dispari:
        boolean pariDispari = pariDispari(6);
        System.out.println(pariDispari);
        
        ////////////////////////////////
        //2 ripeti
        ripeti("ciao", 5);
        
        
        /////////////////////////
        //3 reverse
        System.out.println(reverse("ciao"));
        
        ///////////////////////
        //4 incrementa se uguali
        incrementaSeUguali(3, 2);
                
        /////////////////////////
        //5 calc
        double ris=calc(10, 2, "/");
        System.out.println(ris);        
        
        //6 tasso cambio   
        impostaCambio(0.98);
        double risultato = converti("dollari", "euro", 250.0);
        System.out.println("250 dollari equivalgono a " + risultato + " euro.");                   
        
        //7 posizione
        Random r= new Random();
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++){
            arr[i]=r.nextInt(21);//da 0 a 20
            System.out.print(arr[i]+" ");
        }
        int pos=posizione(arr, 5);
        System.out.println(pos<0?"non è stato trovato":"è stato trovato in posizione "+pos);
                
        //8 media varArgs
        System.out.println(media(1,2,3,4,5));//15.0
        
        //9 unisci array
        //1,2,3,4
        //5,6,7,8
        //[1, 5, 2, 6, 3, 7, 4, 8]        
        int[] primo={1,2,3,4};
        int[] secondo={5,6,7,8};
        
        int[]unito=unisciArray(primo, secondo);
        System.out.println(Arrays.toString(unito));
        
        
        //Caratteri comuni
        boolean siNo=caratteriComuni("fila","computer");
        System.out.println(siNo);
        
        
        //prima ultima e terza lettera
        Scanner s = new Scanner(System.in);        
        System.out.println("Inserisci una stringa di almeno 6 lettere:");
        String frase = s.nextLine();
        
        if (frase.length() >= 6) {
            char[] arr3 = creaArray(frase);
            System.out.println("Array risultato:");
            for (char lettere : arr3) {
                System.out.println(lettere);
            }
        } else {
            System.out.println("La stringa inserita non contiene almeno 6 lettere.");
        }                
        
        
       //ordina
        double[] sortedArray = ordina(3.14, 2.718, 1.618);
        System.out.println("Array ordinato:");
        for (double number : sortedArray) {
            System.out.println(number);
        }       
        
    }//fine main

///////////////// FUNZIONI /////////////////////////////////////////////////    
    
/*Creare un metodo che dati un numero intero a e un numero intero b in input, dica se a è divisibile per b. 
Deve restituire un booleano.*/
    static boolean isDivisible(int num1, int num2) {
        return (num1 % num2 == 0);
    }    
     
// 1) Creare un programma che controlli tramite una funzione se un numero passato in input è pari o dispari.
//Deve restituire un booleano .
    static boolean pariDispari(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////
//2) Scrivere una funzione Ripeti che chiede all’utente di inserire una stringa e un numero intero positivo, da passare in input alla funzione, 
//e che stamperà tante volte la stringa quante indicate nel numero inserito dall’utente. 
//Se il numero inserito dall’utente è negativo il metodo stamperà "ERRORE: numero negativo". 

    static void ripeti(String s, int n){
        if (n<0){
            System.out.println("errore. Numero negativo");
        }else{
            for (int i = 0; i < n; i++){
                System.out.println(s);
            }
        }    
    }

    
    //3)Creare una funzione che accetti una stringa in input, e la restituisca al contrario.    
    static String reverse(String parola){
        String contrario="";
        for (int i = parola.length()-1; i >=0; i--){
            contrario+=parola.charAt(i);
        }
        
//        oppure trasformare la Stringa in un array di caratteri        
//        char[] arrCaratteri=parola.toCharArray();
//
//        for (int i = arrCaratteri.length-1; i >=0; i--){
//            contrario+=arrCaratteri[i];
//        }

        return contrario;
    }

    
    //4) Creare una funzione che accetti 2 numeri inseriti dall’utente:
    //Se i numeri sono uguali li incrementa di uno e li stampa, altrimenti li stampa senza incrementarli.
    static void incrementaSeUguali(int n1, int n2){
        if (n1==n2){
            System.out.println((++n1)+" "+(++n2));
        }else{            
            System.out.println(n1+" "+n2);
        }
    }
    
    
///////////////////////////////////////////////////////////////////////////////////////////////////
//5) Creare una funzione calcolatrice che accetti in input 2 numeri e l'operatore(+  -  * / max min), e restituisca il risultato dell'operazione richiesta.
//Se nel caso della divisione il divisore è zero, scrivere un messaggio di errore e ritornare -99999.
    static double calc(double num1, double num2, String operazione){
        
        double ris=0;
        
        switch (operazione){
            case "+":
                ris = num1 + num2;
                break;
            case "-":
                ris = num1 - num2;                
                break;
            case "*":
                ris = num1 * num2;               
                break;
            case "/":
                if (num2==0){
                    System.out.println("Errore, non puoi dividere per 0");
                    return -99999;
                }else{
                    ris = num1 / num2;
                }
                break;
            default:
                System.out.println("operazione non consentita");
        }
        
        return ris;
    }    

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //6)Creare un programma che permetta la conversione tra Dollari ed Euro e viceversa.
    //Creare due metodi: impostaCambio e converti.
    //Il metodo impostaCambio prende in input il valore del tasso di Cambio tra le due valute Dollaro e Euro
    //Il metodo converti prende in input 2 stringhe valutaDa e valutaA, l'importo da convertire ed esegue la conversione dell'importo in base delle valute specificate.
    //Restituire l'importo convertito.
    //ATTENZIONE!! DICHIARARE LA VARIABILE CAMBIO PRIMA DEL MAIN!  private static double cambio;
    
    public static void impostaCambio(double tassoCambio) {
        System.out.println("Cambio impostato a  " + tassoCambio);
        cambio = tassoCambio;
    }

    public static double converti(String valutaDa, String valutaA, double importo) {

        if (valutaDa.equals("dollari") && valutaA.equals("euro")) {
            return importo * cambio;
        } else if (valutaDa.equals("euro") && valutaA.equals("dollari")) {
            return importo / cambio;
        } else {
            System.out.println("Le valute specificate non sono supportate.");
            return 0.0;
        }
    }     
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //7)Creare un metodo che prenda in input un array di 10 numeri casuali da 0 a 20, ed un numero intero.
    //La funzione deve restituire la posizione nell'array del numero intero.
    //Se il numero non è presente nell'array la funzione deve restituire -1

    static int posizione(int[] arr, int numero){
        for (int i = 0; i < arr.length; i++){
            if (numero==arr[i]){
                return i; 
            }
        }
        return -1;
    }
    
    
    //8)Creare una funzione che accetti un numero variabile di argomenti di tipo intero in input, e ne restituisca la media.
    static double media(int...x){
        int tot=0;           
        System.out.println("Hai passato questi numeri:");
        for (int i : x){
            System.out.println(i);
            tot+=i;
        }
        return tot/x.length;
    }
    
    //9)Creare un metodo che accetta in ingresso due array a1, a2 di uguale lunghezza, 
    //e restituisce un array formato dal primo elemento di a1, seguito dal primo elemento di a2,  
    //dal secondo elemento di a1, seguito dal secondo elemento di a2, e così via. 
    //Se i due array in ingresso non hanno uguale lunghezza, il metodo restituisce null
    
    //1,2,3,4
    //5,6,7,8
    //[1, 5, 2, 6, 3, 7, 4, 8]
    static int[] unisciArray(int[] arr1, int[] arr2){
        int[] uniti=new int[arr1.length+arr2.length];
        if (arr1.length!=arr2.length){
            return null;
        }
        int j=0;
        for (int i = 0;i < arr1.length; i++){
        //for (int i = 0,j=0; i < arr1.length; i++,j++){
            uniti[j]=arr1[i];
            uniti[++j]=arr2[i];
            j++;            
        }
        
        return uniti;
    }

    
/*Creare un metodo che accetta in input 2 stringhe, e restituisce true se e solo se la stringa s1 NON contiene alcun carattere della stringa s2, restituisce false altrimenti. 
Ad esempio, per le stringhe “fila” e “computer” il metodo restituisce true perché non vi è alcun carattere in comune.*/
        public static boolean caratteriComuni(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s2.charAt(i)==s1.charAt(i)) {
                return false;
            }
        }
        return true;
    }


/*Creare un metodo che accetti in input una stringa dall' utente di almeno 6 lettere,
 e restituisca un array contenente la prima, l'ultima e la terza lettera.*/
    static char[] creaArray(String frase){        
        char[] x=new char[3];
        x[0]=frase.charAt(0);
        x[1]=frase.charAt(frase.length()-1);
        x[2]=frase.charAt(3);
        
        return x;
    }

    
//Scrivere un metodo che riceva in input tre numeri con la virgola, e ritorni un array ordinato.    
     static double[] ordina(double num1, double num2, double num3) {
        double[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        return numbers;
    }

}//Fine Classe
