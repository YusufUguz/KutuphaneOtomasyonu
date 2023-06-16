
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KitapEmanet {

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement pStatement = null;
    
    public KitapEmanet(){
        
        String url = "jdbc:mysql://" +Database.host +":"+Database.port+"/"+Database.db_ismi;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
  
        }catch(ClassNotFoundException ex){
            
            System.out.println("Driver bulunamadı");        
        }
        
        try{
            
            con = DriverManager.getConnection(url,Database.kullaniciAdi,Database.parola);
            System.out.println("Bağlantı Başarılı");
   
        }catch(SQLException ex){
            System.out.println("Bağlantı Başarısız");
            
        }
        
    }
    
    public ArrayList<Kitap> kitaplariGetir() {
      
        try{
              
             ArrayList <Kitap> cikti = new ArrayList();
             statement = con.createStatement();
             
             String sorgu = "Select * From kitapdb";
             ResultSet rs = statement.executeQuery(sorgu);
             
             while(rs.next()){
                 
                 int id=rs.getInt("id");
                 String kitapAdi=rs.getString("KitapAdi");
                 String kitapYazari = rs.getString("KitabinYazari");
                 String kitapSayfasi =rs.getString("KitabinSayfasi");
                 String kitapTuru = rs.getString("KitabinTuru");
                 
                 cikti.add(new Kitap(id,kitapAdi,kitapYazari,kitapTuru,kitapSayfasi));

             }
             return cikti;
   
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
 
        }
        
    }

    public void emanetVer(String okulNo, String emanetKitap, String emanetTarihi, String sonTeslimTarihi) {
        
        try {
            String sorgu = "Insert into emanet (okulNo,emanetKitap,emanetTarihi,sonTeslimTarihi) VALUES (?,?,?,?)";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,okulNo);
            pStatement.setString(2,emanetKitap);
            pStatement.setString(3,emanetTarihi);
            pStatement.setString(4,sonTeslimTarihi);
            pStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapEmanet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void emanetSil(String okulNo) {
        
        try {
            String sorgu = "Delete from emanet where okulNo=?";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,okulNo);
            pStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapEmanet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public ArrayList<Emanet> emanetleriGetir() {
        
        try{
              
             ArrayList <Emanet> cikti = new ArrayList();
             statement = con.createStatement();
             
             String sorgu = "Select * From emanet";
             ResultSet rs = statement.executeQuery(sorgu);
             
             while(rs.next()){
                 
                 
                 String okulNo=rs.getString("okulNo");
                 String emanetKitap = rs.getString("emanetKitap");
                 String emanetTarihi =rs.getString("emanetTarihi");
                 String sonTeslimTarihi = rs.getString("sonTeslimTarihi");
                 
                 cikti.add(new Emanet(okulNo,emanetKitap,emanetTarihi,sonTeslimTarihi));

             }
             return cikti;
   
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
 
        }
        
    }

}
