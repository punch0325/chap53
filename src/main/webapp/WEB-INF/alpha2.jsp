<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>alpha2.jsp</title>
<style type="text/css">
	table{
		font-family: monospace;
		border-collapse: collapse;
		font-size: 20pt;
	}
	#submit1, #submit2{
		width:200px;
        margin:auto;
        display:block;
        height : 30px;
	}
	#f1, #f2{
		width: 50%
	}
</style>
</head>
<body>
<h1>Alpha2 Table</h1>
<hr>

<form action="/alpha2">
	<fieldset>
		<fieldset id ="f1">
			<legend>위치</legend>
			<label for="line">행 </label><input type="number" id="line" name="line" min="1" max="20" value="${empty param.line ? 1 : param.line}">
			<label for="col">열 </label><input type="number" id="col" name="col" min="1" max="40" value="${empty param.col ? 1 : param.col}">
		</fieldset>
		
		<fieldset id ="f2">
			<legend>색상</legend>
			<label>폰트</label>
			<select name="fg">
					<c:forEach var="color" items="${colors }">
						<option value="${color}">${color}</option>
					</c:forEach>
			</select>
			<label>배경</label>
			<select name="bg">
				<c:forEach var="color" items="${colors }">
						<option value="${color}">${color}</option>
					</c:forEach>
			</select>
		</fieldset>
		
		<fieldset>
			<legend>알파벳</legend>
			<c:forEach var="ch" items="${chs}">
				<label>${ch}</label>
				<c:choose>
					<c:when test="${empty param.ch and ch=='A' }">
						<input type="radio" id="${ch}" name="ch" value="${ch}" checked="checked">
					</c:when>
					<c:when test="${!empty param.ch and param.ch==ch}">
						<input type="radio" id="${ch}" name="ch" value="${ch}" checked="checked">
					</c:when>
					<c:otherwise>
						<input type="radio" id="${ch}" name="ch" value="${ch}">
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</fieldset>
		
		<fieldset>
			<legend>언어</legend>
			<label for="java">Java</label>
			<input id="java" type="checkbox" name="lang" value="java">
			<label for="python">Python</label>
			<input id="python" type="checkbox" name="lang" value="python">
			<label for="css">Css</label>
			<input id="css" type="checkbox" name="lang" value="css">
		</fieldset> 
		
		<fieldset>
			<legend>기타</legend>
			<input type="date" name="birthday">
			<input type="time" name="startday">
			<input type="color" name="rgb">
			<input type="reset">
		</fieldset>
		
		<fieldset>
			<legend>입력창</legend>
			<textarea rows="10" cols="50" name="area"></textarea>
		</fieldset>  <br>

		<div style="width:300px; margin:auto;">
			<input id ="submit1" type="submit" value="입   력"> <br>
			<input id="submit2" type="image" src="https://via.placeholder.com/200x30">
		</div>		
	</fieldset>
</form>
<hr>

<table>
	<c:forEach var="row" items="${alphas}">	
		<tbody>
			<tr>
				<c:forEach var="alpha" items="${row}">
					<td style="color:${alpha.fg}; background:${alpha.bg};">${alpha.ch}</td>
				</c:forEach>
			</tr>
		</tbody>
	</c:forEach>
</table>
</body>
</html>