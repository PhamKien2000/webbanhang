<%-- 
    Document   : EditCate
    Created on : 09-Dec-2020, 10:43:56
    Author     : kien pham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="wel">
            <h1>Edit</h1>
            <jsp:useBean id="mrBean" scope="page" class="model.Dataprocess"/>
            <c:set var="c" value="${requestScope['sDetail']}"/>
            <form method="POST" action="ControllerCategory?ac=update">
                <table class="table">
                    <tr>
                        <td class="columnDivider">ID:</td>
                        <td class="columnDividerr"><input readonly="true" type="text" name="txtID" value="${c.id}" style="width: 50%"/></td>
                    </tr>
                    <tr>
                        <td class="columnDivider">Name:</td>
                        <td class="columnDividerr"><input type="text" value="${c.name}" name="txtName" style="width: 50%"/></td>
                    </tr>
                    
                <input type="submit"value="Save"/>
            </form>
        </div>
    </body>
</html>
