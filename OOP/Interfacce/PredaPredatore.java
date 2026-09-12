package predapredatore;
//Interfaccia. Gestisce comportamenti. Non eredità di identità. Implements non Extends
/*
    Tutti i metodi sono astratti tranne quelli di default
    È possibile definire solo "attributi" final (in pratica costanti)
    Definendo un attributo in un'interfaccia questo viene automaticamente considerato public static final
 */
public class PredaPredatore {
    
    public static void main(String[] args){
        
        Preda p = new Coniglio();
        p.Scappa(); //p non vede solo le cose nell'interfaccia e non nella classe coniglio
        p.mangia();

        //Coniglio c= new Preda();// NO! Preda è una imterfaccia e non si può istanziare
        //tutte le prede
        Preda[] prede = {new Coniglio(), new Pesce()};
        //tutti i predatori
        Predatore[] predatori = {new Avvoltoio(), new Pesce()};
        
        for (Preda preda : prede){
            preda.Scappa();
        }
        for (Predatore predatore : predatori){
            predatore.Caccia();
        }
        
    }
    
}

//********************************************
interface Preda {
    
    default void mangia(){ //Metodo di default. Si eredita ma NON è obbligatorio fare override.
        System.out.println("gnam gnam");
    }

    //le prede scappano
    void Scappa();
    
}
//********************************************

interface Predatore {

    //I predatori cacciano
    void Caccia();
    
}
//********************************************

class Coniglio implements Preda {

//    public void mangia(){ //override del metodo mangia dell'interfaccia Preda
//        System.out.println("mangio carote");
//    }
    @Override
    public void Scappa(){
        System.out.println("*Il coniglio sta scappando*");
    }
    
}
//********************************************

class Avvoltoio implements Predatore {
    
    @Override
    public void Caccia(){
        System.out.println("*L' avvoltoio sta cacciando*");
    }
    
}
//********************************************

class Pesce implements Preda, Predatore {

    //Pesce piccolo caccia il pesce grande
    @Override
    public void Caccia(){
        System.out.println("*Il pesce sta cacciando pesci più piccoli*");
    }
    
    @Override
    public void Scappa(){
        System.out.println("*Il pesce sta scappando dai pesci più grandi*");
    }
    
}
