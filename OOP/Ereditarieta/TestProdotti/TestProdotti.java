package testprodotti;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class TestProdotti {

    public static void main(String[] args) {
        
        Cliente c=new Cliente("mario","rossi",65);
        ArrayList<Prodotti> p= new ArrayList<>();
        
        ///Prodotti Non Alimentari
        p.add(new ProdNonAlimentari("vetro","Specchio",10,c));
        p.add(new ProdNonAlimentari("plastica","penna",10,c));
        
        /////Prodotti Alimentari
        //Mettere data > di oggi
        LocalDate dLatte=LocalDate.of(2024, 3, 29); //data di scadenza latte
        p.add(new ProdottiAlimentari(dLatte,"latte",10,c));

        //Mettere data > di oggi
        LocalDate dCarne=LocalDate.of(2024, 3, 29); //data di scadenza carne
        p.add(new ProdottiAlimentari(dCarne,"carne",10,c));
        
        ///Stampe di cliente e prodotti
        System.out.println(c);//Stampo l'oggetto Cliente per mostrarlo nell'output
        
        for (Prodotti prodotti : p){
            prodotti.applicaSconto(); //Polimorfismo. Applico gli sconti ai prodotti
            System.out.println(prodotti); //Stampo tutti i prodotti
        }
      
        //lambda expression
//        p.forEach(prodotti->{
//            prodotti.applicaSconto();
//            System.out.println(prodotti);
//        });


    }//Fine main

}//Fine Classe
