package tippoop;

public class Eredmeny {
    private String sorszam;
    private String meccsnev;
    private String kimenetel;
    private Double odds;

    public Eredmeny(String sorszam, String meccsnev, String kimenetel, Double odds) {
        this.sorszam = sorszam;
        this.meccsnev = meccsnev;
        this.kimenetel = kimenetel;
        this.odds = odds;
    }

    public String getSorszam() {
        return sorszam;
    }

    public String getMeccsnev() {
        return meccsnev;
    }

    public String getKimenetel() {
        return kimenetel;
    }

    public Double getOdds() {
        return odds;
    }
    
    
}
