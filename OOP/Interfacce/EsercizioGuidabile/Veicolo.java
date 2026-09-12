package esercizioguidabile;

public abstract class Veicolo {
    
    private String targa;
    private String marca;
    private String modello;
    private int eta;

    public Veicolo(String targa, String marca, String modello, int eta){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.eta = eta;
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        this.eta = eta;
    }

    public String getTarga(){
        return targa;
    }

    public void setTarga(String targa){
        this.targa = targa;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModello(){
        return modello;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    @Override
    public String toString(){
        return "targa: "+getTarga()+" Marca "+getMarca()+" modello "+getModello()+" eta "+getEta()+"\n";
    }
    
    
    
}
