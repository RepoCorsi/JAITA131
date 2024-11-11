package testStudente;

import testPersona.Persona;

public class TestStudente {

	public static void main(String[] args) {

		Studente s= new Studente("Java","mario","rossi",20);
		
		System.out.println(s);
		
		s.dorme();//chiama il metodo  dorme() che è un override da persona
		
		Persona p= new Persona("giuseppe","verdi",40);
		p.dorme();//-->zzzzz
		
		System.out.println(s instanceof Studente);//true
		System.out.println(p instanceof Studente);//false
		System.out.println(s instanceof Persona);//true
		
		Persona ps= new Studente("HTML","luigi","neri",30);
		//Object Ops=new Studente("HTML","luigi","neri",30);
		//ps.studia();//--> non esiste il metodo studia dentro persona
		
		Persona[] elenco= {p,s};

		// POLIMORFISMO
		for (Persona x : elenco) {
			x.dorme();//-->metodo polimorfico			
		}
		
		
	}

}
