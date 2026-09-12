package dispositivoastratto;

public class DispositivoAstratto {

    public static void main(String[] args){

        Dispositivo[] d= {new Computer(),new Lampada(),new Macchina(), new Televisore()};
        
        for (Dispositivo dispositivo : d){
            dispositivo.accendi(); //Polimorfismo
        }
        
    }//Fine main

}//Fine classe 


//---------------------------------------------------------------------
//Classe Astratta
//la classe superiore diventa a tal punto generica che la si può pensare come una base per le altre classi piuttosto che come una classe di cui creare un oggetto.
abstract class Dispositivo {

    public abstract void accendi();

}

//------------------------------------------------------
//Classe Televisore
class Televisore extends Dispositivo {

    public void accendi(){
        System.out.println("Televisore acceso");
    }
}

//----------------------------------------
//Classe Lampada
class Lampada extends Dispositivo {

    public void accendi(){
        System.out.println("Lampada accesa");
    }
}

//-----------------------------------------------------
//Classe Macchina
class Macchina extends Dispositivo{

    @Override
    public void accendi(){
        System.out.println("Bruummm");
    }    
}

//-----------------------------------------------------
//Classe Computer
class Computer extends Dispositivo{

    @Override
    public void accendi(){
        System.out.println("Parte windows/Mac/Linux");
    }    
}