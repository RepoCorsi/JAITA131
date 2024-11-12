package testAnimali;

//la classe stratta è una classe non completamente definita
//NON posso creare oggetti da una classe astratta. NO NEW ANIMALE!
//Nasce per essere estesa
public abstract class Animale {

	private String nome;
	private int eta;
	
	//se un metodo è astratto, Tutta la classe diventa astratta
	//un metodo astratto non ha corpo {}
	public abstract void parla();
	
	public abstract void mangia();
	
	
	public Animale(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public int getEta() {
		return eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", eta=" + eta + "]";
	}
	
	
	
	
}
