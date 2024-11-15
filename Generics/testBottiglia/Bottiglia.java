package testBottiglia;

public class Bottiglia<T> {

	private T contenuto;
	
	public void riempi(T contenuto) {
		System.out.println("ho riempito la bottiglia di "+contenuto);
		this.contenuto=contenuto;
	}
	
	public void svuota() {
		System.out.println("ho svuotato la bottiglia");
		this.contenuto=null;
	}
	
	
	@Override
	public String toString() {
		if (contenuto==null) {
			return "la bottiglia è vuota";
		}else {
			return "la bottiglia contiene "+contenuto;
		}
		
	}
	
}
