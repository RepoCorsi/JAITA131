package gestioneEccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class TestEccezioni {

	static int numCaramelle=10;
	static int quante=0;
	
	public static void main(String[] args) {

	/*checked: 
	 * esprimono condizioni che si riferiscono a condizioni recuperabili,
	 * Danno errore in compilazione, il codice non compila e devono essere gestiti 
	 * dal programmatore
	 * 
	 * Obbligano il programmatore a gestirla altrimenti il codice non compila
	 * 
	 * IOEXception, FIleNotFoundException,
	 * Estendono la classe java.lang.Exception
	 * 
	 * unchecked:
	 * Esprimono condizioni NON recuperabili che avvengono a RUNTIME
	 * Non sono controllate dal compilatore, quindi non danno errore 
	 * e non richiedono una gestione diretta del programmatore 
	 * NullPointException, IndexOutOfBoundException, ArithmeticException
	 * Estendono la classe java.lang.RuntimeException
	 * 
	 */
		
		int a=10;
		int b=2;
		int c=0;
		//Gestione eccezioni
		try {//prova a fare questo pezzo di codice tra {}
			c=a/b; //unchecked	
			System.out.println(c);
			//Se noti un problema esegui quello che c'è nelle{}			
			//potete mettere tanti catch()
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("Niente panico è solo una divisione per 0 ");
			//e.printStackTrace();//messaggino giallo
			c=-1;
		}catch(Exception e) {//ultimo da mettere gestisce tutti i tipi di eccezioni
			System.out.println("Errore che non so qual'è ma l'ho gestito lo stesso");
		}finally {//a prescindere dall'errore
			System.out.println("io vengo eseguito lo stesso anche se non ci sono errori");
		}
		
		//-------------------------------------------------------------
		System.out.println("il codice può continuare c= "+c);
		
		int[] arr= {1,2,3,4,5};
		
		try {//unchecked
			for (int i = 0; i <=arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Hai superato i limiti dell'array "+e.getMessage());
		}
		//-------------------------------------------------------------------
		Scanner s= new Scanner(System.in);
//		
//		try {
//			System.out.println("Inserisci un numero");
//			int num= s.nextInt();
//			//s.nextLine();
//		}catch (InputMismatchException e) {
//			System.out.println("Devi inserire solo numeri");			
//		}finally {
//			s.nextLine();
//		}
		//---------------------------------------------------------------
		//possiamo lanciare qualunque tipo di eccezione anche se non c'è un errore
		try {
			System.out.println("Ciao a tutti");
			throw new Exception("Sono una eccezione lanciata a caso");//sto sollevando una eccezione anche se non c'è errore
		}catch (Exception e) {
			System.out.println("Ho catturato l'eccezione che hai sollevato a caso "+e.getMessage());
		}
		//--------------------------------------------------------------------		
//		try {
//			System.out.println("inserisci un numero");
//			int num=s.nextInt();
//			if (num<0) {
//				throw new Exception();
//			}
//			System.out.println("la radice quadrata di "+num+" è "+ Math.sqrt(num));
//		} catch (Exception e) {
//			//e.printStackTrace();
//			System.out.println("il numero non può essere negativo");
//		}finally {
//			s.nextLine();
//		}
		//----------------------------------------------------------------------
		try {
			System.out.println("Blocco try Esterno");
		//l'eccezione si propaga al blocco più esterno alla ricerca del gestore corretto
			try {
				System.out.println("Blocco try interno");
				throw new Exception("Eccezone sollevata dal bocco interno");
			} catch (ArithmeticException e) {
				System.out.println("NON sto gestendo l'eccezione del try interno");
			}finally {
				System.out.println("finally del try interno");
			}
			System.out.println("xxx");//non viene eseguito perchè va subito al catch
		}catch (Exception e) {
			System.out.println("gestisco l'eccezione del blocco interno che "
							   + "si è propagata al blocco esterno "+e.getMessage());
		}finally {
			System.out.println("finally blocco esterno");
		}
		//------------------------------------------------------------------------
		//checked
		int ris;
		try {
			ris = dividi(10, 0);
			System.out.println(ris);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Errore nell'esecuzione del metodo");
		}
		
		//---------------------------------------------------------------
		int[] anni= {25,-1,180,30};
		for (int eta : anni) {
			
			try {
				controllaEta(eta);
				System.out.println(eta+ " è una età valida");
			} catch (EtaInvalida e) {
				//e.printStackTrace();
				System.out.println(eta+" età non valida: "+e.getMessage());
			}
		}
		//-----------------------------------------------------------------
		System.out.println("Ci sono 10 caramelle");
		
		while(numCaramelle>0) {
			System.out.println("Quante ne vuoi comprare?");
			quante=s.nextInt();
			s.nextLine();
			
			try {
				compra(quante);
			} catch (CaramelleFinite e) {
				//e.printStackTrace();
				System.out.println("Hai mangiato tutte le caramelle! "+e.getMessage());
			}
		}
		
		
		
		
	}//fine main
	
	
	static void compra(int numero) throws CaramelleFinite{
		numCaramelle-=numero;
		
		if (numCaramelle<=0) {
			throw new CaramelleFinite("Misurati la glicemia");
		}
		System.out.println("ne rimangono "+numCaramelle);
	}
	
	//----------------------------------------------------------------
	static int dividi(int i, int i1) throws Exception {//propaga l'eccezione al chiamante
		return i/i1;
//		try {
//			return i/i1;
//		} catch (Exception e) {
//			//e.printStackTrace();
//			System.out.println("Errore metodo");
//			return -1;
//		}
	}
	//------------------------------------------------------------------------
	
	static void controllaEta(int eta) throws EtaInvalida{
		
		if (eta<0 || eta >150) {
			//throw new EtaInvalida();
			throw new EtaInvalida("L'età deve essere compresa tra 0 e 150");
		}
		
	}
	
	
}//fine classe
