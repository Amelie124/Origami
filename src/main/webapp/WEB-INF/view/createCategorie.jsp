<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer une Categorie</title>
</head>
<body>
<form action="saveCategorie" method="post">
<pre>
nom : <input type="text" name="nomCategorie">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeCategories">Liste Categories</a>
</body>
</html>