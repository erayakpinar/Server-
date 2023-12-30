package chatapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
                DATABASE BAĞLANTISI BURADA SAĞLANIYOR
 */
public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/messages";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
