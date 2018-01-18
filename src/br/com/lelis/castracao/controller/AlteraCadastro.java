package br.com.lelis.castracao.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lelis.castracao.model.Castracao;
import br.com.lelis.castracao.model.CastracaoDao;

/**
 * Servlet implementation class AlteraCadastro
 */
@WebServlet("/alteraCastracao")
public class AlteraCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String cpf = request.getParameter("cpf");
		String nomeDono = request.getParameter("nomeDono");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String nomeAnimal = request.getParameter("nomeAnimal");
		String especieAnimal = request.getParameter("especieAnimal");
		String racaAnimal = request.getParameter("racaAnimal");
		String dataEmTexto = request.getParameter("dataAtendimento");
		String horaEmTexto = request.getParameter("horaCastracao");
		String atendido = request.getParameter("atendido");
		Calendar dataAtendimento = null;
		Calendar horaAtendimento = null;

		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataAtendimento = Calendar.getInstance();
			dataAtendimento.setTime(data);
			
			Date date = new SimpleDateFormat("HH:mm").parse(horaEmTexto);
			horaAtendimento = Calendar.getInstance();
			horaAtendimento.setTime(date);
		} catch (ParseException e) {
			out.println("<h1>Erro na conversão</h1>");
			e.printStackTrace();
			return;
		}

		Castracao castracao = new Castracao();
		castracao.setCpf(cpf);
		castracao.setNomeDono(nomeDono);
		castracao.setTelefone(telefone);
		castracao.setEndereco(endereco);
		castracao.setNomeAnimal(nomeAnimal);
		castracao.setEspecieAnimal(especieAnimal);
		castracao.setRacaAnimal(racaAnimal);
		castracao.setAtendido(Boolean.parseBoolean(atendido));
		castracao.setDataAtendimento(dataAtendimento);
		castracao.setHoraAtendimento(horaAtendimento);

		CastracaoDao dao = new CastracaoDao();
		dao.altera(castracao);
		
		request.getRequestDispatcher("/listaCastracao").forward(request, response);
	}

}
