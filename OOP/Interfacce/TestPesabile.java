package pesabile;
public class TestPesabile {

    public static void main(String[] args) {
        //MACCHINA, STUDENTE, CANE
        Pesabile[] p={new macchina("clio",3),new studente("ugo",75), new cane("bobby",20)};
        
        //polimorfismo
        for (Pesabile cose : p){
            cose.pesa();
        }       
    }
}

/*
    Tutti i metodi sono astratti tranne quelli di default
    È possibile definire solo "attributi" final (in pratica costanti)
    Definendo un attributo in un'interfaccia questo viene automaticamente considerato public static final
*/

interface Pesabile{
 // Tutte le variabili in una interfaccia sono implicitamente public static final 
    void pesa();    
}

/***** MACCHINA ******/
class macchina implements Pesabile{
    String nome;
    int peso;

    public macchina(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }    
    
    @Override
    public void pesa(){
        System.out.println("la macchina "+nome+" pesa "+peso);
    }   
}

/***** STUDENTE ******/
class studente implements Pesabile{
    String nome;
    int peso;

    public studente(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public void pesa(){
        System.out.println("lo studente "+nome+" pesa "+peso);
    }
}

/***** CANE ******/
class cane implements Pesabile{
    String nome;
    int peso;

    public cane(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public void pesa(){
        System.out.println("il cane "+nome+" pesa "+peso);
    }
}
