package testprodotti;

public class Prodotti {

    private static int codice=0;
    private int codProdotto;
    private String descrizione;
    protected double prezzo; //protected perchè ci serve nelle altri classi figlie
    Cliente c;	 //--> dalla classe Cliente

	/**
	 * Costruttore che valorizza descrizione prezo e cliente
	 * il codice sarà autoincrement grazie alla variabile static codice
	 * @param descrizione di tipo String
	 * @param prezzo double
	 * @param c deriva dalla classe Cliente
	 */
    public Prodotti(String descrizione, int prezzo,Cliente c){
        codice++; //incrementiamo lo static
        this.codProdotto = codice;	//lo assegnamo all'attributo
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.c=c;
    }


	//javadoc
	/**
	 * metodo che applica lo sconto per i clienti con più di 60 anni
	 * ritona void
	 */
    //20% per prodotti alimentari 10 giorni dalla scadenza
    //10% per prodotti non alimentari fatti con materiale riciclabile

    public void applicaSconto(){
        if (c.eta>60){
           prezzo-=(prezzo*5)/100;
        }
    }

	//metodi get e set di codProdotto, descrizione e prezzo
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

    //informazioni sul cliente
    public Cliente getC(){
        return c;
    }

    public void setC(Cliente c){
        this.c = c;
    }


    @Override
    public String toString(){
      //NON METTIAMO QUI IL CLIENTE, ALTRIMENTI LO RIPETEREBBE PER TUTTI I PRODOTTI NEL LOOP
        return "Prodotti{" + "codice=" + codProdotto + ", descrizione=" + descrizione + ", prezzo=" + prezzo + '}';
    }



}
