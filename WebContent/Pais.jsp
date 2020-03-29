<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
    <%@ page import ="model.Pais" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Pais pais = (Pais)request.getAttribute("pais"); %>
			<p>id: <%=pais.getId() %> </p><br>
			<p>nome: <%=pais.getNome() %> </p><br>
			<p>fone: <%=pais.getPopulacao() %> </p><br>
			<p>e-mail: <%=pais.getArea() %> </p><br>
</body>
</html>