package soluzioniCicli;

import java.util.Random;
import java.util.Scanner;

public class SoluzioniCicli {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        //Esercizio 3: ********************* OK
        //------------------------------------------------------------------------------------------------------------
        //Chiede di inserire un numero maggiore di zero e stampa tutti i numeri da 0 fino al numero inserito
        //se il valore è negativo stampa un errore.
        
        /*int numero;
            System.out.println("inserisci un numero:");
            numero=input.nextInt();
            if (numero<0){
                System.out.println("errore! numero negativo");
            }
            for (int i=0; i<=numero;i++) {
                System.out.println(i);
            }*/

        
        //Esercizio 4: ****** ASTERISCHI:*****************
//        System.out.println("inserisci il numero di righe: ");
//        int numRighe=input.nextInt();
//
//        for (int i =0; i <numRighe; i++) {
//
//            for (int x=0; x<=i; x++){
//                System.out.print("*");//print non va a capo, così li stampa in fila *******
//            }
//
//            System.out.println(); //va a capo dopo ogni fila di asterischi
//        }        
//        


////////////// Inserisce i numeri finchè non si mette 0/////////////////////////////////////////        
//        int y;
//        do{
//            System.out.println("inserisci un numero ");
//            y = input.nextInt();
//            System.out.println("hai inserito " + y);
//        } while (y != 0);

//        int x = 1;
//        while (x != 0){
//            System.out.println("inserisci un numero ");
//            x = s.nextInt();
//            System.out.println("hai inserito " + x);
//        }

/////////////////////////// Stesso esempio col for ///////////////////////////////////////////
//        for (int numero = 1; numero != 0;){
//            System.out.print("Inserisci un numero intero: ");
//            numero = s.nextInt();
//        }
//
//        System.out.println("Hai inserito 0. Il programma termina.");
//////////////////////////////////////////////////////////////////////////////////


        //Esercizio 5: OK
        //*********CHIEDE QUANTI NUMERI VUOI SOMMARE E NE FA LA SOMMA************
        /*int somma=0;
        System.out.println("quanti numeri vuoi sommare?");
        int numeri=input.nextInt();
        for (int i = 1; i <=numeri ; i++) {
            System.out.println("inserisci il numero "+i);
            int num=input.nextInt();
            somma+=num;
        }
        System.out.println("la somma è "+somma);
         */
        
        
        //Esercizio 6: OK
        //******** Visualizzare nell'intervallo da 0 ad un numero casuale (da 0 a n): *************
        //QUANTI PARI, QUANTI DISPARI *************
        /*int dispari=0;
        int pari=0;

        int n=r.nextInt(101);

        //int a=0;
        //while (a<=n){
        //
        //    if(a%2==0){
        //        pari++;
        //    } else{
        //        dispari++;
        //    }
        //
        //    a++;
        //}

        for (int i = 0; i <=n ; i++) {
            if(i%2==0){
                pari++;
            } else{
                dispari++;
            }
        }

        System.out.println("numero casuale: "+n);
        System.out.println("Nell'intervallo tra 0 e "+n+ " ci sono: "+pari+" pari e "+dispari+" dispari");
         */
        
        
        /*Esercizio 8: Visualizzare, in un elenco di numeri da 1 a 10 solo i numeri dispari.
                        Uscire dal loop quando il valore è uguale a 7.
        *********************  /*
            for(int i=1; i <= 10; i++ ){

                if (i%2==0){

                    continue;
                }

                if (i==7){

                    break;
                }

                System.out.println(i);
            }
         */
        
        
        //Esercizio 9: ********* CERCA NUMERO CASUALE ************
        /*boolean trovato=false;
        //int randomEstremi = r.nextInt((superiore-inferiore)+1) + inferiore;
        //int casuale = r.nextInt(20)+1;//da 1 a 20.
        int casuale = r.nextInt(1,21);
        System.out.println("il numero casuale è: "+casuale);
        for(int i = 1; i <= 10; i++){
            if(casuale==i){
                trovato=true;
                break;
            }
        }
        //System.out.println(trovato?"il numero "+casuale+" è stato trovato":"il numero "+casuale+" non è stato trovato");
        String ris = trovato?"il numero "+casuale+"  è stato trovato":"il numero "+casuale+ " non è stato trovato";
        System.out.println(ris);
         */
        
        
        //Esercizio 12: *******************
        /*String frase="tanto va la gatta al lardo...";

        for(int i=0;i<frase.length(); i++){

            if(frase.charAt(i)==' '){
                System.out.println();
                continue; //Saltiamo lo spazio, per evitare di stampare lo spazio tra una lettera e l'altra
            }
            System.out.print(frase.charAt(i));
        }*/
        
        
        //Esercizio 13: ****** AL CONTRARIO *************
        /*String frase="tanto va la gatta al lardo...";
        String contrario="";
        for(int i=frase.length()-1;i>=0; i--){
            contrario+=frase.charAt(i);
        }
        System.out.println(contrario);
         */
        
        
        //Esercizio 17: ******* CONTA SPAZI ************
//        String frase="tanto va la gatta al lardo...";
//        int numeroSpazi=0;
//        for(int i=0;i<frase.length(); i++){
//
//            if(frase.charAt(i)==' '){
//                numeroSpazi++;
//            }
//        }
//        System.out.println(numeroSpazi);


