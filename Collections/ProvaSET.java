package provaset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

		 
//Set è una lista di valori che NON ammette duplicati
		//non è ordinata-> non segue NECESSARIAMENTE l'ordine in cui ho messo i valori
		//l'ordine all'interno della lista dipende da una funzione di HASH
		//Non esiste il metodo get per trovare la posizione di un elemento
		//HashSet -> non segue l'ordine di inserimento
		//TreeSet -> ordina a prescindere dall'ordine in cui io inserisco i valori

public class ProvaSET {

    public static void main(String[] args){

        HashSet hash = new HashSet();
        hash.add("c");
        hash.add("a");
        hash.add("b");
        hash.add("b");
        hash.add("a");

        //ritorna false se c'è già, altrimenti ritorna true
        System.out.println(hash.add("d"));
        System.out.println(hash.add("d"));

        System.out.println(hash.size());// 4: a,b,c,d

        System.out.println(hash);

        //con foreach
        for (Object h : hash){
            System.out.println(h);
        }

        //con lambda expression
        hash.forEach(h -> System.out.println(h));
        hash.forEach(System.out::println);

        //Con l'iteratore
        Iterator it = hash.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //NON ESISTE IL METODO GET PER ACCEDERE AI SINGOLI ELEMENTI!!! MA SI USA EQUALS per le stringhe e
        //CONTAINS per i numeri
        for (Object h : hash){

            if (h.equals("a")){
                System.out.println("trovato");
            }else{
                System.out.println("non trovato");
            }
        }
        System.out.println(hash.contains("a")); //ritorna vero/falso

        hash.remove("b");

        System.out.println(hash);
        hash.clear();//svuota l'hashSet

        // HashSet Parametrizzato con Integer
        HashSet<Integer> numbers = new HashSet();
        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (Object valori : numbers){
            System.out.println(valori);
        }

        // Quali numeri sono tra 1 e 10 nel hashSet
        for (int i = 1; i <= 10; i++){
            if (numbers.contains(i)){
                System.out.println(i + " è stato trovato.");
            }else{
                System.out.println(i + " non c'è.");
            }
        }

        String[] a = {"cane", "cane", "gatto", "topo", "cane"};

        //Set elenco di valori non duplicati
        //Java 8
        HashSet<String> mioSet = new HashSet(Arrays.asList(a));
        System.out.println(mioSet);

//////TREESET******************************
        //TreeSet è ordinato e non ammette duplicati
        TreeSet ts = new TreeSet();
        ts.add(9);
        ts.add(1);
        ts.add(5);
        ts.add(2);
        ts.add(9);

        System.out.println(ts);

/**************************************************************************************************/
////////////ESERCIZIO:
/*

Gestione di un elenco di partecipanti a un evento.

Creare un programma che consenta di aggiungere, rimuovere, visualizzare e verificare se un determinato partecipante è presente in un elenco elenco utilizzando un HashSet.

    Implementa il seguente menu:
        Opzione 1: Aggiungi partecipante
            Richiedi all'utente di inserire il nome del partecipante da aggiungere all'evento.
       Opzione 2: Rimuovi partecipante
            Richiedi all'utente di inserire il nome del partecipante da rimuovere dall'evento.
       Opzione 3: Visualizza partecipanti
            Stampa tutti i nomi dei partecipanti presenti nell'HashSet.
        Opzione 4: Verifica partecipante
            Richiedi all'utente di inserire il nome del partecipante da verificare se è presente nell'Hashset
        Opzione 5: Esci
            Termina il programma.

    Implementa un ciclo che richieda all'utente di selezionare un'opzione dal menu finchè non sceglie Esci
         */
        HashSet<String> partecipanti = new HashSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella gestione degli eventi!\n");

        int scelta;
        while (true){
            stampaMenu();
            System.out.print("Seleziona un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline residuo

            switch (scelta){
                case 1:
                    System.out.print("Inserisci il nome del partecipante da aggiungere: ");
                    String aggiungiNome = scanner.nextLine();
                    if (partecipanti.add(aggiungiNome)){
                        System.out.println("Partecipante aggiunto con successo!\n");
                    }else{
                        System.out.println("Il partecipante è già presente nell'elenco.\n");
                    }
                    break;
                case 2:
                    System.out.print("Inserisci il nome del partecipante da rimuovere: ");
                    String togliNome = scanner.nextLine();
                    if (partecipanti.remove(togliNome)){
                        System.out.println("Partecipante rimosso con successo!\n");
                    }else{
                        System.out.println("Il partecipante non è presente nell'elenco.\n");
                    }
                    break;
                case 3:
                    System.out.println("Partecipanti dell'evento:");
                    if (partecipanti.isEmpty()){
                        System.out.println("Nessun partecipante presente.\n");
                    }else{
                        for (String persona : partecipanti){
                            System.out.println("- " + persona);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Inserisci il nome del partecipante da verificare: ");
                    String nome = scanner.nextLine();
                    if (partecipanti.contains(nome)){
                        System.out.println(nome + " è presente nell'elenco dei partecipanti.\n");
                    }else{
                        System.out.println(nome + " non è presente nell'elenco dei partecipanti.\n");
                    }
                    break;
                case 5:
                    System.out.println("Grazie per aver utilizzato il programma. Arrivederci!");
                    return;
                default:
                    System.out.println("Opzione non valida. Riprova.\n");
            }
        } //fine while

    }//fine main

    public static void stampaMenu(){
        System.out.println("Menu:");
        System.out.println("1. Aggiungi partecipante");
        System.out.println("2. Rimuovi partecipante");
        System.out.println("3. Visualizza partecipanti");
        System.out.println("4. Verifica partecipante");
        System.out.println("5. Esci");
        System.out.println();
    }

}
