package testForme;

public abstract class FormaAstratta {

	private double lato;
	private String tipo;
	
	public FormaAstratta(double lato, String tipo) {
		this.lato = lato;
		this.tipo = tipo;
	}
	
	public abstract double area();
	public abstract double perimetro();

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "FormaAstratta [lato=" + lato + ", tipo=" + tipo + "]";
	}
	
	
}
