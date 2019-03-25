
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Younes
 */
public class DBConnector {
    
    private static final String URL = "jdbc:mysql://127.0.0.1.:3306/localhost";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private static Connection singleton;
    
    public static void setConnection(Connection con){
        singleton = con;
    
    }
    
    public static Connection connection() throws ClassNotFoundException, SQLException{
        if(singleton == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        
        }
            return singleton;
    }
    
    
}
