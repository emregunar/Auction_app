package birinciSoruCevap;

public class girisYonlendir 
{
    Veritabani veritabani=Veritabani.getInstance();
    
    public boolean girisKontrol(String mail,String sifre)
    {
       return veritabani.girisKontrolu(mail,sifre);
    }
}
