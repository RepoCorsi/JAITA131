package testGenerics;

public class ClasseGenerica <Tipo, AltroTipo>{

	Tipo x;
	AltroTipo y;
	
	public ClasseGenerica(Tipo x, AltroTipo y) {
		this.x = x;
		this.y = y;
	}

	public Tipo getX() {
		return x;
	}

	public void setX(Tipo x) {
		this.x = x;
	}

	public AltroTipo getY() {
		return y;
	}

	public void setY(AltroTipo y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	
	
}
