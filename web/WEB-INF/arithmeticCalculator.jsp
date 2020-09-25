<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 23, 2020, 9:25:44 PM
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
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label><input type="number" name="first_number" value ="">
            <br>
            <label>Second:</label><input type="number" name="second_number" value ="">
            <p>
                <input type="submit" name="button" value="+">
                <input type="submit" name="button" value="-">
                <input type="submit" name="button" value="*">
                <input type="submit" name="button" value="%">
            </p>
            <p>Result: ${result}</p>
            <a href="./age">Arithmetic Calculator</a>
        </form>    
    </body>
</html>
