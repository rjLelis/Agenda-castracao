package br.com.lelis.castracao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lelis.castracao.model.CastracaoDao;

/**
 * Servlet implementation class RemoveCastracao
 */
@WebServlet("/removeCastracao")
public class RemoveCastracao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cpf = request.getParameter("cpf");
		
		CastracaoDao dao = new CastracaoDao();
		dao.remove(cpf);
		
		request.getRequestDispatcher("listaCastracao").forward(request, response);
		
	}

}
