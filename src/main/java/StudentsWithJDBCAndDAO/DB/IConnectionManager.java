package StudentsWithJDBCAndDAO.DB;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnectionManager {
    Connection getConnection() throws SQLException;
}
