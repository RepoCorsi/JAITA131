package testprodotti;

import esempioclasse.Persona;//importiamo il progetto 1_inizioClassi per prendere la classe persona

//Una classe pùò estendere solo un'altra classe
public class Cliente extends Persona{

//numero progressivo dello static
static int numeroTessera=0; //ce n'è uno per tutta la classe. Appartiene alla classe  
	//attributo di cliente. ogni cliente che creo avrà il suo tesseraCliente
    int tesseraCliente=0; //numero assegnato al singolo cliente
    public Cliente(String nome, String cognome, int eta){
        super(nome, cognome, eta);
        numeroTessera++; //incremento lo static
        tesseraCliente=numeroTessera;//assegnamo all'attributo tessera cliente
    }

    @Override
    public String toString(){
        return "Cliente{" +super.toString()+" numeroTessera=" + tesseraCliente + '}';
    }




}
