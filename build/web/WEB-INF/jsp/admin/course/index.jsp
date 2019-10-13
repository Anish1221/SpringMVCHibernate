<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var = "SITE_URL" value="${pageContext.request.contextPath}"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <h1>Courses</h1>
        <a href="${SITE_URL}/add">Add Course</a>
        
        <table>
            <tr>
                <th>Courses</th>              
            </tr>
            <c:forEach var="course" items="${courses}">
                <tr>
                    <td><a href="${SITE_URL}/detail/${course.courseId}">${course.courseName}</a></td>                    
                    <td><a href="${SITE_URL}/delete/${course.courseId}" onclick="return confirm('Are you sure to delete?')">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
