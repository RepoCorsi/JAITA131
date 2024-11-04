package testAgenda;

import java.util.ArrayList;

public class Pagina {

	String giorno;
	private ArrayList<Impegno> impegni=new ArrayList<>(); //un elenco di impegni
	
	public Pagina(String giorno, ArrayList<Impegno> impegni) {
		this.giorno = giorno;
		this.impegni = impegni;
	}

	@Override
	public String toString() {
		return "Pagina del giorno "+giorno+":\n impegni: "+impegni+"\n";
	}
}
