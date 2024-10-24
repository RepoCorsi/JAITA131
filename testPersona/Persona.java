package testPersona;

public class Persona {

	// classe= Tipo di dato che contiene attributi+metodi

	// Attributi ->come è fatta la persona
	public String nome;
	public String cognome;
	public int eta;
	public boolean maggiorenne;

	// metodi --> cosa può fare
	public void mangia(String cibo) {
		System.out.println("sto mangiando " + cibo);
	}

	public void mangia(String pranzo, String cena) {
		System.out.println("a pranzo mangio " + pranzo + " a cena mangio " + cena);
	}

	public void dorme() {
		System.out.println("zzzzzzzzzzzzz");
	}

	public boolean isMaggiorenne() {
		return eta >= 18;
	}

	public void stampaInfo() {
		System.out.println("la persona si chiama " + nome + " " + cognome + " ha " + eta + " anni" + " maggiorenne? "
				+ isMaggiorenne());
	}

//ridefinire il metodo toString() di Object per fargli stampare quello che vogliamo noi
//toString è un metodo di Object presente in tutte le classi
	@Override // --> annotazione indica che il metodo esisteva già prima e noi l'abbiamo
				// cambiato
	public String toString() {
		// non deve stampare più l'indirizzo di memoria ma quello che voglio io
		return "la persona si chiama " + nome + " " + cognome + " ha " + eta + " anni" + " maggiorenne? "
				+ isMaggiorenne();
	}

//equals è un metodo di Object che ritorna true se puntano allo stesso oggetto in memoria
//(cioè, se sono lo stesso oggetto)
//Noi lo possiamo ridefinire facendo l'override	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Persona) {				
			//scegliete quando per voi 2 oggetti sono uguali
			return nome.equalsIgnoreCase(((Persona) o).nome) && cognome.equalsIgnoreCase(((Persona) o).cognome);
		}
		return false;
	}
}
