<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Spring Form</title>
    </head>
    <body>
    <h2>Thank you for Filling the Form</h2>
    <br><br>

    <h4>Hello ${student.name}, </h4>
    You have registered with <b>${student.email}</b>. <br>
    Your Department is <b>${student.dept}</b>. <br>
    Your Gender is <b>${student.gender}</b>. <br>
    Your Age is <b>${student.age}</b>. <br>
    Your City pincode is <b>${student.pincode}</b>. <br>
    Your Class code is <b>${student.classcode}</b>. <br>
    Your interests are
    <ul>
        <c:forEach var="temp" items="${student.hobby}">
            <li> ${temp} </li>
        </c:forEach>
    </ul>

    <br><br>

    <a href="http://localhost:4567/SpringDemo/form/show"> Go Back</a>

    </body>
</html>