package jsonplaceholder;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonPlaceholder {

    public static void main(String[] args){
        
        String strJson = getJSONFromURL(
            "https://raw.githubusercontent.com/BoostMyTool/JsonFile/master/example.json"//ok    
            //"https://jsonplaceholder.typicode.com/posts/"//ok     
            //"https://jsonplaceholder.typicode.com/users/"//ok     
        );
// //BISOGNA mettere JSON SIMPLE nella cartella libraries, ALTRIMENTI NON FUNZIONA. https://code.google.com/archive/p/json-simple/downloads        
        JSONParser parser = new JSONParser();
    try {
        
            Object obj = parser.parse(strJson);

            JSONObject jso = (JSONObject) obj; // Questa riga SOLO PER BoostMyTool example.json 

            
//Da qui in poi per JSON PLACEHOLDER   
//            JSONArray arr = (JSONArray) obj;
//
//            for (int i = 0; i < arr.size(); i++) {
//                JSONObject valori = (JSONObject) arr.get(i);
//
//POSTS                
//                long id = (long) valori.get("id");
//                System.out.println("      id : " + id);
//
//                String title = (String) valori.get("title");
//                System.out.println("      title : " + title);
//
//                String body = (String) valori.get("body");
//                System.out.println("      body : " + body);
//                System.out.println("*****************************");
//*******************************************************************
//users
//                long id = (long) valori.get("id");
//                System.out.println("id : " + id);
//
//                String name = (String) valori.get("name");
//                System.out.println("name : " + name);
//                
//                String username = (String) valori.get("username");
//                System.out.println("username : " + username);
//
//                String email = (String) valori.get("email");
//                System.out.println("email : " + email);
//                
//                //Indirizzo
//                    JSONObject indirizzo = (JSONObject) valori.get("address");
//                    System.out.println("Address : ");
//
//                    String street = (String) indirizzo.get("street");
//                    System.out.println(" Street: " + street);                
//
//                    String suite = (String) indirizzo.get("suite");
//                    System.out.println(" suite: " + suite);                
//
//                    String city = (String) indirizzo.get("city");
//                    System.out.println(" city: " + city);                
//
//                    String zipcode = (String) indirizzo.get("zipcode");
//                    System.out.println(" zipcode: " + zipcode);
//                    
//                //Geo
//                    JSONObject geo = (JSONObject) indirizzo.get("geo");
//                    System.out.println("Geo : ");
//                    
//                    String lat = (String) geo.get("lat");
//                    System.out.println(" lat: " + lat);                
//
//                    String lng = (String) geo.get("lng");
//                    System.out.println(" lng: " + lng);
//                    
//                String phone = (String) valori.get("phone");
//                System.out.println("phone : " + phone);
//
//                String website = (String) valori.get("website");
//                System.out.println("website : " + website);
//                
//                //company
//                    JSONObject company = (JSONObject) valori.get("company");
//                    System.out.println("Company : ");
//                    
//                    String name2 = (String) company.get("name");
//                    System.out.println(" name: " + name2);                
//
//                    String catchPhrase = (String) company.get("catchPhrase");
//                    System.out.println(" catchPhrase: " + catchPhrase);
//
//                    String bs = (String) company.get("bs");
//                    System.out.println(" bs: " + bs);
//                    
//                    System.out.println("******************************");
//      }                    


// BoostMyTool example.json
           /*************** First Name ****************/
            String firstName = (String) jso.get("firstName");
            System.out.println("First Name : " + firstName);
            
            /*************** Last Name ****************/
            String lastName = (String) jso.get("lastName");
            System.out.println("Last Name : " + lastName);
            
            /*************** Age ****************/
            long age = (long) jso.get("age");
            System.out.println("Age : " + age);
            
            
            /*************** Address ****************/
            JSONObject jsonObjectAddress = (JSONObject) jso.get("address");
            System.out.println("Address : ");
            
            String streetAddress = (String) jsonObjectAddress.get("streetAddress");
            System.out.println("      Street Address : " + streetAddress);

            String city = (String) jsonObjectAddress.get("city");
            System.out.println("      City : " + city);

            String state = (String) jsonObjectAddress.get("state");
            System.out.println("      State : " + state);

            long postalCode = (long) jsonObjectAddress.get("postalCode");
            System.out.println("      Postal Code : " + postalCode);
            
            
            
            /*************** Phone Numbers ****************/
            JSONArray jsonArrayPhoneNumbers = (JSONArray) jso.get("phoneNumbers");
            System.out.println("Phone Numbers : ");
            
            for (int i = 0; i < jsonArrayPhoneNumbers.size(); i++) {
                JSONObject jsonPhoneNumber = (JSONObject) jsonArrayPhoneNumbers.get(i);
                System.out.println("      Phone Number " + (i + 1));

                String type = (String) jsonPhoneNumber.get("type");
                System.out.println("      Type : " + type);

                String number = (String) jsonPhoneNumber.get("number");
                System.out.println("      Number : " + number);
            }        

          
            
        } catch (ParseException ex){
            System.out.println("errore leggendo il file "+ex.getMessage());
        }         

        
    }
    
    
public static String getJSONFromURL(String strUrl) {
        String jsonText = "";

         URL url=null;
        try{
            url = new URL(strUrl);
        } catch (MalformedURLException ex){
            System.out.println("errore url");
        }
        try{
            Scanner sc = new Scanner(url.openStream());

            while(sc.hasNextLine()) {		
                //System.out.println(sc.nextLine());
                jsonText += sc.nextLine()+ "\n";
            }
            sc.close();
        } catch (IOException ex){
            System.out.println("errore lettura righe dal file");
        }
        
        
//        try {
//            URL url = new URL(strUrl);
//            InputStream is = url.openStream();
//
//            BufferedReader bufferedReader = 
//                            new BufferedReader(new InputStreamReader(is));
//            
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                jsonText += line + "\n";
//            }
//
//            is.close();
//            bufferedReader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        

        return jsonText;
    }

}
