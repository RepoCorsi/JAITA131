package testfilm;

public class Film {
    
    private String titolo;
    private String genere;
    private int anno;
    private double durata;
    private String regista;
    private String[] attori=new String[3];
    private boolean vm;//vietato ai minori

    public Film(String titolo, String genere, int anno, double durata, String autore,boolean vm){
        this.titolo = titolo;
        this.genere = genere;
        this.anno = anno;
        this.durata = durata;
        this.regista = autore;
        this.vm=vm;
    }

    public boolean isVm(){
        return vm;
    }

    public void setVm(boolean vm){
        this.vm = vm;
    }    
    
    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public String getGenere(){
        return genere;
    }

    public void setGenere(String genere){
        this.genere = genere;
    }

    public int getAnno(){
        return anno;
    }

    public void setAnno(int anno){
        this.anno = anno;
    }

    public double getDurata(){
        return durata;
    }

    public void setDurata(double durata){
        this.durata = durata;
    }

    public String getRegista(){
        return regista;
    }

    public void setRegista(String regista){
        this.regista = regista;
    }

    public String[] getAttori(){
        return attori;
    }

    public void setAttori(String[] attori){
        this.attori = attori;
    }

    @Override
    public String toString(){
        
        String attore="";
        for (String a : attori){
            attore+=a+" ";
        }
        
        return "Film{" + "titolo=" + titolo + ", genere=" + genere + 
                ", anno=" + anno + ", durata=" + durata + ", autore=" + regista +"\n Attori: "+attore+ '}';
    }
    
    
    @Override
    public boolean equals(Object obj){
        
        if (obj instanceof Film film){
            return this.regista.equals(film.regista );
        }
        return false;
        
        
    }


    

    
    

    
}
