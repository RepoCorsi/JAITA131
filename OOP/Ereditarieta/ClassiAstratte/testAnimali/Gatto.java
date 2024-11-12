package testAnimali;

public class Gatto extends Animale{

	public Gatto(String nome, int eta) {
		super(nome, eta);
	}

	@Override
	public void parla() {
		System.out.println("miao miao");
	}

	@Override
	public void mangia() {
		System.out.println("il topo");
	}
	
	
}
