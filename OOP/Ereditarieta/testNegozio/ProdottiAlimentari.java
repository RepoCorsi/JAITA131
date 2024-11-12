package testNegozio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdottiAlimentari extends Prodotto{

	private LocalDate dataScadenza;

	public ProdottiAlimentari(LocalDate dataScadenza,String descrizione, double prezzo, Cliente c) {
		super(descrizione, prezzo, c);
		this.dataScadenza = dataScadenza;
	}
	
	/**
	 * Applica lo sconto se il prodotto è vicino alla scadenza(10 gg)
	 */
	@Override
	public void applicaSconto() {
		//calcola la differenza tra 2 date
		long giorniTra2Date=ChronoUnit.DAYS.between(LocalDate.now(), dataScadenza);
		
		if (giorniTra2Date<10) {//Sconto se vicino alla scadenza
			prezzo-=prezzo*0.2;//20%
		}
		super.applicaSconto();// sconto per età>60(Dalla classe prodotto)		
	}
	
	@Override
	public String toString() {
		return super.toString()+" data Scadenza: "+dataScadenza;
	}
	
	
}
