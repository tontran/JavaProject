/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import entities.Hoteluser;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessions.UserSessionRemote;

/**
 *
 * @author Ton Tran
 */
public class UserLoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserLoginController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserLoginController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getSession() != null){
            request.getSession().invalidate();
        }
        
        logIn(request, response);
    }
    
    protected void logIn(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        Hoteluser users = new Hoteluser();
        String userName = request.getParameter("username");
	String password = request.getParameter("password");
	request.getSession().invalidate();
        
        if(userName == null || userName == "" || password == null || password == ""){
            request.setAttribute("error", "Please enter required values!!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	else{
            try {
                InitialContext ic = new InitialContext();
                Object o = ic.lookup(UserSessionRemote.class.getName());
                UserSessionRemote userSession = (UserSessionRemote) o;
                //rooms = roomSession.showAllAvailableRoom();
                // users = userSession.allAvailableRoom('0');
                if(userSession.findUserByName(userName) != null){
                    users = userSession.findUserByName(userName);
                    if(users.getPassword().equals(password)){
                        request.getSession().setAttribute("users", users);
                        request.getRequestDispatcher("/UserController").forward(request, response);
                    }
                    else{
                        request.setAttribute("error", "Entered incorrect password or user may not exist");
			request.getRequestDispatcher("login.jsp").forward(request, response);
                    }
                }
                else{
                    request.setAttribute("error", "Entered incorrect password or user may not exist");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } catch (NamingException ex) {
                Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
