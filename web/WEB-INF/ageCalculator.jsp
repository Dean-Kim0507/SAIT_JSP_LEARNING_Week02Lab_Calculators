<%-- 
    Document   : ageCalculator
    Created on : Sep 23, 2020, 9:25:26 PM
    Author     : 834043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label><input type="number" name="age" value ="">
            <p><input type="submit" value="Age next birthday"></p>
            <p>${message}</p>
            <a href="./arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
