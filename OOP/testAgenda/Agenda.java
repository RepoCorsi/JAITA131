package testAgenda;

import java.util.Arrays;

public class Agenda {

	//definisco l'array di pagine. E' un array perchè i giorni sono fissi 7
	private Pagina[] pagine;
	
	public Agenda() {
		this.pagine=new Pagina[7];// indico che l'array ha 7 elementi
	}

	public Pagina[] getPagina() {
		return pagine;
	}

	public void setPagina(Pagina[] pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		return Arrays.toString(pagine);
	}
}
