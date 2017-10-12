package DB.DAO;

    import core.Pojo.User;

public interface UserDAO {
    User getUserByLoginAndPassword(String login, String password);
    Boolean createUser(User user);
}
