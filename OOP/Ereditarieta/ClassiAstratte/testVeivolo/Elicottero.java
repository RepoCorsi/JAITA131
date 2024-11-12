package testVeivolo;

public class Elicottero extends Veivolo{

	public Elicottero(String modello, int velocitaMassima) {
		super(modello, velocitaMassima);
		
	}

	@Override
	public void decollo() {
		System.out.println("l'elicottero decolla in verticale");
	}

	@Override
	public void atterraggio() {
		System.out.println("l'elicottero atterra in verticale");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
