package testForme;

import java.util.ArrayList;
import java.util.Scanner;

public class TestForme {

	public static void main(String[] args) {

		ArrayList<FormaAstratta> f= new ArrayList<>();
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("inserisci le dimensioni di base e altezza");
		double base= s.nextDouble();
		double altezza= s.nextDouble();
		System.out.println("inserisci il raggio");
		double raggio=s.nextDouble();
		s.nextLine();
		
		f.add(new Rettangolo(base,"Rettangolo", altezza));
		f.add(new Triangolo(base,"Triangolo"));
		f.add(new Cerchio(raggio,"Cerchio"));
		f.add(new Quadrato(base,"Quadrato"));
		
		f.forEach(forme ->
			{System.out.println(forme);
			System.out.println("Area: "+forme.area());
			System.out.println("Perimetro: "+forme.perimetro());
			}
		);
		
//		for (FormaAstratta forme : f) {
//			System.out.println(forme);
//			System.out.println(forme.area());
//			System.out.println(forme.perimetro());
//		}
		
		
		
		
		
		
		
	}

}
