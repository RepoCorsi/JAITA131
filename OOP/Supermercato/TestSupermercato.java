package Supermercato;

import java.util.Scanner;

public class TestSupermercato {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        
        System.out.println("Quanti prodotti hai acquistato?");
        int nProdotti=s.nextInt();
        s.nextLine(); //pulire lo scanner
        
        Cassa cassa1 = new Cassa();
        
        System.out.println("Passa i prodotti sul lettore: ");
        
        for (int i = 0; i < nProdotti; i++){           
            System.out.println("codice:");
            String codice=s.nextLine();
            System.out.println("descrizione");
            String descrizione=s.nextLine();
            System.out.println("prezzo");
            double prezzo=s.nextDouble();
            s.nextLine(); //pulire lo scanner
            
            cassa1.leggiProdotto(codice, descrizione, prezzo);
        }
        
        
        cassa1.stampaScontrino(); //Fine esercizio.

        //Ricaviamo il prodotto più costoso
        Prodotto piuCostoso= cassa1.piuCostoso();//ritorna un oggetto di tipo prodotto        

        //Stampiamo grazie al toString() di prodotto
        System.out.println("il prodotto più costoso è il "+piuCostoso);
        
        
//   Esempio di utilizzo del metodo getProdotti()
//        for (Prodotto prodotto : cassa1.getProdotti()){
//            System.out.println(prodotto.getCodice()+" "+prodotto.getDescrizione()+" "+prodotto.getPrezzo());
//            
//        }        
//        
//        cassa1.leggiProdotto("12345", "Pasta Barilla", 0.79);
//        cassa1.leggiProdotto("12354", "Pesto buono dela nonna", 5.79);
//        cassa1.leggiProdotto("1546", "Spigola", 8.90);
//        cassa1.leggiProdotto("12745", "Patate novelle", 3.49);
//        cassa1.leggiProdotto("89678", "Pastiera ", 10.79);

    }

}
