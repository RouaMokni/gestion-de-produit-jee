<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ajouter un produit</title>
</head>
<body>
<div class="container">
    <h1>Ajouter un produit</h1>

    <form method="post" action="controlleur">
        <div class="form-group">
            <label for="name">Nom :</label>
            <input type="text" id="name" name="name" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="prix">Prix :</label>
            <input type="number" id="prix" name="prix" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="quantities">Quantité :</label>
            <input type="number" id="quantities" name="quantities" class="form-control" required>
        </div>

        <button type="submit" name="action" value="ajout" class="btn btn-primary mb-2">Ajouter</button>
    </form>
</div>
</body>
</html>
