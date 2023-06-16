
public class Iade {
    
    private String okulNo;
    private String emanetKitap;
    private String emanetTarihi;
    private String TeslimTarihi;

    public Iade(String okulNo, String emanetKitap, String emanetTarihi, String TeslimTarihi) {
        this.okulNo = okulNo;
        this.emanetKitap = emanetKitap;
        this.emanetTarihi = emanetTarihi;
        this.TeslimTarihi = TeslimTarihi;
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

    public String getTeslimTarihi() {
        return TeslimTarihi;
    }

    public void setTeslimTarihi(String TeslimTarihi) {
        this.TeslimTarihi = TeslimTarihi;
    }
    
    
    
}
