package testStudente;

import testPersona.Persona;

//abbiamo esteso la classe persona facendola diventare uno studente
public class Studente extends Persona{
	
	// is a -> è un 
	//la classe serve per specializzare una classe più generica

	String materia;
	
	
	public Studente(String materia,String nome, String cognome, int eta) {
		//super deve essere la prima cosa che mettete
		super(nome,cognome,eta);//-->sto passando i valori al costruttore di persona
		this.materia=materia;
	}
	
	public String getMateria() {
		return materia;
	}
	

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void studia(String materia) {
		System.out.println("studio "+materia);
	}


	@Override
	public void dorme() {
		System.out.println("Dormo poco perchè devo studiare");
	}
	

	@Override
	public String toString() {
		return super.toString()+" studia "+ materia;
	}
	
	
	
	
	
}
