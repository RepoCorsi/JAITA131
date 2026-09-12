package TestVeicolo;

public class TestVeicolo {

    public static void main(String[] args){

    // ereditarietà = il processo mediante il quale una classe acquisisce gli attributi e i metodi di un'altra.
        Macchina car = new Macchina("punto",4,5);

        System.out.println(car);
        car.parti();
        car.ferma();

        Bicicletta bike = new Bicicletta("Bianchi",2, 2);

        System.out.println(bike);
        bike.parti();
        bike.ferma();

        Treno treno = new Treno("Frecciarossa", 8, 15);
        System.out.println(treno);

        // Chiamata ai metodi
        treno.parti();
        treno.ferma();

        /******DA AGGIUGERE DOPO: POLIMORFISMO************************/

        System.out.println("-----------------------------------");

        //posso usare il tipo generale Veicolo perchè sono tutti veicoli
        Veicolo[] mezzo= {car,bike,treno};
							
		//polimorfismo -> chiamare lo stesso metodo su oggetti diversi
		//il polimorfismo si fa solo sui metodi override

        for (Veicolo vei : mezzo){
            //polimorfismo. Le classi chiamano lo stesso metodo che ha comportamenti diversi
            System.out.println(vei);
             vei.parti();
             vei.ferma();
        }
    } //Fine main
}//Fine Classe

//*************************************
class Veicolo {
    /*Protected visibilità solo alle classi figlie*/
    protected String nome;
    protected int ruote;

    public Veicolo(String nome,int ruote){
        this.nome = nome;
        this.ruote=ruote;
    }


    void parti(){
        System.out.println("Il veicolo si muove");
    }

    void ferma(){

        System.out.println("Il veicolo si ferma");
    }

    @Override
    public String toString(){
        return "Veicolo " + "nome=" + nome + ", ruote=" + ruote;
    }

}//Fine Veicolo


//*************************************
class Macchina extends Veicolo {

    int porte;

    public Macchina(String nome,int ruote, int porte){
        super(nome,ruote); //Deve essere la prima istruzione
        this.porte=porte;
    }


    /******OVERRIDE DA AGGIUNGERE DOPO****/
    @Override
        void parti(){
        System.out.println("Vado a benzina");
    }

    @Override
    void ferma(){

        System.out.println("Mi fermo col freno a mano");
    }

    @Override
    public String toString(){
        return super.toString()+ " porte "+porte;
    }

} //Fine Veicolo


//*************************************
class Bicicletta extends Veicolo {

    int pedali;

    public Bicicletta(String nome, int ruote,int pedali){
        super(nome, ruote);
        this.pedali = pedali;
    }


    /******OVERRIDE DA AGGIUNGERE DOPO****/
    @Override
    void parti(){
        System.out.println("vado a pedali");
    }

    @Override
    void ferma(){
         System.out.println("Mi fermo con le manopole ");
    }

    @Override
    public String toString(){
        return super.toString()+ " pedali "+pedali;
    }

}
//*************************************

class Treno extends Veicolo {
    private int numeroVagoni; // Numero di vagoni del treno (nuovo attributo)

    // Costruttore della classe Treno che chiama il costruttore della classe Veicolo
    public Treno(String nome, int numeroRuote, int numeroVagoni) {
        super(nome, numeroRuote);
        this.numeroVagoni = numeroVagoni;
    }

    // Sovrascrittura del metodo parti per il Treno
    @Override
    public void parti() {
        System.out.println("Il treno parte con " + numeroVagoni + " vagoni.");
    }

    // Sovrascrittura del metodo ferma per il Treno
    @Override
    public void ferma() {
        System.out.println("Il treno si ferma alla stazione.");
    }

    @Override
    public String toString(){
        return super.toString()+ " numeroVagoni=" + numeroVagoni;
    }

}