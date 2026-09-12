package altre_Classi;

public class ClassiTest {

    public static void main(String[] args) {
        
        //Ogni oggetto che creiamo avrà le stesse caratteristiche nella definizione della classe
		Macchina miaMacchina1 = new Macchina();

		System.out.println(miaMacchina1.marca);
		System.out.println(miaMacchina1.modello);

		miaMacchina1.guida();
		miaMacchina1.frena();
		
                //Oggetto 2 con le stesse caratteristiche di oggetto 1
                Macchina miaMacchina2 = new Macchina();
                
		System.out.println(miaMacchina2.marca);
		System.out.println(miaMacchina2.modello);  
                
                miaMacchina2.guida();
		miaMacchina2.frena();

                
                ///////Gatto////////////////////////////
                Gatto g=new Gatto("milu","persiano",2);

                System.out.println(g);
                
                g.miagola();
                g.mangia("crocchette");
                g.faiLeFusa();            
                
                System.out.println("E' anziano? "+g.isAnziano());
                
                g.setEta(12);
                
                System.out.println("E' anziano? "+g.isAnziano());
                                                
                ///equals////
                Gatto ge=new Gatto("a","b",12);
                Gatto ge2=new Gatto("a","b",12);
                
                //Senza equals non sono uguali anche se hanno gli stessi valori,
                //perchè controllo l'indirizzo di memoria e non il contenuto
                
                if (ge.equals(ge2)){
                    System.out.println("sono uguali");
                }else {
                    System.out.println("non sono uguali");
                }
                
                
                ///////////Studente//////////////////////
               // dichiaro che la variabile stdA e' di tipo Studente:
               Studente stdA;

               // costruisco l'oggetto stdA:
               stdA = new Studente();

               //inizializzo stdA:
               stdA.nome = "Carlo";
               stdA.voto1 = 4; 
               stdA.voto2 = 5; 
               stdA.voto3 = 7;

               // stampo la media dei voti di stdA:

               System.out.println("Media voti di " + stdA.nome +
                                  ": " + stdA.mediaVoti());

               // definisco un nuovo studente:

               Studente stdB = new Studente();
               stdB.nome = "Antonio"; 
               stdB.voto1 = 1;
               stdB.voto2 = 8; 
               stdB.voto3 = 5;
               System.out.println("Media voti di " + stdB.nome +
                                  ": " + stdB.mediaVoti());        
        
               if (stdA.mediaVoti()>stdB.mediaVoti()){
                   System.out.println(stdA.nome+" è più bravo");            
               }else{
                   System.out.println(stdB.nome+" è più bravo");
               }
              
               
             //////////////////// Cellulare////////////////////////////////////////////////////
               
            /**
             * Creo un oggetto della classe Cellulare, con 20€ di credito e 0
             * chiamate effettuate.
             */

            Cellulare nokia = new Cellulare("nokia","3310",20.0);
            /**
             * Ricarico il cellure di 50€.
             */
            nokia.ricarica(50.0);
            /**
             * Effettuo una chiamata di 13 minuti.
             */
            nokia.chiamata(13.0);
            /**
             * Stampo il credito.
             */
            System.out.println(nokia.getCredito());//67.4
             /**
             * Stampo il numero di chiamate effettuate.
             */
            System.out.println(nokia.getNumeroChiamate());//1

            nokia.chiamata(20.0);
            /**
             * Stampo il credito.
             */
            System.out.println(nokia.getCredito());//63.4
             /**
             * Stampo il numero di chiamate effettuate.
             */
            System.out.println(nokia.getNumeroChiamate());//2

           System.out.println("Ho finito i soldi? "+nokia.creditoEsaurito());               
               
               
               
    }//Fine Main
}//Fine Classe
