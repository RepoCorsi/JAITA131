package testabbigliamento;

public class Maglia extends Abbigliamento{

    String tipo;

    public Maglia(String tipo, String taglia, double prezzo, String colore, int quantita){
        super(taglia, prezzo, colore, quantita);
        this.tipo = tipo;
    }
    

    @Override
    double applicaSconto(){
        if (getQuantita()>2&& getColore().equalsIgnoreCase("rosso")&& tipo.equals("felpa")){
            double prezzoScontato=prezzo-(prezzo*0.1);
            System.out.println("Sconto applicato, nuovo prezzo "+prezzoScontato);
            return prezzoScontato;
        }else{
            System.out.println("sconto NON applicato");
            return prezzo;
        }
    }

    
    @Override
    public String toString(){
        return tipo+" "+super.toString();
    }
    
    
    
}
