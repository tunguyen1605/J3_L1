package Controller;

import ModelDAO.QuestionDAO;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 */
@WebServlet(name = "CheckResultServlett", urlPatterns = {"/CheckResultServlet"})
public class CheckResultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("playquiz.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> question;
        HttpSession session = request.getSession();
        question = (ArrayList<String>)session.getAttribute("listquestion");
        String ques = request.getParameter("randomques");
        String check = request.getParameter("answer");
        if (check==null) {
            check="";
        }
        int questionid = Integer.parseInt(request.getParameter("questionid"));
        
        QuestionDAO questionDAO = new QuestionDAO();
        String answerCorrect = questionDAO.getCorrectAnswer(questionid);
        int anwerCorrectCurrent = (int) getServletContext().getAttribute("answerCorrect");
        int numberAnswer = (int) getServletContext().getAttribute("numberAnswer");
        int numberQuestion = (int) getServletContext().getAttribute("numberQuestion");
        numberAnswer++;
        
        session.setAttribute("listquestion", question);
        //check if user done all question
        if (numberAnswer == numberQuestion) {
            if (check.equals(answerCorrect)) {
            anwerCorrectCurrent++;
             getServletContext().setAttribute("answerCorrect", anwerCorrectCurrent);
                double result = (double)anwerCorrectCurrent / numberQuestion * 100;
            NumberFormat formatter = new DecimalFormat("#0.00"); 
            getServletContext().setAttribute("result", formatter.format(result));
            questionDAO.closedb();
            
            }
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
        //update number question user done
        getServletContext().setAttribute("numberAnswer", numberAnswer);
        //check answer of user with answer correct
        if (check.equals(answerCorrect)) {
            anwerCorrectCurrent++;
        }
                   
        //update number anwser correct by user
        getServletContext().setAttribute("answerCorrect", anwerCorrectCurrent);
         double result = (double)anwerCorrectCurrent / numberQuestion * 100;
        NumberFormat formatter = new DecimalFormat("#0.00"); 
        getServletContext().setAttribute("result", formatter.format(result));
          getServletContext().getRequestDispatcher("/PlayQuiz.jsp").forward(request, response);   //admin
//        request.getRequestDispatcher("").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
