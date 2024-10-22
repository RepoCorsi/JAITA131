package numeri;

import java.text.DecimalFormat;
import java.util.Random;

public class Numeri {

	public static void main(String[] args) {

		//classi statiche non si fa il new 
		int massimo= Math.max(5, 10);
		System.out.println(massimo);
		
		int minimo=Math.min(5, 10);
		
		double potenza=Math.pow(2, 3);
		System.out.println(minimo+" "+potenza);
		
		double virgola=Math.round(5.5);//arrotonda per eccesso, 6
		System.out.println(virgola);
		
		double numero=5.564323;
		
		DecimalFormat df= new DecimalFormat("0.00");//2 cifre dopo la virgola
		System.out.println(df.format(numero));
		
		System.out.println(Math.ceil(5.4)); //-->6
		System.out.println(Math.floor(5.8)); //-->5
		
		////////////////////////////////////////////////////////////////
		
		Random r =new Random();
		
		int casuale=r.nextInt(); //genera un numero casuale da -2*32 a +2^31 
		System.out.println(casuale);
		
		int limite=r.nextInt(6); //da 0 a 5
		System.out.println(limite);
		
		int estremi= r.nextInt(2,11); //da 2 a 10
		System.out.println(estremi);
		
		double estrmiVirgola= r.nextDouble(2.5,11.6);
		System.out.println(estrmiVirgola);
		
		//non esiste random per i tipi char e String
		
		boolean casualeBoolean=r.nextBoolean();
		System.out.println(casualeBoolean);
		
		////////////////////////////////////////////////////
		//32 - 125
		//regex ->espressioni regolari 12[aZ^]
		
		int num1=r.nextInt(32,126);
		int num2=r.nextInt(32,126);
		int num3=r.nextInt(32,126);
		
		char lettera1=(char)num1;
		char lettera2=(char)num2;
		char lettera3=(char)num3;
		
		String password=""+lettera1+lettera2+lettera3;
		System.out.println("la password generata è "+password);
		
		//un programma simula il lancio di 2 dadi, e mostri a schermo il risultato dei 2 dadi
		//fare la somma dei valori del random, 
		//dicharare una variabile booleana che ritorni true se i 2 dadi sono uguali
		int dado1=r.nextInt(1,7);
		int dado2=r.nextInt(1,7);
		
		System.out.println(dado1+" "+dado2);
		int somma=dado1+dado2;
		
		boolean ugualiOno=(dado1==dado2);
		System.out.println(ugualiOno);
		
		
		
		
	}

}
