package metodiDefault;

public class MetodiDefault {

    public static void main(String[] args) {

        A a=new A();

        //Se la classe implementa 2 interfacce,
        //le interfacce Int1 e Int2 NON possono avere lo stesso metodo di default(tutti e 2 stampa),
        //altrimenti vanno in conflitto, perchè la classe non saprebbe quale chiamare dei 2 stampa,
        //Quello di Int1 o quello di Int2?
        //E non possono avere gli stessi attributi per lo stesso motivo(tutte e 2 X, o tutte e 2 Y).
        a.ciao();
        a.stampa();
        a.stampa2();
        System.out.println(a.X);
        System.out.println(a.Y);

		System.out.println(a instanceof Int1);

    }
}

class A implements Int1,Int2{

    //definisco il metodo astratto ciao
    @Override
    public void ciao(){
        System.out.println("ciao");
    }

    //Non c'è bisogno di definire i metodi stampa e stampa2 perchè sono di Default.

}

//***********Interfacce

interface Int1 {
/*
    Tutti i metodi sono astratti tranne quelli di default
    È possibile definire solo "attributi" final (in pratica costanti)
    Definendo un attributo in un'interfaccia questo viene automaticamente considerato public static final
*/

    int X=10;

    void ciao();

    //Non è obbligatorio implementare i metodi di default dell'interfaccia, perchè sono metodi "normali"
    //Se si vuole, si può fare l'override per ridefinirli, ma non è obbligatorio.
    //I metodi di default sono pubblici ma NON statici.
    default void stampa(){
        System.out.println("Dentro Int1");
    }
}
//int 2
interface Int2 {

/*
    Tutti i metodi sono astratti tranne quelli di default
    È possibile definire solo "attributi" final (in pratica costanti)
    Definendo un attributo in un'interfaccia questo viene automaticamente considerato public static final
*/
    int Y=20;

    //Non è obbligatorio implementare i metodi di default dell'interfaccia, perchè sono metodi "normali"
    //Se si vuole, si può fare l'override per ridefinirli, ma non è obbligatorio.
    //I metodi di default sono pubblici ma non statici.
    default void stampa2(){
        System.out.println("Dentro Int2");
    }
}

