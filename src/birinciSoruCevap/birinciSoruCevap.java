package birinciSoruCevap;

public class birinciSoruCevap {

    public static void main(String[] args) 
    {
        Veritabani veritabani = Veritabani.getInstance(); 
        girisYonlendir giris = new girisYonlendir();
                
        Satici satici = new Satici("Aras", "sefaaras@ktu.edu.tr", "123456", "Firma Adres"); 
        Musteri musteri = new Musteri("Hakan Bozkurt", "hakanbozkurt@ktu.edu.tr", "654321", "Ev Adres"); 
        
        veritabani.kullaniciKaydet(satici); 
        veritabani.kullaniciKaydet(musteri); 
        
        Urun bilgisayar = new Urun(satici, "Bilgisayar", 7500.0); 
        Urun telefon = new Urun(satici, "Telefon", 5000.0); 
        Urun tablet = new Urun(satici, "Tablet", 2500.0); 
        
        satici.kaydet(bilgisayar); 
        satici.kaydet(telefon); 
        satici.kaydet(tablet); 
        
        satici.goruntule(bilgisayar); 
        musteri.goruntule(telefon); 
       
        if(giris.girisKontrol("sefa@ktu.edu.tr", "123456")) 
        { 
            System.out.println("Giriş Başarılı."); 
        } else { 
            System.out.println("Giriş Başarısız."); 
        } 
        if(giris.girisKontrol("sefaaras@ktu.edu.tr", "123456")) 
        { 
            System.out.println("Giriş Başarılı."); 
        } else { 
            System.out.println("Giriş Başarısız."); 
        }
        
        musteri.urunEkle(tablet);
        musteri.urunEkle(bilgisayar); 
        musteri.urunCikar(tablet); 
        musteri.urunEkle(telefon); 
        musteri.odemeYap();
    }
    
}
