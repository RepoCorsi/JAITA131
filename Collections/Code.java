package code;

import java.util.ArrayDeque;
import java.util.Queue;

public class Code {

    static int numero = 0; //Variabile statica per registrare il numero progressivo nell'esercizio della posta

    public static void main(String[] args){
        //Una coda ha un ordinamento di tipo  FIFO FIRST IN FIRST OUT
        //Esempio una coda di persone
        //il primo che entra è il primo che esce

        //FIFO FIRST IN FIRST OUT.
        //una coda di persone
        //Queue q=new ArrayDeque();
        ArrayDeque q = new ArrayDeque();

//        q.offer("cane");//Aggiunge un elemento alla fine della coda
//        q.offer("gatto");
//        q.offer("pesce");
        q.add("cane");//Aggiunge un elemento alla fine della coda
        q.add("gatto");
        q.add("pesce");

        System.out.println(q.size());// dimensione della coda.
        System.out.println(q);//Stampa la coda.
        System.out.println("testa= " + q.peek());//Peek ritorna la testa della coda,cioè il primo della coda.

        for (Object coda : q){
            System.out.println(coda);
        }
        //non esiste get perchè non c'è un indice

        q.poll();//ELIMINA! l'elemento in testa alla coda, il primo della coda. Se la coda è vuota ritorna null. "Remove" invece ritorna un errore.

        System.out.println(q);
        System.out.println("testa= " + q.peek());//Peek ritorna la testa della coda,cioè il primo della coda."Element" invece ritorna un errore se la coda è vuota.

        System.out.println("La coda è vuota? " + q.isEmpty());//ritorna se la coda è vuota oppure no.

        q.clear();//svuota la coda.

        //////////////////////////////// Esercizio //////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
//Coda alla posta
//Creare il sistema informativo per la gestione del pubblico alle poste.
//la persona che entra alla posta tocca lo schermo, e le viene generato un biglietto con indicato il suo numero nella coda.
//L'impiegato/a delle poste schiaccia un bottone per generare il prossimo numero da servire.
//Una volta servita la persona, il numero deve essere eliminato e viene servita un'altra persona se presente.
//Creare i relativi metodi:
//1) prenota - che ritorna il successivo numero da servire come numero progressivo
//2) servi - per servire la persona
//Finchè ci sono persone in coda, visualizzare la coda dei numeri e il numero che è servito al momento.

//ATTENZIONE!!
//(AGGIUNGERE static int numero = 0; all'inizio PRIMA del main)

        ArrayDeque<Integer> persone = new ArrayDeque(); //Coda di persone
        prenota(persone); //viene generato un numero progressivo. ATTENZIONE!! AGGIUNGERE static int numero = 0; all'inizio PRIMA del main
        prenota(persone);
        prenota(persone);
        prenota(persone);

        while (!persone.isEmpty()){ //finchè ci sono persone...La coda non è vuota...
            System.out.println("Persone in coda:"+persone);
            //servi la prima persona in coda. con peek(la testa della coda)
            servi(persone, persone.peek());  //peek ritorna il valore della testa della coda,cioè il primo della coda
        }
        System.out.println("non ci sono più persone in coda");

    }//Fine Main

    /////// Inizio Funzioni /////////////////
    static void prenota(ArrayDeque q){

        q.offer(++numero);//Aggiunge un elemento alla fine della coda
        System.out.println("hai preso il numero " + numero);
    }

    static void servi(ArrayDeque q, int num){
        System.out.println("Tocca al numero " + num);
        q.poll();//Elimina l'elemento in cima alla coda, cioè il primo della coda
    }

}
