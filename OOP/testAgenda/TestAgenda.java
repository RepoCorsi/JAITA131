package testAgenda;

import java.util.ArrayList;
import java.util.List;

public class TestAgenda {

	public static void main(String[] args) {
		
		//Definisco gli impegni creando oggetti della classe Impegno
		Impegno i1=new Impegno("Studiare Java");
		Impegno i2=new Impegno("Andare in posta");
		Impegno i3=new Impegno("Fare la spesa");
		Impegno i4=new Impegno("Fare l'aperitivo");
		Impegno i5=new Impegno("Pulire casa");
		
		//Associo gli impegni al giorno della settimana
		ArrayList<Impegno> impegniLunedì = new ArrayList<>(List.of(i1,i2,i3));
//		impegniLunedì.add(i1);
//		impegniLunedì.add(i2);
//		impegniLunedì.add(i3);		
		ArrayList<Impegno> impegniMartedì = new ArrayList<>(List.of(i1,i4,i5));
		ArrayList<Impegno> impegniMercoledì = new ArrayList<>(List.of(i1,i4));
		ArrayList<Impegno> impegniGiovedì = new ArrayList<>(List.of(i5,i3,i2));
		//.
		//.
		//..così fino a domenica
		
		//Creo la pagina e gli passo giorno e impegni
		Pagina p1= new Pagina("Lunedì", impegniLunedì);
		Pagina p2= new Pagina("Martedì", impegniMartedì);
		Pagina p3= new Pagina("Mercoledì", impegniMercoledì);
		Pagina p4= new Pagina("Giovedì", impegniGiovedì);
		//.
		//.
		//..così fino a domenica
		
		//Creo l'agenda settimanale
		Agenda a= new Agenda();
		
		//Definisco un array che contiene tutte le pagine che abbiamo creato
		Pagina[] SettePagine= {p1,p2,p3,p4};//..così fino a p7
		
		//assegno le pagine alla settimana
		a.setPagina(SettePagine);
		
		//Stampo tutto		
		System.out.println(a); //toString() di Agenda
		
//		for (Pagina pagina : SettePagine) {
//			System.out.println(pagina);
//			System.out.println("---------------");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
