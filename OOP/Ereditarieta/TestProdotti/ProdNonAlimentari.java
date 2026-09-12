package testprodotti;

public class ProdNonAlimentari extends Prodotti{

    String materiale;

    public ProdNonAlimentari(String materiale, String descrizione, int prezzo,Cliente c){
        super(descrizione, prezzo,c);
        this.materiale = materiale;
    }

    @Override
    public void applicaSconto(){
        if (materiale.equalsIgnoreCase("carta")||materiale.equalsIgnoreCase("vetro")||materiale.equalsIgnoreCase("plastica")){
            //prezzo=prezzo-(prezzo*10)/100;
            prezzo-=prezzo*0.1; //10%
        }
        //super.applicaSconto(); //ulteriore sconto da prodotto se età>60
	public String getMateriale() {
		return materiale;
	}
	public void setMateriale(String materiale) {
		this.materiale = materiale;
    }

    @Override
    public String toString(){
        return super.toString()+" Materiale: "+materiale;
    }



}
