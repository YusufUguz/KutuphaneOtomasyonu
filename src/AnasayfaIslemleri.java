
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class AnasayfaIslemleri {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement pStatement = null;
    
    public AnasayfaIslemleri(){
        
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
    
  public boolean girisYap(String kullaniciAdi,String parola){
        
        try {
            String sorgu = "Select * From yoneticidb where username =? and password =?";
            
            pStatement = con.prepareStatement(sorgu);
            pStatement.setString(1,kullaniciAdi);
            pStatement.setString(2,parola);
            
            ResultSet rs = pStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            
            return false;
        }
        
  
    }
    
    
    
    
}
