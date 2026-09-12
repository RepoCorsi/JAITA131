package Supermercato;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cassa {

     //definisco l'array prodotti
    private ArrayList<Prodotto> prodotti=new ArrayList();
    LocalDate data= LocalDate.now();

    //metodo che inserisce un prodotto nell'array
    public void leggiProdotto(String codice, String desc, double prezzo){
        Prodotto p = new Prodotto(codice, desc, prezzo);//creo un prodotto
        prodotti.add(p);//e lo inserisco nell'array
    }


    //prodotto che costa di più
    public Prodotto piuCostoso(){

        double prezzoMax=0;
        Prodotto piuCostoso=null;

        for (Prodotto prodotto : prodotti){
            if (prodotto.getPrezzo()>prezzoMax){
                prezzoMax=prodotto.getPrezzo();
                piuCostoso=prodotto;
            }
        }
        return piuCostoso;	//qui ritorno l'oggetto cha ha il prezzo più alto
    }


    //Metodo che stampa l'elenco dei prodotti con la data di oggi
    public void stampaScontrino(){

        double somma = 0;

        //per formattare:
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("'Scontrino del' dd/MM/yyyy");

        System.out.println(data.format(formato));


        for (Prodotto p: prodotti) {
            System.out.println(p);//toString() di prodotto
            somma += p.getPrezzo();
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("il totale scontrino è: "+somma);
        System.out.println("il totale scontrino è: "+df.format(somma));
        System.out.printf("il totale scontrino è: %3.2f%n", somma);
        System.out.println("il totale scontrino è: "+Math.round(somma*100.0)/100.0);

    }

}
