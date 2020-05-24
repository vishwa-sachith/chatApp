<%-- 
    Document   : cht
    Created on : Nov 8, 2017, 12:48:23 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=request.getParameter("name")%></title>
        <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css" type="text/css">
    </head>
    <body onload="loadDB()" background="Background.2e16d0ba.fill-1422x800.jpg">
        <script>
            function loadDB() {
                var xhttp;
                if (window.XMLHttpRequest()) {
                    xhttp = new XMLHttpRequest();
                }
                xhttp.onreadystatechange = function () {
                    if (xhttp.readyState === 4 & xhttp.status === 200) {

                        document.getElementById("tb1").innerHTML = xhttp.responseText;
                    }
                };
                xhttp.open("get", "Getdata?id=" +<%=request.getParameter("id")%>, true);
                xhttp.send();
            }
            function save() {
                var xhttp;
                if (window.XMLHttpRequest()) {
                    xhttp = new XMLHttpRequest();
                }
                xhttp.onreadystatechange = function () {
                    if (xhttp.readyState === 4 & xhttp.status === 200) {
                        document.getElementById("msg").value = "";
                        loadDB();
                    }
                };
                xhttp.open("get", "Save?id=" +<%=request.getParameter("id")%> + "" + "&msg=" + document.getElementById("msg").value + "", true);
                xhttp.send();
                document.getElementById("msg").value = "";
                loadDB();
            }
        </script>
    <center>
        <h1><%=request.getParameter("name")%></h1>
        <a href="home.jsp">Back</a>
        <br><br><br>
        <br><br><br>
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
</body>
</html>
