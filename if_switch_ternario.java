package if_switch_ternario;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class if_switch_ternario {

    public static void main(String[] args){

        //if .. giocare con if - else -elseif
        //////////////////////////////////////////////////////////////
        Scanner input = new Scanner(System.in);
        int eta;
        // chiedere l'età della persona
        System.out.println("Inserisci la tua età ");
        eta = input.nextInt();

//Operatori di confronto:
        //>  maggiore
        //< minore 
        //>= maggiore uguale
        //<= minore uguale 
        //== uguale
        //!= diverso		
        if (eta >= 18) // se hai almeno 18 anni
        {
            System.out.println("Sei maggiorenne! puoi entrare");
        }else // altrimenti
        {
            System.out.println("Non sei maggiorenne!");
        }
        System.out.println("Grazie per aver usato il nostro servizio ");
        //////////////////////////////////////////////////////////////////////       

        int num = 5;
        if (num > 5){
            System.out.println("maggiore di 5 ");
        }else if (num == 5){
            System.out.println("uguale a 5 ");
        }else{
            System.out.println("minore di 5 ");
        }

        int temperature = 19; //Fare con lo scanner
        if (temperature > 30){
            System.out.println("Fa caldo");
        }else if (temperature < 20){
            System.out.println("Fa freddo.");
        }else{
            System.out.println("Si sta bene");
        }

        //programmino che chiede 2 numeri e li divide.
        int num1, num2;
        System.out.println(" Inserisci due numeri interi :");
        num1 = input.nextInt();
        num2 = input.nextInt();
        // controlla che num2 sia diverso da zero
        // prima di calcolare num1 / num2
        if (num2 == 0){
            System.out.println(" ERRORE : divisione per zero ");
        }else{
            System.out.print(" Quoziente : ");
            System.out.println(num1 / num2);
            System.out.print(" Resto : ");
            System.out.println(num1 % num2); //resto, non risultato, 10%3=1 perchè 3X3==9 e resta 1
        }

        //programmino che mi dice se un numero è pari o dispari
        //pari se il resto della divisione per 2 è ==0 altrimenti dispari
        System.out.println("inserisci un numero");
        double num3 = input.nextDouble();
        input.nextLine();
        if (num3 % 2 == 0){ //resto, non risultato, 10%3=1 perchè 3X3==9 e resta 1
            System.out.println("il numero è pari");
        }else{
            System.out.println("il numero è dispari");
        }

        //Esercizio:
        //gioco dei dadi: se la somma dei due dadi è superiore o uguale a 10 si vince, altrimenti si perde.
        Random r = new Random();
        var valore1 = r.nextInt(1, 7);
        var valore2 = r.nextInt(1, 7);
        var totale = valore1 + valore2;
        System.out.println(totale);
        if (totale > 10){
            System.out.println("hai vinto");
        }else{
            System.out.println("hai perso");
        }

        
      /////////////////////Saluta in base all'ora del giorno////////////////////////
        
        //Calendar calendario = Calendar.getInstance();
        //int orario = calendario.get(Calendar.HOUR_OF_DAY);
        //System.out.println(calendario.getTime()); data di oggi con calendar
        //LocalDate data= LocalDate.now(); data di oggi con localDate
        //int orario=12;
        
        int orario=LocalTime.now().getHour();// Prendiamo l'ora da localTime
        System.out.println(orario);        
        
        String saluto;

        if (orario < 12){
            saluto = "Buon giorno";
        }else if (orario < 18){
            saluto = "Buon Pomeriggio";
        }else if (orario < 22){
            saluto = "Buona sera";
        }else{
            saluto = "Buona notte";
        }

        System.out.println(saluto);

        ///////////////////////////Numero pari di lettere////////////////////////////////////////        
        String stringa = "ciao";
        int lunghezza = stringa.length();

        if ((lunghezza % 2) == 0){
            System.out.println("La parola " + stringa + " ha un numero pari di lettere.");
        }else{
            System.out.println("La parola " + stringa + " ha un numero dispari di lettere");
        }

        int numero = 1;
        char lettera = 'z';

        if (lettera > numero){//true, perchè nel confronto la lettera viene dopo nell'ascii 
            System.out.println("Si, perchè nella tabella ascii la lettera viene dopo ");
        }else{
            System.out.println("no");
        }

        ////////////////////////////////////////////////////////////////////
        //cercare la parola "tutti" in una frase in input dell'utente.
        //Se esiste ritornare la stringa "tutti" e la posizione di "t" e di "i" 
        System.out.println("inserisci una frase");

        String parola3 = input.nextLine();

        if (parola3.contains("tutti")){// contains ritorna booleano
            int posTutti = parola3.indexOf("tutti");

            int posI = parola3.indexOf("i", posTutti + 1);

            String tutti = parola3.substring(posTutti, posI + 1);//+1 perchè estremi non compresi nella substring
            System.out.println(tutti);
        }else{
            System.out.println("tutti non fa parte della stringa");
        }

//////////////////////////////////////////////////////////////////////////////////
        String str1 = "abaco";
        String str2 = "zuzzurellone";

        if (str1.compareTo(str2) > 0){//str1-str2>0  str1 è più grande quindi viene dopo
            System.out.println(str2 + " viene prima in ordine alfabetico");

        }else if (str1.compareTo(str2) < 0){//str1-str2<0 str2 è più grande quindi viene dopo
            System.out.println(str1 + " viene prima in ordine alfabetico");

        }else if (str1.compareTo(str2) == 0){
            System.out.println("Le parole coincidono");
        }

        ////////////////////////////////////////////////
        //Operatori logici: && ||       
        System.out.println("***********OPERATORI LOGICI**********");

        //AND && -> val1 && val2  vero solo se val1 e val2 sono veri 
        //OR  || -> val1 || val2  vero se anche 1 solo è ver		
        System.out.println(10 > 8 && 7 < 6);//false
        System.out.println(9 > 5 && 5 == 5);//true
        System.out.println(6 == 6 && 1 > 4);//false
        System.out.println(10 > 8 || 7 < 6);//true
        System.out.println(4 < 3 || 7 > 9);//false

        ///////////////////////////
        boolean sole = true;
        int temperatura = 25;
        //voglio uscire se c'è il sole e una temperatura maggiore di 20 gradi
        if (sole && temperatura > 20){
            System.out.println("esco");
        }else{
            System.out.println("sto a casa");
        }

        int voto1 = 6;
        int voto2 = 5;
        int voto3 = 10;

        //La AND HA PRIORITA' SULLA OR
        if (voto1 >= 6 || (voto2 >= 6 && voto3 >= 6)){//vero 
            System.out.println("promosso");
        }else{
            System.out.println("bocciato");
        }

        //////////////////// //Controllo di ore e minuti////////////////////////////////////////        
        //int ore = 0, minuti = 0;
        System.out.println(" Inserire ore e minuti :");
        int ore = input.nextInt();
        int minuti = input.nextInt();
        if (ore < 0){
            System.out.println(" Non e’ un orario ");
        }else if (ore > 23){
            System.out.println(" Non e’ un orario ");
        }else if (minuti < 0){
            System.out.println(" Non e’ un orario ");
        }else if (minuti > 59){
            System.out.println(" Non e’ un orario ");
        }else{
            System.out.println("E’ un orario ");
        }

        //////////// SI PUò SCRIVERE PIU COMODAMENTE ANCHE IN QUESTI MODI:
        if (ore < 0 || ore > 23 || minuti < 0 || minuti > 59){
            System.out.println(" Non e’ un orario ");
        }else{
            System.out.println("E’ un orario ");
        }
        //..............................................................
        boolean ore_ok = (ore >= 0 && ore < 24);
        boolean minuti_ok = (minuti >= 0 && minuti < 60);
        if (ore_ok && minuti_ok){
            System.out.println("E’ un orario ");
        }else{
            System.out.println(" Non e’ un orario ");
        }
        
        //Altro esempio://///////////////
//        int n = 3;
        /*
         * Programma che scrive
         * 
         * "Il colore è Giallo" se il numero è dispari tra questi: 3 5 7 9 11 13 15
         * 
         * "Il colore è Rosso" se il numero è pari, tra questi, ma non 12:  4 6 8 10 14 16 18
         *
         * "Il colore è blu" in tutti gli altri casi
         */

        /* "Il colore è Giallo" se il numero è dispari tra questi: 3 5 7 9 11 13 15 */
//        boolean intervallo1 = n % 2 == 1 && //Dispari
//                              n >= 3 && n <= 15; //range
//        if (intervallo1){
//            System.out.println("Il colore è Giallo");
//        }
//
//        /* "Il colore è Rosso" se il numero è pari, tra questi, 4 6 8 10 14 16 18  ma non 12:  */
//        boolean intervallo2 = n % 2 == 0 && //Pari
//                              n >= 4 && n <= 18 &&  //range
//                              n != 12; //escludo il 12
//        
//        if (intervallo2 && !intervallo1){
//            System.out.println("Il colore è Rosso");
//        }
//
//        if (!intervallo1 && !intervallo2){
//            System.out.println("Il colore è Blu");
//        }    
        
        //.................................................................
        ////////////////////////////////////////////////////////        

        /**
         * ****************** TERNARIO ***************************
         */
        //operatore ternario perchè ha 3 elementi
        //1° condizione
        //2° ? cosa fare se vero
        //3° : cosa fare se falso	
        int $voto = 8;
        System.out.println($voto >= 6 ? "promosso" : "bocciato");

        //Stesso esempio con if
        if ($voto >= 6){
            System.out.println("promosso");
        }else{
            System.out.println("boccciato");
        }

        int $altezza = 175;
        //Operatore ternario
        String $tipologia = ($altezza >= 180) ? "alto" : "normale";
        System.out.println($tipologia);

        //Stesso esempio con if	
        if ($altezza >= 180){
            $tipologia = "alto";
        }else{
            $tipologia = "normale";
        }

        System.out.println($tipologia);

        //Fare esercizio ternario massimo tra 2 numeri
        //ternario max:
        int $a = 10;
        int $b = 20;

        int $max = ($a > $b) ? $a : $b;

        System.out.println("Il maggiore tra " + $a + " e " + $b + "  è: " + $max);

        //Gestione del caso di numeri uguali
        //nel ramo falso : si mette l'altra condizione(else if)
        int maxOUguali = ($a > $b) ? $a : ($a == $b) ? -1 : $a; //-1 velore fittizio in caso di uguali
        System.out.println(maxOUguali
        );

        //oppure con le stringhe
        String $maxUguale = ($a > $b) ? "Il più grande è " + $a : ($a == $b) ? "i numeri sono uguali" : "Il più grande è " + $b;
        System.out.println($maxUguale);

        //CON 3 VALORI
        int $c = 5;

        int $max3 = ($a > $b && $a > $c) ? $a : ($b > $c) ? $b : $c;

        System.out.println("Il maggiore tra " + $a + " " + $b + " " + $c + "  è: " + $max3);

        /**
         * **************** SWITCH *************************
         */
        //Deve essere char, String, byte, short, or int. NO boolean, float, double.
        int $i = 3;
        switch ($i){
            case 0:
                System.out.println("i è uguale a 0");
                break;
            case 1:
                System.out.println("i è uguale a 1");
                break;
            case 2:
                System.out.println("i è uguale a 2");
                break;
            default:
                System.out.println("i è diverso da 0, 1 o 2");
        }

        //Giorno della settimana
        //int giorno = calendario.get(Calendar.DAY_OF_WEEK);//parte da 1=domenica
        int giorno= LocalDate.now().getDayOfWeek().getValue();//il numero del giorno
        System.out.println(giorno);                           //Parte da 1 lunedì
        switch (giorno){
            case 1:
                System.out.println("Oggi è Lunedì");
                break;
            case 2:
                System.out.println("Oggi è Martedì");
                break;
            case 3:
                System.out.println("Oggi è Mercoledì");
                break;
            case 4:
                System.out.println("Oggi è Giovedì");
                break;
            case 5:
                System.out.println("Oggi è Venerdì");
                break;
            case 6:
                System.out.println("Oggi è Sabato");
                break;
            case 7:
                System.out.println("Oggi è Domenica");
                break;
            default:
                System.out.println("Errore nella data");
                break;
        }

        //Switch sequenziali
        String $lettera = "i";
        String messaggio;
        switch ($lettera){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                messaggio = $lettera + " è una vocale";
                break;
            default:
                messaggio = $lettera + " è una consonante";
                break;
        }

        System.out.println(messaggio);

        /**
         * ***********************************************************************
         */
        //Altro modo per scrivere lo switch sequenziale da java 14 in poi:
        //con la -> e senza break. La -> comprende anche il break
        switch ($lettera){
            case "a", "e","i","o","u" -> messaggio = $lettera + " è una vocale";
            default -> messaggio = $lettera + " è una consonante";
        }
        System.out.println(messaggio);

        //Ulteriore semplificazione, Assegnando la variabile messaggio come risultato dello switch
        messaggio = switch ($lettera){
                        case "a", "e","i","o","u" -> $lettera + " è una vocale";
                        default -> $lettera + " è una consonante";
                    };
        System.out.println(messaggio);

        
        //Far fare esercizi if
        /**
         * ***********************SOLUZIONI * IF***********************************
         */
        //Dati 2 numeri da tastiera:
        //Stampa "1" se A è uguale a B, 
        //stampa "2" se A è maggiore di B, 
        //altrimenti stampa "3".

        System.out.println("inserisci il primo numero:");
        int primo = input.nextInt();
        System.out.println("inserisci il secondo numero:");
        int secondo = input.nextInt();
        if (primo == secondo){
            System.out.println("1");
        }else if (primo > secondo){
            System.out.println("2");
        }else{
            System.out.println("3");
        }

        //------------------------------------------------------------------
        //Dato un numero da tastiera,  verificare se contiene un valore pari o dispari,  
        //poi dire se è positivo o negativo.
    
        System.out.println("inserisci numero positivo o negativo:");
        int val = input.nextInt();

        if (val % 2 == 0){
            System.out.print("Pari e ");
        }else{
            System.out.print("Dispari e ");
        }

        if (val < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Positivo");
        }

        //-------------------------------------------------------------
        //Scrivere un programma che chieda 2 numeri interi A e B in input.
        //Se B è pari scambia il valore delle variabili, altrimenti li somma.
        System.out.println("inserisci il primo numero:");
        int a = input.nextInt();
        System.out.println("inserisci il secondo numero:");
        int b = input.nextInt();

        if (b % 2 == 0){
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a= " + a + " b= " + b);
        }else{
            System.out.println("a+b= " + (a + b));
        }

        /**
         * ********************* BMI ************************************
         * Si scriva un programma che dati peso e altezza calcola il BMI 
         * e indichi se la persona è nella norma, sovrappeso o sottopeso.
         * BMI = peso / (Altezza * Altezza) (altezza in metri)
         * Un BMI da 20 a 25 è considerato “nella norma”.
         */
        System.out.print("Inserisci il tuo peso in chilogrammi: ");
        double peso = input.nextDouble();

        System.out.print("Inserisci la tua altezza in metri: ");
        double altezza = input.nextDouble();

        double bmi = peso / (altezza * altezza);
        System.out.println("Il tuo BMI è: " + bmi);

        if (bmi >= 20 && bmi <= 25){
            System.out.println("Sei nella norma.");
        }else if (bmi < 20){
            System.out.println("Sei sottopeso.");
        }else{
            System.out.println("Sei in sovrappeso.");
        }

         /* ********** Numero pari di lettere********
         * Scrivere un programma che visualizzi se una parola ha un numero di lettere pari o dispari.
         * Poi dire se il numero di lettere è maggiore, minore o uguale ad un numero casuale 
         * che va da 1 a 10.
         */
        Random rand = new Random();
        String stringaTest = "ciao";
        int lungh = stringaTest.length();
        int numCas = rand.nextInt(1, 11);
        System.out.println("parola: " + stringaTest + " numero lettere: " + lungh + " numero casuale: " + numCas);

        if (lungh % 2 == 0){
            System.out.println("La parola ha un numero pari di lettere");
        }else{
            System.out.println("La parola ha un numero dispari di lettere");
        }

        if (lungh > numCas){
            System.out.println("il numero di lettere è più grande del numero casuale");
        }else if (lungh < numCas){
            System.out.println("il numero di lettere è più piccolo del numero casuale");
        }else{
            System.out.println("il numero di lettere è uguale al numero casuale");
        }
        
        //------------------------------------------------
        //Settimo esercizio delle slide
        boolean passato = false;
        System.out.println("inserisci il voto(in 30esimi):");
        int voto = input.nextInt();
        if (voto < 0 || voto > 30){
            System.out.println("numero errato");
        }else if (voto >= 0 && voto <= 17){
            System.out.println("Esame non superato");
        }else if (voto >= 18 || voto <= 24){
            System.out.println("Giudizio:sufficiente");
            passato = true;
        }else if (voto >= 25 || voto <= 30){
            passato = true;
            System.out.println("Giudizio: buono");
        }

        if (passato){
            System.out.println("vuoi registrare il voto? 0=no/1=si");
            int registra = input.nextInt();
            if (registra == 0){
                System.out.println("voto rifiutato");
            }else if (registra == 1){
                System.out.println("voto accettato");
            }else{
                System.out.println("scelta non valida");
            }
        }

//*****************************Morra cinese Carta forbice sasso*********************************
        Scanner s = new Scanner(System.in);
        Random r2 = new Random();

        int numeroPc = r2.nextInt(0, 3);

        String computer;

        if (numeroPc == 0){
            computer = "f";
        }else if (numeroPc == 1){
            computer = "s";
        }else{
            computer = "c";
        }

        System.out.println("inserisci f,s,c");

        String giocatore = s.nextLine().toLowerCase();

        System.out.println("tu: " + giocatore + " pc:" + computer);

        boolean vincita = giocatore.equals("s") && computer.equals("f")
                       || giocatore.equals("f") && computer.equals("c")
                       || giocatore.equals("c") && computer.equals("s");

        if (computer.equals(giocatore)){
            System.out.println("parità");
        }else if (vincita){
            System.out.println("hai vinto");
        }else{
            System.out.println("hai perso");
        }
//***********************************************************************************       

        //Chiede 3 numeri e stampa il maggiore
        System.out.println("inserisci 3 numeri: ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("il maggiore è " + numero1);
        }else if (numero2 > numero3){
            System.out.println("il maggiore è " + numero2);
        }else{
            System.out.println("il maggiore è " + numero3);
        }

        //oppure col max
        int max2 = Math.max(numero1, numero2);
        int max3 = Math.max(max2, numero3);
        System.out.println(max3);

        //int max=Math.max(Math.max(numero1, numero2),numero3);
        //System.out.println(max);

        //ordina 3 valori:
        /*Scanner s = new Scanner(System.in);
        int first,second,third;

        System.out.println("inserisci il primo numero:");        
        int uno = s.nextInt();
        first = uno;

        System.out.println("inserisci il secondo numero:");        
        int due = s.nextInt();
        second = due;
        if (due < first){//se il secondo numero è più piccolo del primo, si scambiano di posizione:
            first = due;//il due diventa il primo. first prende il valore di due
            second = uno;//l'uno diventa il secondo. second prende il valore di uno
        }

        System.out.println("inserisci il terzo numero:");        
        int tre = s.nextInt();
        third = tre;
        if (tre < first){//Se il terzo numero è più piccolo del primo, scalano tutti di 1 posizione:
            third = second;//quello che era secondo diventa terzo.third prende il valore del secondo.            
            second = first;//quello che era primo diventa secondo. Second prende il valore del primo.
            first = tre;//e il terzo numero diventa il primo
        }else if (tre < second){//Se il terzo è più piccolo del secondo, si scambiano di posizione
            third = second;
            second = tre;
        }

        System.out.println(first + " " + second + " " + third);
         */
        /////////Altro metodo più semplice con la classe Math////
        /*int uno=s.nextInt();
        int due=s.nextInt();
        int tre=s.nextInt();

        int max=Math.max(Math.max(uno, due),tre);
        int min=Math.min(Math.min(uno, due),tre);
        int mezzo=uno+due+tre-min-max;//Dal totale togliamo il minimo e il massimo, e rimane quello di mezzo
        
        System.out.println(min+" "+mezzo+" "+max);*/
        
        /************************************************************************
         * ************Continuare con esercizi switch*************************************
         */        
        
        /////////////////////////////////////////////////////////////////////
        //Esercizio calcolatrice:
        //Lo Switch gestisce char, String, byte, short, or int. NO boolean, float, double.
        System.out.println("primo numero:");
        int primonumero = input.nextInt();
        System.out.println("secondo numero:");
        int secondonumero = input.nextInt();
        input.nextLine();//per pulire lo scanner dal carattere \n non letto dal nextInt()
        System.out.println("operazione:");
        String operazione = input.nextLine();
        int risultato;

        switch (operazione){
            case "+":
                risultato = primonumero + secondonumero;
                System.out.println(primonumero + " + " + secondonumero + "= " + risultato);
                break;
            case "-":
                risultato = primonumero - secondonumero;
                System.out.println(primonumero + " - " + secondonumero + "= " + risultato);
                break;
            case "*":
                risultato = primonumero * secondonumero;
                System.out.println(primonumero + " * " + secondonumero + "= " + risultato);
                break;
            case "/":
                if (secondonumero == 0){
                    System.out.println("non puoi dividere per zero");
                }else{
                    risultato = primonumero / secondonumero;
                    System.out.println(primonumero + " / " + secondonumero + "= " + risultato);
                }
        }
        /*        
            Realizzare con uno switch un programma che dato il nome del mese restituisca il numero dei giorni.
            Esempio output:
                Mese: Febbraio
                Febbraio ha 28 giorni.
        
                Mese:Marzo
                Marzo ha 31 giorni.
         */
        //soluzione switch mese-giorni:

        System.out.print("Inserisci il nome del mese: ");
        String mese = s.nextLine().toLowerCase();
        int numeroGiorni=0;
        switch (mese){
            case "novembre":
            case "aprile":
            case "giugno":
            case "settembre":
                numeroGiorni=30;
                break;             
            case "febbraio"://gestione bisestile
                System.out.print("Inserisci l'anno: ");
                int anno = s.nextInt();
                //ogni 4 anni, ogni 400 e non divisibili per 100
                if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)){
                    numeroGiorni = 29;  // Anno bisestile
                }else{
                    numeroGiorni = 28;
                }
                break;
            default: //tutti gli altri ne hanno 31
                numeroGiorni = 31;
//                break;                   
//                System.out.println("Mese non valido!");
//                return; //interrompe l'esecuzione del codice. Non fa andare al successivo println
        }
        
        System.out.println(mese + " ha " + numeroGiorni+" giorni");        

        //oppure con la freccia:      
        switch (mese){
            case "novembre","aprile","giugno","settembre" ->
                System.out.println(mese + " ha 30 giorni");
            case "febbraio" ->
                System.out.println(mese + " ha 28 giorni ");
            default ->
                System.out.println(mese + " ha 31 giorni ");
        }

        //con la variabile prima dello switch
        String giorni = switch (mese){
                            case "novembre","aprile","giugno","settembre" ->
                                mese + " ha 30 giorni";
                            case "febbraio" ->
                                mese + " ha 28 giorni";
                            default ->//OBBLIGATORIO il default, perchè dobbiamo dare cmq un valore alla var. giorni
                                mese + " ha 31 giorni";
        }; //OBBLIGATORIO il ; finale perchè stiamo dando un valore alla variabile giorni

        System.out.println(giorni);

        //al contrario: Dato i giorni restituisce il mese.
        int nGiorni = 31;
        switch (nGiorni){
            case 30:
                System.out.println("novembre, aprile, giugno, settembre");
                break;
            case 31:
                System.out.println("gennaio, marzo, maggio, luglio, agosto, ottobre, dicembre");
                break;
            default:
                System.out.println("febbraio");
        }

        ////////////////////////////////////////////////////
        //fare l'esercizio dell'immagine .png
        //Soluzione esercizio dell'immagine .png
        String colore = "rosso";
        switch (colore){
            case "blu":
                System.out.println("Il colore selezionato è blu");
                break;
            case "giallo":
                System.out.println("Il colore selezionato è giallo");
                break;
            case "verde":
                System.out.println("Il colore selezionato è verde");
                break;
            case "rosso":
                System.out.println("Il colore selezionato è rosso");
                break;
            case "arancione":
                System.out.println("Il colore selezionato è arancione");
                break;
            default:
                System.out.println("Nessun colore corrispondente alla tua selezione");
                break;
        }

    }

}
