package altre_Classi;

public class Studente {
    
    public int voto1; 
    public int voto2; 
    public int voto3;

    public String nome;

    // calcolo la media dei voti:

    public double mediaVoti() {
	return (double)(voto1 + voto2 + voto3)/3;
    }

}

//-------------------------------------------------------------------------------------
public class Cellulare {
  
    private String marca,modello;
    private double credito;
    private int numeroChiamate;
    private final double PREZZO_AL_MINUTO=0.20;

    //FARE JAVADOC 
    //poi run->generate javadoc. 
    //Attenzione!! Se non si mette public/private/protected nei metodi, non compare nella javadoc
    //E non si vede nelle altre classi se ne abbiamo bisogno!!(Tipo ereditarietà)
    
    
    /**
     * Creo un oggetto della classe Cellulare.
     * @param marca
     * @param modello
     * @param credito 
     */
    public Cellulare(String marca, String modello, double credito){
        this.marca = marca;
        this.modello = modello;
        this.credito = credito;
    }

    /**
     * Ricarica il cellulare.
     *
     * @param soldi Importo della ricarica.
     */
    public void ricarica(double soldi){
        credito = credito + soldi;
    }

    /**
     * Effettua una chimata, aggiorna il credito, incrementa di una unità il
     * numeroChiamate.
     *
     * @param minutiDurata Durata della chiamata.
     */
    public void chiamata(double minutiDurata){
        credito -=(PREZZO_AL_MINUTO * minutiDurata);
        numeroChiamate++;
    }

    /**
     * Restituisce il valore del credito.
     *
     * @return Quanto credito abbiamo.
     */
    public double getCredito(){
        return credito;
    }

    public void setCredito(double credito){
        this.credito = credito;
    }

    
    /**
     * Restituisce il numero di chiamate.
     *
     * @return numeroChiamate.
     * Quante chiamate abbiamo fatto.
     */
    public int getNumeroChiamate(){
        return numeroChiamate;
    }
    
    public boolean creditoEsaurito(){
        return credito<=0;
    }    

    @Override
    public String toString(){
        return "Cellulare{" + "marca=" + marca + ", modello=" + modello + ", credito=" + credito +
               ", numeroChiamate=" + numeroChiamate + ", PREZZO_AL_MINUTO=" + PREZZO_AL_MINUTO + '}';
    }
}

//----------------------------------------------------
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
