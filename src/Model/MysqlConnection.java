package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    Connection connection;
    private final String CONNECT_URL = "jdbc:mysql://localhost:3306/";
    private final String DATABASE = "";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String UTF8_URL = "?useUnicode=true&characterEncoding=utf-8";
    private static MysqlConnection instance;

    public static MysqlConnection getInstance(){
        if (instance == null){
            instance = new MysqlConnection();
        }
    return instance;
    }

    public Connection getConnection(){
        try {
            if (connection != null || !connection.isClosed()){
                connection = DriverManager.getConnection(CONNECT_URL + DATABASE + UTF8_URL, USERNAME, PASSWORD);
            }
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
