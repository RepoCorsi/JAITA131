package eserciziclassi;

public class Contatore {
    
    private int numero;

    //Costruttore
    public Contatore(int numero){
        this.numero = numero;
    }    
        
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void aumentaNumero(){
        this.numero++;
    }

    public void diminuisciNumero(){
        this.numero--;
    }


    

    
    
}
