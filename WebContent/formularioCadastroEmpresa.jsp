<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.css" />
 <link rel="stylesheet" href="css/estiloEmpresa.css" />
  
</head>
<body>
<c:if  test="${not empty usuarioLogado}">
<div id="BoasVindas">Bem vindo ${usuarioLogado.email}</div>   

<h1 id="titulo" class="display-1">Cadastro de Empresa</h1>

	<form name="formulario" action="Controlador?tarefa=NovaEmpresa" method="post">
		<div id="conteudo" class="form-group">
			<label id="labelNome" class="form-check-label">Nome da Empresa:</label>
			<input type="text" name="nome"id="nome" class="form-control"/>
			<input type="submit" value="cadastrar" class="btn btn-primary" id="Cadastrar"/>
		</div>
	</form>
	<form action="Controlador?tarefa=logout" method="post">
       <input type="submit" value="deslogar" class="btn btn-primary" id="deslogar">
    </form>
</c:if>
<c:if test="${empty usuarioLogado}">
<c:redirect url="/index.jsp"></c:redirect>
<p>vazio ${usuarioLogado.email}</p> 
</c:if>

    
</body>
</html>	