package testUsabile;

//per le interfacce si usa implements e non Extends
public class Computer implements Usabile{

	@Override
	public void usa() {
		System.out.println("il pc si usa con la tastiera");
	}	
}
