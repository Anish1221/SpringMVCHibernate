

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var = "SITE_URL" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
    </head>
    <body>
        <h1>Add Courses</h1>
        <form action="${SITE_URL}/save" method="post">
            <div>
                <label>Course Name</label>
                <input type="text" name ="courseName"/>
            </div>
            <div>
                <label>Course Description</label>
                <textarea name="courseDescription"></textarea>
            </div>
            <div>
                <label>Fees</label>
                <input type="text" name ="fees"/>
            </div>
            <div>
                <label>Duration</label>
                <input type="text" name ="duration"/>
                <select name="durationType">
                    <option value="">Select Duration Type</option>
                    <option value="DAY">DAY</option>
                    <option value="WEEK">Week</option>
                    <option value="MONTH">Month</option>                    
                </select>
            </div>
            <button type="submit">Save</button>
        </form>
    </body>
</html>
