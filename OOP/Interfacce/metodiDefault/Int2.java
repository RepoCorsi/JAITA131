package metodiDefault;

public interface Int2 {

	//non si possono avere gli stessi nomi delle varibili e dei metodi
	int y=20;
	
	default void stampa2() {
		System.out.println("ciao dall'interfaccia 2");
	}
}
