<%@page import="br.loja.entidade.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./css/visualization.css">
<title>Visualization</title>
</head>

<body>
	<header>
		<h2>aequor.Inc</h2>
		<a href="home.jsp">
			<button class="button-started">Página Inicial</button>
		</a>
	</header>

	<main id="container">
		<table>
			<tr>
				<th>Nome</th>
				<th>Descrição</th>
				<th>Preço</th>
				<th>Quantidade</th>
			</tr>
			<% List<Produto> lista = (List<Produto>)request.getAttribute("lista");
            for(Produto produto :lista){
            %>
			<tr>
				<td><%=produto.getNome() %></td>
				<td><%=produto.getDescricao() %></td>
				<td>R$ <%=produto.getPreco() %></td>
				<td><%=produto.getQuantidade() %></td>
			</tr>
			<% } %>
		</table>

	</main>

	<footer>
		<section class="social-media">
			<img class="icons" src="./img/icons/facebook.png"
				alt="Ícone do facebook"> <img class="icons"
				src="./img/icons/instagram.png" alt="Ícone do instagram"> <img
				class="icons" src="./img/icons/twitter.png" alt="Ícone do twitter">
			<img class="icons" src="./img/icons/linkedin.png"
				alt="Ícone do linkedin">
		</section>
	</footer>
</body>

</html>