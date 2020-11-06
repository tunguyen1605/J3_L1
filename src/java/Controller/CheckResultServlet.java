package Controller;

import ModelDAO.QuestionDAO;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        //check if user done all question
        if (numberAnswer == numberQuestion) {
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
        
        request.getRequestDispatcher("PlayQuiz.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
