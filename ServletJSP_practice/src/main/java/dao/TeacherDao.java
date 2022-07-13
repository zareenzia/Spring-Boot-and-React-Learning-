package dao;

import model.Teacher;
import java.sql.*;
public class TeacherDao {
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbapp";
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
    public String insertTeacherInfo(Teacher obj) throws SQLException {
        Connection con = getDatabaseConnection();

        String insertStr = "INSERT INTO teacher (t_name, t_address, t_phoneNo, t_course) VALUES(?,?,?,?)";
        String resultStr = "Data inserted...";

        try{
            PreparedStatement ps = con.prepareStatement(insertStr);
            ps.setString(1, obj.getT_name());
            ps.setString(2, obj.getT_address());
            ps.setInt(3, obj.getT_phoneNo());
            ps.setString(4, obj.getT_course());
            ps.executeUpdate();
        } catch (SQLException e) {
            resultStr ="Data is not saved,Sorry.";
            e.printStackTrace();
        }finally {
            con.close();
        }
        return resultStr;
    }
    public ResultSet getAllTeachers(){
        Connection con = getDatabaseConnection();
        String sql = "SELECT * FROM teacher";

        ResultSet teachers = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            teachers = ps.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return teachers;
    }
//    public int execUpdateSQL(String sql) {
//        Connection conn = null;
//        Statement stmt = null;
//        int numOfRowsUpdated = 0;
//        try {
//            conn = getDatabaseConnection();
//            stmt = conn.createStatement();
//            numOfRowsUpdated = stmt.executeUpdate(sql);
//
//        } catch (SQLException se) {
//            se.printStackTrace();
//        } finally {
//            try {
//                if (stmt != null)
//                    stmt.close();
//            } catch (SQLException se) {
//            }
//            try {
//                if (conn != null)
//                    conn.close();
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }
//        }
//        return numOfRowsUpdated;
//    }
}

//    public void createTeacherTable() {
//        System.out.println("creating table named Teacher");
//        String sql = "";
//        sql = "drop table Teacher";
//        execUpdateSQL(sql);
//        sql = "CREATE TABLE Teacher (" + " t_id int NOT NULL AUTO_INCREMENT,  " + " t_name VARCHAR(255), "
//                + "t_address VARCHAR(255), "+"t_phoneNo int(11), "+ "t_course VARCHAR(255)," + "primary key (teacher_id)" + ")";
//        execUpdateSQL(sql);
//    }

