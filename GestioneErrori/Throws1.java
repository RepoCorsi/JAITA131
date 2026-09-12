package Throws1;

public class Throws1 {

    public static void main(String[] args) {

       try{// Siamo obbligati a gestire l'eccezione perchè divisione() ha il comando throws divisoZero
        double risultato= divisione(4,0);
       
        System.out.println("il risultato è "+risultato);
       }
       //eccezione personalizzata che estende la classe exception
       //catch (divisoZero e){
       catch (Exception e){
       //catch(NumberFormatException e){
           
          System.out.println("Errore nella divisione: "+e);
       }
       finally {
           System.out.println("sono nel finally");
      }
    }

//Funzione che fa la divisione
//Col Throws Obbliga a fare try-catch dell'eccezione quando si chiama il metodo. E' possibile sollevare più eccezioni nel throws   
static double divisione(int a, int b) throws divisoZero, NumberFormatException {
        
    if (b==0){
      throw new divisoZero();//chiamo il cosruttore della classe divisoZero senza parametri
      //throw new divisoZero("ERROREEEEE"); //chiamo il costruttore della classe divisoZero con parametri
    }    
    return a/b;
    }

}

/*********************************************************************************/
///Classe che estende ArithmeticException
class divisoZero extends ArithmeticException{ //Eccezione personalizzata


    public divisoZero() {//costruttore senza parametri
        System.out.println("DAAAANNNOOO!!! COSTRUTTORE DI DEFAULT DELL'ECCEZIONE PERSONALIZZATA!!");
    }


    public divisoZero(String msg) {//costruttore con parametri
        super(msg);
    }
}