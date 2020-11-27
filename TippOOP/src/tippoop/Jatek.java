package tippoop;

import java.util.List;

public class Jatek {
    // Első feladat
    public static void elso(List<Eredmeny> eredmenyek, Tipp t){
        
        int szamlalo =0;
        for(Eredmeny e: eredmenyek){
            if(e.getSorszam().equals(t.getSorszam())){
                if(e.getKimenetel().equals(t.getKimenetel())){
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
