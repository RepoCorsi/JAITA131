package PersonaStudente;

import esempioclasse.Persona;

/*Specializzazione della classe Persona*/
//estendiamo la classe persona facendola diventare uno studente
public class Studente extends Persona{
	// is a -> è un
	//la classe serve per specializzare una classe più generica
    String materia;

     /*Si ereditano tutti i metodi public, tranne il costruttore*/
    public Studente(String materia, String nome, String cognome, int eta){
        //Deve essere la prima istruzione
        super(nome, cognome, eta);//sto passando i valori al costruttore dalla classe padre persona
                                 //perchè il costruttore non si eredita.
        this.materia = materia;
    }

    public void studia(String materia){
        System.out.println("studio "+materia);
    }

   /*Per fare l'override il metodo deve essere identico! Stessa firma! Altrimenti è overloading. Esempi: toString*/
    @Override
    public void dorme(){
        super.dorme();//dorme di persona
        System.out.println("Dormo poco perchè devo studiare");
    }

    @Override
    public String toString(){
        return super.toString()+ " Studio "+materia;
    }



    /* AGGIUNGERE DOPO ALLA CLASSE PERSONA!!!!******/
    /*Se aggiungiamo qualcosa alla classe persona lo possiamo utilizzare qui anche senza reimportare il progetto*/
//    @Override
//    public void parla(String lingua){
//        System.out.println("non parlo "+lingua);
//    }

}
