package testAnimali;

public class Topo extends Animale{

		public Topo(String nome, int eta) {
			super(nome, eta);
		}

		@Override
		public void parla() {
			System.out.println("squit squit");
		}

		@Override
		public void mangia() {
			System.out.println("mangio il formaggio");
		}
	
		
}
