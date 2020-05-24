<%-- 
    Document   : index
    Created on : Nov 8, 2017, 10:03:26 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css" type="text/css">
    </head>
    <body>
       
        <h1 style="margin-left: 700px;" class="text-info" >Welcome</h1>
        <input class="glyphicon-search" type="search">
        <img class="glyphicon glyphicon-search" src="">
        

        <div class="container">
            <div class="col-lg-4"></div>
            <div class="col-lg-4">
                <div class="jumbotron">
                    <div class="form-group">
                        <form action="login" method="post">
                            <input type="text" name="username" placeholder="Username" class="form-control">
                            <input type="password" name="password" placeholder="Password" class="form-control">
                            <br>
                            <button type="submit" class="btn btn-primary btn-block">Login</button>
                            <br><br><br>
                            <table>
                                <tr>
                                    <td>Not a user?</td>
                                    <td>  </td>
                                    <td><a href="reg.jsp">Register here</a></td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-lg-4"></div>
<button type="submit"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
        </div>
              
        <%
            String s = request.getParameter("msg");
            if(s!=null){
                
            
        %>

        <div class="row">
            <div class="col-sm-6">
                <div>
                    <h3 class="alert-danger"><%= s%></h3>
                </div>
            </div>
        </div>
        
        <%
            }
        %>


    </body>
</html>
