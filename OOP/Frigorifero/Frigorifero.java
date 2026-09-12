package array_di_oggetti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Frigorifero {

    public static void main(String[] args) {

        Cibo[] arrCibi = new Cibo[3];

        Cibo cibo1 = new Cibo("pizza");
        Cibo cibo2 = new Cibo("hamburger");
        Cibo cibo3 = new Cibo("hotdog");

        arrCibi[0] = cibo1;
        arrCibi[1] = cibo2;
        arrCibi[2] = cibo3;

        System.out.println(arrCibi[0].nome);
        System.out.println(arrCibi[1].nome);
        System.out.println(arrCibi[2].nome);

        System.out.println("nel frigorifero ci sono i seguenti cibi:");
        for (Cibo cibo : arrCibi){
            System.out.println(cibo);
        }


        //Metodo più veloce
        //Cibo[] frigorifero = {cibo1,cibo2,cibo3};

        //oppure dichiarare gli oggetti direttamente dentro l'array
        Cibo[] dispensa = {new Cibo("pizza"),new Cibo("hamburger"),new Cibo("hotdog")};

        for (Cibo cibo : dispensa){
            System.out.println(cibo); //toString
        }

        //****************************************************************************

         //MODO PER TRASFORMARE UN ARRAY IN UN ARRAYLIST

         ArrayList<Cibo> lista = new ArrayList<>(Arrays.asList(dispensa));//Arrays.asList(p) trasforma l'array "p" nella lista "lista" che accetta elementi di tipo <Cibo>
        //ArrayList lista = new ArrayList(Arrays.asList(p)); //Lista che può contenere qualunque tipo di valore

        lista.add(new Cibo("pasta"));
        //lista.add("ciao"); //Valore NON permesso! perchè "lista" è stata creata con la specificazione del tipo <Cibo> e accetta solo valori tipo Cibo
        //lista.add(123); //Valore NON permesso! perchè "lista" è stata creata con la specificazione del tipo <Cibo> e accetta solo valori tipo Cibo

        for (Cibo cibo : lista){

            System.out.println(cibo);
        }

        //Altro modo di stampare usando le lambda expression.
        System.out.println("---");

        lista.forEach(cibo->System.out.println(cibo));

        lista.forEach(System.out::println);

        System.out.println("---");

        //Con Iterator
        System.out.println("---Secondo metodo di stampa della lista, usando un Iterator------------");

        Iterator it = lista.iterator();
        while (it.hasNext()) { //Finchè l'iteratore ha elementi, continua il ciclo
            System.out.println(it.next());//Stampo il successivo elemento
        }

    }

}
