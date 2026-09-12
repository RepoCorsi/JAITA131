package costruttori;

import java.util.Scanner;

public class Costruttori {
    
    //DOPO QUESTO FAR FARE ESERCIZI SULLE CLASSI!
    
    public static void main(String[] args){

        /**
         * ****************************** OVERLOADING COSTRUTTORI ************************************
         */
        System.out.println("che pizza vuoi? \n"
                           + "1 focaccia/pizza rossa \n"
                           + "2 margherita\n"
                           + "3 Altro ");

        Scanner s = new Scanner(System.in);

        int scelta = s.nextInt();
        s.nextLine();//per pulire lo scanner
        
        Pizza p;

        switch (scelta){

            case 1:
                System.out.println("");
                p = new Pizza("farina", "pomodoro");
                break;
            case 2:
                System.out.println("Mozzarella di bufala o normale?");
                p = new Pizza("farina", "pomodoro", s.nextLine());
                break;
            default:
                System.out.println("Scegli la mozzarella e l'extra");
                p = new Pizza("farina", "pomodoro", s.nextLine(), s.nextLine());
        }

        System.out.println(p);

        //FAR FARE ESERCIZI SULLE CLASSI!
        
    }

}
