package esercizioguidabile;

import java.util.ArrayList;

public class EsercizioGuidabile {

    public static void main(String[] args) {

        /*

        Creare una interfaccia chiamata guidabile
        Scrivere una classe astratta Veicolo che preveda una targa, una marca e un modello ed un età.

        Aggiungere i vari metodi get, set e toString.

        Scrivere le classi Automobile e Motociclo che estendono la classe veicolo e implementano l'interfaccia guidabile

        La classe Automobile prevede una stringa che ne descrive il tipo("utilitaria", "StationWagon", "suv",…)
        mentre la classe Motociclo prevede un numero che ne descrive la cilindrata(50,125…)

        Per testare le classi, scrivere una classe TestVeicoli che crea un ArrayList di oggetti guidabili.

        Stampare a video l'elenco dei veicoli con le loro caratteristiche.

        */

        ArrayList<Guidabile> g=new ArrayList();
        g.add(new Automobile("utilitaria","ssa","fiat","punto",10));
        g.add(new Automobile("utilitaria","ssa","fiat","punto",10));
        g.add(new Motociclo(125,"sdf","Honda", "cbr", 20));

        System.out.println(g);
        //int piuGrande=0;
        
        for (Guidabile guidabile : g){
            guidabile.guida();
                        
            //Per trovare il veicolo più vecchio
            
//            if (guidabile instanceof Automobile automobile){
//                
//                if (automobile.getEta()>piuGrande){
//                    piuGrande=automobile.getEta();
//                }
//            }else if (guidabile instanceof Motociclo motociclo){
//
//                if (motociclo.getEta()>piuGrande){
//                    piuGrande=motociclo.getEta();
//                }                
//            }
        }

//        System.out.println("uil più grande è "+piuGrande);

    }

}
