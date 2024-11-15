package testGenerics;

public class Esempio {
	
	int x;
	String y;
	
	public Esempio(int x, String y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Esempio [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
