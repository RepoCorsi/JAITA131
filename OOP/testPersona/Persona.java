package testPersona;

public class Persona {

	//modificatori di accesso:
	//public -->visibile dappertutto
	//se non metto niente --> visibile solo all'interno del package
	//private --> visibile solo dentro il file.	
	
	//Tre principi base dei linguaggi ad ogetti:
	//1) incapsualmento --> mascherare il funzionamento della classe.
						   //Esporre solo quello che serve per poterci lavorare
	
	// classe= Tipo di dato che contiene attributi+metodi

	// Attributi ->come è fatta la persona
	private String nome;
	private String cognome;
	private int eta;
	private boolean maggiorenne;
	
	private int valore;
	
	//queste 2 propietà non saranno visibili all'esterno
	private char sesso;
	private double peso;
	
	//get -> per ritornare le informazioni sulla variabile
	//set -> per assegnare un valore alle variabili

	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta=eta;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setValore(int valore) {
		//implemento una logica 
		//tutti i controlli 
		//è centralizzato
		//dgdgdfg questa modifica vale per tutti
		this.valore=valore;
	}
	
	public int getValore() {
		return valore;
	}
	
	public char getSesso() {
		return sesso;
	}
	
	public double getPeso() {
		return peso;
	}
		
	public void setSesso(char sesso) {
		// solo quando è tutto come vuoi tu
		this.sesso=sesso;
	}
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	//metodo costruttore ha il compito di costruire l'oggetto.
	//viene eseguito quando si fa il NEW()
	//normalmente è nascosto, ma posso renderlo esplicito
	//Il costruttore è un METODO(come tutti gli altri) che ha LO STESSO NOME DELLA CLASSE 
	//MA NON RITORNA NIENTE NEANCHE VOID
	
	public Persona() {//costruttore di Default
		System.out.println("sono stato chiamato e creo l'oggetto");
	}
	
	//overload del costruttore
	public Persona(String nome, String cognome, int eta) {
		this.nome=nome; 
		//setNome(nome);
		this.cognome=cognome;
		this.eta=eta;
		this.maggiorenne=isMaggiorenne();
	}
	
	//secondo overload
	public Persona(String x, String y) {
		nome=x;
		cognome=y;
	}
	
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
