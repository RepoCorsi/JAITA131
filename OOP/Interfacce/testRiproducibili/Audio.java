package testRiproducibili;

public class Audio implements Riproducibile{

	@Override
	public void play(Multimedia[] multimedia) {
		
		for (Multimedia m : multimedia) {			
			if (m instanceof Canzone) {
				Canzone c=(Canzone)m;
				c.riproduci();
				System.out.println(c);
				System.out.println("---------------");
			}
		}
	}

	
}
