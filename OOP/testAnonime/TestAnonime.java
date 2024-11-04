package testAnonime;

import java.util.ArrayList;

public class TestAnonime {

	public static void main(String[] args) {

		Anonima a= new Anonima();
		a.saluta();
		a.mangia();
		
		//classe anonima
		Anonima aInglese= new Anonima() {//<-- 
			//Faccio l'override del metodo saluta 
			//direttamente nella creazione dell'oggetto			
			@Override
			public void saluta() {
				System.out.println("Hello to everybody");
				canta();//chiamo canta indirettamente
			}
//non si possono chiamare direttamente i metodi che non esistono nella classe originale
			public void canta() {
				System.out.println("aaaaaaaaaa");
			}
		};//<--obbligatorio il ;
			
//aInglese.canta(); non posso chiamare direttamente canta() perchè non esiste nella classe originale
		a.saluta();//saluta in italianoa
		aInglese.saluta();//saluto in inglese e indirettamente chiamo anche canta()
		
		Anonima aMangiaPizza= new Anonima() {
			@Override
			public void mangia() {
				System.out.println("mangio pizza");
			}
		};
		
		a.mangia();//gnam gnam
		aMangiaPizza.mangia();//pizza
	}

}