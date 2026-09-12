package Supermercato;

public class Prodotto {

    private String codice;
    private String descrizione;
    private double prezzo;

    public Prodotto(String codice, String descrizione, double prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }    

    public void setCodice(String codice){
        this.codice = codice;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return "Prodotto{" + "codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo + '}';
    }
    
    
    
}
