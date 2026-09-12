package esercizioDadi;

import java.util.Random;

public class DadiTest {
    
    public static void main(String[] args) {
        
        Giocatore giocatore1=new Giocatore("Fabio");
        Giocatore giocatore2=new Giocatore("Gino");
        String vincitore="";
        
        System.out.println(giocatore1.getPunteggio());
        System.out.println(giocatore2.getPunteggio());
        
//Finchè nessuno ha perso. Basta che uno perde e la && ritorna falsa e il ciclo si ferma.
        while ((!giocatore1.perso())&&(!giocatore2.perso())){
            
            int lancioG1=giocatore1.lancia();
            int lancioG2=giocatore2.lancia();

            System.out.println("Fabio "+lancioG1+ " Gino "+lancioG2);

            if (lancioG1>lancioG2){
                giocatore2.setPunteggio(lancioG1);//Sottraiamo il punteggio + alto a chi ha perso
                System.out.println("Gino perde "+lancioG1+ " punti. Ne rimangono "+giocatore2.getPunteggio());
                vincitore=giocatore1.getNome();
                
            }else if (lancioG2>lancioG1){
                giocatore1.setPunteggio(lancioG2);//Sottraiamo il punteggio + alto a chi ha perso
                System.out.println("Fabio perde "+lancioG2+ " punti. Ne rimangono "+giocatore1.getPunteggio());
                vincitore=giocatore2.getNome();
                
            }else{
                System.out.println("pareggio");
            }            
        }
     
        System.out.println(giocatore1+" "+giocatore2+" vince: "+vincitore);
    }//fine main
}//fine classe

/********************************** GIOCATORE ****************************************************/
class Giocatore {
    private String nome;
    private int punteggio;
    Random r;

    public Giocatore(String nome){
        this.nome = nome;
        this.punteggio = 30;
        r=new Random();        
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
        
    public int getPunteggio(){
        return punteggio;
    }

    public void setPunteggio(int punteggio){
        this.punteggio -= punteggio;
    }        
    
    public boolean perso(){
        return punteggio<=0;
    }     
    
    public int lancia(){
        return r.nextInt(6)+1;
    }

    @Override
    public String toString(){
        return nome + " punteggio=" + punteggio ;
    }      
}