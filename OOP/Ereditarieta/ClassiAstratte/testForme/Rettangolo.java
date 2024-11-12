package testForme;

public class Rettangolo extends FormaAstratta{

	protected double altezza;

	public Rettangolo(double lato, String tipo, double altezza) {
		super(lato, tipo);
		this.altezza = altezza;
	}

	@Override
	public double area() {
		return getLato()*altezza;
	}

	@Override
	public double perimetro() {
		return (getLato()+altezza)*2;
	}
	
	
}
