
public class Kitap {
    private String kitapAdi;
    private String kitabinYazari;
    private String kitabinTuru;
    private String kitabinSayfasi;
    private int id;
    

    public Kitap(int id,String kitapAdi, String kitabinYazari, String kitabinTuru,String kitabinSayfasi ) {
        this.id=id;
        this.kitapAdi = kitapAdi;
        this.kitabinYazari = kitabinYazari;
        this.kitabinSayfasi = kitabinSayfasi;
        this.kitabinTuru = kitabinTuru;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }


    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitabinYazari() {
        return kitabinYazari;
    }

    public void setKitabinYazari(String kitabinYazari) {
        this.kitabinYazari = kitabinYazari;
    }

    public String getKitabinSayfasi() {
        return kitabinSayfasi;
    }

    public void setKitabinSayfasi(String kitabinSayfasi) {
        this.kitabinSayfasi = kitabinSayfasi;
    }

    public String getKitabinTuru() {
        return kitabinTuru;
    }

    public void setKitabinTuru(String kitabinTuru) {
        this.kitabinTuru = kitabinTuru;
    }
    
    
    
    
    
}
