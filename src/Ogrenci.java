
public class Ogrenci {


    private String okulNo;
    private String ad;
    private String soyad;
    private String email;
    private int id;

    public Ogrenci(int id,String okulNo, String ad, String soyad, String email) {
        this.id=id;
        this.okulNo = okulNo;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    
}
