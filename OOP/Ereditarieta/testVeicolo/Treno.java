package testVeicolo;

public class Treno extends Veicolo{

	private int numeroVagoni;

	public Treno(String nome, int ruote, int numeroVagoni) {
		super(nome, ruote);
		this.numeroVagoni = numeroVagoni;
	}
	
	@Override
	public void parti() {
		System.out.println("Il treno parte dalla stazione con "+numeroVagoni+" vagoni");
	}

	@Override
	public void ferma() {
		System.out.println("il treno si ferma alla stazione");
	}
	
	@Override
	public String toString() {
		return super.toString() +" numero Vagoni "+ numeroVagoni;
	}
	
	
	
}
