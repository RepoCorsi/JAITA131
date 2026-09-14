package frigoriferoscadenza;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
//PROGRAMMA DIFFICILE!!
//NON PER CORSI DI BASE!!
public class FrigoriferoScadenza {
    private TreeMap<String, Alimento> frigorifero;

    public FrigoriferoScadenza() {
        frigorifero = new TreeMap<>();
    }

    public void inserisciAlimento(String codiceBarre, String nome, LocalDate dataScadenza) {
        Alimento alimento = new Alimento(codiceBarre, nome, dataScadenza);
        frigorifero.put(codiceBarre, alimento);
        System.out.println("Alimento inserito correttamente.");
    }

    public void rimuoviAlimento(String codiceBarre) {
        Alimento alimento = frigorifero.remove(codiceBarre);
        if (alimento != null) {
            System.out.println("Alimento rimosso correttamente.");
        } else {
            System.out.println("L'alimento specificato non è presente nella cella frigorifera.");
        }
    }

    public void visualizzaAlimenti() {
        if (frigorifero.isEmpty()) {
            System.out.println("Nessun alimento presente nella cella frigorifera.");
        } else {
            System.out.println("Alimenti presenti nella cella frigorifera (ordinati per scadenza):");
            ArrayList<Alimento> alimenti = new ArrayList<>(frigorifero.values());
            Collections.sort(alimenti, Comparator.comparing(Alimento::getDataScadenza));
            for (Alimento alimento : alimenti) {
                System.out.println(alimento);
            }
        }
    }

    public void visualizzaProssimaScadenza() {
        if (frigorifero.isEmpty()) {
            System.out.println("Nessun alimento presente nella cella frigorifera.");
        } else {
            System.out.println("Alimenti più vicini alla scadenza:");
            Alimento prossimaScadenza = frigorifero.firstEntry().getValue();
            for (Alimento alimento : frigorifero.values()) {
                if (alimento.getGiorniRimanenti() < prossimaScadenza.getGiorniRimanenti()) {
                    prossimaScadenza = alimento;
                }
            }
            System.out.println(prossimaScadenza);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FrigoriferoScadenza frigo = new FrigoriferoScadenza();
        int scelta = 0;

        while (scelta != 5) {
            System.out.println("\nMenu di gestione della cella frigorifera:");
            System.out.println("1) Inserimento di un alimento");
            System.out.println("2) Rimozione di un alimento");
            System.out.println("3) Visualizzazione di tutti gli alimenti");
            System.out.println("4) Visualizzazione dell'alimento più vicino alla scadenza");
            System.out.println("5) Uscita");

            System.out.print("Seleziona una funzione (1-5): ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline residuo

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il codice a barre dell'alimento: ");
                    String codiceBarre = scanner.nextLine();
                    System.out.print("Inserisci il nome dell'alimento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci la data di scadenza dell'alimento (formato AAAA-MM-GG): ");
                    LocalDate dataScadenza = LocalDate.parse(scanner.nextLine());
                    frigo.inserisciAlimento(codiceBarre, nome, dataScadenza);
                    break;
                case 2:
                    System.out.print("Inserisci il codice a barre dell'alimento da rimuovere: ");
                    codiceBarre = scanner.nextLine();
                    frigo.rimuoviAlimento(codiceBarre);
                    break;
                case 3:
                    frigo.visualizzaAlimenti();
                    break;
                case 4:
                    frigo.visualizzaProssimaScadenza();
                    break;
                case 5:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        scanner.close();
    }
}//Fine classe col Main

/***********************************************************************************************/
class Alimento {
    private String codiceBarre;
    private String nome;
    private LocalDate dataScadenza;

    public Alimento(String codiceBarre, String nome, LocalDate dataScadenza) {
        this.codiceBarre = codiceBarre;
        this.nome = nome;
        this.dataScadenza = dataScadenza;
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public int getGiorniRimanenti() {
        LocalDate oggi = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(oggi, dataScadenza);
    }

    @Override
    public String toString() {
        return nome + " (Codice: " + codiceBarre + ", Giorni rimanenti: " + getGiorniRimanenti() + ")";
    }
}