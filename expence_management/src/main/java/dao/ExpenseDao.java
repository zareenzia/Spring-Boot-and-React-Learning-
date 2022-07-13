package dao;

import model.Expense;
import java.sql.*;

public class ExpenseDao {
    static final String DB_URL = "jdbc:mysql://localhost:3306/expensedb";
    static final String USER = "root";
    static final String PASS = "";
    static final String JDBCDRIVER = "com.mysql.jdbc.Driver";
    public Connection getDatabaseConnection() {
        try{
            Class.forName(JDBCDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return conn;
    }

    public String insertExpenseInfo(Expense obj) throws SQLException {
        Connection con = getDatabaseConnection();

        String insertStr = "INSERT INTO expense (date, category, name, description,amount) VALUES(?,?,?,?,?)";
        String resultStr = "Data inserted...";

        try{
            PreparedStatement ps = con.prepareStatement(insertStr);
            ps.setString(1, obj.getDate());
            ps.setString(2, obj.getCategory());
            ps.setString(3, obj.getName());
            ps.setString(4, obj.getDescription());
            ps.setInt(5, obj.getAmount());
            ps.executeUpdate();
        } catch (SQLException e) {
            resultStr ="Data is not saved,Sorry.";
            e.printStackTrace();
        }finally {
            con.close();
        }
        return resultStr;
    }

    public ResultSet getAllExpense(){
        Connection con = getDatabaseConnection();
        String sql = "SELECT * FROM expense ORDER by date DESC";

        ResultSet expense = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            expense = ps.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return expense;
    }
}
