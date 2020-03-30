<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
    <%@ page import ="model.Pais" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Pais pais = (Pais)request.getAttribute("pais"); %>
			<p>id: <%=pais.getId() %> </p>
			<p>nome: <%=pais.getNome() %> </p>
			<p>fone: <%=pais.getPopulacao() %> </p>
			<p>e-mail: <%=pais.getArea() %> </p>
</body>
</html>