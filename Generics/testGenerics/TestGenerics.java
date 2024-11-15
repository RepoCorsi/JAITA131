package testGenerics;

public class TestGenerics {

	public static void main(String[] args) {

		//I generics funzionano solo con le classi
		Integer[] numeri= {1,2,3,4};
		String[] parole= {"miao","bau","cip","coccode"};
		Boolean[] veroFalso= {true,false,true,false};
		Double[] virgola= {1.1,2.2,3.3,4.4};
		
		stampa(numeri);
		stampa(parole);
		stampa(veroFalso);
		stampa(virgola);
		
		Esempio e= new Esempio(10, "ciao");
		System.out.println(e);
		
		ClasseGenerica<Integer, Integer> oggettoInteri= new ClasseGenerica(1, 9);
		System.out.println(oggettoInteri);
		
		ClasseGenerica<Double, Double> oggettoDouble= new ClasseGenerica<>(3.14, 3.3);
		System.out.println(oggettoDouble);
		
		ClasseGenerica<String, Boolean> stringaBooleana= new ClasseGenerica<>("ciao", true);
		System.out.println(stringaBooleana);	
		
		ClasseGenerica misto= new ClasseGenerica('#',99);//non parametrizzato
		System.out.println(misto);
		
	}//fine main

	
	public static<T> void stampa(T[] i) {//la t rappresenta tutti i tipi.
		for (T valore : i) {
			System.out.println(valore);
		}
	}
	
//	static void stampa(Integer[] i) {
//		for (Integer interi : i) {
//			System.out.println(interi);
//		}
//	}
//	
//	static void stampa(String[] i) {
//		for (String stringa : i) {
//			System.out.println(stringa);
//		}
//	}
//	
//	static void stampa(Boolean[] i) {
//		for (Boolean booleano : i) {
//			System.out.println(booleano);
//		}
//	}
//	
//	static void stampa(Double[] i) {
//		for (Double virgola : i) {
//			System.out.println(virgola);
//		}
//	}
}
