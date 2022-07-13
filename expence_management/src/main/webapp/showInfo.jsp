<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="dao.ExpenseDao"%>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%
    ExpenseDao jdbcDao=new ExpenseDao();
    ResultSet resultSet= jdbcDao.getAllExpense();
%>
<!DOCTYPE html>
<html>
<head>
    <title>Recorded Expenses</title>
</head>
<body>
<h1>Expense List:</h1>
<table>
    <tr>

    </tr>
    <tr>
        <td><b>DATE</b></td>
        <td><b>CATEGORY</b></td>
        <td><b>EXPENSE NAME</b></td>
        <td><b>DESCRIPTION</b></td>
        <td><b>AMOUNT</b></td>
    </tr>
    <%
        if (resultSet!=null){
            while (resultSet.next()) {
    %>
    <tr>
        <td><%=resultSet.getString("date")%></td>
        <td><%=resultSet.getString("category")%></td>
        <td><%=resultSet.getString("name")%></td>
        <td><%=resultSet.getString("description")%></td>
        <td><%=resultSet.getString("amount")%></td>
    </tr>
    <%
        }
        }
    %>
</table>
</body>
</html>

