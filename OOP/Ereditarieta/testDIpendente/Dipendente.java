package testDIpendente;

import testPersona.Persona;

public class Dipendente extends Persona{

	private double stipendio;

	public Dipendente(double stipendio,String nome, String cognome, int eta) {
		super(nome, cognome, eta);//<--costruttore di Persona
		this.stipendio=stipendio;
	}

	//metodo che aumenta lo stipendio solo se l'età è > 50
	public void aumenta(int percentuale) {
		if (this.getEta()>50) {//getEta ci arriva da persona
			stipendio+=(stipendio*percentuale)/100;
	System.out.println("Aumentato stipendio a "+this.getNome()+" nuovo stipendio "+stipendio);
		}
		else {
			System.out.println("Aumento non concesso a "+this.getNome());
		}
	}
	
	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return super.toString()+ "stipendio=" + stipendio;
	}

	


	
	
}
