package br.loja.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.loja.DAO.ProdutoDAO;
import br.loja.entidade.Produto;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/listar")
public class ListaProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> lista = dao.listar();
		request.setAttribute("lista", lista);
		RequestDispatcher dispatcher = request.getRequestDispatcher("visualization.jsp");
		dispatcher.forward(request, response);
		}

}
