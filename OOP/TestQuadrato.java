package testquadrato;

import java.util.Scanner;

/*
Creare una classe Quadrato, che dichiari un attributo lato.
Quindi creare un metodo pubblico che si chiami perimetro() e che ritorni il perimetro del quadrato, 
e un metodo pubblico area() che ritorni l’area del quadrato.
Creare una classe TestQuadrato che contenga un metodo main() 
che istanzi un oggetto q1 di tipo Quadrato, con lato di valore 5.
Quindi stampare il perimetro e l’area dell’oggetto appena creato.
Successivamente creare un array di tipo Quadrato di dimensione n a piacere, 
inserire come primo elemento l'oggetto q1 già creato precedentemente. 
Tutti gli altri elementi di tipo Quadrato devono essere inseriti al suo interno da tastiera.
Stampare per ogni quadrato presente nell'array la rispettiva area, 
sommare il perimetro totale di tutti i Quadrati inseriti nell' array e 
indicare in quale posizione si trova il Quadrato con il perimetro più grande. 
Se ci sono Quadrati con perimetro uguale, indicare soltanto la posizione del primo inserito nell'array.
*/

public class TestQuadrato {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        Quadrato q1=new Quadrato(5);
        int perimetroQ1=q1.perimetro();
        int areaQ1=q1.area();
        int perimetroTot=0;
        int perimetroMax=0;
        int pos=0;
        int posUguale=0;

        System.out.println("perimetro "+perimetroQ1+" area: "+areaQ1);

        Quadrato[] arrQ= new Quadrato[3];

        arrQ[0]=q1;

        for (int i = 1; i < arrQ.length; i++){
          System.out.println("inserisci il lato:");
          int lato=s.nextInt();
          arrQ[i]=new Quadrato(lato);
        }

        perimetroMax=arrQ[0].perimetro();

        for (int i = 0; i < arrQ.length; i++){
            System.out.println("l'area del quadrato è: "+arrQ[i].area());
            System.out.println("il perimetro è: "+arrQ[i].perimetro());
            perimetroTot+=arrQ[i].perimetro();  
            if (arrQ[i].perimetro()>perimetroMax){//Se sono uguali non entra nell'if e rimane il valore precedente
                perimetroMax=arrQ[i].perimetro();
                pos=i;
            }
        }
        //Bonus, in più rispetto all'esercizio, trova le posizioni dei perimetri massimi uguali 
        for (int i = 0; i < arrQ.length; i++){            
            if (perimetroMax==arrQ[i].perimetro()){
                System.out.println("le posizioni uguali sono: "+i);
            }
        }

        System.out.println("somma dei perimetri "+perimetroTot);
        System.out.println("perimetro max "+perimetroMax+" alla posizione "+pos);
        
    }//fine main
}//Fine classe test
/////////////////////////////////////////////////////////////////////////////////////
/********************************* INIZIO CLASSE QUADRATO *************************************************/

 class Quadrato {
    
    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }
    
    public int perimetro(){
        return this.lato*4;
    }
    
    public int area(){
        return this.lato*this.lato;
    }
}
