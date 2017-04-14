<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.css" />
 <link rel="stylesheet" href="css/estilo.css" />
  
</head>
<body>


<h1 id="tituloLogin">Acesso</h1>

<form action="Controlador?tarefa=Login" method="post">
	<div class="form-group" id="camposLogin">
		<label for="e_mail" id="labelEmail" class="form-check-label">E-mail:</label>
		<input type="email" id="email" name="email" class="form-control">
		<label for="senha" class="form-check-label" id="labelSenha">Senha: </label>
		<input type="password" id="senha" name="senha" class="form-control">
		<input type="submit" value="Logar" id="logar" class="btn btn-primary">
	</div>
</form>
<div id="dadoAcesso">
<p>Dados de Acesso</p>
<p>Email:teste@teste.com.br</p>
<p>Senha:teste</p>
</div>
</body>
</html>

