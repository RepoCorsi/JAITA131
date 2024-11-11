package espackage;

import package2.Classe2;

import testPersona.Persona;

public class TestPackage {

/**
 * MODIFICATORI DI ACCESSO
 * PUBLIC: Visibile dappertutto anche in altri progetti
 * DEFAULT(PACKAGE): Visibile solo all'interno del package
 * PRIVATE: Visibile solo dentro il suo file
 * PROTECTED(SOLO PER EREDITARIETA'): PUBLIC per i figli e PRIVATE per gli altri
 * .JAR-> java archive
 */

	
	public static void main(String[] args) {

		Persona p= new Persona("mario", "Rossi", 20);
		System.out.println(p);
		
		Persona p2= new Persona("giuseppe", "verdi", 40) {
			@Override
			public void dorme() {
				System.out.println("dormo 10 ore al giorno");
			}
		};
		
		p.dorme();
		p2.dorme();
		
		Classe1 c= new Classe1(10, 20);
		System.out.println(c);
		
		Classe2 c2= new Classe2("a", "b");
		System.out.println(c2);
		c2.d="ciao";
		
		//System.out.println(c2.c);--> non visibile perchè ha visibilità di package
		
	}

}
