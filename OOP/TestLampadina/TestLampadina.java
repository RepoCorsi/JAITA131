package testLampadina;

public class TestLampadina {

	public static void main(String[] args) {

		Lampadina l= new Lampadina(true);
		for (int i = 0; i < 10; i++) {
			l.click();
		}
		
	}

}
