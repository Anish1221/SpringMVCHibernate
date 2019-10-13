

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Page</title>
    </head>
    <body>
        <h1>Course Detail</h1>
        <ul>
            <li>Course Name: ${course.courseName}</li>
            <li>Course Description ${course.courseDescription}</li>
            <li>Course Fees: ${course.fees}</li>
            <li>Duration: ${course.duration}</li>
            <li>Duration Type: ${course.durationType}</li>
        </ul>
    </body>
</html>
