<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Daily Expense Management Sheet</title>
</head>
<body>
<div>
    <h1>Daily Expense Management Sheet</h1>
    <h2>Record New Expense:</h2>

    <form action="AddExpense" method="post">

        <label for=>Date:</label>
        <input type="date" name="date"><br>

        <label for="category">Choose a Category:</label>
        <select name="category" id="category">
            <option value="transportation">Transportation</option>
            <option value="food">Food</option>
            <option value="books">Books</option>
            <option value="entertainment">Entertainment</option>
        </select><br>

        <label for=>Expense Name:</label>
        <input type ="text" name="name"><br>

        <label for=>Expense description:</label>
        <input type ="text" name="description"><br>

        <label for=>Amount:</label>
        <input type ="number" name="amount"><br>

        <input type="submit" value="submit Record ">
    </form>
</div>
</body>
</html>