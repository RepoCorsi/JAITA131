package testPesabile;

import testPersona.Persona;

public class Studente extends Persona implements Pesabile{

	double peso;
	
	public Studente(double peso, String nome, String cognome, int eta) {
		super(nome, cognome, eta);	
		this.peso=peso;
	}

	@Override
	public void pesa() {
		System.out.println("lo studente "+getNome()+" pesa "+peso);
	}

	
	
	
}
