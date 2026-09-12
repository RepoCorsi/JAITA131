package testdipendente;

import java.util.ArrayList;

public class TestDipendente {

/*
 Progettare una classe di nome Dipendente, sottoclasse di Persona.
Tale classe prevede tre variabili di istanza, nome, cognome, età da Persona, e stipendio.
Scrivere i vari costruttori e i metodi get() e set() per tutti gli attributi, e il toString() .
Aggiungere poi un metodo aumento(double percentuale), che incrementi lo stipendio
del dipendente di una certa percentuale solo se l'età del dipendente è >50.
Scrivere una classe col metodo main per testare il programma,
dichiarare un array di dipendenti e calcolare il totale degli stipendi.
 */
    public static void main(String[] args) {
		//ArrayList di dipendenti
        ArrayList<Dipendente> d=new ArrayList();
        double somma = 0;

        d.add(new Dipendente(1000,"mario","rossi",20));
        d.add(new Dipendente(5000,"giuseppe","verdi",55));
        d.add(new Dipendente(3000,"aldo","bianchi",60));

        for (Dipendente dipendente : d){
            System.out.println(dipendente); //toString;
            dipendente.aumenta(10);
            somma+=dipendente.getStipendio();
        }

        System.out.println("somma stipendi "+somma);

        Dipendente DipMassimo=DipMaxStipendio(d);
        System.out.println("Il dipendente con lo Stipendio massimo è: "+DipMassimo);

    }

    //dipendente con lo stipendio massimo
    static Dipendente DipMaxStipendio(ArrayList<Dipendente> d){

        double max=0;
        Dipendente d2=null;
        for (Dipendente dipendente : d){
            if (dipendente.getStipendio()>max){
                max=dipendente.getStipendio();
                d2=dipendente;
            }
        }
        return d2;
    }

}

