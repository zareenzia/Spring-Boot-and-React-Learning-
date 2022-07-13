package controller;

import dao.ExpenseDao;
import model.Expense;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AddExpense", value = "/AddExpense")
public class AddExpense extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddExpense(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ExpenseDao dao = new ExpenseDao();
        dao.getDatabaseConnection();

        Expense obj = new Expense(request.getParameter("date"),request.getParameter("category"),request.getParameter("name"),request.getParameter("description"),Integer.parseInt(request.getParameter("amount")));
        try {
            String result = dao.insertExpenseInfo(obj);
        } catch (SQLException e){
            e.printStackTrace();
        }
        response.sendRedirect(request.getContextPath()+"/showInfo.jsp");
    }
}
