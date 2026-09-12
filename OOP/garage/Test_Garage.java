package garage;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Garage {

    //Come passare un oggetto ad un'altra classe
    public static void main(String[] args){

        //Gestione Autorimessa-Parcheggi
        Scanner s = new Scanner(System.in);
        System.out.println("quanti posti ha il parcheggio?");

        int posti = s.nextInt();// qui gli finisce il numero        
        s.nextLine();//Qui finisce il ritorno a capo(l'invio dato da tastiera)

        //Oggetto di tipo garage
        Garage garage1 = new Garage("garage 1");

        //Parcheggio uno alla volta i veicoli
        for (int i = 0; i < posti; i++){
            System.out.println("che macchina vuoi parcheggiare?");
            garage1.parcheggia(new Macchina(s.nextLine()));//uso un oggetto anonimo di tipo Macchina
        }
        
        //Parcheggia i veicoli tutti insieme:
//      //Creo un ArrayList di veicoli.
//      ArrayList<Macchina>veicoli = new ArrayList();
//
//      //Popolo l'ArrayList dei veicoli con oggetti anonimi di tipo Macchina
//        for (int i = 0; i < posti; i++){
//            System.out.println("che macchina vuoi parcheggiare?");
//            veicoli.add(new Macchina(s.nextLine())) ;
//        }
//        
//        //passo al metodo parcheggiaTutti l'arrayList di veicoli popolato sopra.
//        garage1.parcheggiaTutti(veicoli);

        System.out.println("il parcheggio "+ garage1.getNome()+" adesso ha questi veicoli");
        garage1.elenco();

    }

}
