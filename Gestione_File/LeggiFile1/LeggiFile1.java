package LeggiFile1;

import java.io.*;
class LeggiFile1 {
    
    public static void main(String args[]) {
        
        int letters ;
        
        try {
            FileReader fr= new FileReader("C:\\Users\\io\\Documents\\NetBeansProjects\\File\\CreaFile1\\esempio.txt");          
            while(fr.ready()) {
                letters = fr.read(); //LEGGE UN CARATTERE ALLA VOLTA
                System.out.print((char) letters);
            }
            fr.close(); //RICORDARSI DI CHIUDERE LO STREAM!!
            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
    }//fine main
}