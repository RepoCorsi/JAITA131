package testRiproducibili;

public class Canzone extends Multimedia{

	private String autore;

	public Canzone(String titolo, int durata, String autore) {
		super(titolo, durata);
		this.autore = autore;
	}

	@Override
	void riproduci() {
		System.out.println("Sto riproducendo la canzone "+getTitolo());
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return  super.toString()+ " autore=" + autore;
	}
	
	
}
