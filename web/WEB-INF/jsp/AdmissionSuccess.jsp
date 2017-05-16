<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${headerMessage}</h1>

        <h3>Felicidades, has sido aceptado!</h3>

        <h2>Información que has mandado</h2>

        <table>
            <tr>
                <td>Nombre del estudiante: </td>
                <td>${student1.studentName}</td>
            </tr>
            <tr>
                <td>Hobby del estudiante: </td>
                <td>${student1.studentHobby}</td>                
            </tr>
            <tr>
                <td>Celular del estudiante: </td>
                <td>${student1.studentMobile}</td>                
            </tr>
            <tr>
                <td>Fecha del estudiante: </td>
                <td>${student1.studentDOB}</td>                
            </tr>
            <tr>
                <td>Skills del estudiante: </td>
                <td>${student1.studentSkills}</td>                
            </tr>
            <tr>
                <td>Direccion del estudiante: </td>
                <td>
                    country: ${student1.studentAddress.country},
                       city: ${student1.studentAddress.city},
                     street: ${student1.studentAddress.street},
                    pincode: ${student1.studentAddress.pincode}
                </td>
            </tr>
        </table>
    </body>
</html>
