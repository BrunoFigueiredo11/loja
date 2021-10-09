<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/registration.css">
    <title>Sign in - aequor.Inc</title>
</head>

<body>
    <header>
        <h2>aequor.Inc</h2>
    </header>

    <main id="container">
        <section id="content_Form">
            <h2 class="title">Efetuar Login</h2>
            <form action="login" method="post">
                <article class="input-separation">
                    <label for="usuario">Usuário</label>
                    <input type="text" name="usuario">
                </article>
                <article class="input-separation">
                    <label for="senha">Senha
                    </label>
                    <input type="password" name="senha">
                </article>
                
                <article class="space-submit">
                    <input type="submit" value="Login">
                </article>
            </form>
        </section>
    </main>

    <footer>
        <section class="social-media">
            <img class="icons" src="./img/icons/facebook.png" alt="Ícone do facebook">
            <img class="icons" src="./img/icons/instagram.png" alt="Ícone do instagram">
            <img class="icons" src="./img/icons/twitter.png" alt="Ícone do twitter">
            <img class="icons" src="./img/icons/linkedin.png" alt="Ícone do linkedin">
        </section>
    </footer>
</body>

</html>