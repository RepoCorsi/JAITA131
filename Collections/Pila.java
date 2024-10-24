package pila;

import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		//PILA
		//LIFO Last in first out
		//l'ultimo che entra è il primo che esce
		
		Stack<String> p= new Stack<>();
		p.push("piatto1");
		p.push("piatto2");
		p.push("piatto3");
		p.push("piatto4");
				
		System.out.println(p.peek());//ritorna l'ultimo elemento inserito. in cima alla pila
		p.pop();//rimuove l'elemento in cima alla pila
		
		System.out.println(p);
		
	}

}
