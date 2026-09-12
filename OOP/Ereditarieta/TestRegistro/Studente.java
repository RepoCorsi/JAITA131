package testRegistro;

import java.util.ArrayList;
import esempioclasse.Persona;

public class Studente extends Persona{
    
    static int matricola=0; //attributo statico, appartiene alla classe
    private int matricolaStudente;//attributo dell'oggetto
    private ArrayList<Voto> votiStudente=new ArrayList(); 

    //Costruttore
    public Studente(String nome,String cognome,int eta){
        super(nome, cognome, eta);
        matricola++;
        this.matricolaStudente = matricola;
    }

    public int getMatricola(){
        return matricola;
    }
    
    
    public void ottieniVoto(Voto v){
        votiStudente.add(v);
    }
        
    public double mediaVoti(){
        double somma=0;
        for (Voto voto : votiStudente){
            somma+=voto.getVoto();
        }
        return (somma)/votiStudente.size();
    }

    @Override
    public String toString(){
        return getNome()+" matricola=" + matricolaStudente + ", voti=" + votiStudente;
    }
    
    
    
    
}