        //Esercizio 19: OK
        //*******INDOVINA IL NUMERO MISTERIOSO DA TROVARE**************
//       int NumMisterioso=r.nextInt(11);//da 0 a 10
//        for (int i = 10; i >0; i--) {
//            System.out.println("inserisci il numero misterioso");
//            int indovina=input.nextInt();
//            if (indovina==NumMisterioso){
//                System.out.println("indovinato! con "+(i+1) +" tentativi");
//                break;
//            }else {
//                System.out.println("Sbagliato!");
//                if (NumMisterioso < indovina) {
//                    System.out.println("il numero misterioso è più piccolo. Rimangono "+(i-1)+" tentativi");
//                } else {
//                    System.out.println("il numero misterioso è più grande. Rimangono "+(i-1)+" tentativi");
//                }
//            }
//        }


     // Esercizio 11: ok
     //********* Gioco dei DADI ***********
//        int puntiA = 30;
//        int puntiB = 30;
//
//        while (puntiA >0 && puntiB > 0){
//            int dadoA = r.nextInt(1, 7);
//            int dadoB = r.nextInt(1, 7);
//            
//            System.out.println("dadoA= "+dadoA+" dadoB= "+dadoB);
//            
//            if (dadoA>dadoB){
//                puntiB-=dadoA;
//                System.out.print("Vince A. ");
//            }else if (dadoB>dadoA){
//                puntiA-=dadoB;
//                System.out.print("Vince B ");
//            }
//            System.out.println("PuntiA "+puntiA+" puntiB= "+puntiB);
//            if (puntiA <=0){
//                System.out.println("Vince B");
//            }else if (puntiB <=0){
//                System.out.println("Vince A");
//            }
//        }


        //Esercizio 12: 
        //********* CARAMELLE **********
//        int caramelle = 50; // caramelle in magazzino
//        final double PREZZO = 0.5; // prezzo singola caramella in euro
//        while (caramelle > 0){ // fintanto che non ho esaurito le caramelle
//            System.out.println("Sono disponibili " + caramelle + " caramelle");
//            System.out.println("Quante ne vuoi comprare ?");
//            int num = input.nextInt();
//            if (num < 0){ // controlla l’input            
//                System.out.println(" Numero errato ");
//            }else{
//                if (num > caramelle){
//                    num = caramelle;
//                    System.out.println("Hai chiesto troppe caramelle");
//                    System.out.println("Te ne darò soltanto " + num);
//                }
//                caramelle -= num; // preleva le caramelle dal magazzino
//                System.out.println("Costo: " + (num * PREZZO) + " euro");
//            }
//        }
//        // a questo punto il ciclo e’ terminato
//        // cioe ’ le caramelle sono esaurite (caramelle <=0)
//        System.out.println("CARAMELLE TERMINATE !");


        //Esercizio 12: *******************
//        String frase="tanto va la gatta al lardo...";
//        String pari="";
//        String dispari ="";
//        for(int i=0;i<frase.length(); i++){
//
//            if (frase.charAt(i)==' '){
//                continue;
//            }
//
//            if(i%2==0){
//                pari+=frase.charAt(i);
//            }else{
//                dispari+=frase.charAt(i);
//            }
//        }
//
//        System.out.println(pari);
//        System.out.println(dispari);


        // **************  FIBONACCI  ***************************
//       int limite = r.nextInt(0,21);//21 perchè estremo sup non incluso
//        System.out.println(limite);
//        
//        //Esempio: 0 1 1 2 3 5
//        int num1 = 0;
//        int num2 = 1;
//        int somma;
//        
//        for (int i=0; i<limite; i++){
//            System.out.print(num1+" ");
//            somma = num1 + num2;
//            num1 = num2; //si scambiano i valori. Quello che era num1 diventa num2, e num2 diventa la somma.
//            num2 = somma;
//        }   


        /////////////////////////////// COL WHILE ///////////////////////////////////
//        System.out.println(""); //riga vuota in output tra il for e il while
//                
//            int i=0;
//
//            int numA = 0;
//            int numB = 1;
//            int tot;
//
//            while(i<limite) {
//                System.out.print(numA+" ");
//                tot = numA + numB;
//                numA = numB; //si scambiano i valori. Quello che era num1 diventa num2, e num2 diventa la somma.
//                numB = tot;
//                i++;
//            }


    }

}
