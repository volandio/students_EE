package servlets;

import services.RegistrationService;
import services.RegistrationServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        try {
//            req.setAttribute("student", getStudentById(Integer.valueOf(req.getParameter("id"))));
//        } catch (StudentDAO.StudentDAOException e) {
//            e.printStackTrace();
//        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/CreateUser.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RegistrationService registrationService = new RegistrationServiceImpl();
        req.setCharacterEncoding("cp1251");
        resp.setCharacterEncoding("cp1251");
        registrationService.regUser(req.getParameter("name"), req.getParameter("password"));
        resp.sendRedirect(String.format(req.getContextPath(), "/web"));
    }
}
