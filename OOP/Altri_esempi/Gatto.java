package altre_Classi;

public class Gatto {
    
    private String nome,razza;
    private int eta;
    //private boolean anziano;

    public Gatto(String nome, String razza, int eta){
        this.nome = nome;
        this.razza = razza;
        this.eta = eta;
//        setNome(nome);
//        setRazza(razza);
//        setEta(eta);
    }

    
    void miagola(){
        System.out.println("miao miao");
    }
    
    void mangia(String cibo){
        System.out.println("sto mangiando "+cibo);
    }
    
    void faiLeFusa(){
        System.out.println("prrr prrr");
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public String getRazza(){
        return razza;
    }            
    
    public void setRazza(String razza){
        this.razza = razza;
    }    
    

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        this.eta = eta;
    }    
    
    public boolean isAnziano(){
        return eta>=11;
    }   


    @Override
    public String toString(){
        return getNome()+" "+getRazza()+" "+getEta();
    }

     //EQUALS Decidiamo noi quando 2 oggetti sono uguali**********************
    //Senza equals non sono uguali anche se hanno gli stessi valori, perchè controllo l'indirizzo di memoria e non il contenuto
   
    //CASE SENSITIVE
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Gatto){          
            //return this.eta==((Gatto) obj).eta; //In questo caso quando hanno l'età uguali.
            //return this.eta==((Gatto) obj).eta && this.razza.equals(((Gatto) obj).razza); //uguali se eta e razza
            return this.eta==((Gatto) obj).eta &&  ////uguali se tutto uguali
                   this.razza.equals(((Gatto) obj).razza) &&
                   this.nome.equals(((Gatto) obj).nome);
        }
        
        return false;
    }
    
    
    
}
