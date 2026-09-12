package testabbigliamento;

public class Pantaloni extends Abbigliamento{

    protected String modello;

    public Pantaloni(String modello, String taglia, double prezzo, String colore, int quantita){
        super(taglia, prezzo, colore, quantita);
        this.modello = modello;
    }


    @Override
    double applicaSconto(){
        if (modello.equalsIgnoreCase("bermuda")&&getTaglia().equalsIgnoreCase("xl")){
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
        return modello+" "+super.toString(); 
    }






}
