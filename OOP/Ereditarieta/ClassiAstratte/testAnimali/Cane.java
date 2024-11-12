package testAnimali;

public class Cane extends Animale {
//Se estendo una clase astratta, sono costretto a fare l'override di tutti i metodi astratti
	
	public Cane(String nome, int eta) {
		super(nome,eta);
	}

	@Override
	public void parla() {
		System.out.println("bau bau");
	}

	@Override
	public void mangia() {
		System.out.println("mangio le ossa");
	}

	
	
	
}
