/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojos.Users;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         int un = Integer.parseInt(request.getParameter("username"));
        String pw = request.getParameter("password");
        
        Session s = connection.NewHibernateUtil.getSessionFactory().openSession();
        Criteria cr = s.createCriteria(Users.class);
                cr.add(Restrictions.eq("id", un));
                cr.add(Restrictions.eq("password", pw));
                Users l = (Users) cr.uniqueResult();
                
                
                    if(l!=null){
                        
                        response.sendRedirect("home.jsp?sendid='"+un+"'");
                        
                            HttpSession ss=request.getSession();
                            ss.setAttribute("sendid", un);
                        
                        
                    }else{
                        System.out.println("fuckoff");
                        response.sendRedirect("index.jsp?msg=Wrong password");
                    }
        
    }


}
