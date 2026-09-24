package meteo;

import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Meteo {

    public static void main(String[] args) {
        
       Scanner tastiera =new Scanner(System.in);
       System.out.println("inserisci la città per avere le informazioni");
       String citta=tastiera.nextLine();
       
       String strJson= ritonaJson("http://api.openweathermap.org/data/2.5/weather?q="+citta+"&units=metric&lang=it&appid=dab6c942ba6f70bda2c0c357f6129de1");
                
        //System.out.println(strJson);
       
        JSONParser parser =new JSONParser();
        
        try{
            Object obj =parser.parse(strJson);//trasformiamo una stringa in oggetto
            JSONObject jso= (JSONObject)obj;//trasforormiamo l'oggeto in un oggetto JSON
            //col metodo get prendiamo le chiavi
            JSONArray weather = (JSONArray)jso.get("weather");//questo è un array
            JSONObject valori=(JSONObject) weather.get(0);
            String descrizione= (String)valori.get("description");
            
            JSONObject main= (JSONObject)jso.get("main");
            double temp=(double) main.get("temp");
            double tempMin=(double) main.get("temp_min");
            double tempMax=(double) main.get("temp_max");
            
            System.out.println("A "+citta+" ci sono "+temp+"° "+"Max "+tempMax+" min "+tempMin+" "+descrizione);

        } catch (Exception e){
            System.out.println("Errore lettura file json "+e.getMessage());
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
        } catch (Exception e){
            System.out.println("Errore lettura file "+e.getMessage());
        }
            
        return jsonText;        
    }    
    
    
    

}
