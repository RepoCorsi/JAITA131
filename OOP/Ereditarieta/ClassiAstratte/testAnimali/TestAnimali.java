package testAnimali;

public class TestAnimali {

	public static void main(String[] args) {

		Animale a[]= {new Cane("boby", 10), new Gatto("milu", 5),new Topo("miky", 7)};
		
		for (Animale animale : a) {
			System.out.println(animale);
			//polimorfismo
			animale.parla();
			animale.mangia();
		}
		
		
	}

}
