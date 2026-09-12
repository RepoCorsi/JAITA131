package libreria;

import java.util.ArrayList;
import java.util.Arrays;

//1)Libro
//2)Libreria

public class LibreriaTest {

    public static void main(String[] args) {
        
        Libreria libreria=new Libreria("mondadori");
        
        Libro l=new Libro("aa", "bb", 10);           
        libreria.aggiungiLibri(l);
        Libro l2=new Libro("xx", "bb", 10);   
        libreria.aggiungiLibri(l2);
        
        
       String elenco=libreria.trovaLibri("bb");
       
       System.out.println(elenco);        
        
        Libro[] arrL={new Libro("aa", "bb", 10),new Libro("xx", "bb", 10)};
        
       libreria.aggiungiLibri(arrL);
       
       
       String elenco2=libreria.trovaLibri("bb");
       
       System.out.println(elenco2);
       
       System.out.println(libreria);
       
    }//Fine Main
}//Fine Classe

// 1 //////////////////////////////////////////
class Libro {

    private String titolo;
    private String autore;
    private int prezzo;

    public Libro(String t, String a, int p){
        titolo = t;
        autore = a;
        prezzo = p;
    }

    public String getTitolo(){
        return titolo;
    }

    public String getAutore(){
        return autore;
    }

    public int getPrezzo(){
        return prezzo;
    }
}//Fine libro

//*** 2 *************************************
class Libreria {

    String nome;
    //private Libro[] libri;
    private ArrayList<Libro> libri =new ArrayList<>();

    public Libreria(String nome){
        this.nome = nome;
    }
    

    public void aggiungiLibri(Libro l){
        this.libri.add(l);
    }
    
    //Overloading che accetta un array di libri invece che un libro solo
    public void aggiungiLibri(Libro[] l){
        this.libri.addAll(Arrays.asList(l));
    }
        
    
    public String trovaLibri(String a){
        String elenco="";
        int cont = 0;
        for (int i = 0; i < libri.size(); i++){
            if (libri.get(i).getAutore().equals(a)){
                elenco+= libri.get(i).getTitolo()+" ";
                cont++;
            }
        }

        return "Autore "+a+" libri: "+elenco;
    }

    @Override
    public String toString(){
        String elenco="";
        for (Libro libro : libri){
            elenco+=libro.getTitolo()+" ";
        }
        
        return "Libreria{" + "nome=" + nome + ", libri=" + elenco + '}';
    }
    
}
