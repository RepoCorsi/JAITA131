package testVeivolo;

public class Aereo extends Veivolo{

	public Aereo(String modello, int velocitaMassima) {
		super(modello, velocitaMassima);
		
	}

	@Override
	public void decollo() {
		System.out.println("l'aereo decolla dalla pista");
	}

	@Override
	public void atterraggio() {
		System.out.println("l'aereo atterra sulla pista");
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
