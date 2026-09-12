package eserciziclassi;

public class Automobile {
    
    private String marca,modello;
    private int livelloCarburante;

    public Automobile(String marca, String modello, int livelloCarburante){
        this.marca = marca;
        this.modello = modello;
        this.livelloCarburante = livelloCarburante;
    }
    
    public void guida(){
        livelloCarburante--;
    }

    public int statoCarburante(){
        return livelloCarburante;
    }

    public void faiRifornimento(int livelloCarburante){
        this.livelloCarburante+=livelloCarburante;
    }
    
    public void visualizza(){
        System.out.println(marca+" "+modello+" "+livelloCarburante);
    }
    
    
    
    
}
