<%-- 
    Document   : reg
    Created on : Nov 8, 2017, 10:05:09 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css" type="text/css">
    </head>
    <body>
    <center>
        <h1 class="alert-info">User Registration</h1>
        <form action="reguser" method="post">
            <table>
                <tr>
                    <th>Id</th>
                    <td>:</td>
                    <td><input type="text" name="id" required=""></td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td>:</td>
                    <td><input type="text" name="name" required=""></td>
                </tr>
              
                <tr>
                    <th>password</th>
                    <td>:</td>
                    <td><input type="password" name="pw" required=""></td>
                </tr>
              
                <tr>
                    <th><input type="submit" value="Register"></th>
                </tr>

            </table>
                <a href="index.jsp">Back</a>
        </form>
    </center>
    </body>
</html>
