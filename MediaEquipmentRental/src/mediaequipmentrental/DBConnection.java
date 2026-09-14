package mediaequipmentrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:sqlite:C:/Users/User/Documents/GitHub/Media-Equipment-Rental-Management-System/database/media_equipment_rental.db";

    public static Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }

        return conn;
    }
}