<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>Emp List</h1>
<hr>


<form action="/dept/list">
	<input type="text" name="search">
	<input type="submit" value="부서 검색">
</form><br>

<table border="1">
	<thead>
		<tr>
			<th>EMPNO</th>
			<th>ENAME</th>
			<th>GENDER</th>
			<th>JOB</th>
			<th>MGR</th>
			<th>HIREDATE</th>
			<th>SAL</th>
			<th>COMM</th>
			<th>DEPTNO</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.gender}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<td align="right">${emp.sal}</td>
				<td align="right">${emp.comm}</td>
				<td>${emp.deptno}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>