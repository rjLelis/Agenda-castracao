package br.com.lelis.castracao.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lelis.castracao.model.Castracao;
import br.com.lelis.castracao.model.CastracaoDao;

/**
 * Servlet implementation class ListaCastracao
 */
@WebServlet("/listaCastracao")
public class ListaCastracao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CastracaoDao dao = new CastracaoDao();
		
		List<Castracao> castracoes = dao.listar();
		
		request.setAttribute("castracoes", castracoes);
		
		request.getRequestDispatcher("WEB-INF/jsp/lista-castracao.jsp").forward(request, response);
		
		
	}

}
