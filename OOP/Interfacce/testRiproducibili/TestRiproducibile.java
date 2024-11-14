package testRiproducibili;

public class TestRiproducibile {

	public static void main(String[] args) {

		Multimedia[] playlist= {
				new Canzone("Canzone1", 5, "Autore1"),
				new Canzone("Canzone2", 3, "Autore2"),
				new Film("Film1",60,1000),
				new Film("Film2",120,5000)
		};
		
		//Audio e video hanno in comune il fatto di poter essere riprodotti
		//e quindi li mettiamo in una interfaccia
		Riproducibile[] r= {new Audio(), new Video()};
		
		for (Riproducibile riproducibile : r) {
			//il metodo play riproduce un elemento multimediale(canzone o un film)
			riproducibile.play(playlist);
		}
		
	}

}
