package br.loja.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.loja.DAO.LoginDAO;
import br.loja.entidade.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginDAO loginDao = new LoginDAO();
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		login(request, response);
	}
	
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		Login login = new Login(usuario, senha);
		if (loginDao.login(login)) {
			response.sendRedirect("home.jsp");
		} else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuário ou senha incorretos.');");
			out.println("window.location='index.jsp'");
			out.println("</script>");
		}
	}
}
