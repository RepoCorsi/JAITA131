package pile;

import java.util.Scanner;
import java.util.Stack;

public class Pila {

    public static void main(String[] args){

        // pila di elementi di diversi tipi. Come una pila di piatti
        //LIFO last in, first out.  L'ultimo che entra è il primo che esce
        //Se vogliamo un solo tipo si usa <Integer> o <String> non tipo primitivo
        Stack p = new Stack();
        p.push(1); //push aggiunge elementi sopra la pila
        p.push("cane");
        p.push(true);
        p.push(4.5);

        System.out.println("Dimensione: " + p.size());

        System.out.println(p.peek());//peek ritorna sempre l'elemento in cima alla pila 4.5

        p.push(9);//push aggiunge elementi sopra la pila

        System.out.println(p.peek());//peek ritorna sempre l'elemento in cima alla pila 9

        //si possono stampare nel solito modo
        System.out.println(p);

        p.forEach(System.out::println);

        for (int i = 0; i < p.size(); i++){
            System.out.println(p.get(i));//leggiamo il valore
        }

        //search da la posizione nella pila  dell'elemento indicato tra parentesi. -1 se non lo trova
        //l'elemento 1 è in posizione: 5 e vale: cane (5 perchè è al fondo della pila. il primo è il 9)
        System.out.println("l'elemento 1 è in posizione: " + p.search(1) + " e vale: " + p.get(1));

        System.out.println("pila vuota? " + p.empty());

        p.pop(); //rimuove l'elemento in cima alla pila, non accetta argomenti.

        System.out.println(p);

        p.pop(); //rimuove l'elemento in cima alla lista, non accetta argomenti.

        System.out.println(p);

        p.clear(); //Svuota tutta la pila

        System.out.println("pila vuota? " + p.empty());

        System.out.println(p);

        /********************************* Esercizio *********************************************************/

        //verificare se una stringa è palindroma, cioè se si può leggere allo stesso modo da sx a dx e viceversa.
        
        //oro,
        //afa,
        //anna,
        //radar,
        //osso,
        //ai lati d italia,
        //i topi non avevano nipoti,
        //i noti piedi dei pitoni,
        //angolo bar a bologna,
        //i tre sedili deserti
        Scanner s = new Scanner(System.in);

        System.out.println("inserisci una frase:");
        String frase = s.nextLine();

        frase = frase.replace(" ", "");//togliamo gli spazi        

        boolean siNo=true;//variabile di stato
        
        Stack<Character> pila = new Stack();        

        // Aggiunta dei caratteri della frase alla pila
        for (int i = 0; i < frase.length(); i++){
            char ch = frase.charAt(i);//prendiamo i caratteri della frase
            pila.push(ch); //e li inseriamo nella pila
        }
        
        // Confronto dei caratteri della frase con quelli dello Stack
        for (int i = 0; i < frase.length(); i++){

            //charAt(i) prende i caratteri dall'inizio iniziando da 0 e li confrontiamo con stack.pop() 
            //che prende i caratteri dal fondo, partendo dall'ultimo carattere della stringa
            // str.charAt(i)-> ... <-stack.pop()
            if (frase.charAt(i) != pila.pop()){// se non sono uguali...
                  siNo = false; //cambiamo lo stato
                  break; //e usciamo dal loop
            }
        }

        System.out.println("E' palindroma? " + siNo);        

    }//Fine Main

}//Fine classe

/* Altro metodo più facile usando un ciclo con 2 indici
       System.out.println("inserisci una stringa: ");
       String parolaIngresso= input.nextLine();
    
       String parola=parolaIngresso.replace(" ","");//togliamo gli spazi
    
       boolean palindroma=true;
    
       int sx,dx;
       for(sx=0, dx = parola.length()-1; sx<dx; sx++,dx--){// con 2 indici che vanno in direzioni opposte
       
          if(parola.charAt(sx)!=parola.charAt(dx)){
              palindroma = false;
              break;
          }
       }
       System.out.println("Risultato : " + palindroma);
*/


