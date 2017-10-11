package servlets;

import StudentsWithJDBCAndDAO.DB.DAO.StudentDAO;
import StudentsWithJDBCAndDAO.Pojo.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import static StudentsWithJDBCAndDAO.DB.DAO.StudentDAO.getStudentById;
import static StudentsWithJDBCAndDAO.DB.DAO.StudentDAO.updateStudent;

public class StudentEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setAttribute("student", getStudentById(Integer.valueOf(req.getParameter("id"))));
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/EditStudent.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("cp1251");
        resp.setCharacterEncoding("cp1251");
        try {
            updateStudent(new Student((short)(int)Integer.valueOf(req.getParameter("id")), req.getParameter("firstName"),
                                req.getParameter("secondName"), req.getParameter("familyName"),
                                LocalDate.parse(req.getParameter("bdate"))));
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        resp.sendRedirect(String.format(req.getContextPath(), "/web"));
    }
}
