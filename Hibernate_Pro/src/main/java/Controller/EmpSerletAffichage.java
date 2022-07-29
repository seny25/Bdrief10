package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Dao.DaoEmpl;
import Model.Employe;

public class EmpSerletAffichage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	Employe empl=new Employe();
    DaoEmpl daoEmp; 
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Affiche(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	}
	protected void Affiche(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		List<Employe> affiche = daoEmp.find_ALL();
		request.setAttribute("affiche", affiche);
		response.sendRedirect("");
	}
}
