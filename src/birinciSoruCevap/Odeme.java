package birinciSoruCevap;

public class Odeme 
{
    String odemeYapanMusteri;
    double sepetTutari;
    
    public Odeme(String odemeYapanMusteri,double tutar)
    {
        this.odemeYapanMusteri=odemeYapanMusteri;
        this.sepetTutari=tutar;
    }
     
    public void odemeYap()
    {
        System.out.println(this.odemeYapanMusteri+" "+this.sepetTutari+" tutarında ödeme yaptı.");
    }
    
    public double getTutar() {
        return sepetTutari;
    }

    public void setsepetTutari(double sepetTutari) {
        this.sepetTutari = sepetTutari;
    }
    
    public String getOdemeYapanMusteri() {
        return odemeYapanMusteri;
    }

    public void setOdemeYapanMusteri(String odemeYapanMusteri) {
        this.odemeYapanMusteri = odemeYapanMusteri;
    }


}
