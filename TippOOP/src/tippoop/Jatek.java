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
    
    // 1es és 2as
    
    public static void tetNelkul(List<Eredmeny> eredmenyek, List<Tipp> tippek){
        
        int gyoztesTipp = 0;
        int vesztesTipp = 0;
        
        for(Eredmeny e: eredmenyek){
            for(Tipp t: tippek){
                if(e.getSorszam().equals(t.getSorszam())){
                    if(e.getKimenetel().equals(t.getKimenetel())){
                       gyoztesTipp ++; 
                    }
                    else{
                        vesztesTipp ++;
                    }
                }
            }
        }
        
        if((gyoztesTipp+vesztesTipp) != tippek.size()){
            System.out.println("Érvénytelen szelvény");
        }
        else if(vesztesTipp > 0){
            System.out.println("Vesztes szelvény");
        }
        else{
            System.out.println("Gyöztes szelvény");
        }
        
    }
    
    
    // 3es és 4es
}
