package testNegozio;

public class Prodotto {
	//ce n'è uno per tutta la classe. Appartiene alla classe e non all'oggetto
	private static int codice=0;
	private int codProdotto;
	private String descrizione;
	protected double prezzo;//pubblico per le classi derivate, privato per tutti gli altri
	Cliente c; //--> dalla classe Cliente
	
	/**
	 * Costruttore che valorizza descrizione prezo e cliente 
	 * il codice sarà autoincrement grazie alla variabile static codice
	 * @param descrizione di tipo String
	 * @param prezzo double
	 * @param c deriva dalla classe Cliente
	 */
	public Prodotto(String descrizione, double prezzo, Cliente c) {
		codice++;//incrementiamo lo static
		this.codProdotto=codice;//lo assegnamo all'attributo
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.c = c;
	}

	//javadoc
	/**
	 * metodo che applica lo sconto per i clienti con più di 60 anni
	 * ritona void
	 */
	
	public void applicaSconto() {
		if (c.getEta()>60) {
			prezzo-=(prezzo*5)/100;			
		}
	}
	
	//metodi get e set di codProdotto, descrizione e prezzo
	public int getCodProdotto() {
		return codProdotto;
	}

	public void setCodProdotto(int codProdotto) {
		this.codProdotto = codProdotto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Prodotto " + codProdotto + ", descrizione=" + descrizione + ", prezzo=" + prezzo + "]";
	}
	
	
	
	
}
