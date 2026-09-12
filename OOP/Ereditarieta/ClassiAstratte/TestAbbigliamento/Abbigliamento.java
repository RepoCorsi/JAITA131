package testabbigliamento;

public abstract class Abbigliamento {
    
    private String taglia;
    protected double prezzo;
    private String colore;
    private int quantita;

    public Abbigliamento(String taglia, double prezzo, String colore, int quantita){
        this.taglia = taglia;
        this.prezzo = prezzo;
        this.colore = colore;
        this.quantita = quantita;
    }

    //Metodo Astratto
    abstract double applicaSconto();

    public String getTaglia(){
        return taglia;
    }

    public void setTaglia(String taglia){
        this.taglia = taglia;
    }

    public String getColore(){
        return colore;
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public int getQuantita(){
        return quantita;
    }

    public void setQuantita(int quantita){
        this.quantita = quantita;
    }

    @Override
    public String toString(){
        return "taglia=" + taglia + ", prezzo=" + prezzo + ", colore=" + colore + ", quantita=" + quantita;
    }

    

    
    
}
