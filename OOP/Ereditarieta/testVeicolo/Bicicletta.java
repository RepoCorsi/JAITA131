package testVeicolo;

public class Bicicletta extends Veicolo{

	int pedali;

	public Bicicletta(String nome, int ruote, int pedali) {
		super(nome, ruote);
		this.pedali = pedali;
	}

	@Override
	public void parti() {
		System.out.println("parto con i pedali");
	}
	
	@Override
	public void ferma() {
		System.out.println("mi fermo con le manopole");
	}
	
	
	@Override
	public String toString() {
		return  super.toString() +" pedali=" + pedali;
	}
	
	
}
