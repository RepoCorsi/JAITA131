package soluzioneeccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SoluzioneEccezioni {

    static int disponibilita = 10;

    public static void main(String[] args){

//Creare un metodo che faccia la somma di 2 numeri scelti dall'utente.
//Il programma deve controllare che l'input dello scanner sia corretto,
//e deve sollevare una eccezione personalizzata nel caso che uno dei 2 numeri sia zero.
        System.out.println("inserisci 2 numeri");
        Scanner s = new Scanner(System.in);

        try{
            // Chiedi all'utente di inserire due numeri
            System.out.print("Inserisci il primo numero: ");
            int num1 = s.nextInt();

            System.out.print("Inserisci il secondo numero: ");
            int num2 = s.nextInt();

            s.nextLine();//puliamo lo scanner
            
            // Chiamata al metodo di somma
            int risultato = sommaDueNumeri(num1, num2);

            // Stampa il risultato
            System.out.println("La somma dei due numeri è: " + risultato);
        } catch (ZeroInputException e){
            // Gestione dell'eccezione se uno dei numeri è zero
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            // Gestione di altri tipi di errore (ad esempio input non numerici)
            System.out.println("Errore nell'input. Per favore, inserisci numeri validi.");
            s.nextLine();//pulire sempre lo scanner anche quando va in errore!
        }

//----------------------------------------------------------------------------------------------------------
        //Creare un programma che simuli un portamonete.
        //Nel portamonete c'è una quantità fissa di monete.
        //Creare un metodo "preleva" per prelevare dal bancomat e mettere soldi nel portamonete.
        //Creare un metodo "spendi" per far spendere l'utente, con importi scelti a piacere.
        //Se l'utente spende più della disponibilità del portamonete sollevare una eccezione personalizzata.
        preleva(10);
        //aggiungere static int disponibilita = 10; prima del main!!
        System.out.println("hai " + disponibilita + " euro");
        System.out.println("quanto vuoi spendere? ");

        try{
            spendi(s.nextInt());
            s.nextLine();//pulire lo scanner!
            System.out.println("ne rimangono " + disponibilita);
        } catch (InputMismatchException e){
            s.nextLine(); //pulire sempre lo scanner!! Anche quando va in errore!!
            System.out.println("non è un numero");
        } catch (FondiInsufficientiException e){
            s.nextLine();
            System.out.println("Errore "+e.getMessage());
        }

//--------------------------------------------------------------------------------------------------        
        ////////////////////////////////////////////////////////////////////////////
        //Creare un programma che permetta all'utente di scegliere la lunghezza di un array, e successivamente di riempirlo 
        //con dei valori a piacere.
        //Il programma deve continuare ad accettare numeri fino a che l'utente non digita la parola "fine"
        //Gestire l'eccezione in cui l'utente non digiti la parola fine, e metta più valori di quelli ammessi dall'array.
        //In quel caso svuotare l'array e far inserire di nuovo i valori all'utente.
        // Chiediamo all'utente di scegliere la lunghezza dell'array
        System.out.print("Inserisci la lunghezza dell'array: ");
        int lunghezzaArray = s.nextInt();
        s.nextLine(); // Consuma il newline lasciato da nextInt

        // Crea l'array con la lunghezza scelta
        int[] array = new int[lunghezzaArray];

        // indice dell'array
        int indice = 0;

        System.out.println("Inserisci i valori dell'array. Digita 'fine' per terminare.");

        while (true){
            // Chiedi all'utente di inserire un valore o "fine"
            System.out.print("Inserisci un valore (oppure 'fine' per terminare): ");
            String input = s.nextLine();

            // Se l'utente digita "fine", esci dal ciclo
            if (input.equalsIgnoreCase("fine")){
                break;
            }

            // Controlla se l'input è un numero intero
            try{
                int valore = Integer.parseInt(input);

                // Aggiungi il valore all'array
                array[indice] = valore;
                indice++;
            } catch (IndexOutOfBoundsException e){
                // Se l'array è pieno
                System.out.println("Hai inserito più valori di quelli consentiti per l'array!");
                // Svuota l'array e riparti da capo
                array = new int[lunghezzaArray];
                indice = 0;//resettimo l'indice dell'array
                System.out.println("Array resettato. inserisci di nuovo i valori.");
            }

        }//fine while

        // Visualizza i valori finali dell'array
        System.out.println("I valori finali dell'array sono:");
        for (int i = 0; i < indice; i++){
            System.out.println(array[i]);
        }
//-----------------------------------------------------------------------------------------------------

//Creare un metodo che accetti in input una stringa e un numero.
//Chiedere all'utente una stringa e un numero, e ritornare la parte di stringa che va da quel numero(posizione) in poi.
//Se la lunghezza della stringa è minore di 2, sollevare una eccezione personalizzata.
//Se il numero è più grande della lunghezza della stringa sollevare un'altra eccezione personalizzata.
//Sollevare l'eccezione giusta se i tipi di dati inseriti non sono rispettivamente una stringa o un numero.

        System.out.println("Inserisci una stringa e una posizione:");
        String stringa="";
        int posizione=0;
        
        try{
            // Test con tipo di dato errato
            stringa=s.nextLine();
            posizione=s.nextInt();
            System.out.println(estraiParteStringa(stringa, posizione));
        } catch (StringaTroppoCortaException |NumeroTroppoGrandeException | InputMismatchException  e){
            System.err.println("Errore: " + ((e.getMessage()==null)?"tipo errato":e.getMessage()));
        }





    }//fine main

    //////////////////INIZIO METODI PER GLI ESERCIZI///////////////
    
 //---------------------------------------------------------------------------------------------------------------   
    // Metodo che somma i due numeri e lancia un'eccezione se uno dei numeri è zero
     static int sommaDueNumeri(int num1, int num2) throws ZeroInputException,InputMismatchException {
            if (num1 == 0 || num2 == 0) {
                throw new ZeroInputException("Errore: uno dei numeri è zero, non è permesso.");
            }
            return num1 + num2;
    }
     
//----------------------------------------------------------------------------------------------------------------------------
    /////////////////////////////////////////////////////
    static void preleva(int quanto){
        disponibilita += quanto;
    }

    static void spendi(int quanto) throws FondiInsufficientiException{
        if (disponibilita < quanto){
            throw new FondiInsufficientiException("Non hai tutti questi soldi!, ma solo " + disponibilita);
        }
        disponibilita -= quanto;
        System.out.println("Hai speso " + quanto + " euro. Saldo attuale: " + disponibilita);
    }
    
    //--------------------------------------------------------------------------------
    //----------------------ESERCIZIO STRINGA------------------------------------------
    public static String estraiParteStringa(String inputString, int numero) throws StringaTroppoCortaException, NumeroTroppoGrandeException{

//        if (!(inputString instanceof String) || !(numero instanceof Integer)){
//            throw new TipoDatoErratoException("I dati forniti devono essere una stringa e un numero intero.");
//        }

        String str = (String) inputString;
        int posizione = (Integer) numero;
        
        // Verifica se la lunghezza della stringa è inferiore a 2
        if (str.length() < 2){
            throw new StringaTroppoCortaException("La stringa deve essere lunga almeno 2 caratteri.");
        }

        // Verifica se la posizione è maggiore della lunghezza della stringa
        if (posizione > str.length()){
            throw new NumeroTroppoGrandeException("La posizione è troppo grande rispetto alla lunghezza della stringa.");
        }

        // Ritorna la parte della stringa dalla posizione specificata in poi
        return str.substring(posizione);
    }    

}//fine classe

//*************************************** CLASSI ECCEZIONI PERSONALIZZATE *************************************************************
class ZeroInputException extends Exception {

    public ZeroInputException(String message){
        super(message);
    }
}

//----------------------------------------------------------------------------------------

// Eccezione personalizzata per gestione dei fondi insufficienti
class FondiInsufficientiException extends Exception {
    public FondiInsufficientiException(String message) {
        super(message);
    }
}

//----------------------------------------ESERCIZIO STRINGA----------------------------------------------
class StringaTroppoCortaException extends Exception {

    public StringaTroppoCortaException(String message){
        super(message);
    }
}

class NumeroTroppoGrandeException extends Exception {

    public NumeroTroppoGrandeException(String message){
        super(message);
    }
}

class TipoDatoErratoException extends Exception {

    public TipoDatoErratoException(String message){
        super(message);
    }
}