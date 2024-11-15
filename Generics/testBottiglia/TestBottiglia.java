package testBottiglia;

public class TestBottiglia {

	public static void main(String[] args) {

        // Creiamo una bottiglia per l'acqua
        Bottiglia<Acqua> bottigliaAcqua = new Bottiglia<>();
        
        //Riempiamo di acqua
        bottigliaAcqua.riempi(new Acqua()); 
        System.out.println(bottigliaAcqua);

        // Svuotiamo la bottiglia d'acqua
        bottigliaAcqua.svuota();
        System.out.println(bottigliaAcqua);  // la bottiglia è vuota

        // Creiamo una bottiglia per il vino
        Bottiglia<Vino> bottigliaVino = new Bottiglia<>();
        
        //riempiamola di vino
        bottigliaVino.riempi(new Vino());
        System.out.println(bottigliaVino);

        // Svuotiamo la bottiglia di vino
        bottigliaVino.svuota();
        System.out.println(bottigliaVino);  // la bottiglia è vuota
        
        //Creiamo una bottiglia che contiene tutto
        Bottiglia misto = new Bottiglia<>();
        
        //riempo d'acqua
        misto.riempi(new Acqua());
        System.out.println(misto);
        
        //riempo di vino
        misto.riempi(new Vino());
        System.out.println(misto);
        
        //svuotiamo la bottiglia
        misto.svuota();
        System.out.println(misto);
		
		
	}

}
