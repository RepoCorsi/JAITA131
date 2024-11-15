package EccezioneStringa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestEccezioneStringa {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Inserisci una stringa e una posizione");
		
		String stringa="";
		int posizione=0;
		
		try {
			stringa=s.nextLine();
			posizione=s.nextInt();
			System.out.println(estraiStringa(stringa, posizione));
		} catch (StringaTroppoCorta | NumeroTroppoGrande | InputMismatchException e) {
			System.out.println("Errore: "+((e.getMessage()==null)?"tipo errato":e.getMessage()));
			//System.out.println("Errore: "+e.getMessage());
		}
		
		
	}//fine main
	
	
//-------------------------------------------------------------------	
	public static String estraiStringa(String stringa, Integer numero) throws StringaTroppoCorta,NumeroTroppoGrande {
			
		if (stringa.length()<2) {
			throw new StringaTroppoCorta("La stringa deve essere lunga almeno 2 caratteri");
		}
		
		if (numero>stringa.length()) {
			throw new NumeroTroppoGrande("Numero troppo grande rispetto alla lunghezza della s");
		}
		
		return stringa.substring(numero);
	}
	
	
}
