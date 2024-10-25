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
		//p.nome="mario";
		p.setNome("mario");
		p.setCognome("rossi");
		p.setEta(20);
		
		System.out.println(p.getNome());
		System.out.println(p.getCognome());
		System.out.println(p.getEta());
		
		p.stampaInfo();
		
		p.mangia("pizza");
		p.mangia("pasta", "carne");
		
		//-----------------------------------------------------------------------
		Persona p2= new Persona();
		p2.setNome("giuseppe");
		p2.setCognome("verdi");
		p2.setEta(90);
		
		p2.setValore(12);
		
		p2.stampaInfo();
		
		System.out.println(p2);//-->implicitamente sta chiamando il metodo toString()
		
		//System.out.println(p2.toString());
		
		System.out.println(p.equals(p2));//chiama il metodo equals che abbiamo ridefinito
		
		p2.setNome("mario");
		p2.setCognome("rossi");
		
		System.out.println(p.equals(p2));
		
		Persona p3= new Persona();
		p3.setNome("gino");
		p3.setCognome("latino");
		p3.setEta(20);
		
		p3.setValore(12);
		
		System.out.println(p3);
		
		//qui creo l'oggetto p4 utilizzando il costruttore di default
		Persona p4= new Persona();
		//qui creo l'oggetto p5 utilizzando il costruttore personalizzato con l'overload
		Persona p5= new Persona("anna","bianchi",30);
		
		System.out.println(p5);
		
		//qui creo l'oggetto p6 utilizzando il costruttore con 2 paramnetri
		Persona p6= new Persona("pinco", "pallo");
		System.out.println(p6);
		p6.setEta(10);
		
		p6.setValore(12);
		p6.setValore(22);
		System.out.println("valore vale "+p6.getValore());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}
