package birinciSoruCevap;

import java.util.ArrayList;

public class Veritabani 
{
    static Veritabani veritabani;
    
    private ArrayList<Kullanici> kullanicilar;
    private ArrayList<Urun> urunler;
    private ArrayList<Odeme> odemeKayit; 
    
    
    static Veritabani getInstance() {
        if (veritabani == null) {
            veritabani = new Veritabani();
            return veritabani;
        } else {
            return veritabani;
        }
    }
    


    public Veritabani() {
        kullanicilar = new ArrayList<Kullanici>();
        urunler = new ArrayList<Urun>();
        odemeKayit=new ArrayList<Odeme>();
    }



    public void kullaniciKaydet(Kullanici kullanici) {
       kullanicilar.add(kullanici);
       System.out.println(kullanici.getKullaniciIsim()+" sisteme kayıt edilmiştir.");
    }

    public void urunEkle(Urun urun) {
        urunler.add(urun);
        System.out.println(urun.getUrunAd()+" sisteme kayıt edilmiştir.");
    }
    
    public void odemeYap(Odeme odeme) {
        odemeKayit.add(odeme);
        System.out.println(odeme.odemeYapanMusteri+" "+odeme.sepetTutari+" ödemesi sisteme kayıt edilmiştir.");
    }
      
    public boolean girisKontrolu(String mail, String sifre) {

        for(Kullanici kullanici : kullanicilar) {
            if(kullanici.getKullaniciMail().equals(mail) && kullanici.getKullaniciSifre().equals(sifre)) 
        return true;
        }
        return false;
    }
    
}
