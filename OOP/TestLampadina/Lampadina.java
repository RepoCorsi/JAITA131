package testLampadina;

public class Lampadina {

	private boolean stato;
	private int nAccensioni=0;
	
	//costruttore
	public Lampadina(boolean stato) {
		this.stato=stato;
	}
	
	public boolean isRotta() {
		return nAccensioni>=6;
	}
	
	public String stato() {
		if (isRotta()) {
			return "Lampadina rotta!";
		}else {
			return stato?"Lampadina accesa":"Lampadina spenta";
		}
	}
	
	public void click() {
		this.stato=!stato;
		nAccensioni++;
		System.out.println(stato());
	}
	
}
