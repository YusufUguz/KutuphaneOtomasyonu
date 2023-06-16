
public class Emanet {
    
    private String okulNo;
    private String emanetKitap;
    private String emanetTarihi;
    private String sonTeslimTarihi;

    public Emanet(String okulNo, String emanetKitap, String emanetTarihi, String sonTeslimTarihi) {
        this.okulNo = okulNo;
        this.emanetKitap = emanetKitap;
        this.emanetTarihi = emanetTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
    }
    
    

    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }

    public String getEmanetKitap() {
        return emanetKitap;
    }

    public void setEmanetKitap(String emanetKitap) {
        this.emanetKitap = emanetKitap;
    }

    public String getEmanetTarihi() {
        return emanetTarihi;
    }

    public void setEmanetTarihi(String emanetTarihi) {
        this.emanetTarihi = emanetTarihi;
    }

    public String getSonTeslimTarihi() {
        return sonTeslimTarihi;
    }

    public void setSonTeslimTarihi(String sonTeslimTarihi) {
        this.sonTeslimTarihi = sonTeslimTarihi;
    }
    
    
    
}
