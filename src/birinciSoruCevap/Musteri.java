package birinciSoruCevap;

public class Musteri extends Kullanici implements IUrunGoster,IOdemeYapabilen
{
    private Veritabani veritabani=Veritabani.getInstance();
    private Sepet sepet;
    
    public Musteri(String isim,String mail,String sifre,String adres)
    {
        super(isim,mail,sifre,adres);
        sepet=new Sepet();
    }

    @Override
    public void goruntule(Urun urun) {
        System.out.println(urun.getUrunAd()+" - "+urun.getUrunFiyat());
    }
    
    public void urunEkle(Urun urun)
    {
        sepet.sepeteUrunEkle(urun);
    }
    
    public void urunCikar(Urun urun)
    {
        sepet.sepettenUrunCikar(urun);
    }
    
    public Veritabani getVeritabani() {
        return veritabani;
    }

    public void setVeritabani(Veritabani veritabani) {
        this.veritabani = veritabani;
    }

    @Override
    public void odemeYap() {
        Odeme odeme=new Odeme(getKullaniciIsim(), sepet.sepetToplami());
        odeme.odemeYap();
        veritabani.odemeYap(odeme);
    }
}
