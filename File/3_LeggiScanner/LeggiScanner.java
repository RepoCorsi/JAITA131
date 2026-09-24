package leggiscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiScanner {

    public static void main(String[] args) {
        
		File f = new File("C:\\Users\\io\\Documents\\NetBeansProjects\\File\\1_CreaFile1\\esempio.txt");
		

//		System.out.println("Il file esiste? "+f.exists());
//		
//		System.out.println("Qual'è il percorso di sistema del file?\n"+f.getAbsolutePath());
//
//		System.out.println("E' una cartella? "+f.isDirectory());
                                                
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {				
                            System.out.println(sc.nextLine());				
			}
					
		} catch (FileNotFoundException e) {
                    System.out.println("errore lettura file");
		}
        
    }

}
