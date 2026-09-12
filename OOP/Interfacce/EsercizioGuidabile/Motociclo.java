package esercizioguidabile;

public class Motociclo extends Veicolo implements Guidabile{

    int cilindrata;

    public Motociclo(int cilindrata, String targa, String marca, String modello, int eta){
        super(targa, marca, modello, eta);
        this.cilindrata = cilindrata;
    }
        

    @Override
    public void guida(){
        System.out.println("si guida col manubrio");
    }
    
    
}
