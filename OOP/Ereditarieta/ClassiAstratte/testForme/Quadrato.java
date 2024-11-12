package testForme;

public class Quadrato extends Rettangolo{

	public Quadrato(double lato, String tipo) {
		super(lato, tipo, lato);		
	}

	@Override
	public double area() {
		return getLato()*getLato();
	}
	
	@Override
	public double perimetro() {
		return (getLato()*getLato())*2;
	}
}
