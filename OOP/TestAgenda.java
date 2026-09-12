package agenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*   Eseguire con tasto dx->run file, perchè il main è in un altro package*/
//1) impegno
//2) pagina
//3) settimana
//4) main
public class TestAgenda {//Settimanale

    public static void main(String[] args){

        //Definisco gli impegni creando oggetti della classe Impegno
        Impegno i1 = new Impegno("Studiare Java");
        Impegno i2 = new Impegno("Andare in posta");
        Impegno i3 = new Impegno("Fare la spesa");
        Impegno i4 = new Impegno("Fare l'aperitivo");
        Impegno i5 = new Impegno("Pulire casa");

        //Associo gli impegni al giorno della settimana
        ArrayList<Impegno> impegniLunedì = new ArrayList<>(List.of(i1, i2, i3));
//		impegniLunedì.add(i1);
//		impegniLunedì.add(i2);
//		impegniLunedì.add(i3);		
        ArrayList<Impegno> impegniMartedì = new ArrayList<>(List.of(i1, i4, i5));
        ArrayList<Impegno> impegniMercoledì = new ArrayList<>(List.of(i1, i4));
        ArrayList<Impegno> impegniGiovedì = new ArrayList<>(List.of(i5, i3, i2));
        //.
        //.
        //..così fino a domenica

        //Creo la pagina e gli passo giorno e impegni
        Pagina p1 = new Pagina("Lunedì", impegniLunedì);
        Pagina p2 = new Pagina("Martedì", impegniMartedì);
        Pagina p3 = new Pagina("Mercoledì", impegniMercoledì);
        Pagina p4 = new Pagina("Giovedì", impegniGiovedì);
        //.
        //.
        //..così fino a domenica

        //Creo l'agenda settimanale
        Agenda a = new Agenda();

        //Definisco un array che contiene tutte le pagine che abbiamo creato
        Pagina[] SettePagine = {p1, p2, p3, p4};//..così fino a p7

        //assegno le pagine alla settimana
        a.setPagina(SettePagine);

        //Stampo tutto		
        System.out.println(a); //toString() di Agenda

//		for (Pagina pagina : SettePagine) {
//			System.out.println(pagina);
//			System.out.println("---------------");
//		}
    }//Fine Main
}//Fine Classe col Main

///////////// 1) IMPEGNO /////////////////////////////////////////////
class Impegno {

    private String descrizione;//incapsulamento

    public Impegno(String descrizione){
        this.descrizione = descrizione;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }

    @Override
    public String toString(){
        return descrizione;
    }
}//Fine classe impegno

///////////// 2) PAGINA AGENDA che contiene gli impegni///////////////////////////////////////
class Pagina {

    String giorno;
    private ArrayList<Impegno> impegni = new ArrayList<>(); //un elenco di impegni

    public Pagina(String giorno, ArrayList<Impegno> impegni){
        this.giorno = giorno;
        this.impegni = impegni;
    }

    @Override
    public String toString(){
        return "Pagina del giorno " + giorno + ":\n impegni: " + impegni + "\n";
    }

}//Fine classe Pagina

///////////// 3) SETTIMANA AGENDA che contiene le pagine dei giorni///////////////////////////////////////
class Agenda {

    //definisco l'array di pagine. E' un array perchè i giorni sono fissi 7
    private Pagina[] pagine;

    public Agenda(){
        this.pagine = new Pagina[7];// indico che l'array ha 7 elementi
    }

    public Pagina[] getPagina(){
        return pagine;
    }

    public void setPagina(Pagina[] pagine){
        this.pagine = pagine;
    }

    @Override
    public String toString(){
        return Arrays.toString(pagine);
    }
}

