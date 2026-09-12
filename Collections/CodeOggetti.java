package codeoggetti;

import java.util.ArrayDeque;
import java.util.Queue;



public class CodeOggetti {

    public static void main(String[] args) {

        Queue q=new ArrayDeque(); //Coda di persone
          
        persona p=new persona("gino", 30);
        persona p2=new persona("rino", 5);
        persona p3=new persona("mino", 60);
        persona p4=new persona("tino", 10);
        persona p5=new persona("lino", 90);
        
        q.offer(p);
        q.offer(p2);
        q.offer(p3);
        q.offer(p4);
        q.offer(p5);
        
        System.out.println("Primo della coda:"+q.peek());//Il primo elemento è quello in cima alla coda
        
        //l'ordine di visualizzazione, il primo elemento, e l'elemeto eliminato sono in ordine di inserimento. FIFO
        System.out.println(q);
        
        while (!q.isEmpty()) {
            System.out.println("Eliminato: "+q.poll());//poll() elimina l'oggetto partendo dal primo elemento della coda.
        }
        
    }
    
}

/********* Classe persona **************/
class persona{
    
    String nome;
    int età;

    public persona(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    @Override
    public String toString() {
        return "nome:"+getNome()+" eta: "+getEtà();
    } 
    
}
