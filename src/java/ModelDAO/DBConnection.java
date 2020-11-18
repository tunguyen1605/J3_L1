package ModelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thaycacac
 */
public class DBConnection {

       /**
     *
     */
   /**
     *
     */
    public com.mysql.jdbc.Connection conn; //stores connection

    /**
     * Creates new connection to Database server
     */
    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //use com.mysql.jdbc.Driver to connect to MySQL Server
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/long1", "root", ""); //Connects to MySQL Server base on URL, UID, PWD
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Gets current connection
     * @return
     */
    public com.mysql.jdbc.Connection getConnect() {
        return conn;
    }
    public void close(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
