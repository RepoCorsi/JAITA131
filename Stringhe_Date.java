package stringhe_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Stringhe_Date {

    public static void main(String[] args) {

        //La data è un oggetto del package java.util,
        //Quindi ha l'iniziale maiuscola e va importata e creata col New
        Date oggi= new Date();
        System.out.println(oggi); //data di oggi
        
//        int giorno=oggi.getDate();//deprecato. Usare LocalDate o Calendar invece
//        int mese=oggi.getMonth()+1; ///i mesi partono da 0, quindi si aggiunge 1
//        int anno=oggi.getYear()+1900;//ritorna la data meno 1900, quindi aggiungiamo 1900
//        System.out.println(giorno+"/"+mese+"/"+anno);

        System.out.println("************");
        
        
        /**************************************************************************/
        
        LocalDate data= LocalDate.now(); //2024-03-07
        System.out.println(data);
        
        LocalTime ora=LocalTime.now();// ora con millisecondi
        System.out.println(ora);
        
        LocalDateTime dataConOra= LocalDateTime.now(); //data con ora
        System.out.println(dataConOra);
        
        //per formattare:
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss\n"+
                                                              "EEEE dd MMMM Y\n"+ //giorno e mese in lettere
                                                              "'giorno dell anno' D \n"+
                                                              "'settimana dell anno' w \n"+
                                                              "'settimana nel mese' W \n");
        
        System.out.println(dataConOra.format(formato));
               
        //Estrarre parti di data:
        int numeroGiorno=LocalDate.now().getDayOfMonth(); //25 giorno del mese
        String nomeGiorno=LocalDate.now().getDayOfWeek().name(); //TUESDAY
        String nomeMese=LocalDate.now().getMonth().name();//JUNE
        int numeroMese=LocalDate.now().getMonthValue();//6
        int anno=LocalDate.now().getYear(); //2024              

        System.out.println("numeroGiorno "+numeroGiorno+
                           "\nnomeGiorno "+nomeGiorno+
                           "\nnomeMese "+nomeMese+
                           "\nnumeroMese "+numeroMese+
                           "\nanno "+anno);


        //nomi in italiano
        String nomeGiornoIta=LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);
        System.out.println(nomeGiornoIta);
        String nomeMeseIta=LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);
        System.out.println(nomeMeseIta);
        /******************************************************************************/
        
        //Altro esempio con la classe calendar.
//        Calendar calendario = Calendar.getInstance();
//
//        System.out.println(calendario.getTime());//data di oggi

        //Formattiamo la data
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\n"+
//                                                    "EEEE dd MMMM Y\n"+ //giorno e mese in lettere
//                                                    "'giorno dell anno' D \n"+
//                                                    "'settimana dell anno' w \n"+
//                                                    "'settimana nel mese' W \n");
//       
//
//        System.out.println(sdf.format(calendario.getTime()));

//        System.out.println(calendario.get(Calendar.DATE));//Numero giorno corrente es: 19
//        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));//Numero giorno della settimana, parte da domenica
//        System.out.println(calendario.get(Calendar.MONTH));//parte da zero. gennaio=0
//        System.out.println(calendario.get(Calendar.YEAR));
//        System.out.println(calendario.get(Calendar.WEEK_OF_YEAR));//Settimana nell'anno
//        System.out.println(calendario.get(Calendar.WEEK_OF_MONTH)); //Settimana nel mese


        /**************STRINGHE***********************/
        //Anche le stringhe sono oggetti e andrebbero creati con New
        //String parola=new String("ciao a tutti");
        //Ma sono molto comuni, quindi java ci permette di dichiararli come i tipi primitivi
        String parola="ciao ";
        String parola2="a tutti";
        String parola3= parola+parola2;
        System.out.println(parola3);

        //lunghezza della stringa
        int lunghezza=parola.length();
        System.out.println(lunghezza);

        // controlla se inizia o finisce con una parola. false se non trovato
        boolean finisceCon=parola3.endsWith("tutti");
        boolean iniziaCon=parola3.startsWith("ciao");

        System.out.println(finisceCon+" "+iniziaCon);

        //indexOf posizione/indice della PRIMA lettera/parola trovata. -1 se non trovato
        int posTutti=parola3.indexOf("tutti");
        System.out.println(posTutti);

        //indexOf partendo da una posizione specificata
        int secondaT=parola3.indexOf("t",posTutti+1);//t partendo dalla posizione posTutti+1 perchè estremo escluso
        System.out.println(secondaT);


        //charAt() carattere a quella posizione:
        String name="Fabio";
        char ch=name.charAt(2); //se l'indice è troppo grande da errore
        System.out.println(ch);//b

        //primo e ultimo carattere di una stringa con charAt()
        String str = "ciao a tutti";
        int lungh = str.length(); //lunghezza

        System.out.println(str.charAt(0));  // primo carattere

        System.out.println(str.charAt(lungh-1));  //ultimo carattere


        ///Contains: ritorna true o false
        //case sensitive
        String myStr = "ciao";
        System.out.println(myStr.contains("cia"));//true
        System.out.println(myStr.contains("o"));//true
        System.out.println(myStr.contains("Hello")); //false


        //Confronto tra stringhe. Le stringhe sono oggetti, e per gli oggetti non si può fare == ma equals()
        //Altrimenti si confronta l'indirizzo di memoria e non il valore.
        String stringa1="ciao";
        String stringa2="ciao";
        boolean uguali=stringa1.equals(stringa2);

        System.out.println("stringa1==stringa2 " + uguali);

        stringa2="CIAO";
        boolean ugualiNoCase=stringa1.equalsIgnoreCase(stringa2);
        System.out.println("NoCase " + ugualiNoCase);


        //compareTo Verifica dell'ordine alfabetico:
        //DA FARE DOPO CON IF
