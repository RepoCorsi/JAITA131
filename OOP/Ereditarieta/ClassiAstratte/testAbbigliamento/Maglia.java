package testAbbigliamento;

public class Maglia extends Abbigliamento{

	String tipo;

	public Maglia(String taglia, double prezzo, String colore, int quantita, String tipo) {
		super(taglia, prezzo, colore, quantita);
		this.tipo = tipo;
	}

	@Override
	public double applicSconto() {
		if (getQuantita()>2&&getColore().equalsIgnoreCase("rosso")&&tipo.equalsIgnoreCase("felpa")) {
			double prezzoScontato=prezzo-(prezzo*0.1);
			System.out.println("Sconto Applicato, nuovo prezzo "+prezzoScontato);
			return prezzoScontato;
		}else {
			System.out.println("Sconto NON applicato");
			return prezzo;
		}		
	}
	
	@Override
	public String toString() {
		return tipo+" "+super.toString();
	}
}
