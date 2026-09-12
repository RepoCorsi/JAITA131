package For_While;

import java.util.Random;
import java.util.Scanner;

public class For_While {

    public static void main(String[] args) {
    /****************** CICLO FOR *********************************/
        /****************** Modo Classico ***********************************/
        for (int i = 0; i < 10; i++) { //10 numeri da 0 a 9
            System.out.println("i= " + i);
        }

        //al contrario
        for (int i=10;i>0;i--){//10 numeri da 10 a 1
            System.out.println("i= " + i);
        }
        
        //salta di 2 ogni volta
        for (int i = 0; i < 10; i+=2) { //solo i pari
            System.out.println("i= " + i);
        }        
        
        //Stampa tutti i caratteri. La tabella ascii va da 0 a 255. fino a 127 sono stampabili
        for(int i = 0; i < 127; i++) {
            System.out.println("" + i + ": " +(char) i);
        }                
        
        //destrutturato
        int contatore = 0;
        
        for (; contatore < 10;){
         
            System.out.println("contatore= " + contatore);
            contatore++;
        }
        
        //2 indici:
        for (int i = 0, j=10; i < 10; i++,j--) { //la virgola tra i 2 indici. Solo 1 condizione
            System.out.println("i= " + i+" j= "+j);
        }        
        
        
        
        /******************* For Migliorato ****************************************/
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int item : numbers) {
//            System.out.println("Count is: " + item);
//        }
    
        
        /**************** Stampa in verticale ******************/
        String a = "ciao a tutti";

        for (int i = 0; i < a.length(); i++)
            System.out.println(a.charAt(i));

        /************** Oppure col for migliorato:*****************************/
//        for (char lettere:a.toCharArray()) {
//            System.out.println(lettere);
//        } 

        //Stampa numeri al contrario:
        int numeri=739162;
        String cifre = Integer.toString(numeri);
        for(int i=cifre.length()-1; i>=0; i--){
            System.out.println(cifre.charAt(i));
        }
        
        
        //Conta il numero di spazi in una frase
        String frase="Ciao a tutti oggi è una bella giornata";
        int numeroSpazi=0;
        for(int i=0;i<frase.length(); i++){

            if(frase.charAt(i)==' '){
                numeroSpazi++;
            }
        }
        System.out.println("Spazi= "+numeroSpazi);
        
        
        
        //trovare un valore tra altri
        boolean trovato=false;

        Random r=new Random();
        int casuale = r.nextInt(1,21);//da 1 a 20.
        System.out.println("il numero casuale è: "+casuale);
        for(int i = 1; i <= 10; i++){
            if(casuale==i){
                trovato=true;
                break;
            }
        }
        System.out.println(trovato?"il numero è stato trovato":"il numero non è stato trovato");
        
        
        //fattoriale:
        long fact = 1; //long perchè il valore diventa grande in fretta
        for(int i = 1; i <= 10; i++) { //fattoriale di 10
            fact *= i;
        }
        System.out.println("Fattoriale="+fact);        
        
        
        /*************** Cicli annidati: Tabella Pitagorica *******************************/

        for (int $i = 1; $i <= 10; $i++) {

            for (int $j = 1; $j <= 10; $j++) {
                //String.format("%3d",numero) // %3s spazio a dx, testo allineato a sx, lunghezza minima 3 caratteri
                //String.format("%-3d",numero) //%-3s col meno(-) spazio a sx, testo allineato a dx, lunghezza minima 3 caratteri

//print formattato. %-3d allineato a destra(lascia spazio a sx),3 caratteri minimo, d numero, s stringa, f decimale
                //System.out.printf("%-3d", $i * $j); 
                System.out.print("\t"+ $i * $j); //"\t" per tabulazione
                // Stampa celle con il valore $i*$j 1*1..1*2..1*3......1*10
            }

            // a capo dopo ogni riga da 1..10 - 2..20 .. per esempio
            System.out.println("");
        }


        /*************** Allineamenti **********************/

/*
% [flags] [dimensione minima]
        System.out.printf("Total: %-10.2f: ", dblTotal);
        System.out.printf("% 4d", intValue);
        System.out.printf("%20.10s\n", stringVal);
        String s = "Hello World";
        System.out.printf("The String object %s is at hash code %h%n", s, s);
*/
        //I numeri sono allineati a dx.
        //Si inizia col % poi c'è il flag che può essere:
            //0= riempe con 0 davanti al numero(default riempito con spazio)
            //-= per allineare i numeri a sinistra(default allineato a dx)
            //,= mette il punto separatore per le migliaia(solo per i numeri > 1000)
        //Poi c'è la dimensione minima:
            //8= minimo 8 caratteri
            //d= identificatore per i numeri interi[byte, short, int, long] | f=decimali[float, double] | S stringhe
            //%n= fa andare a capo

//Esempi:
//System.out.printf("numero=:%08d%n", 10000);//zeri iniziali, minimo 8 cifre, numero intero, a capo
//System.out.printf("numero=:%-8d#%n",10000);//allineato a sx,minimo 8 cifre,numero intero,# carattere a piacere per segnare la fine. a capo
//System.out.printf("numero=:%0,8d%n", 10000);//zeri iniziali,separatore migliaia,minimo 8 cifre,numero intero,a capo
//
//System.out.println("ciao");
//
//        System.out.printf("%-25s", "left justified:");
//        System.out.printf("%25s", "right justified:");
//        System.out.println();//vado a capo.
//        // oppure usando le funzioni di stringa:
//        String s1 = String.format("%25s", "right justified:");
//        String s2 = String.format("%-25s", "left justified:");
//        System.out.println(s1 + " " + s2);
 
    /********************* WHILE **********************************/
    
        int contatore1 = 0;
        while (contatore1 < 10) {
            System.out.println("Count is: " + contatore1);
            contatore1++;
        }

       
        /*********************Do While*******************************/
        int contatore2 = 0;
        do {
            System.out.println("Count is: " + contatore2);
            contatore2++;
        } while (contatore2 < 10);
        
        
        //Continua a chiedere finchè non si mette 0
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Inserisci un numero, 0 per uscire:");           
        } while (s.nextInt()!=0);
        
        
        /***********************Con lettere*************************************/

