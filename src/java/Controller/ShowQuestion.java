/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ModelDAO.QuestionDAO;
import entities.Answer;
import entities.Question;
import entities.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
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
@WebServlet(name = "ShowQuestion", urlPatterns = {"/ShowQuestion"})
public class ShowQuestion extends HttpServlet {

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
            out.println("<title>Servlet ShowQuestion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowQuestion at " + request.getContextPath() + "</h1>");
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
         HttpSession s = request.getSession();
             User us = (User)s.getAttribute("user");
             if (us.getuType() != 1 ) {
        ArrayList<Question> listquestion = new ArrayList<>();
        QuestionDAO qdao = new QuestionDAO();
             try {
                 listquestion = qdao.listQuestion();
             } catch (ParseException ex) {
                 Logger.getLogger(ShowQuestion.class.getName()).log(Level.SEVERE, null, ex);
             }
         int numberQuestion1 = listquestion.size();
        HttpSession session = request.getSession();
        session.setAttribute("listquestion12", listquestion);
        session.setAttribute("numberQuestion12", numberQuestion1);
         getServletContext().getRequestDispatcher("/ShowQuiz.jsp").forward(request, response);   //admin
        }
             else{
                 
                 request.setAttribute("message", "Cant't Join manager ");
                
            getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);
             }
         
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
