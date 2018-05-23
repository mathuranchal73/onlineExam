<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>

.error{
color:red;
font-size: 15px;
}
</style>
<title>Registration</title>
</head>
<body>
<h1>Create an Account</h1>

<form:form modelAttribute="aNewUser">
			<table>
				<tr>
					<td>ID</td>
					<td><form:input type="text" path="id" name="id" />
					</td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><form:input type="text" path="firstname" name="firstname" />
					</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input type="text" path="lastname" name="lastname" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><form:input type="text" path="username" name="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><form:input type="password" path="password" name="password" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input type="text" path="email" name="email" /></td>
				</tr>
				</table>
			<input type="submit" value="Create" />
			</form:form>

</body>
</html>