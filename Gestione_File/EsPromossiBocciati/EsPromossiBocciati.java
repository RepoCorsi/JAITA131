package espromossibocciati;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EsPromossiBocciati {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        FileWriter writer = null;
        try{
            //Creazione del file alunni e voto
            File file = new File("alunni.txt");
            writer = new FileWriter(file);
            for (int i = 1; i <= 5; i++){
                System.out.println("Inserisci nome e cognome dello studente " + i + ":");
                String nome = s.next();
                String cognome = s.next();
                System.out.println("Inserisci il voto finale di " + nome + " " + cognome + ":");
                int voto = s.nextInt();
                writer.write(nome + " " + cognome + " " + voto + "\n");
            }

            writer.close();
            
            //Creazione dei 2 file promossi e bocciati
            File promossiFile = new File("promossi.txt");
            FileWriter promossiWriter = new FileWriter(promossiFile);
            File bocciatiFile = new File("bocciati.txt");
            FileWriter bocciatiWriter = new FileWriter(bocciatiFile);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String[] tokens = line.split(" ");
                String nome = tokens[0];
                String cognome = tokens[1];
                int voto = Integer.parseInt(tokens[2]);

                if (voto >= 6){
                    promossiWriter.write(nome + " " + cognome + " " + voto + "\n");
                }else{
                    bocciatiWriter.write(nome + " " + cognome + " " + voto + "\n");
                }
            }
            reader.close();
            promossiWriter.close();
            bocciatiWriter.close();
            
            //Lettura del file promossi
            System.out.println("Elenco degli alunni promossi:");
            Scanner promossiReader = new Scanner(promossiFile);
            while (promossiReader.hasNextLine()){
                System.out.println(promossiReader.nextLine());
            }
            promossiReader.close();
            
            //Lettura del file bocciati
            System.out.println("\nElenco degli alunni bocciati:");
            Scanner bocciatiReader = new Scanner(bocciatiFile);
            while (bocciatiReader.hasNextLine()){
                System.out.println(bocciatiReader.nextLine());
            }
            bocciatiReader.close();
            
        } catch (IOException ex){
            System.out.println(ex.getMessage());            
        } finally{
            try{
                writer.close();
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

}
