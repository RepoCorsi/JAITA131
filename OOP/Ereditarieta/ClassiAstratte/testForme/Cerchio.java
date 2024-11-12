package testForme;

public class Cerchio extends FormaAstratta {

	final double piGreco = Math.PI;

	public Cerchio(double lato, String tipo) {
		super(lato, tipo);		
	}

	@Override
	public double area() {
		return getLato()*getLato()*piGreco;
	}

	@Override
	public double perimetro() {
		return 2*piGreco*getLato();//il lato per noi è il raggio
	}
	
	
}
