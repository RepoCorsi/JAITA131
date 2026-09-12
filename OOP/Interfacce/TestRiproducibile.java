package testriproducibile;

import java.util.Arrays;

public class TestRiproducibile {

    public static void main(String[] args) {


       Multimedia[] playlist = {
            new Canzone("Canzone 1", 120, "Autore 1"),
            new Film("Filmato 1", 180, 1000),
            new Canzone("Canzone 2", 150, "Autore 2"),
            new Film("Filmato 2", 200, 500),
        };

		//Audio e video hanno in comune il fatto di poter essere riprodotti
		//e quindi li mettiamo in una interfaccia
        Riproducibile[] r ={new Audio(),new Video()};

        for (Riproducibile riproducibile : r){
			//il metodo play riproduce un elemento multimediale(canzone o un film)
            riproducibile.play(playlist);
        }

    }//Fine main

}//Fine classe col main


//----------------- Multimedia Classe Astratta -------------------------
abstract class Multimedia {
    protected String titolo;
    protected int durata;

    public Multimedia(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    abstract void riproduci();

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString(){
        return "Titolo=" + titolo + ", durata=" + durata;
    }

}//Fine Multimedia

//-------------------- Interfaccia --------------------
interface Riproducibile {
    void play(Multimedia[] multimedia);
}//Fine interfaccia


//--------------- Canzone Classe Concreta ---------------------------
class Canzone extends Multimedia {
    private String autore;

    public Canzone(String titolo, int durata, String autore) {
        super(titolo, durata);
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public String toString(){
        return super.toString()+ " autore=" + autore;
    }

    @Override
    void riproduci(){
        System.out.println("Sto riproducendo la canzone "+getTitolo());
    }

}//fine canzone


//--------------- Film Classe Concreta ---------------------------
class Film extends Multimedia {
    private int numeroVisualizzazioni;

    public Film(String titolo, int durata, int numeroVisualizzazioni) {
        super(titolo, durata);
        this.numeroVisualizzazioni = numeroVisualizzazioni;
    }

    public int getNumeroVisualizzazioni() {
        return numeroVisualizzazioni;
    }

    @Override
    public String toString(){
        return super.toString()+" Numero di visualizzazioni: " + numeroVisualizzazioni;
    }

    @Override
    void riproduci(){
        System.out.println("Sto riproducendo il video "+getTitolo());
    }

}//Fine Film


//------------------- Audio -----------------------------------------
class Audio implements Riproducibile {

    @Override
    public void play(Multimedia[] multimedia) {
        for (Multimedia m : multimedia) {
            if (m instanceof Canzone) {
                Canzone c = (Canzone) m;
                c.riproduci();
                System.out.println(c);	   
				System.out.println("---------------");
            }
        }
    }
}//fine audio

//------------------- Video -----------------------------------------
class Video implements Riproducibile {

    @Override
    public void play(Multimedia[] multimedia) {
        for (Multimedia m : multimedia) {
            if (m instanceof Film) {
                Film f = (Film) m;
                f.riproduci();
                System.out.println(f);
            }
        }
    }
}//fine video
