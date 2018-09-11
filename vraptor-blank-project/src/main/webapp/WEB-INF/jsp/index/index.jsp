<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Language" content="pt-br">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Criptografia</title>
<link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css'/>">
<link rel="stylesheet" href="<c:url value='/css/style.css'/>">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Criptografia</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1"></div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<div class="container">
		<div class="col-xs-12 col-sm-9">
			<blockquote>
				<h2>Criptografar</h2>
			</blockquote>
			<form action="criptografar" method="post">
				<div class="form-group">
				<label>Algoritimo</label>
					<select class="form-control" name="criptografia.tipo">
						<option value="1">Cifra de Cesar</option>
						<option value="2">Cifra de Tranposição</option>
						<option value="3">Cifra Playfair</option>
						<option value="4">Cifra de Vigenère</option>
					</select>
				</div>
				<div class="form-group">
				<label>Chave</label>
					<input class="form-control" name="criptografia.chave"
						value="${chave}">
				</div>
				<div class="form-group">
				<label>Texto</label>
					<input name="criptografia.texto1" class="form-control"
						value="${texto1}">
				</div>
				<div class="form-group">
					<button class="btn" type="submit" value="criptografar">Criptografar</button>
				</div>
				<div class="form-group">
				<label>Texto Criptografado</label>
					<input class="form-control" name="textoCriptografado"
						value="${textoCriptografado}" disabled="disabled">
				</div>
			</form>
			<hr>
			<blockquote>
				<h2>Descriptografar</h2>
			</blockquote>
			<form action="descriptografar" method="post">
				<div class="form-group">
				<label>Algoritimo</label>
					<select class="form-control" name="criptografia.tipo">
						<option value="1">Cifra de Cesar</option>
						<option value="2">Cifra de Tranposição</option>
						<option value="3">Cifra Playfair</option>
						<option value="4">Cifra de Vigenère</option>
					</select>
				</div>
				<div class="form-group">
				<label>Chave</label>
					<input class="form-control" name="criptografia.chave"
						value="${chave}">
				</div>
				<div class="form-group">
				<label>Texto</label>
					<input name="criptografia.texto2" class="form-control"
						value="${texto2}">
				</div>
				<div class="form-group">
					<button class="btn" type="submit" value="descriptografar">Descriptografar</button>
				</div>
				<div class="form-group">
					<label>Texto Descriptografado</label>
					<input class="form-control" name="textoDescriptografado"
					value="${textoDescriptografado}" disabled="disabled">
				</div>
			</form>
		</div>
	</div>
</body>
</html>