package eserciziclassi;

import java.text.DecimalFormat;

public class EserciziClassi {

    public static void main(String[] args) {
        /////////////Esercizio 1 Contatore///////////////
        Contatore c=new Contatore(10);
        c.aumentaNumero();
        System.out.println(c.getNumero());
        c.diminuisciNumero();
        c.setNumero(100);
        System.out.println(c.getNumero());      
        
        //////////////Esercizio 2 Rettangolo////////
        Rettangolo r = new Rettangolo(5,3);
        System.out.println(r.area());
        System.out.println(r.perimetro());
        r.ridimensiona(6, 6);
        System.out.println(r.area());
        System.out.println(r.perimetro());
        
        //////////////Es 3 LAMPADINA////////////////////        
        Lampadina l=new Lampadina(true);
        System.out.println(l.stato());
        l.click();
        //System.out.println(l.stato());
        l.click();
        //System.out.println(l.stato());
        l.click();
        //System.out.println(l.stato());
        
        ////////////////Es 4 Appartamento/////////////////
        Appartamento a1=new Appartamento("Fabio",3);
        a1.visualizza();
        a1.cambiaProprietario("ugo");
        a1.setNumeroInquilini(2);
        a1.visualizza();
        
        /////////////Es 5 Automobile/////////////////////
        Automobile auto=new Automobile("fiat","panda",10);
        System.out.println(auto.statoCarburante());
        auto.guida();
        auto.guida();
        auto.guida();
        System.out.println(auto.statoCarburante());
        auto.faiRifornimento(20);
        System.out.println(auto.statoCarburante());
        auto.visualizza();
        
        ////////////////Es 6 ContoCorrente/////////////////
        DecimalFormat df = new DecimalFormat("0.00");
        ContoCorrente conto= new ContoCorrente("Fabio",10);
        conto.deposito(100);
        System.out.println(df.format(conto.saldo()));
        conto.deposito(150.30);
        System.out.println(df.format(conto.saldo()));
        try{
            conto.prelievo(15000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(df.format(conto.saldo()));
        System.out.println(conto);
        
        //per vedere che lo static conto si incrementa di 1
        ContoCorrente conto1= new ContoCorrente("aa",10);
        System.out.println(conto1);

        ContoCorrente conto2= new ContoCorrente("bb",20);
        System.out.println(conto2);
        
        ///////////////////////Es 7 Prodotti/////////////////
        Prodotti p=new Prodotti(1,"mouse",20);
        p.applicaSconto(10);
        System.out.println("il prezzo del prodotto è: "+df.format(p.getPrezzo()));
        
        //////////////////// DIPENDENTE //////////////////////////////
        Dipendente d=new Dipendente("Ugo",2000);
        d.setEta(48);
        d.aumenta(10);
        System.out.println(d.getStipendio());
        Dipendente d1=new Dipendente("Gino",3000);
        d.setEta(55);
        d1.aumenta(10);
        System.out.println(d1.getStipendio());
        Dipendente d2=new Dipendente("Pino",4000);
        d.setEta(60);
        d2.aumenta(10);
        System.out.println(d2.getStipendio());
        
        Dipendente[] arrDip= {d,d1,d2};
        
        int tot=0;
        for (Dipendente dip : arrDip){
            tot+=dip.getStipendio();
        }
        
        System.out.println("la somma degli stipendi è "+tot);       
    }

}
