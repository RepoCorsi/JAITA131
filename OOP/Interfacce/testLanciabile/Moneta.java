package testLanciabile;

public class Moneta implements Lanciabile{

	@Override
	public String lancia() {
		return r.nextInt(2)==0?"testa":"croce";// 0 testa 1 croce
	}

}
