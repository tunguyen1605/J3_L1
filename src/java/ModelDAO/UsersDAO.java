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
public class UsersDAO {
   
    Connection conn; 
    ResultSet rs;
    public UsersDAO() throws SQLException {
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
         conn.close();
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
                }else{
                    userSinIn = null;
                    conn.close();
                    return userSinIn;
                }
                
                System.out.println(userSinIn);
                conn.close();
                return userSinIn;
            }
            else{
                 conn.close();
                return  null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
     public boolean addUser(User uss) throws SQLException {
         boolean b = false;
         if (!search(uss.getuUsername())) {
                String sql = "INSERT INTO `user`(`uUsername`, `uPassword`, `uEmail`, `uType`) VALUES (?,MD5(?),?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, uss.getuUsername());
                pst.setString(2, uss.getuPassword());
                pst.setString(3, uss.getuEmail());
                pst.setInt(4, uss.getuType());
                pst.executeUpdate();
                b = true;
                conn.close();
         }else{
             return b;
         }
         
      return b;
    }
}
