package testfilm;

public class TestFilm {

    public static void main(String[] args){

        Film f= new Film("il silenzio degli innocenti", "thriller", 1991, 118, "Jonathan Demme", true);
                
        String[] attori={"jodie Foster","Anthony Hopkins","Scott Glenn"};
        f.setAttori(attori);
        
        System.out.println(f);

        System.out.println(f.isVm());
        
        ////Secondo film
        Film f2= new Film("Philadelfia", "Drammatico", 1993, 125, "Jonathan Demme", true);
        
        String[] attori2={"Tom Hanks","Denzel Washington","Jason Robards"};
        f2.setAttori(attori2);
        
        System.out.println(f2);
        
        System.out.println(f.equals(f2));
        
        
    }
    

}
