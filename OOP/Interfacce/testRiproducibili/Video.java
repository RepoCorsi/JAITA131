package testRiproducibili;

public class Video implements Riproducibile{

	@Override
	public void play(Multimedia[] multimedia) {
		for (Multimedia m : multimedia) {
			if (m instanceof Film) {
				Film f= (Film)m;
				f.riproduci();
				System.out.println(f);
				System.out.println("------------------");
			}
			
		}
	}

}
