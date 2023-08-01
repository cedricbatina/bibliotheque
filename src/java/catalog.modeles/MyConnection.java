
package java.catalog.modeles;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * MyConnection
 */
// singleton design pattern

public class MyConnection {
 // URL
 private String url = "jdbc:postgresql://loclahost:5432/catalog";

 // User Name
 private String user = "admin";

 // User password
 private String password = "catalog";

 // Connection object
 private static Connection connect;

 // private Constructor
 private MyConnection() {
  try {
   connect = DriverManager.getConnection(url, user, password);

  } catch (SQLException e) {
   e.printStackTrace();
  }

 }

 // return the instance of create if it does not exist
 public static Connection getInstance() {
  if (connect == null) {
   new MyConnection();
  }
  return connect;

 }

}
