package altre_Classi;

public class Studente {
    
    public int voto1; 
    public int voto2; 
    public int voto3;

    public String nome;

    // calcolo la media dei voti:

    public double mediaVoti() {
	return (double)(voto1 + voto2 + voto3)/3;
    }

}
