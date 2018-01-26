package br.com.lelis.castracao.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirecionaController
 */
@WebServlet("/redirecionaController")
public class RedirecionaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cpf = request.getParameter("cpf");
		if(cpf.equals("")) {
			request.getRequestDispatcher("WEB-INF/jsp/form-adiciona.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("mostraCastracao").forward(request, response);
		}
		
	}

}
