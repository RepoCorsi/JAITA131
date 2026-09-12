package Estensioni_di_interfacce;
/*
    Tutti i metodi sono astratti tranne quelli di default
    È possibile definire solo "attributi" final (in pratica costanti)
    Definendo un attributo in un'interfaccia questo viene automaticamente considerato public static final
*/
public class Estensioni {

   public static void main(String args[]) {
       
       //Interfacce implementa interfaccia1 che estende interfaccia 2,3,4
       Estensioni_di_interfacce t=new Estensioni_di_interfacce();
       
        System.out.println(t.stringa1);//Ereditata da interfaccia1
        System.out.println(t.stringa2);//Ereditata da interfaccia2
        System.out.println(t.stringa3);////Ereditata da interfaccia3

       t.scriviQualcosa();
    }
}


//Interfacce
interface interfaccia1 {
    String stringa1 = "Ciao dall'interfaccia 1!";
}

interface interfaccia2 {
    String stringa2 = "Ciao dall'interfaccia 2!";
}

interface interfaccia3 {
    void scriviQualcosa();
}

// Ereditarietà multipla simulata con le interfacce.
interface interfaccia4 extends interfaccia1, interfaccia2, interfaccia3 { 
    public static final String stringa3 = "Ciao dall'interfaccia 4!";
}

// Classe che implementa l'interfaccia
class Estensioni_di_interfacce implements interfaccia4 {//implementa interfaccia1 che estende interfaccia 2,3,4.

    @Override
    public void scriviQualcosa() {//Ridefinisce il metodo dell'interfaccia3.
        System.out.println("Ho ereditato tutte le variabili e ridefinito il metodo scriviQualcosa.");
    }
}
