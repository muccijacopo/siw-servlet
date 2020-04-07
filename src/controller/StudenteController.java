package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Studente;

/**
 * Servlet implementation class StudenteController
 */
@WebServlet("/StudenteController")
public class StudenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String nextPage = "";
		HttpSession session = request.getSession();
		
		request.setAttribute("nome", nome);
		request.setAttribute("cognome", cognome);
		
		if(nome.equals("")) {
			nextPage = "/newStudente.jsp";
			request.setAttribute("nomeErr", "Il nome è un campo obbligatorio");
			
		}
		if(cognome.equals("")) {
			nextPage = "/newStudente.jsp";
			request.setAttribute("cognomeErr", "Il cognome è un campo obbligatorio");
		}
		
		if(!nome.equals("") && !cognome.equals("")) {
			nextPage = "/conferma.jsp";
			Studente newStudente = new Studente(nome.toUpperCase(), cognome.toUpperCase());
			session.setAttribute("studente", newStudente);
		}
		
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		
	}

}
