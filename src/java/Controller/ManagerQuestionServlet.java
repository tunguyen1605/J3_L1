/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ModelDAO.QuestionDAO;
import entities.Answer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ManagerQuestionServlet", urlPatterns = {"/ManagerQuestionServlet"})
public class ManagerQuestionServlet extends HttpServlet {

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
            out.println("<title>Servlet ManagerQuestionServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ManagerQuestionServlet at " + request.getContextPath() + "</h1>");
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
        ArrayList<Answer> listAnswer = new ArrayList<>();
        int a = Integer.parseInt(request.getParameter("correct"));
        String op1 = request.getParameter("option1") ;
        String op2 = request.getParameter("option2") ;
        String op3 = request.getParameter("option3") ;
        String op4 = request.getParameter("option4") ;
        Answer as = new Answer();
        String question = request.getParameter("question");
        QuestionDAO qdao = new QuestionDAO();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(date);  
        int idquestion = qdao.InsertQuestion(question, strDate);
        if (a == 1) {
            listAnswer.add(new Answer(op1, 1, idquestion));
            listAnswer.add(new Answer(op2, 2,  idquestion));
            listAnswer.add(new Answer(op3, 2, idquestion));
            listAnswer.add(new Answer(op4, 2, idquestion));
            
        }else if (a == 2) {
             listAnswer.add(new Answer(op1, 2, idquestion));
            listAnswer.add(new Answer(op2, 1,  idquestion));
            listAnswer.add(new Answer(op3, 2, idquestion));
            listAnswer.add(new Answer(op4, 2, idquestion));
        }
        else if (a == 3) {
             listAnswer.add(new Answer(op1, 2, idquestion));
            listAnswer.add(new Answer(op2, 2,  idquestion));
            listAnswer.add(new Answer(op3, 1, idquestion));
            listAnswer.add(new Answer(op4, 2, idquestion));
        }else
        {
             listAnswer.add(new Answer(op1, 2, idquestion));
            listAnswer.add(new Answer(op2, 2,  idquestion));
            listAnswer.add(new Answer(op3, 1, idquestion));
            listAnswer.add(new Answer(op4, 2, idquestion));
        }
        QuestionDAO dAO1 = new QuestionDAO();
        dAO1.insertanswer(listAnswer);
        response.sendRedirect("Welcome.jsp");
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
        processRequest(request, response);
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
