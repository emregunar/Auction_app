package birinciSoruCevap;

public class Satici extends Kullanici implements IUrunGoster,ISatisYapabilen
{
    private Veritabani veritabani=Veritabani.getInstance();
    
    public Satici(String firmaAd,String mail,String sifre,String firmaAdres)
    {
        super(firmaAd,mail,sifre,firmaAdres);
    }

    public Veritabani getVeritabani() {
        return veritabani;
    }

    public void setVeritabani(Veritabani veritabani) {
        this.veritabani = veritabani;
    }

    @Override
    public void goruntule(Urun urun) {
        System.out.println(urun.getUrunAd()+" - "+urun.getUrunFiyat()+", "+getKullaniciIsim()+" - "+getKullaniciAdres());
    }

    @Override
    public void kaydet(Urun urun) {
        veritabani.urunEkle(urun);
    }
   
    
}
