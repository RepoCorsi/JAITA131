package testNegozio;

import testPersona.Persona;

public class Cliente extends Persona{

	static int numeroTessera=0;//ce n'è uno per tutta la classe. Appartiene alla classe
	int tesseraCliente=0;//attributo di cliente. ogni cliente che creo avrà il suo tesseraCliente
	
	public Cliente(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
		numeroTessera++;//incremento lo static
		tesseraCliente=numeroTessera;//assegnamo all'attributo tessera cliente		
	}

	@Override
	public String toString() {
		return "Cliente: "+super.toString()+ " numero tessera:" + tesseraCliente;
	}
	
	
	
}
