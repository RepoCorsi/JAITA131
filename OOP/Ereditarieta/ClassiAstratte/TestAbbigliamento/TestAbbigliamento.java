package testabbigliamento;

public class TestAbbigliamento {

    public static void main(String[] args) {
    
        Maglia felpa=new Maglia("felpa", "m", 20, "rosso", 3);
        Maglia tshirt=new Maglia("t-shirt", "l", 10, "bianca", 1);
        Pantaloni bermuda=new Pantaloni("bermuda","xl",20,"blu",1);
        Pantaloni jeans=new Pantaloni("jeans","s",30,"nero",2);
        
         Abbigliamento[] a ={felpa,tshirt,bermuda,jeans};
         
         
         double totale=0;
         for (Abbigliamento abbigliamento : a){
            System.out.println(abbigliamento);
            double prezzoScontato=abbigliamento.applicaSconto();
            totale+=(abbigliamento.getQuantita()*prezzoScontato);
            //System.out.println("tot parziale= "+totale);
        }

        System.out.println("totale speso: "+totale); 
    }

}

