package tippoop;

import java.util.List;


public class Tipp {
    private String sorszam;
    private String kimenetel;

    public Tipp(String sorszam, String kimenetel) {
        this.sorszam = sorszam;
        this.kimenetel = kimenetel;
    }

    public String getSorszam() {
        return sorszam;
    }

    public String getKimenetel() {
        return kimenetel;
    }
    
    // Első feladat
    public void elso(List<Eredmeny> eredmenyek){
        
        int szamlalo =0;
        for(Eredmeny e: eredmenyek){
            if(e.getSorszam().equals(this.sorszam)){
                if(e.getKimenetel().equals(this.kimenetel)){
                    System.out.println("Nyertes tipp");
                }
                else{
                    System.out.println("Vesztes tipp");
                }
            }
            else{
                szamlalo++;
            }
        }
        if(szamlalo == eredmenyek.size()){
            System.out.println("A tipp érvénytelen");
        }
    
    }
}
