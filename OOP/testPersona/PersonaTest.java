package esempioclasse;

public class PersonaTest {

    public static void main(String[] args) {


        //Analogia classe con tipo di dato. Tipo di dato Astratto. ADT abstract data type
        int numero;
        numero=10;

        //posso creare tanti oggetti e tutti condividono le stesse caratteristiche
        Persona persona1;
        persona1=new Persona();//vado a costruire un nuovo oggetto col costruttore di default!				
		//per accedere alle proprietà e ai metodi di un oggetto si usa il punto
        persona1.coloreOcchi="blu";
        persona1.eta=20;
        persona1.nome="Luigi";
        persona1.cognome="bianchi";

        System.out.println(persona1.eta);
        System.out.println("è maggiorenne? "+persona1.isMaggiorenne());


        //OVERLOADING METODI **********************************
        persona1.mangia("pizza");
        persona1.mangia("pasta","carne");

        persona1.info();

        //creo oggetto con costruttore personalizzato
        Persona persona2=new Persona("mario", "rossi", 33, true, "italiana");

        //metodo info fatto da me
        persona2.info();

        //chiamo implicitamente il metodo toString() overloading
        System.out.println(persona2);


        //****GETTER & SETTER INCAPSULAMENTO ***************************
        persona2.setSesso('m');
        char sesso=persona2.getSesso();
        System.out.println(sesso);
        //Per esempio, se ho usato 100 volte età nel mio codice, e domani la chiamo anni,
        //Non funzione più niente e devo fare 100 modifiche.
        //Se invece modifico con setEta basta che cambio solo il metodo.
        //Astrazione del codice dai dati. Il codice deve essere il più possibile indipendente
        //dai dati e funzionare sempre.

        persona2.setPeso(60);
        System.out.println(persona2.getPeso());

        //persona2.NUMERO_GAMBE=4; NO!!!! NUMERO_GAMBE è una costante! Final

        // EQUALS ****************************************	 
        //chiama il metodo equals che abbiamo ridefinito
        System.out.println(persona1.equals(persona2));

        //********** OGGETTO ANONIMO, SENZA IL NOME, E CHIAMO SUBITO IL METODO MANGIA*******************
        new Persona("aa", "bb", 10).mangia("mela");
    }
}
