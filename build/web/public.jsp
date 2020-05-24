<%-- 
    Document   : public
    Created on : Nov 11, 2017, 11:54:46 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css" type="text/css">
    </head>
    <body onload="load()" background="Background.2e16d0ba.fill-1422x800.jpg">
    <center>
        <h1 class="alert-info">Public Chat</h1> 
        <a href="home.jsp">Back</a>
        <br><br><br>
        <br>
        <div class="container">
            <table id="tb1" style="width: 800px" class="table">
            </table>
        </div>
        <br><br><br>
        <br><br><br>
        <div class="container">
            <table>
                <tr>
                    <td><input type="text" class="form-control" placeholder="Enter Massage" id="msg"></td>
                    <td><button onclick="save()" type="button" class="btn btn-success">Send</button></td>
                </tr>
            </table>
        </div>
    </center>
    <script>       
        function load(){
            var xhttp;
            if (window.XMLHttpRequest()) {
                xhttp = new XMLHttpRequest();
            }
            xhttp.onreadystatechange = function () {
                if (xhttp.readyState == 4 & xhttp.status == 200) {
                    document.getElementById("tb1").innerHTML = xhttp.responseText;                  
                }
            }
            xhttp.open("get", "Publoadmsg", true);
            xhttp.send();
            xhttp=null;
        }      
        function save(){
            var xhttp;
            if (window.XMLHttpRequest()) {
                xhttp = new XMLHttpRequest();
            }
            xhttp.onreadystatechange = function () {
                if (xhttp.readyState == 4 & xhttp.status == 200) {
                    load();
                }
            }
            xhttp.open("get", "Pubsend?msg=" + document.getElementById("msg").value + "", true);
            xhttp.send();
            load();
            document.getElementById("msg").value="";
        } 
    </script>
    </body>
</html>
