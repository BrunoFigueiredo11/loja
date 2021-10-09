<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./css/home.css">
<title>Home</title>
</head>

<body>
	<main id="main_Home">
		<section id="content_Welcome">
			<h2 class="logo-home">aequor.Inc</h2>
			<h3 class="title-home">Bem-Vindo ao Registrer!</h3>
			<p class="content-home">Aqui você poderá cadastrar diversos tipos
				de produtos e visualizar todos os produtos já cadastrados</p>
		</section>
		<section id="content_Started">
			<a href="registration.jsp">
				<button class="button-started">
					Registrar Novo
				</button></a>
			<form action="listar" method="post">
				<button class="button-started">
					Visualizar
				</button>
			</form>
		</section>
	</main>
</body>

</html>