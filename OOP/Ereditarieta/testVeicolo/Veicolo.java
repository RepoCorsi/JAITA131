package testVeicolo;

public class Veicolo {

	private String nome;
	private int ruote;
	
	public Veicolo(String nome, int ruote) {
		this.nome = nome;
		this.ruote = ruote;
	}
		
	public void parti() {
		System.out.println("il veicolo parte");
	}
	
	public void ferma() {
		System.out.println("il veicolo si ferma");
	}
	
		
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRuote() {
		return ruote;
	}


	public void setRuote(int ruote) {
		this.ruote = ruote;
	}

	@Override
	public String toString() {
		return "Veicolo: nome=" + nome + ", ruote=" + ruote;
	}

	
}
