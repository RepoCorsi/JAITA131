package studentearraylist;
import java.util.ArrayList;
import esempioclasse.Persona;




///////////////////////////// CLASSE STUDENTE  ///////////////////////////////////////////////////////
class Student extends Persona{

    private String matricola;

    public Student(String matricola, String nome, String cognome, int eta){
        super(nome, cognome, eta);
        this.matricola = matricola;
    }           

     public String getMatricola(){
        return matricola;
    }

    public void setMatricola(String matricola){
        this.matricola = matricola;
    }        
}

//////////////////////// CLASSE CON MAIN  /////////////////////////////////////////////////////////////////////////

public class StudenteArrayList {
    private static ArrayList<Student> studenti= new ArrayList();
    
    // Metodo main per testare il codice
    public static void main(String[] args) {
       
        // Creazione di alcuni studenti
        Student studente1 = new Student("12345","Mario", "Rossi", 20);
        Student studente2 = new Student("67890","Luigi", "Verdi", 22);
        Student studente3 = new Student("54321","Paola", "Bianchi", 21);
        
        // Aggiunta degli studenti all'elenco
        aggiungiStudente(studente1);
        aggiungiStudente(studente2);
        aggiungiStudente(studente3);
        
        // Visualizzazione dell'elenco degli studenti
        System.out.println("Elenco studenti:");
        visualizzaElencoStudenti();
        
        // Trovare uno studente per matricola
        String matricolaCercata = "67890";
        Student studenteTrovato = trovaStudentePerMatricola(matricolaCercata);
        if (studenteTrovato != null) {
            System.out.println("Studente trovato:");
            System.out.println("Nome: " + studenteTrovato.getNome());
            System.out.println("Cognome: " + studenteTrovato.getCognome());
            System.out.println("Età: " + studenteTrovato.getEta());
            System.out.println("Matricola: " + studenteTrovato.getMatricola());
        } else {
            System.out.println("Studente non trovato.");
        }
        
        // Calcolare la media delle età degli studenti
        double mediaEta = calcolaMediaEta();
        System.out.println("Media età degli studenti: " + mediaEta);
    }
    
    ////////////////// ELENCO METODI //////////////////////////////////////////
    
    
    public static void aggiungiStudente(Student studente) {
        studenti.add(studente);
    }
    
    public static void rimuoviStudente(Student studente) {
        studenti.remove(studente);
    }
    
    public static void visualizzaElencoStudenti() {
        for (Student studente : studenti) {
            System.out.println("Nome: " + studente.getNome());
            System.out.println("Cognome: " + studente.getCognome());
            System.out.println("Età: " + studente.getEta());
            System.out.println("Matricola: " + studente.getMatricola());
            System.out.println();
        }
    }
    
    public static Student trovaStudentePerMatricola(String matricola) {
        for (Student studente : studenti) {
            if (studente.getMatricola().equals(matricola)) {
                return studente;
            }
        }
        return null; // Se lo studente non viene trovato
    }
    
    public static double calcolaMediaEta() {
        int sommaEta = 0;
        for (Student studente : studenti) {
            sommaEta += studente.getEta();
        }
        return (double) sommaEta / studenti.size();
    }
    
}
