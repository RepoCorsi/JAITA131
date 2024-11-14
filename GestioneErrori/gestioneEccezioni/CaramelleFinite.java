package gestioneEccezioni;

public class CaramelleFinite extends Exception{

	public CaramelleFinite() {
		System.out.println("Hai mangiato tutte le caramelle!");
	}

	public CaramelleFinite(String message) {
		super(message);
		
	}
	
	
}
