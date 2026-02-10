package ead_cw;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            // Check the database name (SAMS) matches yours!
            String url = "jdbc:mysql://localhost:3306/SAMS"; 
            String user = "root"; 
            String password = ""; // Usually empty for local XAMPP/WAMP
            
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected!");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return conn;
    }
}