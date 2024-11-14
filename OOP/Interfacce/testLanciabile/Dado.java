package testLanciabile;

public class Dado implements Lanciabile{

	@Override
	public String lancia() {
		return Integer.toString(r.nextInt(1,7));//castiamo il numero a stringa
	}

}
