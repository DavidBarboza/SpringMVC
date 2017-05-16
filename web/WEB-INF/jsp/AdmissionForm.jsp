
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${headerMessage}</h1>
        <h1>ADMISIÓN DE ESTUDIANTES PARA CURSO DE JAVA</h1>
        
        <form:errors path="student1.*"/>
        
        <form action ="/SpringMVC/submitAdmissionForm.html" method="post">
            <table>
                <tr>
                    <td>Nombre del estudiante</td> <td> <input type="text" name="studentName"/> </td>
                </tr>
                <tr>
                    <td>Hobby del estudiante</td> <td> <input type="text" name="studentHobby"/> </td>
                </tr>
                <tr>
                    <td>Celular del estudiante</td> <td> <input type="text" name="studentMobile"/> </td>
                </tr>
                <tr>
                    <td>Fecha del estudiante</td> <td> <input type="text" name="studentDOB"/> </td>
                </tr>
                <tr>
                    <td>Skills del estudiante</td> <td> <select name="studentSkills" multiple>
                            <option value="Java Core">Java Core</option>
                            <option value="Spring Core">Spring Core</option>
                            <option value="Spring MVC">Spring MVC</option>
                        </select></td></tr>
            </table>
                
            <table>
                <tr><td>Direccion del estudiante</td></tr>
                <tr>
                    <td>country: <input type="text" name="studentAddress.country"/> </td>
                    <td>city: <input type="text" name="studentAddress.city"/> </td>
                    <td>street: <input type="text" name="studentAddress.street"/> </td>
                    <td>pincode: <input type="text" name="studentAddress.pincode"/> </td>
                </tr>
            </table>
                <tr><td><input type="submit" value="Mandar información"/></td></tr>
        </form>
    
</body>
</html>
