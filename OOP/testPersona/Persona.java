package esempioclasse;

public class Persona {

// Tre principi base dei linguaggi ad oggetti:
// incapsulamento --> mascherare il funzionamento della classe. Esporre solo quello che serve per poterci lavorare
//- ereditarietà - polimorfismo
// classe= Tipo di dato che contiene attributi+metodi
// Attributi ->come è fatta la classe. In questo caso la persona
// metodi --> cosa può fare

//modificatori di accesso:
//public -->visibile dappertutto
//se non metto niente --> visibile solo all'interno del package
//private --> visibile solo dentro il file.

    //FARE JAVADOC
    //poi run->generate javadoc.
    //Attenzione!! Se non si mette public/private/protected nei metodi, non compare nella javadoc
    //E non si vede nelle altre classi se ne abbiamo bisogno!!(Tipo ereditarietà)

    //Attributi : le proprietà che definiscono lo stato del mio oggetto
    public String nome;
    public String cognome;
    public int eta;
    public boolean maggiorenne;//se non valorizzata vale false
    public String coloreOcchi;
    public double altezza;
    public String nazionalita;//se non valorizzata vale null
    public boolean patentato;
    public final int NUMERO_OCCHI = 2; //Final è costante
    public final int NUMERO_GAMBE = 2;

    // Con i modificatori di accesso public private e protected realizziamo l'incapsulamento
    private char sesso;
    private double peso;

	//get -> per ritornare le informazioni sulla variabile
	//set -> per assegnare un valore alle variabili


    /*** NON DARE VALORI Altrimenti tutti gli oggetti che creo avrebbero gli stessi valori ****/
    //   public String nome="Mario";
    //   public int età=46;
    //   public String coloreOcchi="Marroni";
    //   public boolean maggiorenne=true;


    //**************** Metodi **************************************	 
// metodi --> cosa può fare

    //Overloading metodo mangia
    public void mangia(String cibo){
        System.out.println("Sto mangiando " + cibo);
    }

    public void mangia(String pranzo, String cena){
        System.out.println("A pranzo mangio " + pranzo + " e a cena mangio " + cena);
    }

    public void dorme(){
        System.out.println("zzzzzzzzzz");
    }


    public boolean isMaggiorenne(){
        return this.eta >= 18;
    }

    public void info(){

        System.out.println("la persona si chiama " + nome
                + " ha " + eta + " anni"
                + " nazionalità " + nazionalita
                + " Maggiorenne?: " + maggiorenne
                + " Ha come tutti " + NUMERO_OCCHI + " occhi");
    }

    /**************************** COSTRUTTORI *************************************************/

    //Costruttore di default. Esiste se non ne creiamo uno noi.
	//metodo costruttore ha il compito di costruire l'oggetto.
	//viene eseguito quando si fa il NEW()
	//normalmente è nascosto, ma posso renderlo esplicito
	//Il costruttore è un METODO(come tutti gli altri) che ha LO STESSO NOME DELLA CLASSE
	//MA NON RITORNA NIENTE NEANCHE VOID

    public Persona(){
    }
    
//costruttore personalizzato. Overload del costruttore
    //costruttore con 2 parametri
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    //costruttore con 3 parametri
    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }


    //costruttore con 5 parametri
    public Persona(String nome, String cognome, int eta, boolean maggiorenne, String nazionalità){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.maggiorenne = maggiorenne;
        this.nazionalita = nazionalità;
    }

/**************************** INCAPSULAMENTO - GET SET MODIFICATORI ACCESSO ****************************************************************/

    //per accedere ai membri privati usiamo get/set
    public char getSesso(){
        return sesso;
    }

    public void setSesso(char sesso){
        this.sesso = sesso;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        this.eta = eta;
    }



    //*** OVERRIDE DEI METODI DI OBJECT **********************************
//ridefinire il metodo toString() di Object per fargli stampare quello che vogliamo noi.
//toString è un metodo di Object presente in tutte le classi
    //toString. OVERRIDE perchè il metodo toString esiste già.
    ///Override indica che il metodo esisteva già, ma io lo sto ridefinendo secondo le mie necessità
    @Override
    public String toString(){
		// non deve stampare più l'indirizzo di memoria ma quello che voglio io
        return "la persona si chiama " + nome
                + " ha " + eta + " anni"
                + " nazionalità " + nazionalita
                + " Maggiorenne?: " + maggiorenne
                + " Ha come tutti " + NUMERO_OCCHI + " occhi";
    }


    //FARE PER ULTIMO EQUALS
    //Ritorna true se puntano allo stesso oggetto in memoria (cioè, se sono lo stesso oggetto)
//Noi lo possiamo ridefinire facendo l'override.
    //EQUALS Decidiamo noi quando 2 oggetti sono uguali****************
    //In questo caso quando hanno nome e cognome uguali.
    //nome e cognome CASE SENSITIVE
    @Override
    public boolean equals(Object obj){
       // if (obj instanceof Persona){ //se l'oggetto in input è di tipo persona
            return this.nome.equals(((Persona) obj).nome)&&cognome.equals(((Persona) obj).cognome); //e confronto gli attributi che mi interessano
       // }
       // return false;
    }

    //Oppure in modo più semplice:
    //ma NON è override di equals, ma è un metodo nostro
//    public boolean equals(Persona obj){
//        return this.nome.equals(obj.nome)&&cognome.equals(obj.cognome);
//    }

}
