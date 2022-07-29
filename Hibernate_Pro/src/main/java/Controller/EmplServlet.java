package Controller;


import java.io.IOException;
import java.sql.ResultSet;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoEmpl;
import Model.Employe;

  @ WebServlet ("ListEmpl" )
public class EmplServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Employe empl=new Employe();
    DaoEmpl daoEmp = new DaoEmpl(); 


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 this.getServletContext().getRequestDispatcher( "ListEmpl.jsp").forward( request, response );
   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
		insert(request,response);
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom=request.getParameter("Nom");
		String prenom=request.getParameter("Prenom");
		String mail=request.getParameter("Mail");
		String telephone=request.getParameter("Telephone");
		String salaire=request.getParameter("Salaire");
		String adresse=request.getParameter("Adresse");
		String dateNaissance=request.getParameter("Date_naissance");
		
		empl.setNomEmp(nom);
		empl.setPrenomEmp(prenom);
		empl.setEmailEmp(mail);
		empl.setTelEmp(telephone);
		empl.setSalaireEmp(1000);
		empl.setAdresseEmp(adresse);
		empl.setDateNaisEmp(null);
		
		
		try {
			daoEmp.save(empl);
			response.sendRedirect("EmplJSP.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}


