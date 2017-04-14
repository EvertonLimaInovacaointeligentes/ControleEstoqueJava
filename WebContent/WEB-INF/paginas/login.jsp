<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'/>
<title>Autentica��o</title>
</head>
<body>
   <c:if test="${not empty usuarioLogado}">
      <p>Usuario logado: ${usuarioLogado.email}</p>
      <c:redirect url="/Controlador?tarefa=BuscaEmpresa"></c:redirect>       
   </c:if>
   <c:if test="${empty usuarioLogado} }">
      <p>Usuario est� Deslogado</p>
      <c:redirect url="/index.jsp"></c:redirect>
   </c:if>
</body>
</html>