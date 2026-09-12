package eserciziclassi;

public class Rettangolo {
    
    private int base, altezza;

    //Costruttore
    public Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public int getAltezza(){
        return altezza;
    }

    public void setAltezza(int altezza){
        this.altezza = altezza;
    }

    public int getBase(){
        return base;
    }

    public void setBase(int base){
        this.base = base;
    }
    
    public void ridimensiona(int base, int altezza){
        this.base=base;
        this.altezza=altezza;
    }
    
    public int perimetro(){
        return (this.base+this.altezza)*2;
    }

    public int area(){
        return (this.base*this.altezza);
    }
    
    
    
}
