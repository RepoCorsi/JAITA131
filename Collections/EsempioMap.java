package mapcitta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class MapCitta {

    public static void main(String[] args){

        //un insieme di elementi identificati da chiave: valore
        //Hash non è ordinato (per chiave), l'ordine di stampa è casuale
        //le chiavi sono univoche, non ammette duplicati.
        //in caso di chiavi doppie prende la seconda
        //I valori delle chiavi devono essere tutte dello stesso tipo: tutte String, Integer, ecc.. no miste
        HashMap<String, String> paesi = new HashMap<String, String>();

        paesi.put("USA", "Washington");

        paesi.put("Norvegia", "Oslo");

        paesi.put("Russia", "Mosca");

        paesi.put("Cina", "Pechino");

        //l'ordine di stampa è casuale
        System.out.println(paesi);

        //Se si mette una chiave che già esiste, viene sovrascritta.
        paesi.put("USA", "Washington");

        System.out.println(paesi);

        //Inserisce solo se non c'è. Se c'è non sovrascrive. Non fa niente
        paesi.putIfAbsent("Italia", "Roma");

        //Accedere per chiave al singolo valore si usa il get come ArrayList
        System.out.println(paesi.get("Russia"));

        System.out.println(paesi.size());//Dimensione

        //replace è come put. modifica il valore associato ad una chiave
        //Posso cambiare i valori ma non le chiavi
        paesi.replace("USA", "Detroit");

        System.out.println(paesi);

        //cerca se c'è una chiave o un valore
        System.out.println(paesi.containsKey("Inghilterra"));
		//cerca il valore true se lo trova/false se non c'è
        System.out.println(paesi.containsValue("Pechino"));//case sensitive

        //Stampa solo le chiavi:
        for (String chiave : paesi.keySet()){
            System.out.println(chiave + " ");
        }

        //Stampa solo i valori:
        for (String valore : paesi.values()){
            System.out.println(valore + " ");
        }

        //Stampa chiavi e valori
        for (String chiave : paesi.keySet()){
            System.out.println("chiave: " + chiave + " valore: " + paesi.get(chiave));
        }

        //stampa col foreEach: Devo per forza usare chiave e valore nel forEach
        paesi.forEach((chiave, valore) -> {
            System.out.println(chiave+": "+valore);
        });

        //Elimina un elemento. (chiave/valore)
        paesi.remove("USA");
        System.out.println(paesi);

        //Svuota l'hasmap
        paesi.clear(); //{} collection vuota

        //Altro tipo di dati: ********************
        HashMap<String, Integer> montagne = new HashMap<String, Integer>();

        montagne.put("Everest", 8848);
        montagne.put("K2", 8611);
        montagne.put("Nanga Parbat", 8125);

        for (String chiave : montagne.keySet()){
            System.out.println("nome: " + chiave + " altezza: " + montagne.get(chiave));
        }

        //Senza specificare il tipo: posso mischiare tipi diversi
        HashMap misto = new HashMap();
        misto.put("nome", "mario");
        misto.put(44, "gatti in fila per 6");
        misto.put(true, 123);

        //si usa object perchè non gli abbiamo definito un tipo preciso
        for (Object chiave : misto.keySet()){
            System.out.println("chiave: " + chiave + " - valore: " + misto.get(chiave));
        }

        /************************ Altro Esempio *******************************************************/
        HashMap<String, Integer> studentiVoti = new HashMap();

        // Aggiunta dei voti degli studenti alla HashMap
        studentiVoti.put("Mario", 90);
        studentiVoti.put("Ugo", 80);
        studentiVoti.put("Pino", 95);
        studentiVoti.put("Lino", 88);

        // Stampa nome e voti degli studenti
        for (String nome : studentiVoti.keySet()){
            System.out.println("nome: " + nome + " voto: " + studentiVoti.get(nome));
        }

        // Modifica del voto di uno studente
        studentiVoti.put("Bob", 85);

        // Stampa del nuovo voto di Bob
        int nuovoVoto = studentiVoti.get("Mario");
        System.out.println("Nuovo voto di Mario: " + nuovoVoto);

        // Verifica se uno studente è presente nella HashMap
        boolean ePresente = studentiVoti.containsKey("Ugo");
        System.out.println("Ugo è presente? " + ePresente);

        // Rimozione di Charlie
        studentiVoti.remove("Pino");

        // Verifica se Charlie è ancora presente nella HashMap
        ePresente = studentiVoti.containsKey("Pino");
        System.out.println("Pino è presente? " + ePresente);

        /**
         * ****** Con Array************
         */
        //HashMap con valore di tipo Array
        HashMap<String, String[]> prova = new HashMap();

        //Libri degli autori
        String[] x = {"a", "b", "c"};
        String[] y = {"d", "e", "f"};
        String[] z = {"g", "h", "i"};

        //Associazione libro autore
        prova.put("Autore1", x);
        prova.put("Autore2", y);
        prova.put("Autore3", z);

        //Stampa gli autori con i loro libri
        for (String chiave : prova.keySet()){
            System.out.println("Autore: " + chiave + " Libri: " + Arrays.toString(prova.get(chiave)));
        }

        //////////////TREEMAP E' ORDINATO PER CHIAVE///////////////
        TreeMap macchine = new TreeMap(); //Tree è ordinato
        //HashMap macchine = new HashMap(); //Hash NON è ordinato
        macchine.put(2, "audi");
        macchine.put(1, "fiat");
        macchine.put(5, "tesla");
        macchine.put(99, "renault");

        System.out.println(macchine);

        //Altro esempio ordine alfabetico
        TreeMap frutti = new TreeMap();
        frutti.put("mela", 1.50);
        frutti.put("uva", 2.00);
        frutti.put("banana", 5.00);
        frutti.put("kiwi", 3.00);

        System.out.println(frutti);

        //con putAll si mettono più valori alla volta, con put 1 solo alla volta
        montagne.putAll(frutti);
        System.out.println(montagne);


        /************************ ESERCIZIO:**********************************************/
//      Gestione Rubrica telefonica:
//      La rubrica telefonica è composta dall'associazione del nome della persona e dal n di telefono.
//      Non ci possono essere 2 persone con lo stesso nome, o 2 persone con lo stesso numero di telefono nella rubrica.
//
//      dovete realizzare il menù di gestione della rubrica di un cellulare.
//      il programma deve presentare all'utente un menu in cui si chiede la funzione da utilizzare tra le seguenti:
//      1) inserimento del nome della persona con il/i relativi numeri
//      2) cancellazione della persona
//      3) ricerca della persona con i sui numeri
//      4) elenco di tutti i nomi con i relativi numeri presenti nella rubrica
//      5) uscita dal menù
        Scanner s = new Scanner(System.in);

/************************************* VERSIONE PIU SEMPLICE. UN SOLO TELEFONO *********************************************/

        TreeMap<String, String> rubrica = new TreeMap();
        int scelta = 0;

        while (true) {
            System.out.println("Menù rubrica: \n1) Inserimento\n2) Cancellazione\n3) Ricerca\n4) Elenco\n5) Esci");

            System.out.print("Seleziona una funzione (1-5): ");
            scelta = s.nextInt();
            s.nextLine(); // Consuma il newline residuo

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome e il telefono della persona: ");
                    inserisciPersona(rubrica, s.nextLine(),s.nextLine());
                    break;
                case 2:
                    System.out.print("Inserisci il nome della persona da cancellare: ");
                    cancellaPersona(rubrica,s.nextLine());
                    break;
                case 3:
                    System.out.print("Inserisci il nome della persona da cercare: ");
                    ricercaPersona(rubrica, s.nextLine());
                    break;
                case 4:
                    System.out.println("Elenco della rubrica telefonica:");
                    System.out.println(rubrica);
                    break;
                case 5:
                    System.out.println("Uscita dal programma.");
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }//fine switch
        }//fine while

/**********************************************************************************************************************************/
    }//fine main

    ////////// Inizio Funzioni //////////////////


