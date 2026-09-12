package eserciziclassi;

public class Appartamento {
    
    public String NomeProprietario;
    private final int superficie=100;
    private final int piano=2;
    public int numeroInquilini;
    
    public void visualizza(){
        System.out.println("Le caratteristiche dell' appartamento sono: superficie: "+superficie+ 
                           " Nome proprietario: "+NomeProprietario+ 
                           " Piano: "+piano+
                           " Numero Inquilini "+numeroInquilini);                
    }
    //Costruttore
    public Appartamento(String NomeProprietario, int numeroInquilini){
        this.NomeProprietario = NomeProprietario;
        this.numeroInquilini = numeroInquilini;
    }

    public void cambiaProprietario(String NomeProprietario){
        this.NomeProprietario = NomeProprietario;
    }

    public void setNumeroInquilini(int numeroInquilini){
        this.numeroInquilini = numeroInquilini;
    }
    
    
    
    
    
}
