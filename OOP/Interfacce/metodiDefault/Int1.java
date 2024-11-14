package metodiDefault;

public interface Int1 {
	//public static final
	int x=10;
	
	//public abstract
	void ciao();
	
	//da java 8 sono stati creati i metodi di default
	default void stampa() {
		System.out.println("ciao dall'interfaccia 1");
	}
	
}
