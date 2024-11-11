package testVeicolo;

//una classe può estendere solo un'altra classe
public class Macchina extends Veicolo{
	
	int porte;

	public Macchina(String nome, int ruote, int porte) {
		super(nome, ruote);//deve essere la prima istruzione
		this.porte = porte;
	}
	
	@Override
	public void parti() {
		System.out.println("parto con la benzina");
	}
	
	@Override
	public void ferma() {
		System.out.println("mi fermo col freno a mano");
	}
	

	@Override
	public String toString() {
		return super.toString() +" porte "+ porte;
	}
	
	
	
	
}
