package controller;

import dao.TeacherDao;
import model.Teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AddTeacher", value = "/AddTeacher")
public class AddTeacher extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddTeacher(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        TeacherDao dao = new TeacherDao();
        dao.getDatabaseConnection();

        Teacher obj = new Teacher(request.getParameter("t_name"),request.getParameter("t_address"),Integer.parseInt(request.getParameter("t_phoneNo")),request.getParameter("t_course"));
        try {
            String result = dao.insertTeacherInfo(obj);
        } catch (SQLException e){
            e.printStackTrace();
        }
        response.sendRedirect(request.getContextPath()+"/ShowTeacher.jsp");
    }
}
