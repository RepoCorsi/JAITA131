package testPersona;

import java.util.Random;
import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		Random r= new Random();
		
		//creo un oggetto di tipo persona che si chiama p
		Persona p= new Persona();
		//p è una variabile di tipo Persona. Chiamata anche istanza della classe Persona
		
		//per accedere alle proprietà e ai metodi di un oggetto si usa il punto
		p.nome="mario";
		p.cognome="rossi";
		p.eta=20;
		
		System.out.println(p.nome);
		System.out.println(p.cognome);
		System.out.println(p.eta);
		
		p.stampaInfo();
		
		p.mangia("pizza");
		p.mangia("pasta", "carne");
		
		//-----------------------------------------------------------------------
		Persona p2= new Persona();
		p2.nome="giuseppe";
		p2.cognome="verdi";
		p2.eta=90;
		
		p2.stampaInfo();
		
		System.out.println(p2);//-->implicitamente sta chiamando il metodo toString()
		
		//System.out.println(p2.toString());
		
		System.out.println(p.equals(p2));//chiama il metodo equals che abbiamo ridefinito
		
		p2.nome="mario";
		p2.cognome="rossi";
		
		System.out.println(p.equals(p2));
		
		
		
		
		
		
		
		
				
		
	}

}
