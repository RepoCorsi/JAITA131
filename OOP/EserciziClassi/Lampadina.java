package eserciziclassi;

public class Lampadina {
    
    private Boolean acceso;
    private int nAccensioni=0;
    
    //Costruttore
    public Lampadina(Boolean acceso){
        this.acceso = acceso;
    }
            
    public boolean isRotta(){//dopo quanti click si rompe
        return nAccensioni>=3;
    }
    
    public String stato(){
    
        if (isRotta()){
            return "lampadina rotta!";
        }
        return acceso?"Accesa":"spenta";
    }
    

    public void click(){
        this.acceso = !acceso;
        nAccensioni++;    
        System.out.println(stato());
    }
    
    
}
