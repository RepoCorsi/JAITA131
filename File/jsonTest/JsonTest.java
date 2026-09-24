package jsontest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTest {
        //BISOGNA INSTALLARE JSON SIMPLE ALTRIMENTI NON FUNZIONA. https://code.google.com/archive/p/json-simple/downloads
    public static void main(String[] args) throws IOException, ParseException{


         JSONParser parser = new JSONParser();

        try{
            Object obj = parser.parse(new FileReader("src/cocktailjson.json"));

            JSONObject jso = (JSONObject) obj;

            JSONArray drinks = (JSONArray) jso.get("drinks");

            Iterator i = drinks.iterator();

            while (i.hasNext()){
                JSONObject drink = (JSONObject) i.next();
                String title = (String) drink.get("strDrink");
                String img = (String) drink.get("strDrinkThumb");
                System.out.println(title+" "+img);
            }             
            
        } catch (FileNotFoundException ex){
            System.out.println(ex);
        }

    }

}
