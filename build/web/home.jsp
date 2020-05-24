<%-- 
    Document   : home
    Created on : Nov 8, 2017, 12:28:30 PM
    Author     : ASUS
--%>

<%@page import="pojos.Users"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Criterion"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="Background.2e16d0ba.fill-1422x800.jpg">
        <br><br><br>
    <center>
        <h1 class="text-info">Home</h1>
        <table>
            <tr class="text-info">
                <td><a>Public Chat</a></td>
                <td><a href="public.jsp">Send Massages</a></td>
            </tr>
            <%
                HttpSession ss =request.getSession();
                Session hs = connection.NewHibernateUtil.getSessionFactory().openSession();
                Criteria cr = hs.createCriteria(Users.class);
                 
               // cr.add(Restrictions.eq("name", "aaa"));


                List<Users> l1 = cr.list();
                for (Users a : l1) {
            %>
            <tr class="text-info">
                <td><input type="hidden" value="<%=a.getId()%>" id="resid"></td>
                <td><%=a.getName()%></td>
                
                <td><a href=cht.jsp?id=<%=a.getId()%>&name=<%=a.getName()%>>  Send Massages</a></td>
            </tr>

            <%
                }

            %>
        </table>
    </center>
    </body>
</html>
