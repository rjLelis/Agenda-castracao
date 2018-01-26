package br.com.lelis.castracao.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lelis.castracao.model.Castracao;
import br.com.lelis.castracao.model.CastracaoDao;

/**
 * Servlet implementation class AlteraCastracao
 */
@WebServlet("/mostraCastracao")
public class MostraCastracao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cpf = request.getParameter("cpf");
		
		CastracaoDao dao = new CastracaoDao();
		Castracao castracao = dao.listar(cpf);
		
		request.setAttribute("castracao", castracao);
		request.getRequestDispatcher("/WEB-INF/jsp/form-altera.jsp").forward(request, response);
		
	}

}
