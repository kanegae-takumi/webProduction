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
@WebServlet("/TicketList")
public class TicketList extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // ticket.jsp を表示  
        request.getRequestDispatcher("/ticket.jsp").forward(request, response);  
   	}

	
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String ticket = request.getParameter("ticket");
	        if ("resaleTicketSalesConfirmation".equals(ticket)) {
	            response.sendRedirect("resaleTicketSalesConfirmation.jsp");
	        } else if ("ticketDisplay".equals(ticket)) {
	            response.sendRedirect("ticketDisplay.jsp");
	        } else if ("ticket".equals(ticket)) {
	            response.sendRedirect("ticket.jsp");
	        } else if ("resaleTicketSalesComplete".equals(ticket)) {
	            response.sendRedirect("resaleTicketSalesComplete.jsp");
	        } else {
	            response.sendRedirect("memberTop.jsp");  // デフォルトでページAにリダイレクト
	        }
	    }
	}
