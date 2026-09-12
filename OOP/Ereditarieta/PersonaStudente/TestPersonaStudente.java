package PersonaStudente;

/*Se vogliamo creare una persona bisogna importare anche qui il progetto, altrimenti persona non si vede*/
import esempioclasse.Persona;
import java.util.ArrayList;

public class TestPersonaStudente {

    public static void main(String[] args) {

        //per creare una persona, devo importare la classe
        Persona p=new Persona("aldo", "baglio", 30);
        System.out.println(p);
        p.dorme();//chiama quello di persona

        //per creare uno studente non è necessario importare anche persona qui
        Studente s=new Studente("informatica","gino","latino",20);

        s.studia("Java");

        s.dorme();//chiama quello di studente sovrascritto

        System.out.println(s);

		Persona p= new Persona("giuseppe","verdi",40);
		p.dorme();//-->zzzzz

        System.out.println(s instanceof Studente);//true
        System.out.println(p instanceof Studente);//false
        System.out.println(s instanceof Persona);//true

        //Si puà fare ma ps vede solo le cose di persona e non di Studente
        Persona ps=new Studente("Java","mario","rossi",20);

        //ps.studia("Java"); NO perchè ps vede solo le cose di Persona. non esiste il metodo studia dentro persona

		//ArrayList parametrizzato per accettare solo studenti
        ArrayList<Studente> studenti= new ArrayList();
        studenti.add(s); //no ps perchè ps è di tipo persona
        studenti.add(new Studente("html", "giuseppe", "verdi", 90));
        studenti.add(new Studente("sql", "pinco", "pallo", 40));


        for (Studente studente : studenti){
            System.out.println(studente);
        }		  

		Persona[] elenco= {p,s};

		// POLIMORFISMO
		for (Persona x : elenco) {
			x.dorme();//-->metodo polimorfico
		}


    }//fine main


}//fine classe
