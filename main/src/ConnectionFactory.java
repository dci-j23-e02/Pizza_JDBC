package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

  public static final String URL ="jdbc:postgresql://localhost:5432/pizza";
  private static final String USER = "safwankherallah"; // postgres is the default username
  private static final String PASSWORD ="123456";

  /**
   * Get a connection to database
   * @return Connection object
   */
  public static Connection getConnection() {
    Connection conn = null;
    try {
      // Attempt to establish a connection using the  user and  password
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
      if (conn != null) {
        System.out.println("Connected to the database!");
      } else {
        System.out.println("Failed to make connection!");
      }
    } catch (SQLException e) {
      System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn; // Return the connection object
  }


  /**
   * Test Connection
   */

  public static void main(String[] args) {
    Connection connection = getConnection();


  }
}


