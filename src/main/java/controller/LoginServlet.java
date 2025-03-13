package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TicketList
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // ticket.jsp を表示  
        request.getRequestDispatcher("/login.jsp").forward(request, response);  
   	}

	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	request.setCharacterEncoding("UTF-8");
	    	
	    	String login = request.getParameter("login");
	    	
	        if ("login".equals(login)) {
	            request.getRequestDispatcher("./mainJsp/memberTop.jsp").forward(request, response);
	        } else if ("ticketDisplay".equals(login)) {
	            request.getRequestDispatcher("./login.jsp").forward(request, response);
	        }  {
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid action");
	        }
	    }
	}