	char lettera = 'a';
	while (lettera <= 'z') {//posizione nella tabella ascii
		System.out.println(lettera);
		lettera++;
	}    
    
        
        /*************************** For Switch ****************************************/
        int $vocale=0;
	int $consonante=0;
//Esempio switch con tutte le lettere dell'alfabeto.
	for (char $lettera='a';$lettera<='z'; $lettera++){ //a codice 97, z codice 122
	  switch($lettera) {
		case 'a','e','i','o','u':
		  System.out.println($lettera+" è una vocale");
		  $vocale++;
		  break;
		default:
		  System.out.println($lettera+" è una consonante");
		  $consonante++;
		  break;
	  }  
	}
	  System.out.println( "vocali: "+$vocale+ " consonanti:"+ $consonante);
     
         
         /******************** Break & Continue ************************************/
        //Esempio continue;

           for( int $n=1; $n <= 10; $n++ ){

                   if ($n==5){

                           continue;
                   }

                   System.out.println($n); 
           }

        //Esempio break;

           for(int $n=1; $n <= 10; $n++ ){

                   if ($n==5){

                           break;
                   }

                   System.out.println($n); 
           }        
           
          /****************************** CICLO INFINITO**********************************************/         
          while (true){
              System.out.println("inserisci un numero, 0 per uscire: ");

              int numero=s.nextInt();
              System.out.println("hai inserito "+numero);
              if (numero==0){
                  System.out.println("ciao");
                  break;
              }
        }
        ////////////////////////////////////  
        //Ciclo infinito col for
        int val=0;
        for(;;){
            System.out.println(val);
            if (val==10){
                break;
            }
            val++;
        }
        
        
       // **************  FIBONACCI  Da fare come sercizio***************************
     
       int limite = r.nextInt(0,21);//21 perchè estremo sup non incluso
        System.out.println(limite);
        
        //Esempio: 0 1 1 2 3 5
        int num1 = 0;
        int num2 = 1;
        int somma;
        
        for (int i=0; i<limite; i++){
            System.out.print(num1+" ");
            somma = num1 + num2;
            num1 = num2; //si scambiano i valori. Quello che era num1 diventa num2, e num2 diventa la somma.
            num2 = somma;
        }        
        
        
        /////////////////////////////// COL WHILE ///////////////////////////////////
        System.out.println(""); //riga vuota in output tra il for e il while
                
            //Esempio: 0 1 1 2 3 5
            int i=0;

            int numA = 0;
            int numB = 1;
            int tot;

            while(i<limite) {
                System.out.print(numA+" ");
                tot = numA + numB;
                numA = numB; //si scambiano i valori. Quello che era num1 diventa num2, e num2 diventa la somma.
                numB = tot;
                i++;
            }
        
        

    } //Fine main
}//Fine classe
