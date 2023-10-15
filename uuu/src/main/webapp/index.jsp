<%@page import="entities.Produit"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<% List<Produit> liste = (List<Produit>)request.getAttribute("products"); %>
<div class="controlleur">
<table class="table">
<tr>
<th>#</th>
<th>Name</th>
<th>Prix</th>
<th>Quantities</th>
</tr>
<% for(Produit p:liste){ %>
<tr>
<td><%=p.getId() %></td>
<td><%=p.getName() %></td>
<td><%=p.getPrix() %></td>
<td><%=p.getQuantities() %></td>
</tr>
<% } %>


</table>

</div>
</body>
</html>