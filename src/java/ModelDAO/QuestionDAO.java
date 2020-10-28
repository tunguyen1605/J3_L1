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
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public ArrayList<Question> listQuestion() {
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
      public int countQuesion() {
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
         int correct;
                 String answer;
        try {
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM `answer` WHERE questionid = ?");    
          pst.setInt(1, idQuestion);
        rs = pst.executeQuery();
            while (rs.next()) {
                answer = rs.getString(1);
                correct = rs.getInt(2);
//                if (rs.getInt(2) == 1) {
//                     correct = true;
//                }
//                else{
//                     correct = false;
//                }
                Answer newAnswer = new Answer(answer, correct, idQuestion);
                listAnswer.add(newAnswer);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listAnswer;
    }

    public String getQuestionById(int idQuestion) {
        String question = null;
        try {
           
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM `question` WHERE questionid = ?");
            pst.setInt(1,idQuestion);
            rs = pst.executeQuery();
            while (rs.next()) {
                question = rs.getString(2);
            }
            return question;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public int getIdByQuestion(String Question) {
        int idquestion = 0;
        try {
           
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM `question` WHERE question = ?");
            pst.setString(1,Question);
            rs = pst.executeQuery();
            while (rs.next()) {
                idquestion = rs.getInt(1);
            }
            return idquestion;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return 0;
    }
    public boolean insertanswer(ArrayList<Answer> list) {
        
      
            try {
                  for (Answer answer : list) {
                PreparedStatement pst = conn.prepareStatement("INSERT INTO `answer`(`answer`, `correct`, `questionid`) VALUES (?,?,?)");
                pst.setString(1,answer.getAnswer());
                pst.setInt(2, answer.getCorrect());
                pst.setInt(3, answer.getQuestionid());
                pst.executeUpdate();
                        }
                  return true;
            } catch (SQLException ex) {
                Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        return false;
    }
    
    public String getCorrectAnswer(int questionid) {
        try {
            try {
                String sql = "select answer from Answer where questionid = '" + questionid + "' and correct = '1'";
                PreparedStatement pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String answerCorrect = rs.getString(1);
                    conn.close();
                    return answerCorrect;
                    
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            conn.close();
       
        } catch (SQLException ex) {
             Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             return null;
    }
    public  int InsertQuestion(String Question , String datecreated){
        
         try {
             
             try {
                 PreparedStatement pst = conn.prepareStatement("INSERT INTO `question`(`question`, `created`) VALUES (?,?)");
                 pst.setString(1,Question);
                 pst.setString(2, datecreated);
                 pst.executeUpdate();
                 int questionid =0;
                 questionid = getIdByQuestion(Question);
                 conn.close();
                 return questionid;
             } catch (SQLException ex) {
                 Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
             conn.close();
            
         } catch (SQLException ex) {
             Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
          return 0;
    }

}
