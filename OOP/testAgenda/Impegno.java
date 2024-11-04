package testAgenda;

public class Impegno {

	private String descrizione;//incapsulamento

	public Impegno(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return descrizione;
	}

}
