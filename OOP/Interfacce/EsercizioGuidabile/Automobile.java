package esercizioguidabile;

public class Automobile extends Veicolo implements Guidabile{

    String tipo;

    public Automobile(String tipo, String targa, String marca, String modello, int eta){
        super(targa, marca, modello, eta);
        this.tipo = tipo;
    }
        

    @Override
    public void guida(){
        System.out.println("si guida col volante");
    }
    
    
}
