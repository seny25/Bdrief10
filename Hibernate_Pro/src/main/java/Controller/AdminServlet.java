package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoAdmin;
import Model.Administr;
@WebServlet("AdminServlet")
public class AdminServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       DaoAdmin daoAdmin=new DaoAdmin();


	public void init() {
		daoAdmin=new DaoAdmin();
	}
       
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("registe.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		login(request, response);
	}
	
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String username = request.getParameter("nom_utilisateur");
	        String password = request.getParameter("psw");
	       List result = daoAdmin.find_ALL();
	        PrintWriter out = response.getWriter();
	        try {
	        	   if(result != null ) {
	                   
	                   RequestDispatcher rd = request.getRequestDispatcher("connection.jsp");
	                   rd.forward(request,response);
	               }
	        	   else {
	        		   out.print("erreur verifier votre nom utilisateur ou motpass");
	                    RequestDispatcher rd=request.getRequestDispatcher("registe.jsp");
	                    rd.include(request,response);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
	}
	
}
