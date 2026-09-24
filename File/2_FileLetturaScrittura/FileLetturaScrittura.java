package fileletturascrittura;

import java.io.*;
public class FileLetturaScrittura {

    public static void main(String[] args) {

        //SCRIVIAMO IL FILE:
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Esempio.txt"))) {
            bw.write("Prima line del file.");
            bw.newLine();
            bw.write("Seconda linea del file");
            //bw.close(); non serve perchè lo abbiamo scritto col try with resource
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //LEGGIAMO IL FILE:
        try (BufferedReader br = new BufferedReader(new FileReader("Esempio.txt"))) {
            System.out.println("Il contenuto del file è: ");
            while(br.ready()) {
                System.out.println(br.readLine());
            }		
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
