package esempioMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class EsempioMap {

	public static void main(String[] args) {
		
		//un insieme di elementi identificati da chiave e valore
		//le chiavi sono univoche, non ammettono duplicati
		//le chiavi devono essere dello stesso tipo
		//HashMap
		//TreeMap
		
		HashMap<String,String> paesi = new HashMap<>();
		//non si usa add ma put 
		paesi.put("USA", "Washington");
		paesi.put("Norvegia", "Oslo");
		paesi.put("Russia", "Mosca");
		paesi.put("Cina", "pechino");
		
		//inserisce solo se non esiste già la chiave
		paesi.putIfAbsent("USA", "xxx");
		//paesi.put("USA", "xxx");
		paesi.putIfAbsent("Italia", "Roma");		
		
		System.out.println(paesi);
		
		//tramite la chiave prendo il valore
		System.out.println(paesi.get("Russia"));//Mosca
		
		//cerca la chiave. true se la trova/false se non c'è
		System.out.println(paesi.containsKey("Inghilterra"));
		//cerca il valore true se lo trova/false se non c'è
		System.out.println(paesi.containsValue("pechino"));
		
		//visualizzo solo le chiavi
		for (String chiave : paesi.keySet()) {
			System.out.println(chiave);
		}
		
		//visualizzo solo i valori
		for (String valore : paesi.values()) {
			System.out.println(valore);
		}
		
		//stampo chiave e valore
		for (String chiave : paesi.keySet()) {
			System.out.println("chiave "+chiave+" valore "+paesi.get(chiave));
		}
		
paesi.forEach((chiave,valore)->System.out.println("chiave "+chiave+" valore "+valore));

paesi.remove("USA");
System.out.println(paesi);

//---------------------------------------------------------------------------------
	HashMap<String, Integer> montagne= new HashMap<>();
	
	montagne.put("Everest", 8848);
	montagne.put("K2", 8630);
	montagne.put("Nanga Parbat", 8200);

montagne.forEach((chiave,valore)->System.out.println(chiave+" è alto: "+valore+" metri"));

//-----------------------------------------------------------------
	HashMap<String,String[]> autori= new HashMap<>();

	//libri degli autori
	String[] x= {"a","b","c"};//libri dell'autore 1
	String[] y= {"d","e","f"};//libri dell'autore 2
	String[] z= {"g","h","i"};//libri dell'autore 3
	
	autori.put("autore1",x);
	autori.put("autore2",y);
	autori.put("autore3",z);
	
for (String autore : autori.keySet()) {
	System.out.println("Autore: "+autore+ " Libri "+Arrays.toString(autori.get(autore)));
}		
//-----------------------------------------------------------------------------------

	TreeMap<String,Double> frutti= new TreeMap<>();
	frutti.put("mela", 1.50);
	frutti.put("uva", 2.00);
	frutti.put("banana",3.00);
	frutti.put("kiwi",2.50);
	
	System.out.println(frutti);
		
		

	}

}
