package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalConnection {

    private static LocalConnection localConnection;
    private final Connection connection;

    private LocalConnection(Connection connection) {
        this.connection = connection;
    }

    private static final String DB_URL = "jdbc:mysql://localhost/jolly_pirate_yacht_club" +
            "?useUnicode=true&useJDBCCompliantTimezoneShift=" +
            "true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "00659640155";

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
    }

    public Connection getConnection() {
        return connection;
    }

    public static synchronized LocalConnection getInstance() {
        try {
            if (localConnection == null)
                localConnection = new LocalConnection(connect());
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        return localConnection;
    }
}
