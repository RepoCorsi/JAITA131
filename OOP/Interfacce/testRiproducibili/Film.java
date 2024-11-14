package testRiproducibili;

public class Film extends Multimedia{

	private int numeroVisualizzazioni;

	public Film(String titolo, int durata, int numeroVisualizzazioni) {
		super(titolo, durata);
		this.numeroVisualizzazioni = numeroVisualizzazioni;
	}

	public int getNumeroVisualizzazioni() {
		return numeroVisualizzazioni;
	}

	public void setNumeroVisualizzazioni(int numeroVisualizzazioni) {
		this.numeroVisualizzazioni = numeroVisualizzazioni;
	}

	@Override
	void riproduci() {
		System.out.println("Sto riproducendo il film "+getTitolo());
	}

	@Override
	public String toString() {
		return super.toString()+ " numero visualizzazioni=" + numeroVisualizzazioni;
	}
	
	
	
}
