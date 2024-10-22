package esempioDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EsempioDate {

	public static void main(String[] args) {
		
		Date oggi = new Date();
		System.out.println(oggi);
		
		//int giorno=oggi.getDate(); //deprecato non si usa più
		
		LocalDate data=LocalDate.now();
		System.out.println(data);
		
		LocalTime ora = LocalTime.now();
		System.out.println(ora);
		
		LocalDateTime dataConOra= LocalDateTime.now();
		System.out.println(dataConOra);
		
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss\n"+
															   "'Oggi è il' EEEE dd MMMM Y");
		
		System.out.println(dataConOra.format(formato));
		
		//stampare la data di oggi col formato Oggi è il 10**10**2024
		//sono le ore ora**minuti**secondi** di giovedì
		
		
		
		
		
	}
}
