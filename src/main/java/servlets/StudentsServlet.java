package servlets;

import StudentsWithJDBCAndDAO.DB.DAO.StudentDAO;
import StudentsWithJDBCAndDAO.Pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static StudentsWithJDBCAndDAO.DB.DAO.StudentDAO.getAll;

public class StudentsServlet extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("cp1251");
        List<Student> studentsList = null;
        try {
            studentsList = getAll();
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        for (Student student : studentsList) {
            resp.getWriter().println(student);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Student> students = StudentDAO.getAll();
            req.setAttribute("list", students);
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/students.jsp").forward(req, resp);
    }
}