package eserciziclassi;

import java.text.DecimalFormat;

public class ContoCorrente {
   
    private double saldo;
    private String nome;
    private int numero; // Numero di conto assegnato all'oggetto. Proprietà dell'oggetto e non della classe   
    private static int nConto=0;//unica per tutta la classe. Appartiene alla classe e non all'oggetto
    DecimalFormat df = new DecimalFormat("0.00");

    public ContoCorrente(String nome,double saldo){
        nConto++;//incrementiamo il contatore generale di tutta la classe
        numero=nConto;//assegniamo l'ultimo valore generato alla proprietà numero dell'oggetto
        this.nome=nome;
        this.saldo = saldo;
    }        
    
    public void deposito(double quantita){  
       saldo = saldo + quantita;
    }

    public void prelievo(double quantita) throws Exception{
         if (rosso()){
            throw new Exception("Hai finito i soldi!");
        } else if(saldo<quantita){
            throw new Exception("Prelievo oltre la disponibilità");
        }
        saldo = saldo - quantita;
    }

    public double saldo(){  
        return saldo; 
    }
        
    public boolean rosso(){
        return saldo<=0;
    }

    @Override
    public String toString(){
        return "cc numero: "+numero+" di "+nome+" ha un saldo di "+df.format(saldo);
    }   
       
}
