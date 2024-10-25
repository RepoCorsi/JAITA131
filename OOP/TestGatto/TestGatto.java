package testGatto;

public class TestGatto {

	public static void main(String[] args) {

	int   x=10;
	
	//g è l'oggetto di tipo Gatto
	//g istanza della classe Gatto
	//instance -> esemplare -> esempio di gatto
	Gatto g= new Gatto("fufi",7,"persiana");
	
//	g.nome="sdgdfg";
//	g.eta=17;
//	g.razza="dghdghdg";
	
	g.miagola();
	g.mangia("le crocchette");
	g.faiLeFusa();
	
	System.out.println("è anziano? "+g.isAnziano());
	
	System.out.println(g);
	
	Gatto g2= new Gatto("milù",12);
//	g2.nome="milù";
//	g2.eta=12;
	g2.setRazza("siamese");
	
	System.out.println(g2);//<-- senza usare il .toString
	System.out.println("è anziano? "+g2.isAnziano());
	
	System.out.println(g.equals(g2));
	
	g2.setRazza("persiana");
	g2.setNome("fufi");
	g2.setEta(6);
	System.out.println(g.equals(g2));
	
	System.out.println(g2.getEta());
	
	
	
//Creare una classe che rappresenti delle macchine
	//decidete voi quali attributi secondo voi descrivono meglio una macchina
	//la classe deve implementare l'incapsulamento(attributi private e uso di get e set)
	//deve avere almeno 2 costruttori(overload costruttori)
	//deve avere il metodo toString e equals(decidete voi quando 2 macchine sono uguali)
	//deve avere i metodi accelera e frena.
	
		
	
		 
		
	}

}
