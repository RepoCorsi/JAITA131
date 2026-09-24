package cercacocktail;

import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//BISOGNA mettere JSON SIMPLE nella cartella libraries, ALTRIMENTI NON FUNZIONA. https://code.google.com/archive/p/json-simple/downloads 

public class CercaCocktail {

    public static void main(String[] args) {
                
        
       Scanner tastiera =new Scanner(System.in);
       System.out.println("inserisci il cocktail per avere le informazioni");
       String cocktail=tastiera.nextLine();
       
       String strJson= ritonaJson("https://www.thecocktaildb.com/api/json/v1/1/search.php?s="+cocktail);
        
        
        JSONParser parser =new JSONParser();
        
        try{            
            Object obj=parser.parse(strJson);//trasformiamo la stringa in un oggetto
            JSONObject jso = (JSONObject)obj;//trasformo l'oggetto generico in un oggetto JSON
            JSONArray drinks= (JSONArray)jso.get("drinks");
            
            for (int i = 0; i < drinks.size(); i++){
              JSONObject drink=  (JSONObject) drinks.get(i);
              String nome= (String)drink.get("strDrink");
              String categoria=(String)drink.get("strCategory");
              String istruzioni=(String)drink.get("strInstructionsIT");
              
              System.out.println(nome+"\n"+categoria+"\n"+istruzioni+"\n");  
            }

        } catch (Exception e){//ParseException ex
            System.out.println("errore nella lettura del file json "+e.getMessage());
        }
        

    }//fine main
    
    
    
    static String ritonaJson(String strUrl){
        
        String jsonText="";        
        URL url=null;
        
        try{
            url=new URL(strUrl);
        } catch (Exception e){
            System.out.println("Errore url");
        }
        
        try{            
            Scanner s=new Scanner(url.openStream());
            while (s.hasNextLine()){
                //System.out.println(s.nextLine()+"\n");                
                jsonText+=s.nextLine()+"\n";
            }            
        } catch (Exception e){//IOException ex
            System.out.println("Errore lettura file "+e.getMessage());
        }
            
        return jsonText;        
    }
    
    
    

}
