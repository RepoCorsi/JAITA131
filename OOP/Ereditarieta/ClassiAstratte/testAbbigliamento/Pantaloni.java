package testAbbigliamento;

public class Pantaloni extends Abbigliamento {

	protected String modello;

	public Pantaloni(String taglia, double prezzo, String colore, int quantita, String modello) {
		super(taglia, prezzo, colore, quantita);
		this.modello = modello;
	}

	@Override
	double applicSconto() {
		if (modello.equalsIgnoreCase("bermuda")&&getTaglia().equalsIgnoreCase("xl")) {
			double prezzoScontato=prezzo-(prezzo*0.1);
			System.out.println("Sconto applicato, nuovo prezzo "+prezzoScontato);
			return prezzoScontato;
		}else {
			System.out.println("Sconto NON applicato");
			return prezzo;
		}		
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
	@Override
	public String toString() {
		return modello+" "+super.toString();
	}
	
}
