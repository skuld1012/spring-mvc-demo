<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href="${pageContext.request.contextPath}/static/css/main.css" type='text/css' media='all' />
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/docreate">
		<table class="formtable">
			<tr>
				<td class="label">Name: </td><td><input class="control" name="name" type="text" /></td>
			</tr>
			<tr>
				<td class="label">Email: </td><td><input class="control" name="email" type="text" /></td>
			</tr>
			<tr>
				<td class="label">Your offer: </td><td><textarea class="control" name="text" cols="10" rows="10"></textarea></td>
			</tr>
			<tr>
				<td class="label"></td><td><input class="control" name="Create offer" type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>