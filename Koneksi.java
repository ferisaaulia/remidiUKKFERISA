import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author RPLB-35
 */
public class Koneksi {
    Connection koneksi=null;
    
    public static Connection KoneksiDb()
    {
        try{
            String url="jdbc:mysql://localhost/Remidi_UKK";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi=DriverManager.getConnection(url,user,pass);
            return koneksi;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
