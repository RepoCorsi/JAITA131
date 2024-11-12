package testForme;

public class Triangolo extends FormaAstratta{

	public Triangolo(double lato, String tipo) {
		super(lato, tipo);
		
	}

	@Override
	public double area() {
		return (getLato()*getLato())/2;
	}

	@Override
	public double perimetro() {//triangolo equilatero
		return getLato()*3;
	}

	
}
