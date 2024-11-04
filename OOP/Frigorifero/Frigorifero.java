package rigorifero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Frigorifero {

	public static void main(String[] args) {

		Cibo[] arrCibi= new Cibo[3];//Array di cibi
//		
//		Cibo cibo1= new Cibo("pizza");
//		Cibo cibo2= new Cibo("hamburger");
//		Cibo cibo3= new Cibo("hot dog");
//		
//		arrCibi[0]=cibo1;
//		arrCibi[1]=cibo2;
//		arrCibi[2]=cibo3;
//		
//		System.out.println("nel frigorifero ci sono i seguenti cibi:");
//		for (Cibo cibo : arrCibi) {
//			System.out.println(cibo);//toString
//		}

		//oggetti anonimi		
		Cibo[] dispensa= {new Cibo("pizza"),new Cibo("hamburger"),new Cibo("hot dog")};
		for (Cibo cibo : dispensa) {
			System.out.println(cibo);//toString
		}
		
		//trasformato l'array in un ArrayList
		ArrayList<Cibo> lista= new ArrayList<>(Arrays.asList(dispensa));
		lista.add(new Cibo("pasta"));//ho aggiunto un nuovo oggetto alla lista
		
		System.out.println("nel frigorifero ci sono i seguenti cibi:");
		lista.forEach(cibo->System.out.println(cibo));
		
		
		
		
		
	}

}
