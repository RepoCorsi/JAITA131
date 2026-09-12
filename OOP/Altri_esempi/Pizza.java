package costruttori;

public class Pizza {
    
   	String farina;
	String salsa;//pomodoro o olio per la focaccia
	String mozzarella;//mozzarella normale o di bufala
	String extra;//funghi, prosciutto, ecc

        //Costruttore di default
        /**
         * Costruttore di default per gli oggetti di tipo pizza
         */
        Pizza(){}

	
        //Costruttore 1 parametro
        /**
         * Questa è solo l'impasto per preparare una pizza
         * @param farina tipo 00 o integrale
         */
	Pizza(String farina){
		this.farina = farina;
	}

	
        //Costruttore 2 parametri
        /**
         * Ingredienti per preparare la pizza rossa o la focaccia
         * @param farina tipo 00 oppure integrale
         * @param salsa pomodoro o olio evo
         */
	Pizza(String farina,String salsa){
		this.farina = farina;
		this.salsa = salsa;
	}

	
        //Costruttore 3 parametri
        /**
         * Ingredienti per preparare la margherita o una pizza bianca
         * @param farina tipo 00 oppure integrale
         * @param salsa pomodoro o olio evo
         * @param formaggio mozzarella normale o di bufala
         */
	Pizza(String farina,String salsa,String formaggio){
		this.farina = farina;
		this.salsa = salsa;
		this.mozzarella = formaggio;
	}

	
        //Costruttore 4 parametri
        /**
         * 
         * Ingredienti per preparare tutte le altre pizze
         * @param farina tipo 00 oppure integrale
         * @param salsa pomodoro o olio evo
         * @param formaggio mozzarella normale o di bufala
         * @param extra rinforzi vari, tipo funghi, prosciutto,peperoni, ecc
         */
	Pizza(String farina,String salsa,String formaggio,String extra){
		this.farina = farina;
		this.salsa = salsa;
		this.mozzarella = formaggio;
		this.extra = extra;
	}        

    @Override
    public String toString(){
        return "Ecco la tua pizza :{" + "farina=" + farina + ", salsa=" + salsa + ", formaggio=" + mozzarella + ", extra=" + extra + '}';
    }

        
        
        
}//******************************************************************************** 

