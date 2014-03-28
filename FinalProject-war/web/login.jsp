<%-- 
    Document   : login
    Created on : Mar 26, 2014, 10:49:34 PM
    Author     : Ton Tran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Reservation</title>
    </head>
    <body>
        <div>
            <h1>Log in as user</h1>
        </div>
        <div>
            <form name="userLogin" action="UserLoginController" method="post">
                <div><span>Username: </span>&nbsp;<span><input type="text" name="username" id="username" placeholder="Username"></span></div>
                <div><span>Password: </span>&nbsp;<span><input type="password" name="password" id="password" placeholder="Password"></span></div>
                <div><span><button type="button">Log In</button></span>&nbsp;<span><button type="reset">Cancel</button></span></div>
            </form>
        </div>
    </body>
</html>
