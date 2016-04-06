<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>

<head>
    <title>Department Update Page</title>

</head>
<body>
<form method="POST" name='formDepartment' action="update">
    <h2>Update department name</h2>
    <p>

        <input type="hidden" readonly name="id" id="id" value="<c:out value="${id}" />" />
        <label for="name">Name</label> <input type="text" name="name" id="name" value="<c:out value="${name}" />" />
        <span class="error"><c:out value="${error.name}" /></span>

    </p>
    <input type="submit" value="Edit">

</form>

</body>
</html>