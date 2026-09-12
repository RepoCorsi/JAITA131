package testdipendente;

import esempioclasse.Persona;

public class Dipendente extends Persona{

    private double Stipendio;

    public Dipendente(double Stipendio, String nome, String cognome, int eta){
        super(nome, cognome, eta);//<--costruttore di Persona
        this.Stipendio = Stipendio;
    }

	//metodo che aumenta lo stipendio solo se l'età è > 50
    public void aumenta(int percentuale){
        if (this.getEta()>50){//getEta ci arriva da persona
            Stipendio+=(Stipendio*percentuale)/100;
            System.out.println("aumentato lo stipendio a "+this.getNome()+". Nuovo stipendio: "+Stipendio);
        }else{
            System.out.println("aumento non concesso a "+this.getNome());
        }
    }

    public double getStipendio(){
        return Stipendio;
    }

    public void setStipendio(double Stipendio){
        this.Stipendio = Stipendio;
    }


    @Override
    public String toString(){
        return super.toString()+" stipendio= "+Stipendio;
    }


}
