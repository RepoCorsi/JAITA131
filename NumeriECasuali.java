package NumeriECasuali;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class NumeriECasuali {

    public static void main(String[] args) {
        
        /*************** MATH ******************/
        int massimo = Math.max(5, 10);
        int minimo = Math.min(5, 10);
        double radice = Math.sqrt(8);
        double potenza = Math.pow(2, 3);//ritorna un double

        //round toglie i decimali. Arr. per eccesso 5.5-> 6// ritorna un long 5.4->5
        System.out.println(Math.round(5.5)); 

        double numero=3.56432;
        
        //per arrotondare a n cifre dopo la virgola si usa DecimalFormat che va importato.
        DecimalFormat df = new DecimalFormat("0.00");// se metto più zeri delle cifre dopo la virgola, mi aggiunge zero al fondo
        System.out.println(df.format(numero)); //ritorna String, quindi solo per visualizzazione
        
        //oppure usare Math.round che ritorna un numero:
        double v = Math.round(numero * 1000.0) / 1000.0;//gli zeri rappresentano i numeri dopo la virgola. in questo caso 3
        System.out.println(v);
        
        System.out.println(Math.ceil(5.4)); //Valore più alto. Ritorna il prossimo numero -> 6//ritorna un double
        System.out.println(Math.floor(5.8)); //Valore più basso. Ritorna il numero 5 //ritorna un double

       
        
        //Random************************************************
        Random r=new Random();
     
        int casuale=r.nextInt(); //random genera un numero qualsiasi da -2^31 a +2^31. positivo o negativo
        System.out.println(casuale);
        
        int limite=r.nextInt(6); //da 0 a 5, Estremo superiore non compreso. da 0 a n-1
        System.out.println(limite);
        
        int estremi=r.nextInt(2, 11);//da 2 a 10, estremo superiore escluso
        System.out.println(estremi);
        
        int estremoMinimo=r.nextInt(Integer.MIN_VALUE,11);//da -2^31(estremo inferirore degli int) a 10
        System.out.println(estremoMinimo);
        
        //lo stesso con i double
        System.out.println(r.nextDouble(2,11.0));//non arriva a 11 xkè estremi esclusi, ma può arrivare a 10.99
        
        //////////////////////////////////////////////////////////////////
        //oppure metodo vecchio più complicato:
        //aggiungendo +1 abbiamo un numero da 1 a 6 (Se viene zero ritorna 1, se viene 5 ritorna 6)
//        int casVecchio=r.nextInt(6)+1; //da 1 a 6 estremi sempre esclusi
//        System.out.println(casVecchio);
        
        //int casuale = r.nextInt(100)+1;//da 1 a 100. Gli estremi sono sempre esclusi
        
        //formula generale vecchio modo per estremi:
        //int randomEstremi = r.nextInt((superiore-inferiore)+1) + inferiore;
        //int randomEstremi = r.nextInt((20 - 10)+1) + 10; //da 10 a 20
        //System.out.println(randomEstremi);
         
        //con i boolean
        System.out.println(r.nextBoolean());//true o false
        
        //Esiste per tutti tranne che per char e string
        
        ////////////////////////////////////////////////////
        //oppure usare Math.random() che si comporta come il modo vecchio.
        //Ritorna sempre un double. Non accetta parametri in ingresso
        // Math.random() genera un numero casuale tra 0.0 e 0.999
        //Math.random()*5 è un numero tra 0.0 e 4.999

        
        ///////////////////////////////////////////////////////////////////////////
        /************************** Esercizio generatore di Password **************************************************/
        
        int num1=r.nextInt(32,126); //da 31 a 125, I caratteri stampabili della tab ascii
        int num2=r.nextInt(32,126); //da 31 a 125, I caratteri stampabili della tab ascii       
        int num3=r.nextInt(32,126); //da 31 a 125, I caratteri stampabili della tab ascii       
        int num4=r.nextInt(32,126); //da 31 a 125, I caratteri stampabili della tab ascii     
        
        System.out.println("Esercizio Password");
       
        char char1=(char)num1;
        char char2=(char)num2;
        char char3=(char)num3;
        char char4=(char)num4;  
        
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
        System.out.println(char4);        
        
        //importante il "" davanti per farlo interpretare come Stringa, altrimenti fa la somma ascii dei caratteri 
        String password= ""+char1+char2+char3+char4;
        System.out.println("password: "+password);        
        
        
        
        ///////*******ESERCIZIO:************/////////////////////////
        //**********************************************************
// Programma che simula il lancio di due dadi (a sei facce) 
//mostri a schermo il valore del primo dado, quello del secondo ed infine la somma dei due valori.
//dichiarare una variabile booleana che ritorni true se i 2 dadi sono uguali

        int dado1=r.nextInt(1,7); //da 1 a 6, Estremo superiore non compreso. da 0 a n-1
        System.out.println(dado1);
        int dado2=r.nextInt(1,7); //da 1 a 6, Estremo superiore non compreso. da 0 a n-1
        System.out.println(dado2);
        System.out.println("somma= "+(dado1+dado2));
        boolean uguali=dado1==dado2;
        System.out.println("sono uguali? "+uguali);
        
        
        
     ///////*******ESERCIZIO:************/////////////////////////   
// chiede 2 numeri all'utente e questi numeri vengono usati 
//per generare 2 numeri casuali da utilizzare come estremi per generare 1 altro numero casuale

        Scanner s=new Scanner(System.in);
        System.out.println("primo numero");
        int numero1=s.nextInt();
        System.out.println("Secondo numero");
        int numero2=s.nextInt();

        int random1=r.nextInt(numero1)+1;//+1 perchè estremi non compresi
        int random2=r.nextInt(numero2)+1;//+1 perchè estremi non compresi

        int estremi2 = r.nextInt(numero1, numero2+1); //da 2 a 10 

        System.out.println(estremi2+" "+random1+" "+random2);
        
        
    }
}
