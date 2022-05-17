package birinciSoruCevap;

public class Kullanici 
{
    private String Kullanici_isim;
    private String Kullanici_mail;
    private String Kullanici_sifre;
    private String Kullanici_adres;
    
    public Kullanici(String Kullanici_isim,String Kullanici_mail,String Kullanici_sifre,String Kullanici_adres)
    {
        this.Kullanici_isim=Kullanici_isim;
        this.Kullanici_mail=Kullanici_mail;
        this.Kullanici_sifre=Kullanici_sifre;
        this.Kullanici_adres=Kullanici_adres;
    }
    
    public String getKullaniciAdres() {
        return Kullanici_adres;
    }

    public void setKullaniciAdres(String Kullanici_adres) {
        this.Kullanici_adres = Kullanici_adres;
    }

    public String getKullaniciIsim() {
        return Kullanici_isim;
    }

    public void setKullaniciIsim(String Kullanici_isim) {
        this.Kullanici_isim = Kullanici_isim;
    }
    
    public String getKullaniciMail() {
        return Kullanici_mail;
    }

    public void setKullaniciMail(String Kullanici_mail) {
        this.Kullanici_mail = Kullanici_mail;
    }

    public String getKullaniciSifre() {
        return Kullanici_sifre;
    }

    public void setKullaniciSifre(String Kullanici_sifre) {
        this.Kullanici_sifre = Kullanici_sifre;
    }
}
