package servlets;

import DB.DAO.StudentDAO;
import core.Pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import static DB.DAO.StudentDAO.insertStudent;

public class StudentCreateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("cp1251");
        resp.setCharacterEncoding("cp1251");
        try {
            insertStudent(new Student(req.getParameter("firstName"), req.getParameter("secondName"),
                             req.getParameter("familyName"),LocalDate.parse(req.getParameter("bdate"))));
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        resp.sendRedirect(String.format(req.getContextPath(), "/students"));
    }
}
