package eserciziclassi;

public class Prodotti {
    
    private int codice;
    private String descrizione;
    private double prezzo;

    public Prodotti(int codice, String descrizione, double prezzo){
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public void applicaSconto(int sconto){
        prezzo-=(prezzo*sconto)/100;
    }
    
    public int getCodice(){
        return codice;
    }

    public void setCodice(int codice){
        this.codice = codice;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }
    
    
    
}
