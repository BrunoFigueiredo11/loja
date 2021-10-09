package br.loja.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProdutoDAO dao = new ProdutoDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("produto");
		String descricao = request.getParameter("descricao");
		double valor = Double.parseDouble(request.getParameter("valor"));
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		Produto produto = new Produto(nome, descricao, valor, quantidade);
		if (dao.cadastrar(produto)) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Produto Cadastrado com Sucesso!');");
			out.println("window.location='home.jsp'");
			out.println("</script>");

		} else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('O produto não foi cadastrado, tente novamente!');");
			out.println("window.location='registration.jsp'");
			out.println("</script>");
		}
	}
}
