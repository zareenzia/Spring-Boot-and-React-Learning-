package CRUD_test;

import CRUD_test.JDBCDao ;

public class CRUDTest {

	public static void main(String[] args) {

		JDBCDao dao = new JDBCDao();
		dao.getDatabaseConnection();
		dao.createTeacherTable();
		dao.insertData();
	}
}
