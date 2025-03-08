import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            throw new SQLException("Database error occurred");
        } catch (SQLException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}