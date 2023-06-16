
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OgrenciIslemleri {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement pStatement = null;
    
    public OgrenciIslemleri(){
        
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
    
    public void ogrKaydet(String ogrNo, String ogrAd, String ogrSoyad, String ogrEmail) {
        
        try {
            String sorgu = "Insert into ogrencidb (okulNo,ad,soyad,email) VALUES (?,?,?,?)";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,ogrNo);
            pStatement.setString(2,ogrAd);
            pStatement.setString(3,ogrSoyad);
            pStatement.setString(4,ogrEmail);
            pStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void ogrSil(int id) {
        
        try {
            String sorgu = "Delete from ogrencidb where id=?";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setInt(1,id);
            pStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    public void ogrGuncelle(int id,String no, String ogrNo, String ogrAd, String ogrSoyad, String ogrEmail) {
    
        try {
            String sorgu = "Update ogrencidb set okulNo=?,ad=?,soyad=?,email=? where id=? ";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,ogrNo);
            pStatement.setString(2,ogrAd);
            pStatement.setString(3,ogrSoyad);
            pStatement.setString(4,ogrEmail);
            pStatement.setInt(5,id);
            
            pStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    
    }
    
    public static void main(String[] args){
        OgrenciIslemleri islemler = new OgrenciIslemleri();
    }

    public ArrayList<Ogrenci> ogrenciGetir() {
        
        try{
            
            ArrayList<Ogrenci> cikti = new ArrayList();
            statement = con.createStatement();
            
            String sorgu = "Select * From ogrencidb";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id = rs.getInt("ID");
                String ogrOkulNo = rs.getString("OkulNo");
                String ogrAd = rs.getString("ad");
                String ogrSoyad = rs.getString("soyad");
                String ogrEmail = rs.getString("email");
                
                cikti.add(new Ogrenci(id,ogrOkulNo,ogrAd,ogrSoyad,ogrEmail));
   
            }

            return cikti;
            
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }

    }

    

    

    
}
