package DB.DAO;

import DB.ConnectionManagerPostgreSQL;
import DB.IConnectionManager;
import core.Pojo.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {
    private static IConnectionManager manager;

    static {
        manager = ConnectionManagerPostgreSQL.getInstance();
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        User user = null;
        try {
            PreparedStatement statement = manager.getConnection().
                prepareStatement("SELECT * FROM users WHERE login = ? AND  password = ?");
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                user = new User(resultSet.getString("login"),
                    resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public Boolean createUser(User user) {
        try {
            PreparedStatement statement = manager.getConnection().prepareStatement
                ("INSERT INTO users (login, password) VALUES(?, ?)");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            if (statement.executeUpdate() == 1) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