/************************************* VERSIONE PIU SEMPLICE. UN SOLO TELEFONO *********************************************/

    public static void inserisciPersona(TreeMap rubrica, String nome, String telefono) {
        if (rubrica.containsKey(nome)) {
            System.out.print("Errore: La persona esiste già:\n");
        }else if (rubrica.containsValue(telefono)) {
            System.out.println("Errore: Il numero di telefono è già assegnato a un'altra persona.");
        } else{
            rubrica.put(nome, telefono);
            System.out.println("Persona inserita con successo.");
        }
    }

    public static void cancellaPersona(TreeMap rubrica, String nome) {
        if(rubrica.remove(nome)!= null){
            System.out.println("persona eliminata con successo");
        }else{
            System.out.println("la persona da eliminare non esiste");
        }
    }

    public static void ricercaPersona(TreeMap rubrica, String nome) {
        String numero =(String)rubrica.get(nome);
        if (numero != null) {
            System.out.println("Numero di telefono di " + nome + ": " + numero);
        } else {
            System.out.println("La persona specificata non è presente nella rubrica.");
        }
    }


    //********************** VERSIONE PIU' COMPLICATA CON PIU' TELEFONI PER OGNI PERSONA*****************************

//        TreeMap<String, ArrayList> rubrica = new TreeMap();
//        ArrayList tuttiNumeri=new ArrayList();//contiene tutti i numeri della rubrica
//        Boolean cicla = true;
//        while (cicla){
//            System.out.println("Menù rubrica: \n1) Inserimento\n2) Cancellazione\n3) Ricerca\n4) Elenco\n5) Esci");
//            int scelta = s.nextInt();
//            s.nextLine();
//            switch(scelta){
//                case 1://inserimento
//                    System.out.println("Inserisci il nome e il numero");
//                    inserimento(rubrica, s.nextLine(), s.nextInt(),tuttiNumeri);
//                    break;
//                case 2://cancellazione
//                    System.out.println("Inserisci la persona da cancellare");
//                    cancellazione(rubrica, s.nextLine(),tuttiNumeri);
//                    break;
//                case 3: //ricerca
//                    System.out.println("inserisci la persona da ricercare");
//                    ricerca(rubrica, s.nextLine());
//                    break;
//                case 4: //elenco
//                    System.out.println(rubrica);
//                    break;
//                case 5: //Esci
//                    cicla = false;
//                    break;
//                default:
//                    System.out.println("Scelta non corretta");
//            }
//        }//fine while

 //    static void inserimento(TreeMap rubrica, String nome, int numero,ArrayList tuttiNumeri){
