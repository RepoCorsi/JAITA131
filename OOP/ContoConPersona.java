package ContoConPersona;

/*   Eseguire con tasto dx->run file, perchè il main è in un altro package*/

import java.text.DecimalFormat;
import esempioclasse.Persona;

public class ContoConPersona {

    public static void main(String[] args) {

        Persona p=new Persona("mario", "rossi", 33);
        Conto_Corrente c= new Conto_Corrente(p,10);
        c.deposito(100);
        DecimalFormat df = new DecimalFormat("0.00");// se metto più zeri delle cifre dopo la virgola, mi aggiunge zero al fondo
        System.out.println(df.format(c.saldo())); //ritorna String, quindi solo per visualizzazione
        c.deposito(150.30);
        System.out.println(df.format(c.saldo()));
        c.prelievo(150);
        System.out.println(df.format(c.saldo()));
        c.info();        
        
    }//Fine Main
}//Fine Classe col Main

////////////////////////////////  Conto Corrente ////////////////////////////////////////////////////////////
class Conto_Corrente {
       
    private double saldo;
    private Persona p; //a chi è intestato
    DecimalFormat df = new DecimalFormat("0.00");

    public Conto_Corrente(Persona p,double saldo){
        this.p=p;//<-----
        
        this.saldo = saldo;
    }        
    
    public void deposito(double amount){  
       saldo = saldo + amount;
    }

    public void prelievo(double amount){
        saldo = saldo - amount;
    }

    public double saldo(){
        return saldo; 
    }
        
    public void info(){
        System.out.println(p.nome+" ha un saldo di "+df.format(saldo));
    }    
}
