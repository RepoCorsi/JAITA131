package VeivoloAstratto;
/*
 * Una classe è astratta se ha almeno un metodo astratto.
 * È una classe non completamente definita e non può essere istanziata
 * E' una classe come le altre, e si usano esattamente come le altre classi.
 * Se una classe eredita da una classe astratta, deve per forza ridefinire i suoi membri astratti.
 * Si usa quando non è possibile definire un metodo per questa classe(Esempio: Il calcolo delle aree è diverso per ogni figura geometrica)
 la classe superiore diventa a tal punto generica che la si può pensare come una base per le altre classi piuttosto che come una classe di cui creare un oggetto.
 */
public class TestVeivoloAstratto{

    public static void main(String args[]){
        Boeing747 b = new Boeing747("747", 590);
        b.descrizione();
        b.decollo();
        b.Atterraggio();

        System.out.println();

        Elicottero eli = new Elicottero("Pegaso3", 1190);
        eli.descrizione();
        eli.decollo();
        eli.Atterraggio();

        System.out.println();

        Idrovolante idro = new Idrovolante("Cessna Anfibio", 213);
        idro.descrizione();
        idro.decollo();
        idro.Atterraggio();

        System.out.println("***************************");
        Veivolo[] v= {b,eli,idro};
        for (Veivolo veivolo : v){
            veivolo.descrizione();
            veivolo.decollo();
            veivolo.Atterraggio();
        }


    }
}

////////////////////////////////////////
//Definizione classe astratta

abstract class Veivolo {

    private String modello;
    private int velocitaMassima;

    Veivolo(String modello, int velocitaMassima){
        this.modello = modello;
        this.velocitaMassima = velocitaMassima;
    }

    void descrizione(){
        System.out.println("La velocità massima di un " + modello + " è: " + velocitaMassima);
    }
	
    //Devono essere implementati nelle classi ereditate
    abstract void decollo(); // abstract method

    abstract void Atterraggio();  // abstract method
}


//****************************** Classi che estendono la classe astratta veicolo ****************************
class Boeing747 extends Veivolo {

    //costruttore
    Boeing747(String modello, int velocitaMassima){
        super(modello, velocitaMassima);
    }

    @Override
    void decollo(){
        System.out.println("Il 747 ha bisogno di una pista molto lunga per il decollo ...");
    }

    @Override
    void Atterraggio(){
        System.out.println("Il 747 ha bisogno di una pista molto lunga per l'atterraggio...");
    }
}

//................................................................................
class Elicottero extends Veivolo {

    //Costruttore
    Elicottero(String modello, int velocitaMassima){
        super(modello, velocitaMassima);
    }

    @Override
    void decollo(){
        System.out.println("L'elicottero decolla da fermo ...");
    }

    @Override
    void Atterraggio(){
        System.out.println("L'elicottero atterra in verticale ...");
    }
}

//...................................................................................
class Idrovolante extends Veivolo {

    //Costruttore
    Idrovolante(String modello, int velocitaMassima){
        super(modello, velocitaMassima);
    }

    @Override
    void decollo(){
        System.out.println("L'idrovolante può decollare dall'acqua o da una pista ...");
    }

    @Override
    void Atterraggio(){
        System.out.println("L'idrovolante può atterrre nell'acqua o sulla una pista...");
    }
}
