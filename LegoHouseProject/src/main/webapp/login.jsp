<%-- 
    Document   : login
    Created on : 21-03-2019, 13:49:36
    Author     : Younes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Lego Shop.</title>
    </head>
    <body>
        <h1>Welcome to the best Lego shop ever!</h1>
        
        <table>
            <tr><td>Login</td>
                <td>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login">
                        Username:<br>
                        <input type="text" name="username" value="lego">
                        <br>
                        Password:<br>
                        <input type="password" name="password" value="ogel">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                    
                </td>
                <td>Register account</td>
                <td>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        Email:<br>
                        <input type="text" name="email" value="hej@goddag.com">
                        <br>
                        Username:<br>
                        <input type="text" name="username" value="lego">
                        <br>
                        Password:<br>
                        <input type="password" name="password1" value="ogel">
                        <br>
                        Repeat password:<br>
                        <input type="password" name="password2" value="ogel">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
            </tr>
         </table>
         <% String error = (String) request.getAttribute( "error");
           if ( error != null) { 
               out.println("<H2>Error!!</h2>");
               out.println(error);
           }
        %>
    </body>
</html>
