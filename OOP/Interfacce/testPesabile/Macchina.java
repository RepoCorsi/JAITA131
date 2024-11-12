package testPesabile;

public class Macchina implements Pesabile{

	String nome;
	int peso;
		
	public Macchina(String nome, int peso) {
		this.nome = nome;
		this.peso = peso;
	}

	@Override
	public void pesa() {
		System.out.println("la macchina "+nome+" pesa "+peso);
	}

}
