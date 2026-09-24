package leggifileInternet;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class LeggiFileInternet {

    public static void main(String[] args) {
        
         URL url=null;
         
//        Scanner drink=new Scanner(System.in);
//        System.out.println("inserisci il cocktail che vuoi");
//        String c=drink.nextLine();         
         
        try{
            //url=new URL("https://jsonplaceholder.typicode.com/posts/");
            //url=new URL("https://jsonplaceholder.typicode.com/users");
            //url=new URL("https://www.thecocktaildb.com/api/json/v1/1/random.php");
            //url=new URL("https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita");
            // con valore passato dallo Scanner
            //url=new URL("https://www.thecocktaildb.com/api/json/v1/1/search.php?s="+c);            
            //url=new URL("https://www.omdbapi.com/?apikey=1adf89ca&s=the%20hobbit");
            //url=new URL("http://api.weatherapi.com/v1/current.json?key=c5e7e1a1509b4f8daf4220617232401&q=turin");
            //url=new URL("http://api.openweathermap.org/data/2.5/weather?q=Turin&units=metric&lang=it&appid=dab6c942ba6f70bda2c0c357f6129de1");
            url=new URL("http://testecdl.altervista.org/stati.txt");
           
        } catch (MalformedURLException ex){
            System.out.println("errore lettura da internet");
        }
        try{
            Scanner sc = new Scanner(url.openStream()); 
            while(sc.hasNextLine()) {	
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException ex){
            System.out.println("errore lettura righe dal file");
        }
        	
    }

}
