package birinciSoruCevap;

public class Urun
{
    private String urunAd;
    private double urunFiyat;

    Satici satici;
    
    public Urun(Satici satici,String urunAd,double urunFiyat)
    {
        this.urunAd=urunAd;
        this.urunFiyat=urunFiyat;
        this.satici=satici;
    }
    
    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public double getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(double urunFiyat) {
        this.urunFiyat = urunFiyat;
    }
}
