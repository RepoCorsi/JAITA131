package eccezioni;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 *  Scrivi un programma che istanziato un vettore di interi di 5 posizioni chieda all'utilizzatore di 
	inserire un numero in una posizione specificata; gestire l'eventualità che vengano violati i limiti dell'array.
 * */
public class TestaEccezioni {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creazione di un array di 5 elementi
        int[] array = new int[5];

            try {
                System.out.print("Inserisci la posizione in cui vuoi inserire un valore (0-4): ");
                int index = scanner.nextInt();  // Legge l'indice dall'input dell'utente
                System.out.print("Inserisci un valore da inserire in posizione " + index + ": ");
                int value = scanner.nextInt();  // Legge il valore dall'input dell'utente
                array[index] = value;  // Assegna il valore all'indice specificato

                System.out.println("Valore inserito correttamente!");
            }catch (InputMismatchException e) {
                // Cattura l'eccezione specifica al nextInt
                System.out.println("Errore: Devi inserire cifre numeriche");
            }catch (ArrayIndexOutOfBoundsException e) {
                // Cattura l'eccezione specifica per indici fuori limite
                System.out.println("Errore: l'indice deve essere compreso tra 0 e 4.");
            }finally {
            	scanner.close();  // Chiude lo scanner
            }
    }

}