//        String str1 = "Gatto";
//        String str2 = "Micio";
//
//        if(str1.compareTo(str2)>0) {//str1-str2>0  str1 è più grande quindi viene dopo
//           System.out.println(str2 +" viene prima in ordine alfabetico");
//
//        }else if(str1.compareTo(str2)<0){//str1-str2<0 str2 è più grande quindi viene dopo
//           System.out.println(str1 +" viene prima in ordine alfabetico");
//
//        }else if(str1.compareTo(str2)==0){
//           System.out.println("Le parole coincidono");
//        }


        //isEmpty() ritorna true se è vuota
        System.out.println("è vuota? "+stringa2.isEmpty());

        //substring
        String parola4="ciao a tutti";
        String tutti = parola4.substring(7, 12);//da 7 a 11=tutti. estremo superiore non incluso(-1)
        System.out.println("substring = " + tutti);

        String ciao = parola4.substring(0, 4);//da 0 a 3= ciao
        System.out.println("substring = " + ciao);

        //cerca un pezzo della stringa e la cambia in un altra
        System.out.println(parola4.replace("tutti","nessuno"));
        System.out.println(parola4.replaceAll(" ", ""));//cerca tutti i caratteri e li sostituisce

        //!!!LE STRINGHE SONO IMMUTABILI!!
        //QUALSIASI OPERAZIONE SU UNA STRINGA RITORNA UNA NUOVA STRINGA E LASCIA
        //L'ORIGINALE INTATTA!!
        //infatti se stampiamo parola4 otteniamo il valore originale e non quello modificato

        System.out.println(parola4);

        //tutto in maiuscolo/minuscolo
        System.out.println(parola4.toUpperCase());
        System.out.println(parola4.toLowerCase());


        //CARATTERI DI ESCAPE:
        System.out.println("ciao a \"tutti\"");
        System.out.println("c:\\windows\\..");
        System.out.println("ciao\na tutti");
        System.out.println("ciao\ta tutti");


        //Stampare la data di oggi col formato "Oggi è il gg*MM*aaa. Sono le ore HH:mm:SSn di giovedì"

        //A partire dalla stringa "java è un bel linguaggio di programmazione"

        //trovare la posizione della parola linguaggio
        //trovare la posizione dell'ultimo carattere della frase.
        //ritagliare a partire dalle posizioni trovate, la stringa "linguaggio di programmazione"        
        //trovare la posizione della seconda g

        //Soluzone:
        //DateTimeFormatter formato2=DateTimeFormatter.ofPattern("'Oggi è il' dd*MM*yyyy 'Sono le ore 'HH:mm:ss 'di' EEEE " );             
        //System.out.println(dataConOra.format(formato2));
        
        // String frase="java è un bel linguaggio di programmazione";
        // int linguaggio=frase.indexOf("linguaggio");
           //char ultimo=frase.charAt(lunghe-1);

        // int posUltimo=frase.indexOf("ultimo");
        // String l=frase.substring(linguaggio,posUltimo);
        // System.out.println(l);
        // int posG=frase.indexOf("g");
        // int pos2G=frase.indexOf("g",posG+1);
        // int lunghe=frase.length();



    }

}
