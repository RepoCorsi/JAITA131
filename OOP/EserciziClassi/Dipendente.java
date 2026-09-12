package eserciziclassi;

public class Dipendente {
    
    private String nome;
    private int eta;
    private double Stipendio;

    public Dipendente(){
    }

    public Dipendente(String nome, double Stipendio){
        this.nome = nome;
        this.Stipendio = Stipendio;
    }

    
    public void aumenta(int percentuale){
        if (eta>50){
            Stipendio+=(Stipendio*percentuale)/100;
            System.out.println("aumentato lo stipendio a "+nome+" del "+percentuale+"%");
        }else{
            System.out.println("aumento non concesso ad "+nome);
        }    
    }
    
    public double getStipendio(){
        return Stipendio;
    }

    public void setStipendio(double Stipendio){
        this.Stipendio = Stipendio;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        this.eta = eta;
    }
    
    
}
