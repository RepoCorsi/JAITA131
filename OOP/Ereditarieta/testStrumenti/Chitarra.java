package testStrumenti;

public class Chitarra extends Strumento{

	private int numeroCorde;
	
	public Chitarra(String nome, int numeroCorde) {
		super(nome);
		this.numeroCorde=numeroCorde;
	}
	
	@Override
	public void suona() {
		System.out.println("la chitarra si suona con le corde");
	}
}
