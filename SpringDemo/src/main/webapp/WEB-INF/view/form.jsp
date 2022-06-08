<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Spring Form</title>
        <style>
            .error{
                color:red
            }
        </style>
    </head>
    <body>
    <h2>Welcome to Spring Demo</h2>
    <form:form action="process" modelAttribute="student">
        <label>Name: </label>
        <form:input type="text" path="name"/><label class="error">*</label>
        <form:errors path="name" cssClass="error" />
        <br><br>

        <label>Email: </label>
        <form:input type="email" name="email" path="email"/>
        <form:errors path="email" cssClass="error" />
        <br><br>

        <label>Age: </label>
        <form:input type="number" name="age" path="age"/>
        <form:errors path="age" cssClass="error" />
        <br><br>

        <label>Pin code: </label>
        <form:input type="number" name="pincode" path="pincode"/>
        <form:errors path="pincode" cssClass="error" />
        <br><br>

        <label>Gender: </label>
        <form:radiobutton path="gender" value="male"/><label>Male </label>
        <form:radiobutton path="gender" value="female"/><label>Female </label>
        <form:radiobutton path="gender" value="other"/><label>Others </label>
        <br><br>

        <label>Department: </label>
        <form:select path="dept">
            <form:options items="${student.deptOptions}" />
        </form:select>
        <br><br>


        <label>Extra-curicular: </label>
        <form:checkbox path="hobby" value="Cricket"/>Cricket
        <form:checkbox path="hobby" value="Football"/>Football
        <form:checkbox path="hobby" value="Chess"/>Chess
        <form:checkbox path="hobby" value="Books"/>Books
        <form:checkbox path="hobby" value="Movie"/>Movie

        <br><br>

        <label>Class code: </label>
        <form:input type="text" name="classcode" path="classcode"/>
        <form:errors path="classcode" cssClass="error" />
        <br><br>

        <input type="submit" value="Submit"/>
    </form:form>

    </body>
</html>