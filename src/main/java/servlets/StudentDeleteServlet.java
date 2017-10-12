package servlets;

import DB.DAO.StudentDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static DB.DAO.StudentDAO.deleteStudentById;

public class StudentDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            deleteStudentById(Integer.valueOf(req.getParameter("id")));
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        resp.sendRedirect(String.format(req.getContextPath(), "students"));
    }
}
