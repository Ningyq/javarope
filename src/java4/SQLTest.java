package java4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLTest {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/Student";
        String DRIVER = "com.mysql.jdbc.Driver";
        String USERNAME = "root";
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,USERNAME,"123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

