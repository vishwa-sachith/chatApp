/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Users;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "reguser", urlPatterns = {"/reguser"})
public class reguser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Users s = new Users();
            s.setId(Integer.parseInt(request.getParameter("id")));
            s.setName(request.getParameter("name"));
            s.setPassword(request.getParameter("pw"));
            Session hibses = connection.NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = hibses.beginTransaction();
            hibses.save(s);
            
            tr.commit();
            hibses.flush();
            hibses.close();
            response.sendRedirect("index.jsp");
        
    }

}
