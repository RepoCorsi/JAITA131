package metodi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Metodi {
   
    //Ha un nome seguita da una coppia di parentesi ()
    //tra le () posso indicare un numero variabile di argomenti oppure nessun argomento 
    //Importante lo static perchè queste funzioni vengono chiamate dal metodo main che è statico
    //Obblligatorio il tipo di ritorno. Se niente è void
    
    //metodi final non si può fare override nelle classi derivate
    //------------------------- DICHIARAZIONI DELLE FUNZIONI ----------------------------------------
    //Il main è al fondo della pagina

    //Funzione Void
    static void stampa(){
        System.out.println("ciao");
    }

    static void stampaConParametriIngresso(String valore, String valore1){
            System.out.println("Il mio nome è: " + valore + " e il mio cognome è: " + valore1);
    }

    //si può usare il return anche per i metodi void,ma solo per uscire dalla funzione.
    static void area(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisci la base");
        int base = keyboard.nextInt();
        if(base <0){
            System.out.println("Errore! la base non può essere negativa");
            return; //si usa return anche se il metodo è void, ma solo per uscire dalla funzione.
        }
        System.out.println("Inserisci l'altezza");        
        int altezza = keyboard.nextInt();        
        if(altezza <0){
            System.out.println("Errore! l'altezza non può essere negativa");
            return; //si usa return anche se il metodo è void, ma solo per uscire dalla funzione.
        }
        System.out.println(base * altezza);
        //non mi serve dare return qui: il metodo è già finito, siamo all'ultima istruzione.
    }    
    
    
    static String stampaParametriInUscita(String valore, String valore1){

            String scritta = "il nome è: " + valore + " e il mio cognome è: " + valore1;
            return scritta;
    }    
        
    //a, b Parametri formali,
    static int somma(int a, int b){ //java non supporta i valori di default nei parametri di ingresso dei metodi.
        return a+b;
    }
    
    
    //E' divisibile? Return Boolean
    static boolean isDivisible(int num1, int num2) {
        return (num1 % num2 == 0);
    }
    
    
    //Funzione con parametro Array    
    static void leggiArray(String[] arr){
        for (String valori : arr){
            System.out.println(valori);
        }
    }
    
    //Funzione con ritorno di tipo array    
    static String[] creaArray(String uno,String due, String tre){        
        String[] arr={uno,due,tre};
        return arr;
    }
    
    /*************************************************************************/
    //Da fare solo se si sono fatti gli ArrayList
    public static void stampa(ArrayList parole) {

        for (Object val : parole) {//Object perchè l'Array_List è di tipo misto, e quindi non esiste un tipo preciso da assegnare
            System.out.println(val);
        }
    }    
    /*************************************************************************/    
    
    //funzione con scanner
    public static int askUser() {
            System.out.println("Inserisci un numero INTERO!!!!");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
    }    
    
    //............................. OVERLOAD ........................................

    // overloaded methods = Metodi che hanno lo stesso nome ma diversi parametri
   // name + parameters = firma del metodo

	static int somma(int a, int b, int c) {

		System.out.println("This is overloaded method #2");

		return a + b + c;

	}

	static int somma(int a, int b, int c, int d) {

		System.out.println("This is overloaded method #3");

		return a + b + c + d;

	}

	static double somma(double a, double b) {

		System.out.println("This is overloaded method #4");

		return a + b;

	}

	static double somma(double a, double b, double c) {

		System.out.println("This is overloaded method #5");

		return a + b + c;

	}

	static double somma(double a, double b, double c, double d) {

		System.out.println("This is overloaded method #6");

		return a + b + c + d;

	}
    
	static int somma(String a, String b) {
		int value1 = Integer.parseInt(a);
		int value2 = Integer.parseInt(b);
                
		return value1 + value2;
	}    
        
        //concatenazione di stringhe
        static String somma(String a, String b, String c){
            System.out.println("overloading somma 5");
            return a+b+c;
        }        

        
        //------------------------- Argomenti Variabili: Var Args -----------------------------------
        static int varArgs(int...x){//importanti i 3 puntini per far capire che x può essere 1 o più valori
            int tot=0;           
            System.out.println("Hai passato questi numeri:");
            for (int i : x){
                System.out.println(i);
                tot+=i;
            }
            return tot;
        }

        //----------------------------- Variabili static ------------------------------------------
        static int x = 0;
        static void varStatica() {
                System.out.println (x);// Essendo dichiarata static, x mantiene il suo valore ad ogni chiamata alla funzione
            x++;//aumenta di 1 il valore precedente
        }

        //Stesso esempio ma con String
        static String s="aaa";
        static void stampaQualcosa(){        
            System.out.println(s);
            s+="*"; //Accodiamo a s gli asterischi ogni volta che chiamiamo il metodo
        }
        
                
     //--------------------------- FUNZIONI RICORSIVE----------------------------------------------

    //Una funzione è detta ricorsiva se, direttamente o indirettamente,richiama se stessa.*/
    static void sempre(){ 
        System.out.println("continua per sempre");  
        sempre();
    }
    //Per evitare che una funzione ricorsiva cada in una ricorsione infinita,
    //bisogna prevedere delle condizioni di terminazione, di uscita chiamate caso base.        

    //le funzioni ricorsive sono tutte composte di 2 parti:
    // 1) Un calcolo/equazione/formula da ritornare(Da mettere nel return)
    // 2) Una condizione di uscita, chiamata condizione di base.
        
    
    static void nonSempre(int quanto){ //passiamo il numero di volte che vogliamo ripetere
        if (quanto>0){  //caso base, per terminare l'esecuzione     
            System.out.println("NON continua per sempre "+quanto);
            quanto--;
            nonSempre(quanto);
        }
    } 
    
    //Esempio Fattoriale ricorsivo:
    static long fattoriale(long x){
        if (x==0)
            return 1;
        else
            return x*fattoriale(x-1);
    }
    
    ///Fattoriale non ricorsivo
//    public static long fattorialeNoricorsivo(int n) {
//        long risultato = 1;
//        for (int i = 2; i <= n; i++) {
//            //System.out.println(risultato);
//            risultato *= i;
//        }
//        return risultato;
//    }    
   
    //Esempio somma ricorsiva    
    static int sommaRicorsiva(int n){
      if(n == 1){
         return 1;
      }else{
         return n + sommaRicorsiva(n-1);
      }
   }    
  
 /*
 //somma non ricorsiva   
   private static int sum(int n){
      int result = 0;
      for(int i = 1; i <= n; i++){
         result = result + i;
      }
      return result;
   }
 */   
    
    
///Fibonacci ricorsiva
    static long fibonacciRicorsivo(int n){
        if (n <= 1){
            return n;
        }else{
            return fibonacciRicorsivo(n - 1) + fibonacciRicorsivo(n - 2);
        }
    }


//Fibonacci NO ricorsiva
    static long fibonacciNOricorsivo(int n){

        if (n <= 1){
            return n;
        }else{

            long num1 = 0;
            long num2 = 1;
            long somma = 0;

            for (int i = 1; i <n; i++){
                somma = num1 + num2;
                num1 = num2; //si scambiano i valori. Quello che era num1 diventa num2, e num2 diventa la somma.
                num2 = somma;
            }
            return somma;
        }
    }    
    
    
	/////////////////////////////congetturaCollaz//////////////////////////////////////////
   //se a è pari, ritorna a/2. se a è dispari, ritorna 3*a+1. 
  //Se si fa girare finisce sempre con 421 qualunque numero si mette in input
//    static int congetturaCollaz(int a){
//            System.out.println(a);
//            if(a==1) //caso base di uscita
//                return -1; 
//            if(a%2==0)
//                return congetturaCollaz(a/2);                
//            else
//                return congetturaCollaz(3*a+1);
//}    
//Fine dichiarazione delle funzioni
    
   /************************************* INIZIO MAIN ********************************************************/     
    
    public static void main(String[] args) {
        
        stampa();
        stampaConParametriIngresso("Fabio","Pileggi");
        
        area();        
        
        String nomeCognome=stampaParametriInUscita("Fabio","Pileggi");
        System.out.println(nomeCognome);
        
        System.out.println("---");
        
        int risultato=somma(1,2);//1,2 parametri attuali
        System.out.println(risultato);
        
        System.out.println("---");
        
        //Stesso esempio ma con valori chiesti all'utente
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo e secondo numero");        
        risultato=somma(input.nextInt(), input.nextInt());//da console si inseriscono con l'invio.
        input.nextLine();// per pulire lo scanner
        System.out.println("La somma è: "+risultato);
        
        System.out.println("---");
        
        //Return boolean
        boolean divisibile=isDivisible(10,2);
        System.out.println("è divisibile? "+divisibile);

        
        //********************* LEGGI ARRAY ***************************************************
        String[] paperi={"qui","quo","qua"};
        leggiArray(paperi);//parametro Array
        System.out.println("---");
        
        
        //********************** RETURN ARRAY ************************************************
        String[] elementi=creaArray("qui","quo","qua");
        
        for (String valori : elementi){
            System.out.println(valori);
        }
        System.out.println("---");
        
  /*************************************************************************/
        //Da fare solo se si sono fatti gli ArrayList
        ArrayList duck = new ArrayList(Arrays.asList(elementi));  //Trasforma un array in una lista                
        stampa(duck);
  /*************************************************************************/        
        
        //Funzione con scanner:
        int a = askUser();
        int b = askUser();
        System.out.println(somma(a,b));
        
        
        //************************ OVERLOAD *****************************************************

        int x = somma(1,2,3);//viene chiamata la funzione in base al numero e tipo di parametro passati
        System.out.println(x);
        
        x = somma("9","1");
        System.out.println(x);   
        
        System.out.println(somma("9","1","ciao")); //concatenazione di stringhe
        
        System.out.println("---");
        
        
        //************************ ARGOMENTI VARIABILI *******************************************
        //chiama varArgs con argomenti variabili
        int ris=varArgs(1,2,3,4,5,6);
        System.out.println("la somma è: "+ris);
        System.out.println("---");
                
        
        //**************************** STATICI **************************************************
        //Aggiungere static int x = 0; all'inizio della classe PRIMA del main
        varStatica(); //Ad ogni chiamata la variabile x si incrementa di 1.
        varStatica();//Cioè Ad ogni chiamata della funzione, mantiene il valore precedente,
        varStatica();//e la funzione fa x++, così ad ogni chiamata x aumenta di 1.
        
        System.out.println("---");
        
        //concatena * alla stringa
        stampaQualcosa(); 
        stampaQualcosa();
        stampaQualcosa();
        stampaQualcosa();
        
        
        //*************************** RICORSIVI *********************************
        //sempre();// continua per sempre
        nonSempre(3);
        
        System.out.println("---");
        
        //Con input utente:
        System.out.println("Quante volte vuoi ripetere?");
        int quante=input.nextInt();
        nonSempre(quante);//420 volte
        
        System.out.println("---");
        
        //Chiamata di fattoriale:
         long fatt=fattoriale(10);
         System.out.println(fatt);
         
        System.out.println("--somma ric-");                
        System.out.println(sommaRicorsiva(10));
        

        System.out.println("Fibonacci ricorsivo");
        for (int i = 0; i < 20; i++){ //vogliamo 10 numeri di fibonacci
            System.out.print(fibonacciRicorsivo(i) + " ");
        }

        System.out.println("Fibonacci NON ricorsivo");
        for (int i = 0; i < 20; i++){//vogliamo 10 numeri di fibonacci
            System.out.print(fibonacciNOricorsivo(i) + " ");
        }        
        
        
//        System.out.println("--collazz--");
//        int val=congetturaCollaz(100);//ritorna sempre 4-2-1 finale
//        System.out.println(val);
        
    }//fine main
        
}//Fine classe
