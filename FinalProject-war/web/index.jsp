<%-- 
    Document   : index
    Created on : Mar 26, 2014, 11:00:44 AM
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
        <%		
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RoomController");
            requestDispatcher.forward(request, response); 
        %>
    </body>
</html>
