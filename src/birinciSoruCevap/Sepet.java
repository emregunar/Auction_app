package birinciSoruCevap;
import java.util.ArrayList;

public class Sepet 
{
    private ArrayList<Urun> sepettekiUrunler;
    
    public Sepet() {
        sepettekiUrunler = new ArrayList<Urun>();
    }
       
    public double sepetToplami() {
        double tutar = 0.0;
        for(Urun urun : sepettekiUrunler) {
            tutar += urun.getUrunFiyat();
        }
        return tutar;
    }
    
    
    public void sepeteUrunEkle(Urun urun) {
        sepettekiUrunler.add(urun);
        System.out.println("Sepete ürün eklendi.");
    }
    
    public void sepettenUrunCikar(Urun urun)
    {
        try
        {
            sepettekiUrunler.remove(urun);
            System.out.println("Sepetten ürün çıkarıldı.");
        }
        catch(Exception e)
        {
            System.out.println("Ürün bulunamadı.");
        }
        
    }
    

}
