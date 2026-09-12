package javaapplication152;

import java.util.Scanner;

public class AziendaAssumi {

    public static void main(String[] args) {
        
        System.out.println("Inserisci il nome della azienda");
        Scanner s = new Scanner(System.in);
        String nome=s.nextLine();
        
        azienda a=new azienda(nome);
        
        a.assumi();
        System.out.println(a); //stampa l'oggetto grazie al toString della classe azienda        
        
    }
}

class azienda{
    String nome;
    persona[] p;//un array di persone
    Scanner s = new Scanner(System.in);

    public azienda(String nome){
        this.nome=nome;
    }
    
    void assumi(){
        System.out.println("quanti dipendenti vuoi assumere?");
        int quanti=s.nextInt();
        p=new persona[quanti];
        s.nextLine();// dopo ogni nextInt() pulire il buffer.        
        for (int i = 0; i < p.length; i++){
            System.out.println("inserisci il nome");
            String nomedip=s.nextLine();
            System.out.println("inserisci l'eta");
            int eta=s.nextInt();
            s.nextLine();
            System.out.println("inserisci il sesso");
            String sesso=s.nextLine();
            p[i]=new persona(nomedip,sesso,eta); // Riempo l'array di oggetti persona in base ai valori inseriti dall'utente
        }
    }

    @Override
    public String toString(){
        String s="Azienda= "+nome+"\n";
        s+=persona.contatore+" dipendenti assunti:\n";
        for (persona pers : p){ //leggo l'array di persone popolato nel metodo assumi()
            s+= "nome: "+pers.getNome()+" sesso: "+pers.getSesso()+" età: "+pers.getEta()+"\n";
        }
        
        return s;
    }
}//fine classe azienda


class persona{   
    private String nome;
    private String sesso;
    private int eta;
    static int contatore=0;

    public void stampa(){
        System.out.println(getEta()+ " "+getSesso()+" "+getNome());
    }
    
    public static int getContatore(){
        return contatore;
    }
    
    public persona(String nome){
        this(nome,"",0);
    }
    
    public persona(String nome, String sesso){
        this(nome,sesso,0);
    }

    public persona(String nome, String sesso, int eta){
        this.nome=nome;
        this.sesso=sesso;
        this.eta=eta;
        contatore++;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome=n;
    }
    
    public String getSesso(){
        return sesso;
    }
    
    public void setSesso(String s){
        sesso=s;
    }
    
    public int getEta(){
        return eta;
    }
       
    public void setEta(int eta){
        this.eta=eta;
    }

    @Override
    public String toString(){
        return getEta()+ " "+getSesso()+" "+getNome();
    }
    
    
    
    public boolean equals(Object o){
        if (o instanceof persona){
        persona p=(persona) o;
            if (this.nome==p.nome && this.eta==p.eta && this.sesso==p.sesso){
                return true;
            }
        }
        return false;
    }
}