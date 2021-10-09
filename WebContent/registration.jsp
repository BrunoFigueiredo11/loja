<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./css/registration.css">
<title>Registration</title>
</head>

<body>
	<header>
		<h2>aequor.Inc</h2>
		<a href="home.jsp">
			<button class="button-started">Página Inicial</button>
		</a>
	</header>

	<main id="container">
		<section id="content_Form">
			<h2 class="title">Cadastrar um produto</h2>
			<form action="cadastro">
				<article class="input-separation">
					<label for="produto">Produto</label> <input type="text"
						name="produto" placeholder="Ex:Caneta" required>
				</article>
				<article class="input-separation">
					<label for="descricao">Descrição </label> <input type="text"
						name="descricao" placeholder="Ex:Caneta Azul" required>
				</article>
				<article class="input-separation">
					<label for="name">Valor</label> <input type="number" name="valor" step="0.01"
						placeholder="0.00" min="0" required>
				</article>
				<article class="input-separation">
					<label for="name">Quantidade</label> <input type="number"
						name="quantidade" placeholder="0" min="0" required>
				</article>
				<article class="space-submit">
					<input type="submit" value="Cadastrar">
				</article>
			</form>
		</section>
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