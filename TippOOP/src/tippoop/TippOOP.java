
package tippoop;

import java.util.ArrayList;
import java.util.List;


public class TippOOP {

    
    public static void main(String[] args) {
        List<Eredmeny> e = new ArrayList<Eredmeny>();
        
        Eredmeny e1 = new Eredmeny("a001","Magyar-Angol","H",1.5);
        Eredmeny e2 = new Eredmeny("a002","Fradi-Ujpest","D",3.0);
        Eredmeny e3 = new Eredmeny("a003","Brazil-Argentin","V",2.0);
        Eredmeny e4 = new Eredmeny("a004","Barca-Real","H",2.0);
        Eredmeny e5 = new Eredmeny("a005","Chelsea-Arsenal","V",2.5);
        
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);
        
        Tipp t1 = new Tipp("a001","H");
        
        // t1.elso(e);
        Jatek.elso(e, t1);
    }
    
}
