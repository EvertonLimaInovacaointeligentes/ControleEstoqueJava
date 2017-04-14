<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
  <html>
  <head>	  
  <meta http-equiv='Content-Type' content='text/html; charset=windows-1252'>
  <meta name='viewport' content='width=device-width, initial-scale=1'>
   <link rel="stylesheet" href="css/bootstrap.css" />
   <link rel="stylesheet" href="css/estiloBuscarEmpresa.css" />   
  </head>
  <body>
  <c:if  test="${not empty usuarioLogado}">
  <form action="Controlador?tarefa=logout" method="post">
       <input type="submit" value="deslogar" class="btn btn-primary" id="deslogar">
    </form>
  <h1>Buscar Empresa</h1>
  <div id="BoasVindas">Bem vindo ${usuarioLogado.email}</div>
  <p>Resultado da Busca Empresa:</p>
	  <table border='1' class="table table-striped">
	  <thead>
	  <tr>
	  <th style="width:2px;">Código</th>
	  <th style="width:-52px;">Empresa</th>
	  </tr>
	  </thead>
	  <tbody>	  
	  <c:forEach var="empresa" items="${empresas}">
		<tr>
		<td>${empresa.id}</td>
		<td>${empresa.nome}</td>
		</tr>
	</c:forEach>
	  
	  </tbody>
	  </table>
	  <a href='/gerenciador/formularioCadastroEmpresa.jsp' id="linkCadatrar">Nova Empresa</a>
	  </c:if>	  
	  <c:if  test="${empty usuarioLogado}">
	    <c:redirect url="index.jsp"></c:redirect>
	  </c:if>
	  </body>
	  </html>
  