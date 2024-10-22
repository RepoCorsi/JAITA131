package variabili;

import java.util.Scanner;

public class Variabili {

	public static void main(String[] args) {

		///variabili numeriche
		
		//qui dichiaro 3 varibili b,sh,i
		//dichiarare significa indicare il tipo e il nome della variabile
		
		//numeriche intere
		byte b=1; //-128 +127 ->2^8=256
		short sh=1; //-32768 + 32768 ->2^16 65.500...
		int i=1;//tipo predefinito per gli interi -2miliari +2 miliardi 2^32.....
				
		System.out.println(b); //qui stampo il valore della variabile b
		b=25;
		System.out.println(b);//25
		
		System.out.println("123");//stampa 123 come parola
		System.out.println(123);//stampa 123 come numero
		
		System.out.println(sh);
		
		System.out.println("il valore di i è "+i);
		System.out.println("cambio il valore");
		i=50;//cambio il  valore di i
		System.out.println("Adesso il valore di i è "+i);
		
		int primo=10;
		int secondo=5;
		
		int somma=primo+secondo;
		System.out.println(somma);
		int sottrazione=primo-secondo;
		System.out.println(sottrazione);
		int moltiplicazione=primo*secondo;
		System.out.println(moltiplicazione);
		int divisione=primo/secondo;
		System.out.println(divisione);
		
		System.out.println(10*10/5+3-1*4/2);
		
		//int a="ciao";
		//int h=1.5;
		
		long lungo=66L;//la L obbliga java a considerare la variabile come tipo long
		System.out.println(lungo);
		
		//------------------------------------------------
		//variabili numeriche con la virgola		
		float f=1.5F; // per variabili con la virgola, ma con meno cifre dopo la virgola
		double d=2.5;//tipo predefinito di varibili con la virgola
		
		//---------------------------------------------------------------
		//tipi di dato carattere.
		//si rappresentano con un apice solo.
		char carattere='a';
		char carattere2='b';
		System.out.println(carattere+ " " +carattere2);
		char aMaiuscola=65;
		System.out.println(aMaiuscola);//A
		aMaiuscola++; //++ vuol dire aggiungi 1
		System.out.println(aMaiuscola);//B
		aMaiuscola++;
		System.out.println(aMaiuscola);//C
		//prima stampo e poi incremento
		//post incremento
		System.out.println(aMaiuscola++);//stampa c ma vale D 
		System.out.println(aMaiuscola);//D
		//pre incremento
		System.out.println(++aMaiuscola);//PRIMA INCREMENTA e po stampa E
		
		
		//---------------------------------------------------------------
		String parola="ciao";
		System.out.println(parola);
		
		String parola2=" a tutti";
		
		String parola3=parola+parola2;
		System.out.println(parola3);
		
		//-----------------------------------------------
		boolean vero=true;
		boolean falso=false;
		
		int eta=12;
		boolean maggiorenne= eta>=18;
		System.out.println(maggiorenne);
		
		//----------------------------------------------------
		//le costanti si dichiarano con final
		final double PIGRECO=3.14;
		//PIGRECO=99; non posso cambiare il valore
		////--------------------------------------------------------
		int var=56;
		long lung=var; //cast implicitio
		//si ha un cast quando mischio i tipi di dati
		
		int x=10; //cast implcito
		double dbl=x;//java riesce a risolvere i tipi diversi
		
		long l2=56L;
		int i2=(int)l2;//cast esplicito. ho trasformato un long in un int
		
		double d3=3.999999999;
		int intera=(int)d3;//cast esplicito . rischio di perdere dei valori
		System.out.println(intera);
		
		//////////////////////////////////////////////////////////////////////
		byte mioByte=12;
		byte mioByte2=15;
		//il tipo predefinito è int, anche se a volte usiamo un altro tipo di dato
		byte tot=(byte)(mioByte+mioByte2);
		
		char lettera='a';
		int ascii=lettera;
		System.out.println(ascii);
		//------------------
		char carattere3=(char)100;
		System.out.println(carattere3);
		
		int w=10;
		
		//post incremento
		System.out.println(w++);//prima stampa 10 e poi icrementa
		System.out.println(w);//11
		
		//pre incremento
		System.out.println(++w); //prima incrementa e poi stampa 12
		
		boolean v=false;
		System.out.println(v);
		
		v=(10<2);
		System.out.println(v);
		
		int z=10;
		
//		System.out.println(z++);//post incremento //10
//		System.out.println(z);//11
		
		System.out.println(++z);//pre incremento //11
		
		var miaVariabile=10;//prende il tipo dal valore che assegno
		//miaVariabile="ciao"; //non posso cambiare il tipo di dato
		
		var virgola=3.14; //double
		//virgola="ciao";
		
		String nome="fabio";
		
		//progetto nuovo che si chiama calcoli
		//il programma deve calcolare perimetro e area
		//di un rettangolo di base 25 e altezza 40
		//definire 4 variabili col tipo giusto base, altezza, area e perimetro
		//stampare tutte le variabili a video
		
		//programma che calcola l'area del cerchio e il perimetro del cerchio
		//area pi*r*r
		//perimetro 2*pi*r
		//definire una costante PIGRECO
		//dichiarare un raggio a piacere
		//calcolare perimetro e area
		//stampare tutto
				
	}

}
