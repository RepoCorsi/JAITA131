package testfrutta;

import java.util.ArrayList;

public class TestFrutta {

    public static void main(String[] args){

        try{

            Cesto c = new Cesto();//non parametrizzato, posso aggiungere tutti i tipi di frutta.

            Mela m = new Mela();
            Pesca p = new Pesca();
            Arancia a = new Arancia();

            for (int i = 0; i < 4; i++){//cicliamo per simulare di aggiungere tanti frutti
                c.aggiungi(m);
                c.aggiungi(p);
                c.aggiungi(a);
                c.aggiungi(a);
                System.out.println(c);
            }

            Cesto<Mela> cm = new Cesto<>();//posso aggiungere solo mele
            Mela m2 = new Mela();
            cm.aggiungi(m2);

            System.out.println(cm);

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}

abstract class Frutta {

    protected double peso;
}

class Mela extends Frutta {

    public Mela(){
        peso = 0.2; // peso medio di una mela in kg
    }

    @Override
    public String toString(){
        return "Mela: peso " + peso;
    }

}

class Pesca extends Frutta {

    public Pesca(){
        peso = 0.3; // peso medio di una pesca in kg
    }

    @Override
    public String toString(){
        return "Pesca: peso " + peso;
    }
}

class Arancia extends Frutta {

    public Arancia(){
        peso = 0.5; // peso medio di un'arancia in kg
    }

    @Override
    public String toString(){
        return "Arancia: peso " + peso;
    }
}

//class Cesto<T extends Frutta> {
class Cesto<T> {

    public ArrayList<T> frutti = new ArrayList<T>();
    private double pesoMassimo = 5.0;
    private double pesoAttuale = 0.0;

    public double getPeso(){
        return pesoAttuale;
    }

    public void aggiungi(T x) throws PesoException{
        //public void aggiungi(Frutta x) throws Exception {
        if (pesoAttuale + ((Frutta) x).peso > pesoMassimo){//facciamo il cast per trasformare X generico in una frutta
            //if (pesoAttuale + x.peso > pesoMassimo) {
            throw new PesoException("Limite massimo di peso superato.");
        }
        frutti.add(x);
        pesoAttuale += ((Frutta) x).peso;
        //   pesoAttuale += x.peso;
    }

    @Override
    public String toString(){
        return "Cesto{" + frutti + "pesoMassimo=" + pesoMassimo + ", pesoAttuale=" + pesoAttuale + "}";
    }

}//Fine classe generica cesto

//-----------------------------------------------------------------
///CLASSE ECCEZIONE PERSONALIZZATA
class PesoException extends Exception {

    public PesoException(String messaggio){
        super(messaggio);
    }
}
