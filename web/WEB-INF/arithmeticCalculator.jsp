<%-- 
    Document   : arithmeticCalculator.jsp
    Created on : Feb 01, 2022, 7:25:10 PM
    Author     : 761450
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
        
        First:<input type="text" name="first" value="" required><br>
        Second:<input type="text" name="second" value="" required><br><br>
            <input type="submit" name="operation_add" value="+">
            <input type="submit" name="operation_sub" value="-">
            <input type="submit" name="operation_multiply" value="*">
            <input type="submit" name="operation_mod" value="%">
        </form>
        <div>Result: ${result}</div>
        <a class="active" href="age">Age Calculator</a>
    </body>
</html>
