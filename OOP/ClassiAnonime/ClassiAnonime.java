package classiAnonime;

//-------------------------------------------------------

class Anonima {

    public void saluta(){
        System.out.println("ciao a tutti");
    }

    public void mangia(){
        System.out.println("gnam gnam");
    }
}

//************************** MAIN **************************
public class ClassiAnonime {

    public static void main(String[] args){

        //Modo classico per creare un oggetto
        Anonima o = new Anonima();
        o.saluta();//saluta in italiano
        o.mangia();

        Anonima o2 = new Anonima();
        o2.saluta();//saluta in italiano
        o2.mangia();

        //CLASSI ANONIME
        //Ridefinisce il metodo saluta della classe base(superclasse) Anonima.java
        //Serve per ridefinire al volo un metodo di una classe quando per esempio non posso modificare la classe originale.
        //Non si mette il ';' ma si mettono le parentesi graffe per inglobare del codice che rappresenta la classe anonima innestata.
        //Non si può creare un costruttore all'interno di questa classe anonima.
        //Saluta in inglese
        Anonima o3 = new Anonima() {  //<--
			//Faccio l'override del metodo saluta
			//direttamente nella creazione dell'oggetto
            @Override
            public void saluta(){
                System.out.println("hello world");
            }

            //Non si possono creare altri metodi in più oltre a quelli presenti nella classe base(superclasse).
            //Questo metodo non si può chiamare dall'esterno della classe anonima
            public void canta(){
                System.out.println("aaaaa");
            }
        };//Obbligatorio il punto e virgola

        o3.saluta();//saluta in inglese
        o3.mangia();
        //o3.canta(); no! Non si può chiamare un metodo non presente nella classe base.

        //Saluta in francese
        Anonima o4 = new Anonima() {
            @Override
            public void saluta(){
                System.out.println("bonjour monde");
            }
        };

        o4.saluta();//saluta in francese

		Anonima aMangiaPizza= new Anonima() {
			@Override
			public void mangia() {
				System.out.println("mangio pizza");
			}
		};

		o.mangia();//gnam gnam
		aMangiaPizza.mangia();//pizza


    }// Fine Main
}

