package mediaequipmentrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
        "jdbc:sqlite:../database/media_equipment_rental.db";

    public static Connection connect() {
        Connection conn = null;
        
        try {
                System.out.println("Current working directory: "
                        + System.getProperty("user.dir"));
                conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }

        return conn;
    }
}