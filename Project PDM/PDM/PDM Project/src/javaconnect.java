
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb(){
        try{
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	String dbURL = "jdbc:sqlserver://localhost:1434;databaseName=PROJECT;user=sa;password=sa";
        	Connection conn = DriverManager.getConnection(dbURL);
            return conn;
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
}
