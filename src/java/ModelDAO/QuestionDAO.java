/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import entities.Answer;
import entities.Question;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuestionDAO {
     Connection conn; 
    ResultSet rs;
    public QuestionDAO(){
       DBConnection db = new  DBConnection();
      this.conn = db.getConnect();
    }
    public ArrayList<Question> listQuestion(String username) {
        ArrayList<Question> listQuestion = new ArrayList<>();
        try {
            
//            String sql = "select questionid, question, created from Question where username = '" + username + "'";
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM `question` WHERE 1");    
           rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Date created = rs.getDate(3);
                Question question = new Question(id, name, created);
                listQuestion.add(question);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listQuestion;
    }
      public int countQuesion(String username) {
        try {
           PreparedStatement pst = conn.prepareStatement("SELECT COUNT(*) FROM `question` WHERE 1");    
           rs = pst.executeQuery();
            while (rs.next()) {
                int count = rs.getInt(1);
                return count;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public ArrayList<Answer> listAnswer(int idQuestion) {
        ArrayList<Answer> listAnswer = new ArrayList<>();
         boolean correct;
                 String answer;
        try {
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM `answer` WHERE questionid = ?");    
          pst.setInt(1, idQuestion);
        rs = pst.executeQuery();
            while (rs.next()) {
                answer = rs.getString(1);
                if (rs.getInt(2) == 1) {
                     correct = true;
                }
                else{
                     correct = false;
                }
                Answer newAnswer = new Answer(answer, correct);
                listAnswer.add(newAnswer);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listAnswer;
    }

//    public String getQuestionById(int idQuestion) {
//        String question = null;
//        Connection con = null;
//        DBContext db = new DBContext();
//        try {
//            con = db.getConnection();
//            String sql = "select question from question where questionid = '" + idQuestion + "'";
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                question = rs.getString(1);
//            }
//            return question;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
//
//    public String getCorrectAnswer(int questionid) {
//        Connection con = null;
//        DBContext db = new DBContext();
//        try {
//            con = db.getConnection();
//            String sql = "select answer from Answer where questionid = '" + questionid + "' and correct = '1'";
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                String answerCorrect = rs.getString(1);
//                return answerCorrect;
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
}
