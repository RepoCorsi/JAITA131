package testStrumenti;

public class Strumento {

	private String nome;

	public Strumento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void suona() {
		System.out.println("tutti gli strumenti suonano");
	}
	
	@Override
	public String toString() {
		return "Strumento [nome=" + nome + "]";
	}
	
	
}
