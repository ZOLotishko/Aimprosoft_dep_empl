<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>New Employee</title>
</head>
<body>
<center>
    <form method="POST" name='formEmployee' action="addEmployees">
        <h2>Add New Employee</h2>
        <table>
            <tr>
                <td><label for="name">First Name</label></td>
                <td>
            </tr>
            <tr>
                <td><input type="text" name="name" id="name" value="<c:out value="${emp.name}" />" /> <span class="error"><c:out value="${error.first_name}" /></span></td>
            </tr>

            <tr>
                <td><label for="email">Email</label></td>
            </tr>
            <tr>
                <td><input type="text" name="email" id="email" <c:out value="${emp.email}"/> /> <span class="error"><c:out value="${error.email}" /></span></td>
            </tr>
            <tr>
                <td><label for="date">BornDay: YYYY-MM-DD </label></td>
            </tr>
            <tr>
                <td><input type="text" name="date" id="date" <c:out value="${emp.date}"/> /> <span class="error"><c:out value="${error.date}" /></span></td>
            </tr>
            <tr>
                <td><label for="salary">Salary</label></td>
            </tr>
            <tr>
                <td><input type="text" name="salary" id="salary" <c:out value="${emp.salary}"/> /> <span class="error"><c:out value="${error.salary}" /></span></td>
            </tr>

        </table>
        <input type="hidden" readonly name="department_id" value="<c:out value="${department_id}"/>" /> <br>
        <br> <input type="submit" value="Add Employee">
    </form>
</center>
</body>
</html>