package altre_Classi;

//Questa classe crea oggetti tutti uguali
public class Macchina {


    //......Proprietà della classe.........
    String marca   = "Chevrolet";
    String modello = "Corvette";
    int    anno    = 2020;
    String colore  = "blu";
    double prezzo  = 50000;

    
    //.....Metodi della classe...............
    void guida(){
        System.out.println("Stai guidando");
    }

    void frena(){
        System.out.println("Hai frenato");
    }


    @Override
    public boolean equals(Object obj){
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
}


