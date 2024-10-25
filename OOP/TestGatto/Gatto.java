package testGatto;

public class Gatto {

	//modificatori di accesso:
	//public -->visibile dappertutto
	//se non metto niente --> visibile solo all'interno del package
	//private --> visibile solo dentro il file.
	
	//gli attributi -> come è fatta
	private String nome;
	private int eta;
	private String razza;
	
	//overload dei costruttori
	public Gatto(String nome, int eta, String razza) {
		this.nome=nome;
		this.eta=eta;
		this.razza=razza;
	}
		
	public Gatto(String nome, int eta) {
		this.nome=nome;
		this.eta=eta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta=eta;
	}	
		
	public String getRazza() {
		return razza;
	}
	
	public void setRazza(String razza) {
		this.razza=razza;
	}
	
	
	//cosa può fare -> metodi	
	public void miagola() {
		System.out.println("miao miao");
	}
	
	public void mangia(String cibo) {
		System.out.println("sto mangiando "+cibo);
	}
	
	public void faiLeFusa() {
		System.out.println("prrr prrr");
	}
	
	public boolean isAnziano() {
		return eta>10;
	}
	
	//Override permette la riscrittura del metodo che già esiste
	@Override
	public String toString() {
		return "il gatto si chiama "+nome+" ha "+eta+" anni ed è di razza "+razza;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Gatto) {
			return razza.equalsIgnoreCase(((Gatto)o).razza );
		}
		return false;
	}
}
