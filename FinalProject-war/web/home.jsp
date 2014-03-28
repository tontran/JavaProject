<%-- 
    Document   : home
    Created on : Mar 26, 2014, 5:58:39 PM
    Author     : Ton Tran
--%>

<%@page import="entities.Hotelroom"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hotel Reservation</title>
    </head>
    <body>
        <h1>Welcome to My Hotel Reservation Home Page</h1>
        
        <div>
            <label><a href="login.jsp">Log in </a> as a user</label>
        </div>
        <label>All Available Rooms</label>
        <%
            List<Hotelroom> rooms = (List<Hotelroom>) request.getAttribute("rooms");

           // response.getWriter().println(request.getPathInfo());
            if(rooms == null){
                request.getRequestDispatcher("/RoomController").forward(request, response);
                
            }

        %>
        <table width="30%" border="1" cellspacing="5" cellpadding="0">
        <%
            //rooms = (ArrayList<RoomClass>) request.getAttribute("rooms");
        %>
            <thead>
                <td>ID</td>
                <td>ROOM NUMBER</td>
                <td>ROOM TYPE</td>
                <td>STATUS</td>
            </thead>
            <%
                for(Hotelroom room : rooms){
                    out.println("<tr><td>" + room.getId() + "</td>" +
                                "<td>" + room.getRoomnum() + "</td>" +
                                "<td>" + room.getType() + "</td>" +
                                "<td>" + room.getStatus() + "</td>" +
                                "</tr>");
                }
            %>
            
        </table>
    </body>
</html>
