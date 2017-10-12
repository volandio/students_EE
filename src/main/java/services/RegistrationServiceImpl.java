package services;

import DB.DAO.UserDAO;
import DB.DAO.UserDAOImpl;
import core.Pojo.User;

import static services.PasswordEncoder.encode;

public class RegistrationServiceImpl implements RegistrationService {
    private static UserDAO userDAO = new UserDAOImpl();

    @Override
    public Boolean regUser(String login, String password) {
        if (login == null || password == null) {
            return false;
        }
        return userDAO.createUser(new User(login, encode(password)));
    }
}
