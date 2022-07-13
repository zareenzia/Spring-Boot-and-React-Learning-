package CRUD_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDao {
	static final String DB_URL = "jdbc:mysql://localhost:3306/university";
	static final String USER = "root";
	static final String PASS = "";

	public Connection getDatabaseConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return conn;
	}
	public void createTeacherTable() {
		System.out.println("creating table named teacher");
		String sql = "";
		sql = "drop table teacher";
		execUpdateSQL(sql);
		sql = "CREATE TABLE teacher (" + " teacher_id int NOT NULL AUTO_INCREMENT,  " + " teacher_name VARCHAR(255), "
				 + "address VARCHAR(255), "+"phone_no int(11), " + "primary key (teacher_id)" + ")";
		execUpdateSQL(sql);
	}
	public void insertData() { 
		String sql = "";
		sql = "INSERT INTO teacher (teacher_name,address,phone_no) VALUES ( 'Jack', 'Uttara', 0987663)";
		execUpdateSQL(sql);

		sql = "INSERT INTO teacher ( teacher_name,address,phone_no) VALUES ( 'Jill', 'Bashundhara', 24748)";
		execUpdateSQL(sql);
		
		sql = "INSERT INTO teacher ( teacher_name,address,phone_no) VALUES ( 'Tom', 'Banasree', 35634748)";
		execUpdateSQL(sql);
		
		sql = "INSERT INTO teacher ( teacher_name,address,phone_no) VALUES ( 'Mira', 'Dhaka', 6374748)";
		execUpdateSQL(sql);
		
		sql = "INSERT INTO teacher ( teacher_name,address,phone_no) VALUES ( 'Jerry', 'Dhaka', 6374748)";
		execUpdateSQL(sql);
		
		sql = "INSERT INTO teacher ( teacher_name,address,phone_no) VALUES ( 'Zareen', 'Dhaka', 6374748)";
		execUpdateSQL(sql);

	}
	

	public int execUpdateSQL(String sql) {
		Connection conn = null;
		Statement stmt = null;
		int numOfRowsUpdated = 0;
		try {
			conn = getDatabaseConnection();
			stmt = conn.createStatement();
			numOfRowsUpdated = stmt.executeUpdate(sql);
		
		} catch (SQLException se) {
		
			se.printStackTrace();
		} finally {
			
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} 
		} 
		return numOfRowsUpdated;
	}
	
}