//
//        if (tuttiNumeri.contains(numero)){//controllo se il numero è già presente
//            System.out.println("numero già presente in rubrica");
//        }else{//altrimenti
//
//            if (rubrica.containsKey(nome)){//se esiste già una persona
//                ArrayList numeri = (ArrayList) rubrica.get(nome);//salvo tutti i suoi numeri in un ArrayList
//                numeri.add(numero); //Aggiungo il numero all'ArrayList
//                rubrica.put(nome,numeri );// e lo passo al TreeMap
//                tuttiNumeri.add(numero);//Aggiungo il numero all'elenco di tutti i numeri
//
//            }else{ //se non esiste la persona
//                ArrayList nuovi = new ArrayList();//creo un nuovo ArrayList vuoto
//                nuovi.add(numero);//gli aggiungo il numero passato
//                rubrica.put(nome, nuovi);//e lo inserisco nell'HashMap nella chiave passata(nome)
//                tuttiNumeri.add(numero);//Aggiungo il numero all'elenco di tutti i numeri
//            }
//        }
//    }
//
//
//    static void cancellazione(TreeMap persona, String nome,ArrayList tuttiNumeri){
//        tuttiNumeri.removeAll((ArrayList)persona.get(nome));
//        persona.remove(nome);
//    }
//
//    static void ricerca(TreeMap persona, String nome){
//        System.out.println(persona.get(nome));
//    }


/**********************************************************************************************************************************/
}//Fine classe
