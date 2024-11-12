package testVeivolo;

public abstract class Veivolo {

	private String modello;
	private int velocitaMassima;
	
	public Veivolo(String modello, int velocitaMassima) {
		this.modello = modello;
		this.velocitaMassima = velocitaMassima;
	}

	/**
	 * Metodo astratto
	 * Deve essere implementati nelle classi ereditate
	 */
	public abstract void decollo();
	
	/**
	 * Metodo astratto
	 * Deve essere implementati nelle classi ereditate
	 */	
	public abstract void atterraggio();
		
	
	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getVelocitaMassima() {
		return velocitaMassima;
	}

	public void setVelocitaMassima(int velocitaMassima) {
		this.velocitaMassima = velocitaMassima;
	}

	@Override
	public String toString() {
		return "Veivolo [modello=" + modello + ", velocitaMassima=" + velocitaMassima + "]";
	}
	
	
}
