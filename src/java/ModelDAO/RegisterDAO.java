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
public class RegisterDAO {
     Connection conn; 
    ResultSet rs;
    public RegisterDAO() throws SQLException {
      DBConnection db = new  DBConnection();
      this.conn = db.getConnect();
    }
    public void addUser(String username, String password, int type, String email) throws SQLException {
                String sql = "INSERT INTO `user` (`uUsername`, `uPassword`, `uEmail`, `uType`) VALUES (?, MD5(?), ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {                      
              //  userSinIn = new User(rs.getString("uUsername"),rs.getString("uPassword"),rs.getString("uEmail"), rs.getInt("uType"));
                }
    }
}
