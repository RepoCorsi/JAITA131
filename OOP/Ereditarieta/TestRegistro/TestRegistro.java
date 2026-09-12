package testRegistro;

import java.util.Scanner;

public class TestRegistro {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        Studente[] arrS={new Studente("Laura", "Bianchi", 48),
                         new Studente("Mario", "Rossi", 20),
                         new Studente("Giuseppe", "Verdi", 30),
        };
        
        for (Studente studente : arrS){
            System.out.println("inserisci il voto di italiano per lo studente "+studente.getNome());
            studente.ottieniVoto(new Voto("italiano",s.nextInt()));
            s.nextLine();
            System.out.println("inserisci il voto di storia per lo studente "+studente.getNome());
            studente.ottieniVoto(new Voto("storia",s.nextInt()));
            s.nextLine();
            System.out.println("inserisci il voto di geografia per lo studente "+studente.getNome());            
            studente.ottieniVoto(new Voto("geografia",s.nextInt()));
            s.nextLine();
            
            if (studente.mediaVoti()>=6){
                System.out.println(studente+" media "+studente.mediaVoti()+" promosso");
            }else{
                System.out.println(studente+" media "+studente.mediaVoti()+" bocciato");
            }
        }//fine for
        
    }//Fine main
}//fine classe
