package testStrumenti;

public class Pianoforte extends Strumento{

	private String tipoPianoforte;

	public Pianoforte(String nome, String tipoPianoforte) {
		super(nome);
		this.tipoPianoforte = tipoPianoforte;
	}
	
	@Override
	public void suona() {
		System.out.println("il pianoforte si suona con i tasti");
	}
	
}
