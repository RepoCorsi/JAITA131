package teststrumenti;

public class TestStrumenti {

    public static void main(String[] args) {

        Strumento s= new Strumento("generico");

        Chitarra c=new Chitarra("Fender",6);
        Pianoforte p=new Pianoforte(88,"piano");
        Tromba t=new Tromba("t1",5);

        s.suona();
        c.suona();
        p.suona();
        t.suona();		

		suonaMain(p);

        //Un array di Strumenti. Uso il tipo di base come contenitore di strumenti
        Strumento[] arrS={s,c,p,t};

        /*Polimorfismo è l'utilizzo di un metodo in molte forme diverse*/
        for (Strumento strumento : arrS){
            strumento.suona();//Metodo polimorfico
        }

    }//Fine Main

	//metodo che accetta in input istanze del tipo Strumento
	static void suonaMain(Strumento strumento) {

		strumento.suona();
	}

}//Fine Classe

//*************************STRUMENTO********************************************
class Strumento {

    private String nome;

    //Costruttore
    public Strumento(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void suona(){
        System.out.println("tutti gli strumenti suonano");
    }

    @Override
    public String toString(){
        return "Strumento{" + "nome=" + nome + '}';
    }
} //Fine classe Strumento


//***********************************CHITARRA**********************************************
class Chitarra extends Strumento{

    private int numeroCorde;

    public Chitarra(String nome,int numeroCorde){
        super(nome);
        this.numeroCorde=numeroCorde;
    }

    @Override
    public void suona(){
        System.out.println("la chitarra suona con le corde");
    }
} //Fine classe Chitarra


//**************************************PIANOFORTE**********************************************
class Pianoforte extends Strumento{

    private int numeroTasti;

    public Pianoforte(int numeroTasti, String nome){
        super(nome);
        this.numeroTasti = numeroTasti;
    }

    @Override
    public void suona(){
        System.out.println("il pianoforte si suona con i tasti");
    }
}//Fine classe Pianoforte


//****************************************TROMBA****************************************************
class Tromba extends Strumento{

    private int numeroTasti;

    public Tromba(String nome, int numeroTasti){
        super(nome);
        this.numeroTasti=numeroTasti;
    }

    @Override
    public void suona(){
        System.out.println("La tromba suona con l'aria");
    }
} //Fine classe Tromba
