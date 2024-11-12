package testPredaPredatore;

public class Pesce implements Preda, Predatore,i{

	@Override
	public void caccia() {
		System.out.println("Il pesce caccia i pesci più piccoli");
	}

	@Override
	public void scappa() {
		System.out.println("Il pesce scappa dai pesci più grandi");
	}

	
}
