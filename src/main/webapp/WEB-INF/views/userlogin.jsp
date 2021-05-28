<%--
  Created by IntelliJ IDEA.
  User: Sharma Ji
  Date: 5/27/2021
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2 style="color: orange">Login to eHR Payroll</h2>
<c:if test="${'fail' eq param.auth}">
    <div style="color:red">
        Login Failed!!!<br />
        Reason : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
    </div>
</c:if>
<form action="/user" method="post">
    <table frame="box" cellpadding="0" cellspacing="6">
        <tr>
            <td>Username:</td>
            <td><input type='text' name='username' /></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit"
                                   value="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>