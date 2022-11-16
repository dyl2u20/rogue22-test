package ie.atu.rogue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Hard-coded password to check SAST compliance
        String username = "dylan";
        String password = "walsh";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                "user=" + username + "&password=" + password);
    }
}