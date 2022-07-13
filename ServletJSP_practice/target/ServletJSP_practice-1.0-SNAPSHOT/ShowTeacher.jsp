<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="dao.TeacherDao"%>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%
  TeacherDao jdbcDao=new TeacherDao();
  ResultSet resultSet= jdbcDao.getAllTeachers();
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Teacher List</title>
</head>
<body>
<div>
  <h1>Teacher List:</h1>
  <%
if (resultSet!=null){
    while (resultSet.next()) {
  %>
  <%=resultSet.getString("t_name")%>
  <%=resultSet.getString("t_address")%>
  <%=resultSet.getString("t_phoneNo")%>
  <%=resultSet.getString("t_course")%>
  <%
    }
    }
  %>
</div>
</body>
</html>






