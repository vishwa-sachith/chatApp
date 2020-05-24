/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import pojos.Private;
import pojos.Public;
import pojos.Users;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "Publoadmsg", urlPatterns = {"/Publoadmsg"})
public class Publoadmsg extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession ss = request.getSession();
            Session hs = connection.NewHibernateUtil.getSessionFactory().openSession();
            Criteria cr = hs.createCriteria(Public.class);
            List<Public> l1 = cr.list();
            String txt = "";
            for (Public msg : l1) {
                    String x=ss.getAttribute("sendid").toString();
                if (x.equals(msg.getUsers().getId() + "")) {
                    txt += "<tr class=\"success\">";
                    System.out.println("if1");
                    txt += "<td style=\"float: right\">" + msg.getUsers().getName() + " : " + msg.getMsg() + "</td>";
                }
                 else if (true) {
                    txt += "<tr class=\"info\">";
                    System.out.println("if2");
                    txt += "<td style=\"float: left\">" + msg.getUsers().getName() + " : " + msg.getMsg() + "</td>";
                }
                txt += "</tr>";
            }
            out.write(txt);
            l1.clear();
            Transaction tr = hs.beginTransaction();
            tr.commit();
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
        processRequest(request, response);
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
