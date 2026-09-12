package inpututente;

import java.util.Scanner;

public class InputUtente {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); 

        //Si possono usare tutti i tipi di dato:
        // String,int,long,double,float,short,byte,boolean

        //NO CHAR!
        
        //Per char si fa:  char c = input.next().charAt(0);        
        
        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("How old are you? ");
        int age = input.nextInt();
        input.nextLine();//pulire lo scanner dal caratter \n che arriva dopo l'inserimento del numero
        
        System.out.println("Quanto sei alto?");
        double altezza = input.nextDouble(); //NELLA CONSOLE SI METTE LA VIRGOLA NON IL PUNTO!
        input.nextLine();//pulire lo scanner dal caratter \n che arriva dopo l'inserimento del numero

        System.out.println("What is your favorite food?");
        String food = input.nextLine();
        
        System.out.println("Ti piace la programmazione? (true/false)");
        boolean piace = input.nextBoolean();        

        System.out.println("Qual è la tua lettera preferita? (char)");
        char iniziale = input.next().charAt(0);        
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
        System.out.println("Altezza "+altezza);
        System.out.println("Ti piace la programmazione: " + piace);
        System.out.println("Iniziale preferita: " + iniziale);               
        
        //input.close(); //NO!!!
        //Lo scanner non va chiuso nel caso di System.in .Si chiude solo quando leggo risorse esterne come file, db....
        //Se si chiude col System.in, poi non si può più riaprire!! 
        
        //************************************************************************        
        //PARLARE DI SCANNER.NEXT CHE ACCETTA UNA SOLA PAROLA SENZA SPAZI!!!
        //************************************************************************           
        
        //----------------------- ESERCIZI SCANNER: --------------------------------------
             
        //Chiedere all'utente una temperatura in °C e convertirla in °Kelvin
        //formula °k=°c+273.15

        Scanner s = new Scanner(System.in);  
        
        System.out.println("Inserisci la temperatura da convertire:");
        //**ATTENZIONE!! nella console va inserito 3,5 e NON 3.5 Altrimenti da errore***
        double temp=s.nextDouble(); 
        System.out.println("la temp in ° kelvin è "+(temp+273.15));        
        
        
        
        //---------- ESERCIZIO --------------------------
        
        //Scrivere un programma che chiede all'utente 2 numeri con la virgola, 
        //li somma e stampa il risultato come numero intero:
        //Es: Inserisci 2 numeri con la virgola:
        //3.6   4.6 il risultato è 8
            
        System.out.println("inserisci il primo numero con la virgola");
        double num1=s.nextDouble();
        System.out.println("inserisci il secondo numero con la virgola");
        double num2=s.nextDouble();
        int ris=(int)(num1+num2);//cast per convertire a numero intero
        System.out.println("la somma è: "+ris);
        
        
        //----------------------- Esercizio 5-----------------------------------------
                
   // chiede all'utente 4 numeri e ne calcola la somma con 2 VARIABILi oltre lo scanner      
        
        int totale = 0, valore;
        
        System.out.println("inserisci il primo numero");
        //non c'è bisogno di pulire lo scanner perchè uso solo nextInt che accetta solo numeri.
        //L'invio si perde nell'aria
        valore = s.nextInt(); 

        totale += valore;

        System.out.println("inserisci il secondo numero");
        valore = s.nextInt();

        totale += valore;

        System.out.println("inserisci il terzo numero");
        valore = s.nextInt();

        totale += valore;

        System.out.println("inserisci il quarto numero");
        valore = s.nextInt();

        totale += valore;

        System.out.println("totale= " + totale);
        
  ///////////////////////////////////////////////////////////////////      
        //con 1 SOLA VARIABILE
        int tot=0;
        System.out.println("inserisci il primo numero");
        tot+= s.nextInt();
        System.out.println("inserisci il secondo numero");
        tot+= s.nextInt();
        System.out.println("inserisci il terzo numero");
        tot+= s.nextInt();   
        System.out.println("inserisci il quarto numero");
        tot+= s.nextInt();
        System.out.println(tot);          

    
///////////////////// ESERCIZIO //////////////////////////////////////////////
// Chiede all'utente un numero con la virgola che rappresenta il tempo espresso in ore(3.5= 3 ore e mezza) 
//e stampa il tempo espresso in minuti(210 = 3.5*60)
//il risultato deve essere un numero intero, quindi 210 e non 210.0
      
        System.out.println("inserisci le ore");
        
        //**ATTENZIONE!! nella console va inserito 3,5 e NON 3.5 Altrimenti da errore***
        double ore=s.nextDouble();
    
        int minuti=(int)(ore*60);
                
        System.out.println("minuti= "+minuti);        
           
    }

}
