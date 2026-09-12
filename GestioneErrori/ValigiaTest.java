package valigiatest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ValigiaTest {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int capacitaMassima;
        double pesoMassimo;

        System.out.println("Imposta la capacità massima della valigia:");
        capacitaMassima = scanner.nextInt();

        System.out.println("Imposta il peso massimo della valigia:");
        pesoMassimo = scanner.nextDouble();

        //creiamo la valigia impostando il numero max di oggetti e il peso max
        Valigia valigia = new Valigia(capacitaMassima, pesoMassimo);

        int scelta = 0;

        while (scelta != 5){ //Esce quando si mette 5
            System.out.println("\nMenù:");
            System.out.println("1. Elencare gli oggetti presenti nella valigia");
            System.out.println("2. Inserire un oggetto nella valigia");
            System.out.println("3. Eliminare un oggetto dalla valigia");
            System.out.println("4. Trovare l'oggetto più pesante");
            System.out.println("5. Uscire");

            try{
                scelta = scanner.nextInt();

                switch (scelta){
                    case 1: //elenco
                        valigia.elencaOggetti();
                        break;
                    case 2: //inserisci
                        System.out.println("Inserisci il nome dell'oggetto:");
                        String nomeOggetto = scanner.next();
                        System.out.println("Inserisci il peso dell'oggetto:");
                        double pesoOggetto = scanner.nextDouble();
                        valigia.inserisciOggetto(nomeOggetto, pesoOggetto);
                        break;
                    case 3://elimina
                        valigia.togliOggetto();
                        break;
                    case 4://più pesante
                        Oggetto oggettoPiuPesante = valigia.oggettoPiuPesante();
                        System.out.println("L'oggetto più pesante è: " + oggettoPiuPesante.getNome() + " - Peso: " + oggettoPiuPesante.getPeso());
                        break;
                    case 5://uscita
                        System.out.println("Programma terminato.");
                        break;
                    default://default
                        System.out.println("Scelta non valida. Riprova.");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Input non valido. Riprova.");
                scanner.nextLine(); // pulisce l'invio
            } catch (ValigiaPienaException | PesoSuperatoException | ValigiaVuotaException e){
                System.out.println(e.getMessage());
            }
        }
        
        
        
    }
}

/*
*********************************** OGGETTO ******************************
*/
class Oggetto {

    private String nome;
    private double peso;

    public Oggetto(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public double getPeso(){
        return peso;
    }
}

/*
**************************************** Valigia *********************************************
*/
class Valigia {
   
    private ArrayList<Oggetto> oggetti=new ArrayList();
    
    private int capacitaMassima;
    private double pesoMassimo;
    
    //metodo statico per tutta la classe per controllare il peso
    private static int pesoAttuale=0;    

    public Valigia(int capacitaMassima, double pesoMassimo){
        this.capacitaMassima = capacitaMassima;
        this.pesoMassimo = pesoMassimo;
    }

    public void elencaOggetti(){
        if (oggetti.isEmpty()){
            System.out.println("La valigia è vuota.");
        }else{
            System.out.println("Oggetti nella valigia:");
            for (Oggetto oggetto : oggetti){
                System.out.println(oggetto.getNome() + " - Peso: " + oggetto.getPeso());
            }
        }
        System.out.println("peso totale: "+pesoAttuale);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////
    public void inserisciOggetto(String nome, double peso) throws ValigiaPienaException, PesoSuperatoException{
        if (oggetti.size() >= capacitaMassima){
            throw new ValigiaPienaException();
        }

        if (pesoAttuale+peso > pesoMassimo){
            throw new PesoSuperatoException();
        }
        
        oggetti.add(new Oggetto(nome, peso));
        pesoAttuale+=peso;
        System.out.println("Oggetto inserito nella valigia.");
        System.out.println("peso totale= "+pesoAttuale);
    }
    
///////////////////////////////////////////////////////////////////////////////
    public void togliOggetto() throws ValigiaVuotaException{
        if (oggetti.isEmpty()){
            throw new ValigiaVuotaException();
        }

        System.out.println("Seleziona l'oggetto da prendere:");
        //fa l'elenco degli oggetti nello zaino
        for (int i = 0; i < oggetti.size(); i++){
            Oggetto oggetto = oggetti.get(i);
            System.out.println((i + 1) + ". " + oggetto.getNome() + " - Peso: " + oggetto.getPeso());
        }        

        Scanner s = new Scanner(System.in);

        int scelta = s.nextInt();

        if (scelta < 1 || scelta > oggetti.size()){
            System.out.println("Scelta non valida. Riprova.");
            return;
        }

        Oggetto oggettoSelezionato = oggetti.get(scelta - 1);//parte da 0
        oggetti.remove(oggettoSelezionato);
        pesoAttuale-=oggettoSelezionato.getPeso();
        System.out.println("Hai tolto l'oggetto: " + oggettoSelezionato.getNome());
    }

///////////////////////////////////////////////////////////////////////////////////
    public Oggetto oggettoPiuPesante(){
        Oggetto oggettoPiuPesante = oggetti.get(0);
        for (Oggetto oggetto : oggetti){
            if (oggetto.getPeso() > oggettoPiuPesante.getPeso()){
                oggettoPiuPesante = oggetto;
            }
        }
        return oggettoPiuPesante;
    }

}


/*
***************************** INIZIO ECCEZIONI **********************************************************
*/

class ValigiaPienaException extends Exception {

    public ValigiaPienaException(){
        super("La valigia è pieno.");
    }
}

//////////////////////////////////////////////////////////
class PesoSuperatoException extends Exception {

    public PesoSuperatoException(){
        super("Il peso massimo della valigia è stato superato.");
    }
}

////////////////////////////////////////////////////////////
class ValigiaVuotaException extends Exception {

    public ValigiaVuotaException(){
        super("La valigia è vuota.");
    }
}

