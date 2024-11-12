package testNegozio;

public class ProdNonAlimentari extends Prodotto{

	String materiale;

	/**
	 * Costruttore della classe non alimantare
	 * @param materiale
	 * @param descrizione
	 * @param prezzo
	 * @param c
	 */
	public ProdNonAlimentari(String materiale,String descrizione, double prezzo, Cliente c) {
		super(descrizione, prezzo, c);
		this.materiale=materiale;
		
	}
	
	@Override
	public void applicaSconto() {		
		if (materiale.equalsIgnoreCase("carta")||
			materiale.equalsIgnoreCase("vetro")||
			materiale.equalsIgnoreCase("plastica")) {
			prezzo-=prezzo*0.1;
		}
		super.applicaSconto();//ulteriore sconto da prodotto se eta>60
	}
	
	public String getMateriale() {
		return materiale;
	}
	
	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	@Override
	public String toString() {
		return super.toString()+"materiale=" + materiale;
	}
	
	
	
}
