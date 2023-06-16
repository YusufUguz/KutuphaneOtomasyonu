
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KitapIade {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement pStatement = null;
    
    public KitapIade(){
        
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

    public ArrayList<Emanet> emanetleriGetir() {
        
        try {
            
            ArrayList <Emanet> cikti = new ArrayList();
            statement = con.createStatement();
            
            String sorgu = "Select * From emanet";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                String okulNo=rs.getString("okulNo");
                String emanetKitap = rs.getString("emanetKitap");
                String emanetTarihi = rs.getString("emanetTarihi");
                String sonteslimTarihi = rs.getString("sonTeslimTarihi");
                
                cikti.add(new Emanet(okulNo,emanetKitap,emanetTarihi,sonteslimTarihi));
                
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }

    ArrayList<Iade> iadeleriGetir() {
        
        try {
            ArrayList <Iade> cikti = new ArrayList();
            statement=con.createStatement();
            
            String sorgu = "Select * from iade";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                String okulNo=rs.getString("okulNo");
                String emanetKitap = rs.getString("emanetKitap");
                String emanetTarihi = rs.getString("emanetTarihi");
                String teslimTarihi = rs.getString("TeslimTarihi");
                
                cikti.add(new Iade(okulNo,emanetKitap,emanetTarihi,teslimTarihi));

            }
            
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
             
        
        
    }

    public void iadeKaydet(String okulNo, String iadeKitap, String emanetTarihi, String teslimTarihi) {
        try {
            String sorgu = "Insert into iade (okulNo,emanetKitap,emanetTarihi,teslimTarihi) VALUES (?,?,?,?)";
            pStatement=con.prepareStatement(sorgu);
            pStatement.setString(1,okulNo);
            pStatement.setString(2,iadeKitap);
            pStatement.setString(3,emanetTarihi);
            pStatement.setString(4,teslimTarihi);
            pStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void iadeSil(String okulNo) {
        
        try {
            String sorgu = "Delete from iade where okulNo=?";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,okulNo);
            pStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapEmanet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    void emanetSil(String okulNo) {
        
        try {
            String sorgu = "Delete from emanet where okulNo=?";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,okulNo);
            pStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapEmanet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
