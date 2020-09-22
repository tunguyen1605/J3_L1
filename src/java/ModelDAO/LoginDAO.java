/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class LoginDAO {
   
    Connection conn; 
    ResultSet rs;
    public LoginDAO() throws SQLException {
      DBConnection db = new  DBConnection();
      this.conn = db.getConnect();
    }
    public boolean Login(String user , String Pass) throws SQLException{
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM `user` WHERE username = ? AND password = MD5(?)");
           pst.setString(1, user);
           pst.setString(2, Pass);
           rs = pst.executeQuery();
            
         if(rs.next()){            
         return  true;
        }
        return false;
    }
}
