package testStrumenti;

public class Tromba extends Strumento{

	private int numeroTasti;

	public Tromba(String nome, int numeroTasti) {
		super(nome);
		this.numeroTasti = numeroTasti;
	}
	
	@Override
	public void suona() {
		System.out.println("La tromba si suona con l'aria");
	}
	
}
