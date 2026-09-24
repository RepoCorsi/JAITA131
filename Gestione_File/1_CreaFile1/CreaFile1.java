package CreaFile1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CreaFile1 {
    public static void main(String args[]) {
        //SCRIVE UN INSIEME DI CARATTERI SUL FILE.
        //SE IL FILE ESISTE GIà LO SOVRASCRIVE. COL TRUE SI FA L'APPEND
        
        //try (FileWriter fw = new FileWriter("Esempio.txt")) {//Try with resource... quindi non c'è bisogno di fare fw.close()   
        
        try {// TRY SENZA RESOURCE, QUINDI DOBBIAMO GESTIRE NOI LA CHIUSURA DELLO STREAM        
            FileWriter fw = new FileWriter("esempio.txt");//COL PARAMETRO TRUE FACCIAMO L'APPEND SE IL FILE GIà ESISTE, ALTRIMENTI LO CREA.
            fw.write("Prima linea del file.\n");
            fw.write("Seconda linea del file.\n");
            fw.write("Terza linea del file.\n");
            fw.write("Quarta linea del file.\n");
            fw.write("Quinta linea del file.\n");
            fw.close(); //Ricordarsi di chiudere altrimenti non si vede niente nel file!!
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

    //Informazioni sul file    
    File file = new File("Esempio.txt");
    
    System.out.println("Il file esiste? "+file.exists());

    System.out.println("Qual'è il percorso di sistema del file?\n"+file.getAbsolutePath());

    System.out.println("E' una cartella? "+file.isDirectory());
    
     //Per fare l'append del file si deve identificare il file con la classe FILE.
     //Col true dopo FileWriter si fa l'append    
    try{
        FileWriter fw = new FileWriter(file, true);//col true si fa l'append
            fw.write("Queste righe\n");
            fw.write("Verranno\n");
            fw.write("Accodate al file.\n");
        fw.close();
    } catch (IOException e){
        System.out.println("Errore nel fare l'append del file");
    }

    /**************************** Lettura del file *******************/
        int letters ;
        
        try {
            //"C:\\Users\\io\\Documents\\NetBeansProjects\\File\\CreaFile1\\esempio.txt"
            FileReader fr= new FileReader("esempio.txt");          
            while(fr.ready()) {//LEGGE UN CARATTERE ALLA VOLTA
                letters = fr.read();
                System.out.print((char) letters);
            }
            fr.close(); //RICORDARSI DI CHIUDERE LO STREAM!!
            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    
    /************************************************************************************/
    
    //cancellare un file;
    //file.delete();    
    //System.out.println("Il file esiste? "+file.exists());    
    
    }
}