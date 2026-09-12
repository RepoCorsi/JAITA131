package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_List {
//collections ->ArrayList, Hashset treeSet , hashmap treeMap
    public static void main(String[] args){

        //Da Java 7 non devo dichiarare il tipo nel costruttore dell'oggetto.
        //ArrayList<String> miaLista6 = new ArrayList<String>(); // Java 6
       // ArrayList<String> miaLista7 = new ArrayList();       // Java 7+

        //ArrayList estende la classe List. posso usare come tipo direttamente List ma non è consigliabile.
        List prova= new ArrayList();

        //Array dinamico di caratteri. Parametrizzato a Character. Forzo il tipo a Character
        ArrayList<Character> lettere = new ArrayList<>();
        //I tipi che accetta ArrayList devono essere oggetti, non tipi primitivi. Quindi INTEGER e non int

        //ArrayList lettere = new ArrayList();//Array dinamico che accetta tutti i tipi, anche mischiati

        lettere.add('a');//Aggiunge un valore alla fine del'array
        lettere.add('b');
        lettere.add(0, 'c');//Aggiunge c all'inizio dell'array
        lettere.add('d');
        
        System.out.println(lettere);

        //NO lettere[2] perchè non posso accedere con l'indice
        //lettere[2] NO!!!
        //ma si usa get                
        System.out.println("Elemento alla posizione 2:"+lettere.get(2));

        
        //size()  restituisce la dimensione dell’array
        System.out.println("dimensione= "+lettere.size());
        
        for (int i = 0; i < lettere.size(); i++){
            System.out.println(lettere.get(i));
        }

        System.out.println("----------------------------");


        for (Character caratteri : lettere){
            System.out.println(caratteri);
        }
        
        
        //funzioni in ingresso ad altre funzioni-> funzioni di callback
        //lambda expression         
        //Stampare usando le lambda expression.
        
        lettere.forEach(caratteri->{System.out.println(caratteri);});        
        
        //più stringato. Si chiama METHOD REFERENCE
        lettere.forEach(System.out::println);

        System.out.println("----------------------------");

        //cerca se contiene un elemento. RITORNA TRUE/FALSE OCCHIO AL TIPO: char e Stringhe sono diversi
        System.out.println(lettere.contains('a'));//questo è char, non funziona con "a" che è stringa

        //ArrayList di tipo generico non parametrizzato
        ArrayList arl=new ArrayList();
        arl.add('a');
        arl.add('b');
        arl.add('c');
        arl.add('d');

        System.out.println("contiene tutti questi? "+lettere.containsAll(arl));

        System.out.println(lettere.indexOf('t'));//Cerca la posizione. -1 se non trovato
        
        System.out.println("è vuoto? "+lettere.isEmpty());

        //Altro esempio:
        
        ArrayList<String> prodotti = new ArrayList<>();
        prodotti.add("scarpe");
        prodotti.add("t-shirt");
        prodotti.add("camicie");

        //size() al posto di length
        int lunghezza = prodotti.size();

        //get() per prendere un elemento
        String elemento0 = prodotti.get(0);

        //remove() per rimuovere un elemento
        prodotti.remove(2);

        prodotti.add("giacche");

        //stampo
//		for(int i = 0; i < prodotti.size(); i++) {
//			System.out.println(prodotti.get(i));
//		}

        //quando si tratta di array esiste anche il foreach
        for(String elemento: prodotti) {
                System.out.println(elemento);
        }


        ArrayList<String> classe = new ArrayList<>();

        classe.add("Marco");
        classe.add("Gennaro");
        classe.add("Anna");
        classe.add("Laura");


        for(String studente: classe) {
                System.out.println(studente);
        }


        //I tipi che accetta ArrayList devono essere oggetti, non tipi primitivi. Quindi INTEGER e non int
        ArrayList<Integer> voti = new ArrayList<>();
        voti.add(25);
        voti.add(30);
        voti.add(30);
        voti.add(27);

        //stampo il nome dello studente con il voto accanto
        for(int i = 0; i < voti.size(); i++) {
                System.out.println("Nome Studente: " + classe.get(i) + " - voto: " + voti.get(i));
        }        
        
        
        //......................ARRAYLIST DA ARRAY GIà ESISTENTE. JAVA8. ..............................
        Character[] c={'x','y','z'};

        ArrayList<Character> lettere2 = new ArrayList(Arrays.asList(c));  //Trasforma un array in una lista

        for (Character car : lettere2){
            System.out.println(car);
        }
                
        //ArrayList a=new ArrayList(1,2,3,4); //no! nella parentesi ci va una collection,non un insieme di valori
        
        System.out.println("----------------------------");

        lettere2.set(0, 'w');//Cambia il valore all'indice specificato

        lettere2.forEach(n->System.out.println(n));
        lettere2.forEach(System.out::println);
                       

        //Ritornare da arrayList ad array semplice:        
        Character[] x=new Character[lettere2.size()];//creiamo un array che conterrà i valori dell'ArrayList
        lettere2.toArray(x);//converte l'arrayList in un array già esistente come quello di sopra
        System.out.println(Arrays.toString(x));
        

/*
/////////RIEPILOGO METODI ARRAYLIST
.add(a)  aggiunge un oggetto a alla fine della sequenza.
- .add(i, c)  aggiunge nella posizione i l’oggetto c e sposta i successivi in avanti di una posizione.
- .remove(i)  elimina l’elemento nella posizione i.
- .size()  restituisce la dimensione dell’array.
- .get(i)  restituisce l’oggetto nella posizione i.
- .set(i, a)  assegna il valore a alla posizione i.
- .isEmpty() controlla se l’Arraylist è vuoto(boolean).        
*/
        
        
        System.out.println("----------------------------");

        //Altro modo per stampare, creando un iteratore per ciclare su tutti gli elementi dell'Arraylist
        Iterator i = lettere2.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

        /*********************** ArrayList di tipo generico ***********************************************************/
      
         ArrayList misto=new ArrayList();
         misto.add(1);
         misto.add("ciao");
         misto.add(true);
         misto.add(3.14);
         
         System.out.println(misto);
         for (Object o : misto){
             System.out.println(o);
        }
        
        misto.forEach(o->System.out.println(o));     
        
        //.....................................................................
        ArrayList nani = new ArrayList();//ArrayList di tipo generico

        nani.add("pisolo");//0
        nani.add("eolo");
        nani.add("mammolo");
        nani.add("gongolo");
        nani.add("brontolo");
        nani.add("cucciolo");
        nani.add("dotto");//6

        System.out.println(nani);
        
        nani.addAll(lettere);//Aggiunge un altro array all'array. lettere deve essere di tipo List/Araylist
        
        
        /****************************************************        
        //////////////////////
        //FARE IL METODO!!!!!
        //METODO che accetta in input arrayList e lo stampa (Next Bookmark )
        ********************************/
        stampa(nani);

        
        nani.remove("gatto");//elimina un solo elemento dalla lista
        //parole.remove(0);//elimina il primo elemento dalla lista

        nani.subList(4, 6).clear();//metodo per eliminare un sottinsieme di un array, cioè più valori alla volta

        stampa(nani);

        nani.removeAll(lettere);//rimuove tutti gli elementi che fanno parte della lista indicata, in questo caso lettere.

        stampa(nani);

        System.out.println(nani.get(1)); //ritorna il secondo elemento. Parte da zero

        System.out.println("--------------");
        
        System.out.println(nani.contains("eolo")); //cerca la parola eolo. ritorna vero o falso

        //per ordinare una collections
        Collections.sort(nani);
        for (Object o : nani){
            System.out.println(o);
        }
        
        //Cerca un valore e ritorna la posizione.
        //L'arrayList DEVE ESSERE ORDINATO CON SORT
        System.out.println(Collections.binarySearch(nani, "eolo"));
        
        System.out.println("************");
        //!!CAMBIA LA LISTA IN MODO PERMANENTE.l'ORIGINALE NON C'è PIù
        Collections.reverse(nani);//RITORNA VOID E NON SI PUò STAMPARE DIRETTAMENTE
        System.out.println(nani);
        
        //Per copiare un array in un altro si mette l'array sorgente nelle parentesi()
        ArrayList copia=new ArrayList(nani);

        System.out.println(copia);

        
    }//Fine Main

    
    //Tornare alla chiamata del metodo con previous bookmark
    public static void stampa(ArrayList parole) {

        for (Object val : parole) {//Object perchè l'Array_List è di tipo misto, e quindi non esiste un tipo preciso da assegnare
            System.out.println(val);
        }
    }

    /************************************* Esercizio: ***********************************************/

    
    
    //Chiedere all'utente di inserire dei numeri e salvarli in un ArrayList.
    //Se l'utente inserisce -1 il programma smette di chiedere i numeri,
    //mostra tutti i numeri inseriti, e ne calcola la somma.
    //Mostrare i numeri inseriti con i 4 metodi:
    //for normale, for migliorato, iteratore, foreach

/*

        List v = new ArrayList();

        int somma=0;

        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("inserisci un numero, -1 per terminare");
            int numero = s.nextInt();
            if (numero == -1){
                break;
            }else{
                v.add(numero);
            }
        }

        //1° metodo di stampa
        Iterator i = v.iterator();
        while (i.hasNext()){
            somma+=(int)i.next();
        }
        System.out.println("la somma è: "+somma);


        //2° metodo di stampa
        somma=0;
        for (int x = 0; x < v.size(); x++) {
            somma+=(int)v.get(x);//Il metodo get ritorna un tipo Object, così dobbiamo fare il cast ad int
        }
        System.out.println("la somma è: "+somma);


        //3° metodo di stampa
        somma=0;
        for (var numeri : v){
            somma+=(int)numeri;
        }
        System.out.println("la somma è: "+somma);

        //4°metodo di stampa
        v.forEach(System.out::println);

*/

////////////////////////// ALTRO ESERCIZIO ////////////////////////////////////////////    
/*ArrayList di nomi di persona e implementando i metodi di inserimento, 
cancellazione, ricerca di un nome e visualizzazione dell'elenco di tutti i nomi:*/    
    

//   static ArrayList<String> nomi = new ArrayList();
//   static Scanner s = new Scanner(System.in);
//    
//         while (true) {
//            System.out.println("Seleziona un'opzione:");
//            System.out.println("1. Inserisci un nome");
//            System.out.println("2. Cancella un nome");
//            System.out.println("3. Cerca un nome");
//            System.out.println("4. Visualizza l'elenco di tutti i nomi");
//            System.out.println("5. Esci");
//
//            int scelta = s.nextInt();
//
//            switch (scelta) {
//                case 1:
//                    inserisciNome();
//                    break;
//                case 2:
//                    cancellaNome();
//                    break;
//                case 3:
//                    cercaNome();
//                    break;
//                case 4:
//                    visualizzaElencoNomi();
//                    break;
//                case 5:
//                    return;
//                default:
//                    System.out.println("Scelta non valida. Riprova.");
//            }
//        }//Fine while
//         
//////////////Inizio metodi:
//
//
//static void inserisciNome() {
//        System.out.println("Inserisci un nome:");
//        String nome = s.next();
//        nomi.add(nome);
//        System.out.println("Nome inserito correttamente.");
//    }
//
//    private static void cancellaNome() {
//        System.out.println("Inserisci il nome da cancellare:");
//        String nome = s.next();
//        if (nomi.contains(nome)) {
//            nomi.remove(nome);
//            System.out.println("Nome cancellato correttamente.");
//        } else {
//            System.out.println("Il nome non è presente nell'elenco.");
//        }
//    }
//
//    private static void cercaNome() {
//        System.out.println("Inserisci il nome da cercare:");
//        String nome = s.next();
//        if (nomi.contains(nome)) {
//            System.out.println("Il nome è presente nell'elenco.");
//        } else {
//            System.out.println("Il nome non è presente nell'elenco.");
//        }
//    }
//
//    private static void visualizzaElencoNomi() {
//        System.out.println("Elenco nomi:");
//        for (String nome : nomi) {
//            System.out.println(nome);
//        }
//    }         
         
}//Fine classe
