/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ModelDAO.QuestionDAO;
import entities.Question;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "TakeQuizServlet", urlPatterns = {"/TakeQuizServlet"})
public class TakeQuizServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TakeQuizServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TakeQuizServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int numberQuestion = Integer.parseInt(request.getParameter("numberQuestion"));
            ArrayList<Question> listquestion = new ArrayList<>();
            QuestionDAO qdao = new QuestionDAO();
            listquestion = qdao.listQuestion();
            int numberQuest = listquestion.size();
            if (numberQuestion > numberQuest || numberQuestion < 0 || numberQuestion == 0) {
                request.setAttribute("message", "can't Play We have" + numberQuest + " Question");
                getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);
            } else {
                HttpSession session = request.getSession();
//         session.setAttribute("answerCorrect", 0);
//         session.setAttribute("numberAnswer", a);
//         session.setAttribute("numberQuestion",numberQuestion );
                getServletContext().setAttribute("answerCorrect", 0);
                getServletContext().setAttribute("numberQuestion", numberQuestion);
                getServletContext().setAttribute("numberAnswer", 0);
//         response.sendRedirect("PlayQuiz.jsp");
                getServletContext().getRequestDispatcher("/PlayQuiz.jsp").forward(request, response);
            }

        } catch (Exception ex) {
//            request.setAttribute("message", "can't Play Wrong Input ");
//            getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
