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
    public boolean search(String user) throws SQLException{
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM `user` WHERE uUsername = ?");
           pst.setString(1, user);
//           pst.setString(2, Pass);
           rs = pst.executeQuery();
            
         if(rs.next()){            
         return  true;
        }
        return false;
    }
    public User signIn(String username, String password) {

        User userSinIn = new User();
        try {
            if (search(username)) {
//                con = db.getConnect();
                String sql = "SELECT * FROM `user` WHERE uUsername = ? AND uPassword = MD5(?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {                      
                userSinIn = new User(rs.getString("uUsername"),rs.getString("uPassword"),rs.getString("uEmail"), rs.getInt("uType"));
                }
                
                System.out.println(userSinIn);
                return userSinIn;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
