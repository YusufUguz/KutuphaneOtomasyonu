
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KitapIslemleri {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement pStatement = null;
    
    public KitapIslemleri(){
        
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
    
    public void kitapKaydet(String kitapAdi,String kitapYazari,String kitapSayfasi,String kitapTuru){
        
        try{
            
            String sorgu = "Insert into kitapdb (KitapAdi,KitabinYazari,KitabinSayfasi,KitabinTuru) VALUES (?,?,?,?)";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,kitapAdi);
            pStatement.setString(2,kitapYazari);
            pStatement.setString(3,kitapSayfasi);
            pStatement.setString(4,kitapTuru);
            pStatement.executeUpdate();
            
            
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
    }
    public void kitapSil(int id) {
      
        try {
            String sorgu = "Delete From kitapdb where id=?";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setInt(1,id);
            pStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    void kitapGuncelle(int id,String yeniKitapAdi, String yeniKitapYazari, String yeniKitapSayfasi, String yeniKitapTuru) {
        
        try {
            String sorgu = "Update kitapdb set KitapAdi=?,KitabinYazari=?,KitabinTuru=?,KitabinSayfasi=? where id=?";
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,yeniKitapAdi);
            pStatement.setString(2,yeniKitapYazari);
            pStatement.setString(3,yeniKitapTuru);
            pStatement.setString(4,yeniKitapSayfasi);
            pStatement.setInt(5,id);

            pStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
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
   public static void main(String[] args){
       
       KitapIslemleri islemler = new KitapIslemleri();
       
   }


}
   