<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>New Teacher Registration</title>
</head>
<body>
<div>
  <h1>New Teacher Registration Form:</h1>
  <form action="AddTeacher" method="post">

    <label for=>Name:</label>
    <input type ="text" name="t_name"><br>

    <label for=>Address:</label>
    <input type ="text" name="t_address"><br>

    <label for=>Phone No:</label>
    <input type ="number" name="t_phoneNo"><br>

    <label for=>Course:</label>
    <input type ="text" name="t_course"><br>

    <input type="submit" value="register">
  </form>
</div>
</body>
</html>