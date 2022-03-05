<%-- 
    Document   : ageCalculator
    Created on : Feb 28, 2022, 7:35:00 PM
    Author     : 761450
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age">
        <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <br><br>
            <input type="submit" value="Age next birthday">
        </form>
        <a class="active" href="arithmetic">Arithmetic Calculator</a>
        
        <p>${errorMessage}</p>
        <p>${passMessage}</p>
        <p>${intMessageError}</p>
        <p>${nullMessage}</p>
        
    </body>
</html>
