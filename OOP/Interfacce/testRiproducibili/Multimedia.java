package testRiproducibili;

public abstract class Multimedia {
	
	protected String titolo;
	protected int durata;
	
	public Multimedia(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}

	abstract void riproduci();

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "titolo=" + titolo + ", durata=" + durata;
	}
	
	
	
}
