package package2;

public class Classe2 {

	private String a;
	private String b;
	
	String c;
	
	public String d;
	
	public Classe2(String a, String b) {
		this.a = a;
		this.b = b;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Classe2 [a=" + a + ", b=" + b + "]";
	}
	
	
	
}
