package testVeivolo;

public class Idrovolante extends Veivolo{

	public Idrovolante(String modello, int velocitaMassima) {
		super(modello, velocitaMassima);
		
	}

	@Override
	public void decollo() {
		System.out.println("L'idrovolante decolla dall'acqua");
	}

	@Override
	public void atterraggio() {
		System.out.println("L'idrovolante atterra sull'acqua");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
